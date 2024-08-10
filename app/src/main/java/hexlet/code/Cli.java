package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void printWelcomeForm() {
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        var scanner = new Scanner(System.in);
        Engine.userName = scanner.next();
        System.out.printf("Hello, " + Engine.userName + "!\n");
    }
}
