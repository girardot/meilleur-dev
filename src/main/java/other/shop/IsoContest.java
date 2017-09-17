package other.shop;

/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 * IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 ***/

import java.util.Scanner;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);
        int nbLine = Integer.parseInt(sc.nextLine());
        String[] times = sc.nextLine().split(" ");

        int r = 0;
        while (sc.hasNextLine()) {
            String[] customer = sc.nextLine().split(" ");
            if (times[0].compareTo(customer[0])>=0 && times[0].compareTo(customer[1])<=0 ) {
                r++;
            }


        }

        System.out.println(r);
    }
}