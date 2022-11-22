package hexlet.code;
import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class Cli {
    public static void gameNum() {
        boolean found = false;
        String[] gameNumbers = new String[]{"1", "2", "3", "4", "5", "6"};
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
        for (String i : gameNumbers) {
            if (i.equals(gameNum)) {
                found = true;
                break;
            }
        }
        if (found) {
            switch (gameNum) {
                case "1":
                    Engine.greet();
                    break;
                case "2":
                    EvenGame.evenGame();
                case "3":
                    CalcGame.calcGame();
                case "4":
                    GCDGame.gcdGame();
                case "5":
                    ProgressionGame.progressionGame();
                case "6":
                    PrimeGame.primeGame();
                default:
                    break;
            }
        }
    }
}
