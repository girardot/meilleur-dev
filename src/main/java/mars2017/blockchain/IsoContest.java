package mars2017.blockchain;

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
        final int N = Integer.parseInt(sc.nextLine());
        line = sc.nextLine();
        String r = "";
        while (sc.hasNextLine()) {
            final String[] split = sc.nextLine().split(" ");
            final String C = split[0];
            final int Q = Integer.parseInt(split[1]);
            if (Q >= N / 2) {
                r += C;
            }
            /* Lisez les données et effectuez votre traitement */
        }
        System.out.println(r);
    }
}