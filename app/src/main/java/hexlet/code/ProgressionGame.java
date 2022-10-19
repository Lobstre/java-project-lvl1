package hexlet.code;
import java.util.Scanner;

public class ProgressionGame {

    public static void progressionGame(String userName) {
        final int hundred = 100;
        final int ten = 10;
        int i;
        int n;
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        for (i = 0; i <= 2; i++) {
            int startNum = 1 + (int) (Math.random() * hundred);
            int stepNum = 1 + (int) (Math.random() * ten);
            int randNum = 1 + (int) (Math.random() * ten);
            System.out.print("Question: " + startNum);
            for (n = 1; n <= ten; n++) {
                if (n == randNum) {
                    System.out.print(" ..");
                    startNum = startNum + stepNum;
                    answer = startNum;
                } else {
                    System.out.print(" " + (startNum + stepNum));
                    startNum = startNum + stepNum;
                }
            }
            System.out.print("\nYour answer: ");
            int randGameAnswer = scanner.nextInt();
            if (randGameAnswer == answer) {
                System.out.println("Correct!");
            } else {
                System.out.println(randGameAnswer + " is wrong answer ;(. Correct answer was " + answer);
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        System.exit(0);
    }
}
