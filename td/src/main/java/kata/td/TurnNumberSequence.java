package kata.td;

public class TurnNumberSequence {
    private static int _turnNumber = 0;

    public TurnNumberSequence() {
        this(0);
    }

    public TurnNumberSequence(int firstNumber) {
        this._turnNumber = firstNumber;
    }

    public int getNextTurnNumber()
    {
        return _turnNumber++;
    }
}
