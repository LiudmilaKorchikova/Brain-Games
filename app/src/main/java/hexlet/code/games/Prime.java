package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.playGame;

public class Prime {
    private static final int QUESTIONS_COUNT = 3;
    private static final int NUMBER_LIMIT = 100;
    private static final int START_DIVISOR = 3;
    public static void playPrime() {
        Random rand = new Random();
        String[] questions = new String[QUESTIONS_COUNT];
        String[] expected = new String[QUESTIONS_COUNT];
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int number = rand.nextInt(NUMBER_LIMIT);
            questions[i] = Integer.toString(number);
            expected[i] = generateCorrectAnswer(number);
        }
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        playGame(expected, questions, rules);
    }

    private static String generateCorrectAnswer(int number) {
        if (number == 2) {
            return "yes";
        }
        if (number <= 1 || number % 2 == 0) {
            return "no";
        }
        for (int i = START_DIVISOR; i <=  Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
