package AI_TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.CreditCardStrategy;

class CreditCardStrategyTestAI {

    @Test
    void testValidCreditCardCreation() {
        CreditCardStrategy strategy =
                new CreditCardStrategy(1234567812345678L, 1226, 123);

        assertNotNull(strategy);
    }

    @Test
    void testInvalidCardNumber() {
        assertThrows(IllegalArgumentException.class, () ->
                new CreditCardStrategy(12345L, 1226, 123));
    }

    @Test
    void testInvalidExpiryDate() {
        assertThrows(IllegalArgumentException.class, () ->
                new CreditCardStrategy(1234567812345678L, 126, 123));
    }

    @Test
    void testPay() {
        CreditCardStrategy strategy =
                new CreditCardStrategy(1234567812345678L, 1226, 123);

        assertTrue(strategy.pay(50));
    }

    @Test
    void testRefund() {
        CreditCardStrategy strategy =
                new CreditCardStrategy(1234567812345678L, 1226, 123);

        assertTrue(strategy.refund(25));
    }

    @Test
    void testConfirmation() {
        CreditCardStrategy strategy =
                new CreditCardStrategy(1234567812345678L, 1226, 123);

        assertEquals("Credit card ending in 5678",
                strategy.getConfirmation());
    }
}