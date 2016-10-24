package decode;

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
        String result = "";
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            int r = 0;
            for (int i = 0; i < 8; i++) {
                String c = new String(new char[]{line.charAt(i)});
                Integer i1 = Integer.parseInt(c);
                r += i1 * Math.pow(2, 7 - i);
            }
            result += Character.toChars(r)[0];
            /* Lisez les données et effectuez votre traitement */
        }
            System.out.println(result);
    /* Vous pouvez aussi effectuer votre traitement une fois que vous avez lu toutes les données.*/
    }
}