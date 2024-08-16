package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Utils.generateRandomNumber;

public class Calc {
    private static final int NUMBER_LIMIT = 100;
    private static final int QUESTION_ANSWER_PAIR = 2;
    private static final char[] OPERATIONS = {'+', '-', '*'};
    private static final String RULES = "What is the result of the expression?";
    public static void run() {
        String[][] questionsAndCorrectAnswers = new String[Engine.QUESTIONS_COUNT][QUESTION_ANSWER_PAIR];
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            questionsAndCorrectAnswers[i] = generateRoundData();
        }
        Engine.run(questionsAndCorrectAnswers, RULES);
    }

    private static String[] generateRoundData() {
        String[] roundData = new String[QUESTION_ANSWER_PAIR];
        char operation = OPERATIONS[new Random().nextInt(OPERATIONS.length)];
        int firstNumber = generateRandomNumber(NUMBER_LIMIT);
        int secondNumber = generateRandomNumber(NUMBER_LIMIT);
        roundData[0] = firstNumber + " " + operation + " " + secondNumber;
        roundData[1] = Integer.toString(generateCorrectAnswer(firstNumber, secondNumber, operation));
        return roundData;
    }

    private static int generateCorrectAnswer(int firstNumber, int secondNumber, char operation) {
        switch (operation) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            default:
                throw new RuntimeException("Invalid operation: " + operation);
        }
    }
}
