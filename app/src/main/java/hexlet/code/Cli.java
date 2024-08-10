package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String getUserName() {
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        var scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.printf("Hello, " + userName + "!\n");
        return userName;
    }
}
