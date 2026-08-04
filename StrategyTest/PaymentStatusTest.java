package StrategyTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.PaymentStatus;

public class PaymentStatusTest {

    @Test
    void numberofStatusesTest() {
        assertEquals(4, PaymentStatus.values().length);
    }

    @Test
    void paidCheck() {
        assertEquals(PaymentStatus.PAID, PaymentStatus.valueOf("PAID"));
    }

    @Test
    void overdueCheck() {
        assertEquals(PaymentStatus.OVERDUE, PaymentStatus.valueOf("OVERDUE"));
    }

    @Test
    void failedCheck() {
        assertEquals(PaymentStatus.FAILED, PaymentStatus.valueOf("FAILED"));
    }

    @Test
    void refundedCheck() {
        assertEquals(PaymentStatus.REFUNDED, PaymentStatus.valueOf("REFUNDED"));
    }

    @Test
    void stausTypeValidation() {
        assertThrows(IllegalArgumentException.class, () -> PaymentStatus.valueOf("WITHDRAW"));
    }
    
    @Test
    void stausTypeEmptyValidation() {
        assertThrows(IllegalArgumentException.class, () -> PaymentStatus.valueOf(""));
    }
    
    @Test
    void stausTypeValidation2() {
        assertThrows(IllegalArgumentException.class, () -> PaymentStatus.valueOf("paid"));
    }
    
    @Test
    void stausTypeValidation3() {
        assertThrows(IllegalArgumentException.class, () -> PaymentStatus.valueOf("PAid"));
    }
    
    @Test
    void stausTypeValidation4() {
        assertThrows(IllegalArgumentException.class, () -> PaymentStatus.valueOf("refunded"));
    }

}