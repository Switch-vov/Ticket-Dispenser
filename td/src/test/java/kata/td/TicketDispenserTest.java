package kata.td;

import org.junit.Test;
import sun.security.krb5.internal.Ticket;

import static org.junit.Assert.assertEquals;

public class TicketDispenserTest {
    @Test
    public void a_trivial_test() {
        assertEquals(5, 2 + 3);
    }

    @Test
    public void a_new_ticket_should_have_the_turn_number_subsequent_to_the_previous_ticket() {
        // Arrange
        TicketDispenser ticketDispenser = new TicketDispenser();
        TurnTicket newTicket;
        TurnTicket previousTicket;

        // Act
        previousTicket = ticketDispenser.getTurnTicket();
        newTicket = ticketDispenser.getTurnTicket();

        // Assert
        assertEquals(1, newTicket.getTurnNumber() - previousTicket.getTurnNumber());
    }

    @Test
    public void a_new_ticket_should_have_the_turn_number_subsequent_to_the_previous_ticket_from_another_dispenser() {
        // Arrange
        TicketDispenser ticketDispenser = new TicketDispenser();
        TicketDispenser anotherTicketDispenser = new TicketDispenser();

        // Act
        TurnTicket previousTicket = anotherTicketDispenser.getTurnTicket();
        TurnTicket newTicket = ticketDispenser.getTurnTicket();

        // Assert
        assertEquals(1, newTicket.getTurnNumber() - previousTicket.getTurnNumber());
    }

    // TODO-unit-test-working-on: the class TicketDispenser should dispenser the ticket number 11 if give a turn number 11 to it
    @Test
    public void the_class_TicketDispenser_should_dispense_the_ticket_number_11_if_give_a_turn_number_11_to_it() {
        // Assert
        assertEquals(11, ticket.getTurnNumber());
    }

    // TODO-new-feature: the turn number sequence of the vip customers starts from 1001
    // TODO-new-feature: the turn number sequence of the regular customers starts from 2001
}
