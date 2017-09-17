package nov2014.substring;

import java.util.LinkedList;
import java.util.Scanner;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();

        int l = 0;
        LinkedList<Character> xc = new LinkedList<>();
        for (Character c : x.toCharArray()) {
            xc.addLast(c);
        }
        for (Character c : y.toCharArray()) {
            if (xc.isEmpty()) {
                break;
            }
            if (c.equals(xc.getFirst())) {
                xc.removeFirst();
                l++;
            }
        }
        if (l == x.length()) {
            System.out.println("OK");
        } else {
            System.out.println("NOK " + l);
        }
    }
}