package mars2017.devops;

/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 * IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 ***/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.nextLine());

        int p = 0;

        List<Integer> usersSatisfied = new ArrayList<>();
        usersSatisfied.add(0);
        while (sc.hasNextLine()) {
            usersSatisfied.add(Integer.parseInt(sc.nextLine()));
        }

        for (int i = 1; i < usersSatisfied.size(); i++) {

            if (i - 1 >= 0) {

                if (usersSatisfied.get(i) == usersSatisfied.get(i - 1)) {
                    p += 10;
                } else if (usersSatisfied.get(i) > usersSatisfied.get(i - 1)) {
                    if (i - 2 >= 0 && usersSatisfied.get(i - 1) > usersSatisfied.get(i - 2)) {
                        p += 20;
                    } else {
                        p += 15;
                    }
                } else if (usersSatisfied.get(i) < usersSatisfied.get(i - 1)) {
                    if (i - 2 >= 0 && usersSatisfied.get(i - 1) < usersSatisfied.get(i - 2)) {
                        p += 0;
                    } else {
                        p += 5;
                    }
                }
            }
        }

        final int m = (int) Math.ceil(p / (N * 1.0));
        System.out.println(m);
    }
}