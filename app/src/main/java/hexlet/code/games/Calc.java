package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Utils.generateRandomNumber;

public class Calc {
    private static final int QUESTIONS_COUNT = 3;
    private static final int NUMBER_LIMIT = 100;
    private static final int QUESTION_ANSWER_PAIR = 2;
    private static final char[] OPERATIONS = {'+', '-', '*'};
    public static void run() {
        String[][] questionsAndCorrectAnswers = new String[QUESTIONS_COUNT][QUESTION_ANSWER_PAIR];
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            questionsAndCorrectAnswers[i] = generateRoundData();
        }
        String rules = "What is the result of the expression?";
        Engine.run(questionsAndCorrectAnswers, rules);
    }

    private static String[] generateRoundData() {
        String[] roundData = new String[QUESTION_ANSWER_PAIR];
        char operation = OPERATIONS[new Random().nextInt(OPERATIONS.length)];
        int firstNumber = generateRandomNumber(NUMBER_LIMIT);
        int secondNumber = generateRandomNumber(NUMBER_LIMIT);
        roundData[0] = generateQuestion(firstNumber, secondNumber, operation);
        roundData[1] = generateCorrectAnswer(firstNumber, secondNumber, operation);
        return roundData;
    }

    private static String generateQuestion(int firstNumber, int secondNumber, char operation) {
        return firstNumber + " " + operation + " " + secondNumber;
    }

    private static String generateCorrectAnswer(int firstNumber, int secondNumber, char operation) {
        if (operation == '+') {
            return Integer.toString(firstNumber + secondNumber);
        }
        if (operation == '-') {
            return Integer.toString(firstNumber - secondNumber);
        }
        return Integer.toString(firstNumber * secondNumber);
    }
}
