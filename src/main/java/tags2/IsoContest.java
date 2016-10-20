package tags2;

/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 * IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 ***/

import java.util.*;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        Map<String, Integer> count = new HashMap<>();
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            count.put(line, count.getOrDefault(line, 0) + 1);
        }

        Map<Integer, String> order = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            order.put(entry.getValue(), entry.getKey());
        }

        int i = 1;
        for (Map.Entry<Integer, String> entry : order.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
            if (i == 5) {
                break;
            }
            i++;
        }

    }
}

   