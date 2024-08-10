package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.playGame;

public class Even {
    public static void playEvenGame() {
        Random rand = new Random();
        int questionsCount = 3;
        int numberLimit = 100;
        String[] questions = new String[questionsCount];
        String[] expected = new String[questionsCount];
        for (int i = 0; i < 3; i++) {
            int number = rand.nextInt(numberLimit);
            questions[i] = Integer.toString(number);
            expected[i] = generateCorrectAnswer(number);
        }
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        playGame(expected, questions, rules);
    }

    private static String generateCorrectAnswer(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
