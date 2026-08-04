package AI_TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.InstitutionalBillingStrategy;

class InstitutionalBillingStrategyTestAI {

    @Test
    void testValidInstitutionCreation() {
        InstitutionalBillingStrategy strategy =
                new InstitutionalBillingStrategy(
                        "York University",
                        1234567L,
                        "finance@yorku.ca");

        assertNotNull(strategy);
    }

    @Test
    void testInvalidInstitutionName() {
        assertThrows(IllegalArgumentException.class, () ->
                new InstitutionalBillingStrategy(
                        "",
                        1234567L,
                        "finance@yorku.ca"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () ->
                new InstitutionalBillingStrategy(
                        "York",
                        1234567L,
                        ""));
    }

    @Test
    void testInvalidAccountNumber() {
        assertThrows(IllegalArgumentException.class, () ->
                new InstitutionalBillingStrategy(
                        "York",
                        123L,
                        "finance@yorku.ca"));
    }

    @Test
    void testPay() {
        InstitutionalBillingStrategy strategy =
                new InstitutionalBillingStrategy(
                        "York",
                        1234567L,
                        "finance@yorku.ca");

        assertTrue(strategy.pay(100));
    }

    @Test
    void testRefund() {
        InstitutionalBillingStrategy strategy =
                new InstitutionalBillingStrategy(
                        "York",
                        1234567L,
                        "finance@yorku.ca");

        assertTrue(strategy.refund(50));
    }

    @Test
    void testConfirmation() {
        InstitutionalBillingStrategy strategy =
                new InstitutionalBillingStrategy(
                        "York",
                        1234567L,
                        "finance@yorku.ca");

        assertEquals("Billed to York (account 1234567)",
                strategy.getConfirmation());
    }
}
