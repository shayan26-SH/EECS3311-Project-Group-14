package Test.state_manual;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Chief_event_coordinator.State.IllegalBookingTransitionException;

public class IllegalBookingTransitionExceptionTest {

    @Test
    public void keepsTheMessage() {
        IllegalBookingTransitionException e = new IllegalBookingTransitionException("boom");
        assertEquals("boom", e.getMessage());
    }

    @Test
    public void isARuntimeException() {
        assertTrue(new IllegalBookingTransitionException("x") instanceof RuntimeException);
    }

    @Test
    public void isUnchecked() {
        assertThrows(IllegalBookingTransitionException.class, () -> {
            throw new IllegalBookingTransitionException("unchecked");
        });
    }

    @Test
    public void hasNoCause() {
        assertNull(new IllegalBookingTransitionException("x").getCause());
    }

    @Test
    public void nullMessageIsKept() {
        assertNull(new IllegalBookingTransitionException(null).getMessage());
    }

    @Test
    public void canCatchAsRuntimeException() {
        try {
            throw new IllegalBookingTransitionException("caught");
        } catch (RuntimeException e) {
            assertEquals("caught", e.getMessage());
        }
    }

    @Test
    public void toStringHasMessage() {
        assertTrue(new IllegalBookingTransitionException("detail").toString().contains("detail"));
    }

    @Test
    public void twoInstancesDontShareState() {
        IllegalBookingTransitionException a = new IllegalBookingTransitionException("a");
        IllegalBookingTransitionException b = new IllegalBookingTransitionException("b");
        assertEquals("a", a.getMessage());
        assertEquals("b", b.getMessage());
    }

    @Test
    public void emptyMessageIsFine() {
        assertEquals("", new IllegalBookingTransitionException("").getMessage());
    }

    @Test
    public void isThrowable() {
        assertTrue(new IllegalBookingTransitionException("t") instanceof Throwable);
    }
}
