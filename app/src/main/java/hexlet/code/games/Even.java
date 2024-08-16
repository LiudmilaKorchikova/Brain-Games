package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateRandomNumber;

public class Even {
    private static final int NUMBER_LIMIT = 100;
    private static final int QUESTION_ANSWER_PAIR = 2;
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
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
        roundData[0] = Integer.toString(number);
        roundData[1] = isEven(number) ? "yes" : "no";
        return roundData;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
