package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateRandomNumber;

public class Progression {
    private static final int QUESTION_ANSWER_PAIR = 2;
    private static final int NUMBER_LIMIT = 10;
    private static final int STEP_LIMIT = 5;
    private static final int LENGTH = 10;
    private static final String RULES = "What number is missing in the progression?";
    public static void run() {
        String[][] questionsAndCorrectAnswers = new String[Engine.QUESTIONS_COUNT][QUESTION_ANSWER_PAIR];
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            questionsAndCorrectAnswers[i] = generateRoundData();
        }
        Engine.run(questionsAndCorrectAnswers, RULES);
    }

    private static String[] generateRoundData() {
        String[] roundData = new String[QUESTION_ANSWER_PAIR];
        int number = generateRandomNumber(NUMBER_LIMIT);
        int step = generateRandomNumber(STEP_LIMIT) + 1;
        int emptyIndex = generateRandomNumber(LENGTH);
        String[] numbers = generateNumbersArray(number, step);
        roundData[0] = generateQuestion(numbers, emptyIndex);
        roundData[1] = numbers[emptyIndex];
        return roundData;
    }


    private static String[] generateNumbersArray(int firstNumber, int step) {
        String[] numbers = new String[LENGTH];
        int element = firstNumber;
        for (int i = 0; i < LENGTH; i++) {
            numbers[i] = String.valueOf(element);
            element += step;
        }
        return numbers;
    }

    private static String generateQuestion(String[] numbers, int emptyIndex) {
        String[] numbersCopy = numbers.clone();
        numbersCopy[emptyIndex] = "..";
        String question = String.join(" ", numbersCopy);
        return question.trim();
    }
}
