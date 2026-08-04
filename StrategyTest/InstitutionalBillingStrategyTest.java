package StrategyTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import model.InstitutionalBillingStrategy;

public class InstitutionalBillingStrategyTest {
    
    @Test
    void accountNumberValidation1() {
        assertThrows(IllegalArgumentException.class, () -> new InstitutionalBillingStrategy("YorkU", 12345l, "test@yorku.ca"));
    }
    
    @Test
    void nullNameValidation() {
        assertThrows(IllegalArgumentException.class, () -> new InstitutionalBillingStrategy(null, 12345678912345l, "test@yorku.ca"));
    }

    @Test
    void emptyNameValidation() {
        assertThrows(IllegalArgumentException.class, () -> new InstitutionalBillingStrategy("  ", 12345678912345l, "test@yorku.ca"));
    }
    
    @Test
    void nullEmailValidation() {
        assertThrows(IllegalArgumentException.class, () -> new InstitutionalBillingStrategy("YorkU", 12345678912345l, null));
    }

    @Test
    void emptyEmailValidation() {
        assertThrows(IllegalArgumentException.class, () -> new InstitutionalBillingStrategy("YorkU", 12345678912345l, "  "));
    }
    
    @Test
    void payTest() {
    	InstitutionalBillingStrategy card = new InstitutionalBillingStrategy("YorkU", 12345678912345l, "test@yorku.ca");
        assertTrue(card.pay(50f));
    }

    @Test
    void refundTest() {
    	InstitutionalBillingStrategy card = new InstitutionalBillingStrategy("YorkU", 12345678912345l, "test@yorku.ca");
        assertTrue(card.refund(50f));
    }

    @Test
    void confirmationDigitsTest() {
    	InstitutionalBillingStrategy card = new InstitutionalBillingStrategy("YorkU", 12345678912345l, "test@yorku.ca");
        assertEquals("Billed to YorkU (account 12345678912345)", card.getConfirmation());
    }


    @Test
    void payZeroFlexibilityTest() {
    	InstitutionalBillingStrategy card = new InstitutionalBillingStrategy("YorkU", 12345678912345l, "test@yorku.ca");
        assertTrue(card.pay(0f));
        //this should be okay since YORKU charges $0 in many instances like Fitness Center Room or Group Class Booking
        //so we are leaving this option open since payment controls it
    }

    @Test
    void payTest2() {
    	InstitutionalBillingStrategy card = new InstitutionalBillingStrategy("YorkU", 12345678912345l, "test@yorku.ca");
        assertTrue(card.pay(10f));
        assertTrue(card.pay(20f));
        assertTrue(card.pay(30f));
    }

}