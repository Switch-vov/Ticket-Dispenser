package kata.td;

public class TurnNumberSequence {
    private static int turnNumber = 0;

    public TurnNumberSequence() {
        this(0);
    }

    public TurnNumberSequence(int firstNumber) {
        this.turnNumber = firstNumber;
    }

    public int getNextTurnNumber()
    {
        return turnNumber++;
    }
}
