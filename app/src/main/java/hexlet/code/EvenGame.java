package hexlet.code;
import java.util.Scanner;

public class EvenGame {

    public static void evenGame(String userName) {
        final int hundred = 100;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if number is even otherwise answer 'no'.");
        for (i = 0; i <= 2; i++) {
            int randomNum = 1 + (int) (Math.random() * hundred);
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String evenGameAnswer = scanner.nextLine();
            String rightAnswer;
            if (randomNum % 2 == 0) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
            }
            if (rightAnswer.equals(evenGameAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(evenGameAnswer + " is wrong answer ;(. Correct answer was " + rightAnswer);
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
            if (i >= 2) {
                System.out.println("Congratulations, " + userName + "!");
                System.exit(0);
            }
        }
    }
}
