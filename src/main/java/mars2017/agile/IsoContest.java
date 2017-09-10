package mars2017.agile;

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
        final int T = Integer.parseInt(sc.nextLine());

        int backlog = T;
        while (sc.hasNextLine()) {
            final String[] s = sc.nextLine().split(" ");
            final int V = Integer.parseInt(s[0]);
            final int U = Integer.parseInt(s[1]);
            backlog += -V + U;


        }
        if (backlog <= 0) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }
}