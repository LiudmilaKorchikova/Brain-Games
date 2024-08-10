package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.playGame;

public class GCD {
    public static void playGCD() {
        Random rand = new Random();
        int questionsCount = 3;
        int numberLimit = 100;
        String[] questions = new String[questionsCount];
        String[] expected = new String[questionsCount];
        for (int i = 0; i < 3; i++) {
            int firstNumber = rand.nextInt(numberLimit);
            int secondNumber = rand.nextInt(numberLimit);
            questions[i] = generateQuestion(firstNumber, secondNumber);
            expected[i] = generateCorrectAnswer(firstNumber, secondNumber);
        }
        String rules = "Find the greatest common divisor of given numbers.";
        playGame(expected, questions, rules);
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
