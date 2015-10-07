package bingo;

/*******
 * Read input from System.in
 * Use System.out.println to ouput your result.
 * Use:
 * IsoContestBase.localEcho( variable)
 * to display variable in a dedicated area.
 ***/

import java.util.Scanner;

public class IsoContest {
    public static void main(String[] argv) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[5][5];
        boolean[][] gridResult = new boolean[5][5];

        for (int i = 0; i < 5; i++) {
            String[] line = sc.nextLine().split(" ");
            for (int j = 0; j < 5; j++) {
                grid[i][j] = Integer.parseInt(line[j]);
                gridResult[i][j] = false;
            }
        }

        int nbTurn = Integer.parseInt(sc.nextLine());
        int turn = 0;
        boolean bingo = false;
        while (sc.hasNextLine()) {
            int nb = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (grid[i][j] == nb) {
                        gridResult[i][j] = true;
                    }
                }
            }

            turn++;

            if (checkBingo(gridResult)) {
                bingo = true;
                break;
            }
            if (turn == nbTurn) {
                break;
            }
        }

        if (bingo) {
            System.out.println("OK " + turn);
        } else {
            System.out.println("NOK");
        }

    }

    private static boolean checkBingo(boolean[][] gridResult) {
        return checkLineByLine(gridResult)
                || checkColumnByColumn(gridResult)
                || checkInDiagonal(gridResult);
    }

    private static boolean checkInDiagonal(boolean[][] gridResult) {
        int i = 0;
        for (int j = 0; j < 5; j++) {
            if (!gridResult[i][j]) {
                break;
            }
            if (i == 4) {
                return true;
            }
            i++;
        }
        return false;
    }

    private static boolean checkColumnByColumn(boolean[][] gridResult) {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                if (!gridResult[i][j]) {
                    break;
                }
                if (i == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkLineByLine(boolean[][] gridResult) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (!gridResult[i][j]) {
                    break;
                }
                if (j == 4) {
                    return true;
                }
            }
        }
        return false;
    }

}