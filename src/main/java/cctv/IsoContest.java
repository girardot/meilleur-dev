package cctv;

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

        String[] split = sc.nextLine().split(" ");
        int nbPeople = Integer.parseInt(split[0]);
        int maxPeopleClose = Integer.parseInt(split[1]);
        double maxDistanceClose = Double.parseDouble(split[2]);
        List<People> peoples = new ArrayList<>();

        while (sc.hasNextLine()) {
            String[] split1 = sc.nextLine().split(" ");
            peoples.add(new People(Integer.parseInt(split1[0]), Integer.parseInt(split1[1])));
        }

        List<Integer> dangerous = new ArrayList<>();

        int i = 0;
        for (People people : peoples) {
            int nbCloseP = 0;
            for (People otherP : peoples) {
                if (people != otherP) {
                    if (people.distance(otherP) <= maxDistanceClose) {
                        nbCloseP++;
                    }
                }
            }
            if (nbCloseP >= maxPeopleClose) {
                dangerous.add(i + 1);
            }
            i++;

        }

        for (Integer dangerou : dangerous) {
            System.out.print(dangerou + " ");
        }
        if (dangerous.isEmpty()) {
            System.out.println("No danger");
        }

    }

}

class People {
    public int x;
    public int y;

    public People(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(People p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
    }
}