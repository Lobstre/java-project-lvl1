package hexlet.code;
import java.util.Scanner;

public class GCDGame {

    public static void gcdGame(String userName) {
        int i;
        final int hundred = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        for (i = 0; i <= 2; i++) {
            int randomNum1 = 1 + (int) (Math.random() * hundred);
            int randomNum2 = 1 + (int) (Math.random() * hundred);
            System.out.println("Question: " + randomNum1 + " " + randomNum2);
            System.out.print("Your answer: ");
            int gcdGameAnswer = scanner.nextInt();
            int gcd = 1;
            for (int n = 1; n <= randomNum1 && n <= randomNum2; n++) {
                if (randomNum1 % n == 0 && randomNum2 % n == 0) {
                    gcd = n;
                }
            }
            if (gcdGameAnswer == gcd) {
                System.out.println("Correct!");
            } else {
                System.out.println(gcdGameAnswer + " is wrong answer ;(. Correct answer was " + gcd);
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }

        }
        System.out.println("Congratulations, " + userName + "!");
        System.exit(0);
    }
}
