package hexlet.code;
import java.util.Scanner;

public class PrimeGame {

    public static void primeGame(String userName) {
        final int hundred = 100;
        int i;
        int n;
        int k;
        String answer = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (i = 0; i <= 2; i++) {
            int randNum = 1 + (int) (Math.random() * hundred);
            System.out.print("Question: " + randNum);
            for (k = 2; k <= (randNum / 2); k++) {
                n = randNum % k;
                if (n == 0) {
                    answer = "no";
                    break;
                } else {
                    answer = "yes";
                }
            }
            System.out.print("\nYour answer: ");
            String primeGameAnswer = scanner.nextLine();
            if (primeGameAnswer.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(primeGameAnswer + " is wrong answer ;(. Correct answer was " + answer);
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        System.exit(0);
    }
}
