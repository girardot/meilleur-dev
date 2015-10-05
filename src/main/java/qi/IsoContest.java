package qi;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class IsoContest {

    public static void main(String[] argv) throws Exception {
        int line;
        Scanner sc = new Scanner(System.in);
        int personNumber = parseInt(sc.nextLine());
        Integer min = null;
        while (sc.hasNextLine()) {
            line = parseInt(sc.nextLine());
            if (min == null) {
                min = line;
            }
            min = Math.min(min, line);
        }
        System.out.println(min / personNumber);
    }

}