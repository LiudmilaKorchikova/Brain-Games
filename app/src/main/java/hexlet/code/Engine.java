package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.getUserName;

public class Engine {
    private static final int QUESTIONS_COUNT = 3;
    public static void run(String[][] questionsAndCorrectAnswers, String rules) {
        String userName = getUserName();
        System.out.println(rules);
        var scanner = new Scanner(System.in);
        for (String[] questionAnswerPair: questionsAndCorrectAnswers) {
            System.out.println("Question: " + questionAnswerPair[0]);
            System.out.print("Your answer: ");
            String received = scanner.nextLine();
            if (questionAnswerPair[1].equals(received)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + received + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'" + questionAnswerPair[1] + "'"
                        + "\nLet's try again, " + userName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
