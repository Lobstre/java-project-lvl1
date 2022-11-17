package hexlet.code;
import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class Cli {
    public static void askName(String gameNum) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        switch (gameNum) {
            case "2":
                EvenGame.evenGame(userName);
            case "3":
                CalcGame.calcGame(userName);
            case "4":
                GCDGame.gcdGame(userName);
            case "5":
                ProgressionGame.progressionGame(userName);
            case "6":
                PrimeGame.primeGame(userName);
            default:
                break;
        }
    }

    public static void gameNum() {
        boolean found = false;
        String[] gameNums = new String[]{"1", "2", "3", "4", "5", "6"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("""
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        System.out.print("Your choice: ");
        String gameNum = scanner.nextLine();
        for (String i : gameNums) {
            if (i.equals(gameNum)) {
                found = true;
                break;
            }
        }
        if (found) {
            askName(gameNum);
        }
    }
}
