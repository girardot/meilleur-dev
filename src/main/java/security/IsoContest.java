package security;

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
        Scanner sc = new Scanner(System.in);
        Integer.parseInt(sc.nextLine());

        Map<String, Set<String>> allRelations = new HashMap<>();
        Set<String> allKeys = new HashSet<>();
        while (sc.hasNextLine()) {
            String[] split = sc.nextLine().split(" ");
            String A = split[0];
            String B = split[1];

            if (allRelations.get(A) == null) {
                Set<String> newList = new HashSet<>();
                newList.add(B);
                allRelations.put(A, newList);
            } else {
                allRelations.get(A).add(B);
            }

            allKeys.add(A);
            allKeys.add(B);
        }

        int maxDepth = 0;
        for (String key : allKeys) {
            int depth = depth(key, allRelations);
            maxDepth = Math.max(maxDepth, depth);
        }
        System.out.println(maxDepth + 1);
    }

    private static int depth(String key, Map<String, Set<String>> allRelations) {
        int maxDepth = 0;
        for (Map.Entry<String, Set<String>> entry : allRelations.entrySet()) {
            if (key.equals(entry.getKey())) {
                for (String relation : entry.getValue()) {
                    maxDepth = Math.max(maxDepth, depth(relation, allRelations) + 1);
                }
            }
        }
        return maxDepth;
    }

}