package StrategyTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

import model.TimeSlot;

public class TimeSlotTest {

    private LocalDateTime start = LocalDateTime.of(2026, 7, 29, 11, 0);

    @Test
    void constructorTest() {
        LocalDateTime time = start.plusHours(2);
        TimeSlot ts = new TimeSlot(start, time);
        assertEquals(start, ts.getStart());
        assertEquals(time, ts.getEnd());
    }

    @Test
    void nullStartValidation() {
        assertThrows(IllegalArgumentException.class, () -> new TimeSlot(null, start.plusHours(1)));
    }

    @Test
    void nullEndValidation() {
        assertThrows(IllegalArgumentException.class, () -> new TimeSlot(start, null));
    }

    @Test
    void slotDurationValidation() {
        assertThrows(IllegalArgumentException.class, () -> new TimeSlot(start, start));
    }

    @Test
    void endBeforeStartValidation() {
        assertThrows(IllegalArgumentException.class, () -> new TimeSlot(start, start.minusMinutes(1)));
    }

    @Test
    void endBeforeStartValidation2() {
        LocalDateTime end = start.plusMinutes(2);
        TimeSlot slot = new TimeSlot(start, end);
        assertEquals(end, slot.getEnd());
    }

    @Test
    void slotTest1() {
        LocalDateTime lateStart = LocalDateTime.of(2026, 3, 1, 23, 0);
        LocalDateTime nextDayEnd = LocalDateTime.of(2026, 3, 2, 1, 0);
        TimeSlot slot = new TimeSlot(lateStart, nextDayEnd);
        assertEquals(lateStart, slot.getStart());
        assertEquals(nextDayEnd, slot.getEnd());
    }

    @Test
    void NotNull() {
        LocalDateTime end = start.plusHours(3);
        TimeSlot slot = new TimeSlot(start, end);
        assertNotNull(slot);
    }

    @Test
    void referenceValidation() {
        TimeSlot slotA = new TimeSlot(start, start.plusHours(1));
        TimeSlot slotB = new TimeSlot(start, start.plusHours(2));
        assertEquals(slotA.getStart(), slotB.getStart());
        assertNotSame(slotA, slotB);
    }

    @Test
    void slotTest2() {
        LocalDateTime end = start.plusHours(5);
        TimeSlot slot = new TimeSlot(start, end);
        assertEquals(start, slot.getStart());
        assertEquals(end, slot.getEnd());
    }
}