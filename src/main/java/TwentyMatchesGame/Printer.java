package TwentyMatchesGame;

public class Printer {

    public void matchesLeft(int matchesCounter) {
        System.out.println("На столе осталось " + matchesCounter + " спичек.");
    }

    public void matchesGrab(int matchesCounter) {
        System.out.println(" - Количество выбранных компьютером спичек = " + matchesCounter + ".");
    }

    public void welcome() {
        System.out.print(" - Ход игрока. Введите количество спичек: ");
    }

    public void error() {
        System.out.println("Некорректное количество спичек!");
    }

    public void gameOver() {
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }
}
