package mars2017.chatbot;

/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 * IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 ***/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);
        line = sc.nextLine();
        List<String> cities = new ArrayList<>(Arrays.asList("paris", "lyon", "nantes", "marseille"));
        String cityFound = null;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            for (String city : cities) {
                if (s.contains(city)) {
                    cityFound = city;
                }
            }
        }

        if (cityFound != null) {
            System.out.println(cityFound);
        } else {
            System.out.println("Pas de magasin");

        }
    }
}