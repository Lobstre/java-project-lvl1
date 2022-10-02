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
        if (num == 3) {
            calcGame(userName);
        }
        if (num == 4) {
            gcdGame(userName);
        }
    }
    public static void gameNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - GCD\n" + "0 - Exit");
        int num = scanner.nextInt();
        System.out.println("Your choice: " + num);
        if (num == 1 || num == 2 || num == 3 || num == 4) {
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
    public static void calcGame(String userName) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        switch (i) {
            case 1:
                int randomNum1 = 1 + (int)(Math.random() * 100);
                int randomNum2 = 1 + (int)(Math.random() * 100);
                System.out.println("Question: " + randomNum1 + "*" + randomNum2);
                int calcGameAnswer = scanner.nextInt();
                if (calcGameAnswer == randomNum1 * randomNum2) {
                    System.out.println("Correct!");
                } else {
                    System.out.println(calcGameAnswer + " is wrong answer ;(. Correct answer was " + (randomNum1 * randomNum2));
                    System.out.println("Let's try again, " + userName);
                    System.exit(0);
                }
                i++;
            case 2:
                randomNum1 = 1 + (int)(Math.random() * 100);
                randomNum2 = 1 + (int)(Math.random() * 100);
                System.out.println("Question: " + randomNum1 + "+" + randomNum2);
                calcGameAnswer = scanner.nextInt();
                if (calcGameAnswer == randomNum1 + randomNum2) {
                    System.out.println("Correct!");
                } else {
                    System.out.println(calcGameAnswer + " is wrong answer ;(. Correct answer was " + (randomNum1 + randomNum2));
                    System.out.println("Let's try again, " + userName);
                    System.exit(0);
                }
                i++;
            case 3:
                randomNum1 = 1 + (int)(Math.random() * 100);
                randomNum2 = 1 + (int)(Math.random() * 100);
                System.out.println("Question: " + randomNum1 + "-" + randomNum2);
                calcGameAnswer = scanner.nextInt();
                if (calcGameAnswer == randomNum1 - randomNum2) {
                    System.out.println("Correct!");
                } else {
                    System.out.println(calcGameAnswer + " is wrong answer ;(. Correct answer was " + (randomNum1 - randomNum2));
                    System.out.println("Let's try again, " + userName);
                    System.exit(0);
                }
                break;
        }
        System.out.println("Congratulations, " + userName);
    }
    public static void gcdGame(String userName) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        for (i = 0; i <= 2; i++) {
                int randomNum1 = 1 + (int)(Math.random() * 100);
                int randomNum2 = 1 + (int)(Math.random() * 100);
                System.out.println("Question: " + randomNum1 + " " + randomNum2);
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
                System.out.println("Let's try again, " + userName);
                System.exit(0);
            }

        }
        System.out.println("Congratulations, " + userName);
    }
}
