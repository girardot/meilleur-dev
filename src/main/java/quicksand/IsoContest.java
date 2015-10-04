package quicksand;

import java.util.Scanner;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);

        String[] firstLine = sc.nextLine().split(" ");
        int height = Integer.parseInt(firstLine[0]);
        int width = Integer.parseInt(firstLine[1]);
        String field[][] = loadField(sc, height, width);

        int maxDeep = 0;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (field[y][x].equals("#")) {
                    int deep = 1;
                    maxDeep = Math.max(maxDeep, deep);
                }
            }
        }
        System.out.println(maxDeep);
    }

    private static String[][] loadField(Scanner sc, int height, int width) {
        String line;
        String[][] field = new String[height][width];
        int y = 0;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            char[] charLine = line.toCharArray();
            for (int x = 0; x < charLine.length; x++) {
                field[y][x] = String.valueOf(charLine[x]);
            }
            y++;
        }
        return field;
    }

}