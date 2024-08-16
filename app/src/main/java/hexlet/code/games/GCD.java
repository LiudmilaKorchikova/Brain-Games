package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateRandomNumber;

public class GCD {
    private static final int NUMBER_LIMIT = 100;
    private static final int QUESTION_ANSWER_PAIR = 2;
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    public static void run() {
        String[][] questionsAndCorrectAnswers = new String[Engine.QUESTIONS_COUNT][QUESTION_ANSWER_PAIR];
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            questionsAndCorrectAnswers[i] = generateRoundData();
        }
        Engine.run(questionsAndCorrectAnswers, RULES);
    }

    private static String[] generateRoundData() {
        String[] roundData = new String[QUESTION_ANSWER_PAIR];
        int firstNumber = generateRandomNumber(NUMBER_LIMIT);
        int secondNumber = generateRandomNumber(NUMBER_LIMIT);
        roundData[0] = firstNumber + " " + secondNumber;
        roundData[1] = Integer.toString(generateCorrectAnswer(firstNumber, secondNumber));
        return roundData;
    }

    private static int generateCorrectAnswer(int firstNumber, int secondNumber) {
        int min = Math.min(firstNumber, secondNumber);
        for (int i = min; i > 1; i--) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
