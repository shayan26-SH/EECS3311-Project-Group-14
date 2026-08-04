package AI_TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.DebitCardStrategy;

class DebitCardStrategyTestAI {

    @Test
    void testValidDebitCardCreation() {
        DebitCardStrategy strategy =
                new DebitCardStrategy(1111222233334444L, 1226, 123);

        assertNotNull(strategy);
    }

    @Test
    void testInvalidCardNumber() {
        assertThrows(IllegalArgumentException.class, () ->
                new DebitCardStrategy(1234L, 1226, 123));
    }

    @Test
    void testPay() {
        DebitCardStrategy strategy =
                new DebitCardStrategy(1111222233334444L, 1226, 123);

        assertTrue(strategy.pay(40));
    }

    @Test
    void testRefund() {
        DebitCardStrategy strategy =
                new DebitCardStrategy(1111222233334444L, 1226, 123);

        assertTrue(strategy.refund(20));
    }

    @Test
    void testConfirmation() {
        DebitCardStrategy strategy =
                new DebitCardStrategy(1111222233334444L, 1226, 123);

        assertEquals("Debit card ending in 4444",
                strategy.getConfirmation());
    }
}
