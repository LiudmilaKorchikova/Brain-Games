package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.playGame;

public class Even {
    private static final int QUESTIONS_COUNT = 3;
    private static final int NUMBER_LIMIT = 100;
    public static void playEvenGame() {
        Random rand = new Random();
        String[] questions = new String[QUESTIONS_COUNT];
        String[] expected = new String[QUESTIONS_COUNT];
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int number = rand.nextInt(NUMBER_LIMIT);
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
