package stairs;

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
        int nbSteps = Integer.parseInt(sc.nextLine());
        int nbInstants = Integer.parseInt(sc.nextLine());
        int a = nbSteps;
        int b = nbSteps;

        String result = "";
        while (sc.hasNextLine()) {
            String[] split = sc.nextLine().split(" ");
            a -= Integer.parseInt(split[0]);
            b -= Integer.parseInt(split[1]);
            if (a <= 0) {
                result += "A";
                if (b <= 0) {
                    result += "B";
                }
                break;
            }
            if (b <= 0) {
                result += "B";
                if (a <= 0) {
                    result += "A";
                }
                break;
            }

        }
        if(result.contains("A") && result.contains("B"))
            result = "NO WINNER";

        System.out.println(result);
    /* Vous pouvez aussi effectuer votre traitement une fois que vous avez lu toutes les données.*/
    }
}