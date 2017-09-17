package mars2016.pylone;

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
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        List<Integer> pylone = new ArrayList<>();

        while (sc.hasNextLine()) {
            pylone.add(Integer.parseInt(sc.nextLine()));
        }

        List<Integer> result = new ArrayList<>(pylone.size());

        int i = 0;
        for (Integer size : pylone) {

            int nb = 0;
            int maxR = -1;
            for (int j = i + 1; j < pylone.size(); j++) {
                if (pylone.get(j) > maxR) {
                    nb++;
                    maxR = pylone.get(j);
                }
            }
            int maxL = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (pylone.get(j) > maxL) {
                    nb++;
                    maxL = pylone.get(j);
                }
            }

            result.add(i, nb);
            i++;
        }

        for (Integer integer : result) {
            System.out.print(integer + " ");
        }

    }
}