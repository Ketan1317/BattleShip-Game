import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        char[][] board = new char[5][5];
        for (char[] arr : board) {
            Arrays.fill(arr, 'O');
        }

        System.out.println("\nStarting the Attack !!\n");

        for (char[] arr : board) {
            for (char c : arr) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        // Generate the ship ke coordinates
        ArrayList<ArrayList<Integer>> coordinates = new ArrayList<>();

        while (coordinates.size() < 5) {
            int randomRow = (int) (Math.random() * 5);
            int randomCol = (int) (Math.random() * 5);

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(randomRow);
            temp.add(randomCol);

            if (!coordinates.contains(temp)) {
                coordinates.add(temp);
            }
        }

        int userRow;
        int userCol;
        int NumberOfShips = 3;
        int turns = 7;
        boolean isWon = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("\nThere Are "+NumberOfShips+" Ships in the Ocean");
        System.out.println("You have "+turns+" Number of turns to sank them");

        while (turns != 0) {
            System.out.println("\nEnter the Row you want to Attack (0-4): ");
            userRow = sc.nextInt();

            System.out.println("Enter the Col you want to Attack (0-4): ");
            userCol = sc.nextInt();

            if (userRow < 0 || userRow > 4 || userCol < 0 || userCol > 4) {
                System.out.println("\nOops, that's not even in the ocean!");
                continue;
            }

            if (board[userRow][userCol] == 'X' || board[userRow][userCol] == '-') {
                System.out.println("\nYou already attacked this location!");
                continue;
            }

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(userRow);
            temp.add(userCol);

            if (coordinates.contains(temp)) {
                System.out.println("\nWooohoooo!! You sank the opponent's ship!");
                board[userRow][userCol] = 'X';
                NumberOfShips--;
            } else {
                System.out.println("\nNahhh! Missed it.");
                board[userRow][userCol] = '-';
            }

            turns--;

            System.out.println();
            System.out.println("Ships Remaining: " + NumberOfShips);
            System.out.println("Turns Remaining: " + turns);
            System.out.println();

            for (char[] arr : board) {
                for (char c : arr) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }

            if (NumberOfShips == 0) {
                isWon = true;
                break;
            }
        }

        if (isWon) {
            System.out.println("\nYOU WON THE GAME!");
        } else {
            System.out.println("\nGAME OVER! You lost.");
        }

        sc.close();
    }
}
