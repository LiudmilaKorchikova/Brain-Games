package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.getUserName;

public class Engine {
    private static final int QUESTIONS_COUNT = 3;
    public static void playGame(String[] expected, String[] question, String rules) {
        String userName = getUserName();
        System.out.println(rules);
        var scanner = new Scanner(System.in);
        int questionsCount = QUESTIONS_COUNT;
        for (int i = 0; i < questionsCount; i++) {
            System.out.println("Question: " + question[i]);
            System.out.print("Your answer: ");
            String received = scanner.nextLine();
            if (expected[i].equals(received)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + received + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'" + expected[i] + "'"
                        + "\nLet's try again, " + userName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

}
