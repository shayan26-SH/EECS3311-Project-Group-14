package StrategyTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import model.DebitCardStrategy;

public class DebitCardStrategyTest {
    
    @Test
    void debitCardNumberValidation() {
        assertThrows(IllegalArgumentException.class, () -> new DebitCardStrategy(12345l, 1228, 123));
    }
    
    @Test
    void expDateValidation1() {
        assertThrows(IllegalArgumentException.class, () -> new DebitCardStrategy(12345l, 12, 123));
    }
    
    @Test
    void expDateValidation2() {
        assertThrows(IllegalArgumentException.class, () -> new DebitCardStrategy(12345l, 1234566, 123));
    }
    
    @Test
    void cvvValidation1() {
        assertThrows(IllegalArgumentException.class, () -> new DebitCardStrategy(12345l, 1228, 123223334));
    }
    
    @Test
    void cvvValidation2() {
        assertThrows(IllegalArgumentException.class, () -> new DebitCardStrategy(12345l, 1228, 1));
    }
    
    @Test
    void payTest() {
    	DebitCardStrategy card = new DebitCardStrategy(12345678912345l, 1228, 123);
        assertTrue(card.pay(50f));
    }

    @Test
    void refundTest() {
    	DebitCardStrategy card = new DebitCardStrategy(12345678912345l, 1228, 123);
        assertTrue(card.refund(50f));
    }

    @Test
    void confirmationDigitsTest() {
    	DebitCardStrategy card = new DebitCardStrategy(12345678912345l, 1228, 123);
        assertEquals("Debit card ending in 2345", card.getConfirmation());
    }


    @Test
    void payZeroFlexibilityTest() {
    	DebitCardStrategy card = new DebitCardStrategy(12345678912345l, 1228, 123);
        assertTrue(card.pay(0f));
        //this should be okay since YORKU charges $0 in many instances like Fitness Center Room or Group Class Booking
        //so we are leaving this option open since payment controls it
    }

    @Test
    void payTest2() {
    	DebitCardStrategy card = new DebitCardStrategy(12345678912345l, 1228, 123);
        assertTrue(card.pay(10f));
        assertTrue(card.pay(20f));
        assertTrue(card.pay(30f));
    }

}