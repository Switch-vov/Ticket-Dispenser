package kata.td;

public class TicketDispenser {
    private TurnNumberSequence turnNumberSequence;

    public TicketDispenser() {

    }

    public TicketDispenser(TurnNumberSequence turnNumberSequence) {

    }

    public TurnTicket getTurnTicket()
    {
        // TODO: Depending on a static method violate the Dependency Inversion Principle and Open-Closed Principle.
        int newTurnNumber = turnNumberSequence.getNextTurnNumber();
        TurnTicket newTurnTicket = new TurnTicket(newTurnNumber);

        return newTurnTicket;
    }
}
