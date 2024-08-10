package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.playGame;

public class Even {
    public static void playEvenGame() {
        Random rand = new Random();
        String[] questions = new String[3];
        String[] expected = new String[3];
        for (int i = 0; i < 3; i++) {
            int number = rand.nextInt(100);
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
