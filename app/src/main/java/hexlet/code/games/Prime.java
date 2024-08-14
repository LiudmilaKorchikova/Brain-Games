package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.generateRandomNumber;

public class Prime {
    private static final int QUESTIONS_COUNT = 3;
    private static final int NUMBER_LIMIT = 100;
    private static final int QUESTION_ANSWER_PAIR = 2;
    private static final int START_DIVISOR = 3;
    public static void run() {
        String[][] questionsAndCorrectAnswers = new String[QUESTIONS_COUNT][QUESTION_ANSWER_PAIR];
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            questionsAndCorrectAnswers[i] = generateRoundData();
        }
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.run(questionsAndCorrectAnswers, rules);
    }

    private static String[] generateRoundData() {
        String[] roundData = new String[QUESTION_ANSWER_PAIR];
        int number = generateRandomNumber(NUMBER_LIMIT);
        roundData[0] = Integer.toString(number);
        roundData[1] = isPrime(number) ? "yes" : "no";
        return roundData;
    }


    private static boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }
        if (number <= 1 || number % 2 == 0) {
            return false;
        }
        for (int i = START_DIVISOR; i <=  Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
