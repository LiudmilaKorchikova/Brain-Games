package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.playGame;

public class Progression {
    public static void playProgression() {
        Random rand = new Random();
        int questionsCount = 3;
        int numberLimit = 10;
        int stepLimit = 5;
        int indexLimit = 10;
        String[] questions = new String[questionsCount];
        String[] expected = new String[questionsCount];
        for (int i = 0; i < 3; i++) {
            int number = rand.nextInt(numberLimit);
            int step = rand.nextInt(stepLimit) + 1;
            int emptyIndex = rand.nextInt(indexLimit) + 1;
            questions[i] = generateQuestion(number, step, emptyIndex);
            expected[i] = generateCorrectAnswer(number, step, emptyIndex);
        }
        String rules = "What number is missing in the progression?";
        playGame(expected, questions, rules);
    }

    private static String generateQuestion(int number, int step, int emptyIndex) {
        StringBuilder question = new StringBuilder();
        for (int i = 0; i < 10; i++) {
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
