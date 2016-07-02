package kata.td;

public class TicketDispenser {
    public TicketDispenser() {

    }

    public TicketDispenser(TurnNumberSequence turnNumberSequence) {

    }

    public TurnTicket getTurnTicket()
    {
        // TODO: Depending on a static method violate the Dependency Inversion Principle and Open-Closed Principle.
        int newTurnNumber = TurnNumberSequence.getNextTurnNumber();
        TurnTicket newTurnTicket = new TurnTicket(newTurnNumber);

        return newTurnTicket;
    }
}
