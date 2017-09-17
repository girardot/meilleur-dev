package com.isograd.exercice;

/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 * IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 ***/

import java.util.Scanner;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            /* Lisez les données et effectuez votre traitement */
        }
	/* Vous pouvez aussi effectuer votre traitement une fois que vous avez lu toutes les données.*/
    }

    /*******************************************************************************************/

    private static void sortByReverseOrder(List<Integer> list) {
        Collections.sort(list, COMPARE_BY_REVERSE_ORDER);
    }

    private static void sortByOrder(List<Integer> list) {
        Collections.sort(list, COMPARE_BY_ORDER);
    }

    private static final Comparator<Integer> COMPARE_BY_REVERSE_ORDER = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    };

    private static final Comparator<Integer> COMPARE_BY_ORDER = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    };

    /*******************************************************************************************/

    private static boolean validatePhoneNumber(String phone) {
        final String PHONE_REGEX = "^\\+[0-9]{1,3}\\-[0-9]{9,11}$";
        final Pattern phonePattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = phonePattern.matcher(phone);
        return matcher.matches();
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


    static <K, V extends Comparable<? super V>>
    SortedSet<Map.Entry<K, V>> entriesSortedByValuesAsc(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(
                new Comparator<Map.Entry<K, V>>() {
                    public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                        int res = e1.getValue().compareTo(e2.getValue());
                        return res != 0 ? res : 1;
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }

}