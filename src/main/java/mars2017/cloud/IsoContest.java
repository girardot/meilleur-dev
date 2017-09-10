package mars2017.cloud;

/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 * IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 ***/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);
        line = sc.nextLine();

        Map<String, String> startRange = new HashMap<>();
        startRange.put("M", "05:30");
        startRange.put("AM", "11:59");
        startRange.put("S", "18:00");
        startRange.put("N", "23:30");
        startRange.put("N2", "00:00");

        Map<String, String> endRange = new HashMap<>();
        endRange.put("M", "11:59");
        endRange.put("AM", "17:59");
        endRange.put("S", "23:29");
        endRange.put("N", "23:59");
        endRange.put("N2", "05:29");

        Map<String, Integer> resultByRange = new HashMap<>();
        resultByRange.put("M", 0);
        resultByRange.put("AM", 0);
        resultByRange.put("S", 0);
        resultByRange.put("N", 0);


        while (sc.hasNextLine()) {
            final String date = sc.nextLine();
            for (String t : resultByRange.keySet()) {
                if (date.compareTo(startRange.get(t)) >= 0 && date.compareTo(endRange.get(t)) <= 0) {
                    if (t == "N2") {
                        resultByRange.put("N", resultByRange.get(t) + 1);
                    } else {
                        resultByRange.put(t, resultByRange.get(t) + 1);

                    }
                    break;
                }
            }
        }

        String result = "";
        int resultCount = 0;

        for (String t : resultByRange.keySet()) {
            if (resultByRange.get(t) > resultCount) {
                resultCount = resultByRange.get(t);
                result = t;
            }
        }
        System.out.println(result);

    }
}