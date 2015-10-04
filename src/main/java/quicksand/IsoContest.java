package quicksand;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class IsoContest {
    private static final String GROUND = ".";
    private static final String SAND = "#";

    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);

        String[] firstLine = sc.nextLine().split(" ");
        int height = Integer.parseInt(firstLine[0]);
        int width = Integer.parseInt(firstLine[1]);
        String field[][] = loadField(sc, height, width);

        int maxDepth = 0;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (field[y][x].equals(SAND)) {
                    int depth = computeDepth(x, y, field, height, width);
                    maxDepth = Math.max(maxDepth, depth);
                }
            }
        }
        System.out.println(maxDepth);
    }

    private static String[][] loadField(Scanner sc, int height, int width) {
        String[][] field = new String[height][width];
        int y = 0;
        while (sc.hasNextLine()) {
            char[] line = sc.nextLine().toCharArray();
            for (int x = 0; x < line.length; x++) {
                field[y][x] = valueOf(line[x]);
            }
            y++;
        }
        return field;
    }

    private static int computeDepth(int x, int y, String[][] field, int height, int width) {
        int maxDistance = Math.min(height / 2, width / 2);
        for (int distance = 1; distance <= maxDistance; distance++) {
            if (getAllCellsAtDistance(x, y, distance, field, height, width).contains(GROUND)) {
                return distance;
            }
        }
        return 0;
    }

    private static List<String> getAllCellsAtDistance(int x, int y, int distance, String[][] field, int height, int width) {
        List<String> cellsAtDistance = new ArrayList<>();
        for (int yy = 0; yy < height; yy++) {
            for (int xx = 0; xx < width; xx++) {
                if (distance == Math.abs(xx - x) + Math.abs(yy - y)) {
                    cellsAtDistance.add(field[yy][xx]);
                }
            }
        }
        return cellsAtDistance;
    }

}