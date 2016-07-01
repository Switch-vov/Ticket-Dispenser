package kata.td;

public class TicketDispenser {
    private TurnNumberSequence turnNumberSequence;

    public TicketDispenser(TurnNumberSequence turnNumberSequence) {
        this.turnNumberSequence = turnNumberSequence;
    }

    public TicketDispenser() {
        this(new TurnNumberSequence());
    }

    public TurnTicket getTurnTicket()
    {
        // TODO: Depending on a static method violate the Dependency Inversion Principle and Open-Closed Principle.
        int newTurnNumber = TurnNumberSequence.getNextTurnNumber();
        TurnTicket newTurnTicket = new TurnTicket(newTurnNumber);

        return newTurnTicket;
    }
}
