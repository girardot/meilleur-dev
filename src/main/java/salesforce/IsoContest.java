package salesforce;

/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 * IsoContestBase.localEcho(variable)
 * to display variable in a dedicated area.
 ****/

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);
        int numberOfLine = Integer.parseInt(sc.nextLine());
        List<String> countries = Arrays.asList(sc.nextLine().split(";"));

        int x;
        int y = 0;
        int z = 0;

        Set<String> lines = new HashSet<String>();
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            lines.add(line);
        }

        x = numberOfLine - lines.size();

        for (String l : lines) {
            String[] user = l.split(";");
            String phone = user[3];
            if (!validatePhoneNumber(phone)) {
                y++;
            }

            String country = user[4];
            if (!validateCountry(country, countries)) {
                z++;
            }
        }

        System.out.println(x + " " + y + " " + z);
    }

    private static boolean validatePhoneNumber(String phone) {
        final String PHONE_REGEX = "^\\+[0-9]{1,3}\\-[0-9]{9,11}$";
        final Pattern phonePattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = phonePattern.matcher(phone);
        return matcher.matches();
    }

    private static boolean validateCountry(String country, List<String> countries) {
        return countries.contains(country);
    }


}
