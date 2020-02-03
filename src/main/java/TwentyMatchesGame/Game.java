package TwentyMatchesGame;

import java.util.Scanner;

public class Game {
    int gameMatchesCount = 20;
    boolean isComputerTurn = true;

    public void play() {
        Printer printer = new Printer();
        Computer computer = new Computer();
        Scanner scan = new Scanner(System.in);
        int numberOfMatches;

        while (gameMatchesCount > 1) {
            printer.matchesLeft(gameMatchesCount);

            if (isComputerTurn) {
                numberOfMatches = computer.makeDecision(gameMatchesCount);
                printer.matchesGrab(numberOfMatches);
            } else {
                printer.welcome();
                numberOfMatches = scan.nextInt();
                if (numberOfMatches < 1 || numberOfMatches > 3) {
                    printer.error();
                    continue;
                }
            }

            gameMatchesCount -= numberOfMatches;
            isComputerTurn = !isComputerTurn;

            if (gameMatchesCount == 1 && !isComputerTurn) {
                printer.gameOver();
                break;
            }
        }

    }
}
