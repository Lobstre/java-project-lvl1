package hexlet.code.games;

import java.util.Scanner;

public class GreetGame {
    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.exit(0);
    }
}
