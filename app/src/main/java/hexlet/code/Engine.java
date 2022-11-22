package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int STAGE = 3;

    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static void braingamesEngine(String[][] qAndAs, String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        for (String[] qAndA : qAndAs) {
            System.out.println(question);
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
