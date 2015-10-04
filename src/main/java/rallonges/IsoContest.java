package rallonges;

import java.util.*;

import static java.lang.Integer.parseInt;

public class IsoContest {

    private static final Comparator<Integer> COMPARE_BY_REVERSE_ORDER = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    };

    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);
        int rallongesTotalNumber = parseInt(sc.nextLine());
        Map<String, List<Integer>> rallongesByName = new HashMap<>();

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            String[] lineInfo = line.split(" ");
            String rallongeName = lineInfo[0];
            Integer rallongeLength = Integer.parseInt(lineInfo[1]);

            if (rallongeName.equals("F-M")) {
                rallongeName = "M-F";
            }

            if (rallongesByName.get(rallongeName) == null) {
                rallongesByName.put(rallongeName, new ArrayList<Integer>());
            }

            rallongesByName.get(rallongeName).add(rallongeLength);
        }

        Integer result = 0;
        if (rallongesByName.get("M-F") != null) {
            for (Integer length : rallongesByName.get("M-F")) {
                result += length;
            }
        }

        if (rallongesByName.get("M-M") != null && rallongesByName.get("F-F") != null) {
            int communNumber = Math.min(rallongesByName.get("F-F").size(), rallongesByName.get("M-M").size());

            Collections.sort(rallongesByName.get("F-F"), COMPARE_BY_REVERSE_ORDER);
            Collections.sort(rallongesByName.get("M-M"), COMPARE_BY_REVERSE_ORDER);

            for (int i = 0; i < communNumber; i++) {
                result += rallongesByName.get("M-M").get(i) + rallongesByName.get("F-F").get(i);
            }

        }
        System.out.println(result);
    }

}