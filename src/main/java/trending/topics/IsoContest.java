package trending.topics;

import java.util.Scanner;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);
        int hashTagNumber = Integer.parseInt(sc.nextLine());

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            String hashtag = line.split("#")[1];


        }
        System.out.println("#" + "Pas de trending topic");
    }
}