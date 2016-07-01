package kata.td;

import org.junit.Test;

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

    @Test
    public void the_class_TicketDispenser_should_dispense_the_ticket_number_11_if_give_a_turn_number_11_to_it() {
        // Arrange
        MockTurnNumberSequence mockTurnNumberSequence = new MockTurnNumberSequence();
        mockTurnNumberSequence.arrangeNextTurnNumber(11);
        TicketDispenser ticketDispenser = new TicketDispenser(mockTurnNumberSequence);

        // Act
        TurnTicket ticket = ticketDispenser.getTurnTicket();

        // Assert
        assertEquals(11, ticket.getTurnNumber());
        mockTurnNumberSequence.verifyMethodGetNextTurnNumberCalledOnce();
    }

    @Test
    public void the_turn_number_sequence_of_the_vip_customers_starts_from_1001() {
        // Arrange
        TurnNumberSequence vipCustomerTurnNumberSequence = new TurnNumberSequence(TurnNumberSequence.VIP_CUSTOMER_FIRST_NUMBER);
        TicketDispenser vipCustomerTicketDispenser = new TicketDispenser(vipCustomerTurnNumberSequence);

        // Act
        TurnTicket ticket = vipCustomerTicketDispenser.getTurnTicket();

        // Assert
        assertEquals(TurnNumberSequence.VIP_CUSTOMER_FIRST_NUMBER, ticket.getTurnNumber());
    }

    @Test
    public void the_turn_number_sequence_of_the_regular_customers_starts_from_2001() {
        // Arrange
        TurnNumberSequence regularTurnNumberSequence = new TurnNumberSequence(TurnNumberSequence.REGULAR_CUSTOMER_FIRST_NUMBER);
        TicketDispenser regularCustomerTicketDispenser = new TicketDispenser(regularTurnNumberSequence);

        // Act
        TurnTicket ticket = regularCustomerTicketDispenser.getTurnTicket();

        // Assert
        assertEquals(TurnNumberSequence.REGULAR_CUSTOMER_FIRST_NUMBER, ticket.getTurnNumber());
    }
}
