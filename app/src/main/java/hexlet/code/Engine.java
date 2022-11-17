package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int stage = 3;
    public static void braingamesEngine (String[][] qAndAs, String question, String userName) {
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
