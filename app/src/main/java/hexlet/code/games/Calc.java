package hexlet.code.games;
import java.util.Random;
import static hexlet.code.Engine.playGame;

public class Calc {
    private static final int QUESTIONS_COUNT = 3;
    private static final int NUMBER_LIMIT = 100;
    public static void playCalc() {
        Random rand = new Random();
        String[] questions = new String[QUESTIONS_COUNT];
        String[] expected = new String[QUESTIONS_COUNT];
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            char operation = generateOperation();
            int firstNumber = rand.nextInt(NUMBER_LIMIT);
            int secondNumber = rand.nextInt(NUMBER_LIMIT);
            questions[i] = generateQuestion(firstNumber, secondNumber, operation);
            expected[i] = generateCorrectAnswer(firstNumber, secondNumber, operation);
        }
        String rules = "What is the result of the expression?";
        playGame(expected, questions, rules);
    }

    private static char generateOperation() {
        char[] operations = {'+', '-', '*'};
        return operations[new Random().nextInt(operations.length)];
    }

    private static String generateQuestion(int firstNumber, int secondNumber, char operation) {
        if (operation == '+') {
            return firstNumber + " + " + secondNumber;
        }
        if (operation == '-') {
            return firstNumber + " - " + secondNumber;
        }
        return firstNumber + " * " + secondNumber;
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
