package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.playGame;

public class Prime {
    public static void playPrime() {
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
        for (int i = 3; i <=  Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
