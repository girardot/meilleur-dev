package tags;

/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 * IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 ***/

import java.util.HashMap;
import java.util.Scanner;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);

        int tagNumber = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> tags = new HashMap<String, Integer>();

        while (sc.hasNextLine()) {
            line = sc.nextLine();

            if (tags.get(line) == null) {
                tags.put(line, 1);
            } else {
                tags.put(line, tags.get(line) + 1);
            }

            /* Lisez les données et effectuez votre traitement */
        }
        System.out.println(tags);
        /* Vous pouvez aussi effectuer votre traitement une fois que vous avez lu toutes les données.*/
    }

}