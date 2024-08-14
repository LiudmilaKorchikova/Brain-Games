package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateRandomNumber;

public class Progression {
    private static final int QUESTIONS_COUNT = 3;
    private static final int QUESTION_ANSWER_PAIR = 2;
    private static final int NUMBER_LIMIT = 10;
    private static final int STEP_LIMIT = 5;
    private static final int LENGTH = 10;
    public static void run() {
        String[][] questionsAndCorrectAnswers = new String[QUESTIONS_COUNT][QUESTION_ANSWER_PAIR];
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            questionsAndCorrectAnswers[i] = generateRoundData();
        }
        String rules = "What number is missing in the progression?";
        Engine.run(questionsAndCorrectAnswers, rules);
    }

    private static String[] generateRoundData() {
        String[] roundData = new String[QUESTION_ANSWER_PAIR];
        int number = generateRandomNumber(NUMBER_LIMIT);
        int step = generateRandomNumber(STEP_LIMIT) + 1;
        int emptyIndex = generateRandomNumber(LENGTH);
        String[] numbers = generateNumbersArray(number, step);
        roundData[0] = generateQuestion(numbers, emptyIndex);
        roundData[1] = generateCorrectAnswer(number, step, emptyIndex);
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

    private static String generateCorrectAnswer(int number, int step, int emptyIndex) {
        return Integer.toString(number + step * emptyIndex);
    }
}
