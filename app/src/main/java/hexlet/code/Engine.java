package hexlet.code;
import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {
    public static final int STAGE = 3;
    private static String userName;

    public static void setUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        Engine.userName = userName;
    }

    public static void whatGame(String gameNum) {
        setUserName();
        switch (gameNum) {
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
    public static void braingamesEngine(String[][] qAndAs, String question) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        for (String[] qAndA : qAndAs) {
            System.out.println("Question: " + qAndA[0]);
            System.out.println("Your answer: ");
            String answer = scanner.nextLine();
            if (answer.equals(qAndA[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'"
                        + answer
                        + "' is wrong answer;(. Correct answer was '"
                        + qAndA[1]
                        + "'.\n"
                        + "Let's try again, "
                        + userName
                        + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        System.exit(0);
    }


}
