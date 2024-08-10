package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.playGame;

public class Progression {
    private static final int QUESTIONS_COUNT = 3;
    private static final int NUMBER_LIMIT = 10;
    private static final int STEP_LIMIT = 5;
    private static final int INDEX_LIMIT = 10;
    public static void playProgression() {
        Random rand = new Random();
        String[] questions = new String[QUESTIONS_COUNT];
        String[] expected = new String[QUESTIONS_COUNT];
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int number = rand.nextInt(NUMBER_LIMIT);
            int step = rand.nextInt(STEP_LIMIT) + 1;
            int emptyIndex = rand.nextInt(INDEX_LIMIT);
            questions[i] = generateQuestion(number, step, emptyIndex);
            expected[i] = generateCorrectAnswer(number, step, emptyIndex);
        }
        String rules = "What number is missing in the progression?";
        playGame(expected, questions, rules);
    }

    private static String generateQuestion(int number, int step, int emptyIndex) {
        StringBuilder question = new StringBuilder();
        for (int i = 0; i < NUMBER_LIMIT; i++) {
            if (i == emptyIndex) {
                question.append(" ..");
            } else {
                question.append(" ").append(number);
            }
            number += step;
        }
        return question.toString().trim();
    }

    private static String generateCorrectAnswer(int number, int step, int emptyIndex) {
        return Integer.toString(number + step * emptyIndex);
    }
}
