package hexlet.code;


import static hexlet.code.Cli.getUserName;
import static hexlet.code.games.Even.playEvenGame;
import static hexlet.code.games.Calc.playCalc;
import static hexlet.code.games.GCD.playGCD;
import static hexlet.code.games.Prime.playPrime;
import static hexlet.code.games.Progression.playProgression;

import java.util.Scanner;



public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - Nod\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
        var id = scanner.nextLine();
        switch (id) {
            case "1": getUserName();
            break;
            case "2": playEvenGame();
            break;
            case "3": playCalc();
            break;
            case "4": playGCD();
            break;
            case "5": playProgression();
            break;
            case "6": playPrime();
            break;
            case "0": System.exit(0);
            default:
        }
    }
}
