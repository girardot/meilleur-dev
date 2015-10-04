package life.game;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);
        int rectNumber = parseInt(sc.nextLine());
        while (sc.hasNextLine()) {
            String[] lineSplit = sc.nextLine().split(" ");
            int x1 = parseInt(lineSplit[0]);
            int y1 = parseInt(lineSplit[1]);
            int x2 = parseInt(lineSplit[2]);
            int y2 = parseInt(lineSplit[3]);

            /* Lisez les données et effectuez votre traitement */
        }
    /* Vous pouvez aussi effectuer votre traitement une fois que vous avez lu toutes les données.*/
    }
}