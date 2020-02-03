package TwentyMatchesGame;

public class Computer {
    public int makeDecision(int matchesLeftCount) {
        if (matchesLeftCount > 17) {
            return matchesLeftCount - 17;
        } else if (matchesLeftCount > 13 && matchesLeftCount < 17) {
            return matchesLeftCount - 13;
        } else if (matchesLeftCount > 9 && matchesLeftCount < 13) {
            return matchesLeftCount - 9;
        } else if (matchesLeftCount > 5 && matchesLeftCount < 9) {
            return matchesLeftCount - 5;
        } else {
            return --matchesLeftCount;
        }
    }
}
