package hexlet.code.games;

import java.util.Random;

import static hexlet.code.Engine.playGame;

public class GCD {
    public static void playGCD() {
        Random rand = new Random();
        String[] questions = new String[3];
        String[] expected = new String[3];
        for (int i = 0; i < 3; i++) {
            int firstNumber = rand.nextInt(100);
            int secondNumber = rand.nextInt(100);
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
