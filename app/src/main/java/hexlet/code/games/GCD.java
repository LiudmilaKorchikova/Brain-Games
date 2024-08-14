package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateRandomNumber;

public class GCD {
    private static final int QUESTIONS_COUNT = 3;
    private static final int NUMBER_LIMIT = 100;
    private static final int QUESTION_ANSWER_PAIR = 2;
    public static void run() {
        String[][] questionsAndCorrectAnswers = new String[QUESTIONS_COUNT][QUESTION_ANSWER_PAIR];
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            questionsAndCorrectAnswers[i] = generateRoundData();
        }
        String rules = "Find the greatest common divisor of given numbers.";
        Engine.run(questionsAndCorrectAnswers, rules);
    }

    private static String[] generateRoundData() {
        String[] roundData = new String[QUESTION_ANSWER_PAIR];
        int firstNumber = generateRandomNumber(NUMBER_LIMIT);
        int secondNumber = generateRandomNumber(NUMBER_LIMIT);
        roundData[0] = generateQuestion(firstNumber, secondNumber);
        roundData[1] = generateCorrectAnswer(firstNumber, secondNumber);
        return roundData;
    }


    private static String generateQuestion(int firstNumber, int secondNumber) {
        return firstNumber + " " + secondNumber;
    }

    private static String generateCorrectAnswer(int firstNumber, int secondNumber) {
        int min = Math.min(firstNumber, secondNumber);
        for (int i = min; i > 1; i--) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                return Integer.toString(i);
            }
        }
        return "1";
    }
}
