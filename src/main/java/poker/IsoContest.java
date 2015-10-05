package poker;

/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 * IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 ***/

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);
        int playerMoney = parseInt(sc.nextLine());
        int turnNumber = parseInt(sc.nextLine());

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            String[] splitLine = line.split(" ");
            int x = parseInt(splitLine[0]);
            int y = parseInt(splitLine[1]);
            playerMoney += -x + y;
        }
        System.out.println(playerMoney);

    }
}