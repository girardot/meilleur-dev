package tags;

/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 * IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 ***/

import java.util.*;

import static java.lang.String.format;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);

        int tagNumber = Integer.parseInt(sc.nextLine());
        Map<String, Integer> tags = new TreeMap<String, Integer>();

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (tags.get(line) == null) {
                tags.put(line, 1);
            } else {
                tags.put(line, tags.get(line) + 1);
            }
        }

        SortedSet<Map.Entry<String, Integer>> entriesSortedByValuesDesc = entriesSortedByValuesDesc(tags);
        displayTags(entriesSortedByValuesDesc, 5);
    }

    private static void displayTags(Set<Map.Entry<String, Integer>> entries, int displayLimit) {
        int displayNumber = 0;
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext() && displayNumber < displayLimit) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(format("%s %s", entry.getKey(), entry.getValue()));
            displayNumber++;
        }
    }

    static <K, V extends Comparable<? super V>>
    SortedSet<Map.Entry<K, V>> entriesSortedByValuesDesc(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(
                new Comparator<Map.Entry<K, V>>() {
                    public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                        int res = e2.getValue().compareTo(e1.getValue());
                        return res != 0 ? res : 1;
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }

}