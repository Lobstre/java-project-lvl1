package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void askName(String gameNum) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        switch (gameNum) {
            case "2":
                evenGame(userName);
            case "3":
                calcGame(userName);
            case "4":
                gcdGame(userName);
            case "5":
                progressionGame(userName);
            case "6":
                primeGame(userName);
            default:
                break;
        }
    }
    public static void gameNum() {
        boolean found = false;
        String[] gameNums = new String[]{"1", "2", "3", "4", "5", "6"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("""
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        System.out.print("Your choice: ");
        String gameNum = scanner.nextLine();
        for (String i : gameNums) {
            if (i.equals(gameNum)) {
                found = true;
                break;
            }
        }
        if (found) {
            askName(gameNum);
        }
    }
    public static void evenGame(String userName) {
        final int hundred = 100;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
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
    public static void calcGame(String userName) {
        final int hundred = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        int randomNum1 = 1 + (int) (Math.random() * hundred);
        int randomNum2 = 1 + (int) (Math.random() * hundred);
        System.out.println("Question: " + randomNum1 + "*" + randomNum2);
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
        System.out.println("Question: " + randomNum1 + "+" + randomNum2);
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
        System.out.println("Question: " + randomNum1 + "-" + randomNum2);
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
