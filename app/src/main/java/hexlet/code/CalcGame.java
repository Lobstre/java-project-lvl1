package hexlet.code;
import java.util.Scanner;

public class CalcGame {

    public static void calcGame(String userName) {
        final int hundred = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        int randomNum1 = 1 + (int) (Math.random() * hundred);
        int randomNum2 = 1 + (int) (Math.random() * hundred);
        System.out.println("Question: " + randomNum1 + " * " + randomNum2);
        System.out.print("Your answer: ");
        int calcGameAnswer = scanner.nextInt();
        if (calcGameAnswer == randomNum1 * randomNum2) {
            System.out.println("Correct!");
        } else {
            System.out.println(calcGameAnswer + " is wrong answer ;(. Correct answer was " + (randomNum1 * randomNum2));
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        randomNum1 = 1 + (int) (Math.random() * hundred);
        randomNum2 = 1 + (int) (Math.random() * hundred);
        System.out.println("Question: " + randomNum1 + " + " + randomNum2);
        System.out.print("Your answer: ");
        calcGameAnswer = scanner.nextInt();
        if (calcGameAnswer == randomNum1 + randomNum2) {
            System.out.println("Correct!");
        } else {
            System.out.println(calcGameAnswer + " is wrong answer ;(. Correct answer was " + (randomNum1 + randomNum2));
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        randomNum1 = 1 + (int) (Math.random() * hundred);
        randomNum2 = 1 + (int) (Math.random() * hundred);
        System.out.println("Question: " + randomNum1 + " - " + randomNum2);
        System.out.print("Your answer: ");
        calcGameAnswer = scanner.nextInt();
        if (calcGameAnswer == randomNum1 - randomNum2) {
            System.out.println("Correct!");
        } else {
            System.out.println(calcGameAnswer + " is wrong answer ;(. Correct answer was " + (randomNum1 - randomNum2));
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        System.out.println("Congratulations, " + userName + "!");
        System.exit(0);
    }
}
