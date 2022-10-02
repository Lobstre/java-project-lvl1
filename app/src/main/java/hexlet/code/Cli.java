package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void askName(int gameNum) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        switch (gameNum) {
            case 2:
                evenGame(userName);
            case 3:
                calcGame(userName);
            case 4:
                gcdGame(userName);
            case 5:
                progressionGame(userName);
        }
    }
    public static void gameNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - GCD");
        System.out.println("5 - Progression\n" + "0 - Exit");
        int gameNum = scanner.nextInt();
        System.out.println("Your choice: " + gameNum);
        if (gameNum == 1 || gameNum == 2 || gameNum == 3 || gameNum == 4 || gameNum == 5) {
            askName(gameNum);
        }
    }
    public static void evenGame(String userName) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (i = 0; i <= 2; i++) {
            int randomNum = 1 + (int)(Math.random() * 100);
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
                System.out.println("Let's try again, " + userName);
                System.exit(0);
            }
            if (i >= 2) {
                System.out.println("Congratulations, " + userName + "!");
                System.exit(0);
            }
        }
    }
    public static void calcGame(String userName) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        int randomNum1 = 1 + (int)(Math.random() * 100);
        int randomNum2 = 1 + (int)(Math.random() * 100);
        System.out.println("Question: " + randomNum1 + "*" + randomNum2);
        System.out.print("Your answer: ");
        int calcGameAnswer = scanner.nextInt();
        if (calcGameAnswer == randomNum1 * randomNum2) {
            System.out.println("Correct!");
        } else {
            System.out.println(calcGameAnswer + " is wrong answer ;(. Correct answer was " + (randomNum1 * randomNum2));
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }
        i++;
        randomNum1 = 1 + (int)(Math.random() * 100);
        randomNum2 = 1 + (int)(Math.random() * 100);
        System.out.println("Question: " + randomNum1 + "+" + randomNum2);
        System.out.print("Your answer: ");
        calcGameAnswer = scanner.nextInt();
        if (calcGameAnswer == randomNum1 + randomNum2) {
            System.out.println("Correct!");
        } else {
            System.out.println(calcGameAnswer + " is wrong answer ;(. Correct answer was " + (randomNum1 + randomNum2));
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }
        i++;
        randomNum1 = 1 + (int)(Math.random() * 100);
        randomNum2 = 1 + (int)(Math.random() * 100);
        System.out.println("Question: " + randomNum1 + "-" + randomNum2);
        System.out.print("Your answer: ");
        calcGameAnswer = scanner.nextInt();
        if (calcGameAnswer == randomNum1 - randomNum2) {
            System.out.println("Correct!");
        } else {
            System.out.println(calcGameAnswer + " is wrong answer ;(. Correct answer was " + (randomNum1 - randomNum2));
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }
        System.out.println("Congratulations, " + userName + "!");
        System.exit(0);
    }
    public static void gcdGame(String userName) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        for (i = 0; i <= 2; i++) {
                int randomNum1 = 1 + (int)(Math.random() * 100);
                int randomNum2 = 1 + (int)(Math.random() * 100);
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
                System.out.println("Let's try again, " + userName);
                System.exit(0);
            }

        }
        System.out.println("Congratulations, " + userName + "!");
        System.exit(0);
    }
    public static void progressionGame(String userName) {
        int i;
        int n;
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        for (i = 0; i <= 2; i++) {
            int startNum = 1 + (int)(Math.random() * 100);
            int stepNum = 1 + (int)(Math.random() * 10);
            int randNum = 1 + (int)(Math.random() * 10);
            System.out.print("Question: " + startNum);
            for (n = 1; n <= 10; n++) {
                if (n == randNum) {
                    System.out.print(" ..");
                    startNum = startNum + stepNum;
                    answer = startNum;
                } else {
                    System.out.print(" "+ (startNum + stepNum));
                    startNum = startNum + stepNum;
                }
            }
            System.out.print("\nYour answer: ");
            int randGameAnswer = scanner.nextInt();
            if (randGameAnswer == answer) {
                System.out.println("Correct!");
            } else {
                System.out.println(randGameAnswer + " is wrong answer ;(. Correct answer was " + answer);
                System.out.println("Let's try again, " + userName);
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        System.exit(0);
    }
}
