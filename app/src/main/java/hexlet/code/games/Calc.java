package hexlet.code.games;
import java.util.Random;
import static hexlet.code.Engine.playGame;

public class Calc {
    public static void playCalc() {
        Random rand = new Random();
        String[] questions = new String[3];
        String[] expected = new String[3];
        for (int i = 0; i < 3; i++) {
            char operation = generateOperation();
            int firstNumber = rand.nextInt(100);
            int secondNumber = rand.nextInt(100);
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
