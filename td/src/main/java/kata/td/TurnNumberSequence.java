package kata.td;

public class TurnNumberSequence {
    public static final int VIP_CUSTOMER_FIRST_NUMBER = 1001;
    public static final int REGULAR_CUSTOMER_FIRST_NUMBER = 2001;

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
