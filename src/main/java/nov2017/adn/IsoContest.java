package nov2017.adn;

/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 * IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 ***/

import java.util.*;
import java.util.stream.Collectors;

public class IsoContest {

    private static int mid = 0;

    public static void main(String[] argv) throws Exception {
        mid = 0;
        Scanner sc = new Scanner(System.in);
        final int n = Integer.parseInt(sc.nextLine());
        List<String> segs = new ArrayList<>(n);
        while (sc.hasNextLine()) {
            final String l = sc.nextLine();
            segs.add(l);
            mid += l.length();
        }
        mid = mid / 2;

        List<String> combs = combs(segs)
                .stream()
                .filter(s -> s.contains("#"))
                .collect(Collectors.toList());

        final List<String> result = combs.stream()
                .map(s -> s.replace(" ", ""))
                .map(s -> s.replace("#", ""))
                .collect(Collectors.toList());

        int i = 0;
        for (String r : result) {
            if (isValid(r)) {
                System.out.println(combs.get(i));
                break;
            }
            i++;
        }

    }

    private static Map<Character, Character> adn = new HashMap<>();

    static {
        adn.put('A', 'T');
        adn.put('T', 'A');
        adn.put('G', 'C');
        adn.put('C', 'G');
    }

    private static boolean isValid(String r) {

        for (int i = 0; i < r.length() - mid; i++) {
            final char[] chars = r.toCharArray();
            if (adn.get(chars[i]) != chars[i + mid]) {
                return false;
            }
        }
        return true;
    }

    private static List<String> combs(List<String> segs) {
        final ArrayList<String> result = new ArrayList<>();
        if (segs.size() == 1) {
            return segs;
        }
        for (String seg : segs) {
            final ArrayList<String> copySegs = new ArrayList<>(segs);
            copySegs.remove(seg);
            final List<String> subSegs = combs(copySegs);
            for (String subSeg : subSegs) {
                if (subSeg.replace(" ", "").length() == mid) {
                    result.add(seg + "#" + subSeg);
                } else {
                    result.add(seg + " " + subSeg);
                }
            }
        }

        return result;
    }
}