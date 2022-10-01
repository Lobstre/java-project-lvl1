package hexlet.code;
import java.util.Scanner;

public class Cli {
    String userName;
    int num;
    public static void askName(int num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        if (num == 2) {
            evenGame(userName);
        }
    }
    public static void gameNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "0 - Exit");
        int num = scanner.nextInt();
        System.out.println("Your choice: " + num);
        if (num == 1 || num == 2) {
            askName(num);
        }
    }
    public static void evenGame(String userName) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (i = 0; i <= 2; i++) {
            int randomNum = 1 + (int)(Math.random() * 100);
            System.out.println("Question: " + randomNum);
            String evenGameAnswer = scanner.nextLine();
            String rightAnswer = "";
            if (randomNum % 2 == 0) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
            }
            if (rightAnswer.equals(evenGameAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(evenGameAnswer + " is wrong answer ;(. Correct answer was " + rightAnswer);
                System.out.println("Let's try again, " + userName);
                i = 3;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + userName);
            }
        }
    }
}
