import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        Chief_event_coordinator.Classes.RegressionTest0 regressionTest0_0 = new Chief_event_coordinator.Classes.RegressionTest0();
        boolean[] booleanArray4 = new boolean[] { true, true, false };
        boolean[] booleanArray7 = new boolean[] { true, true };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        regressionTest0_0.assertBooleanArrayEquals(booleanArray4, booleanArray7);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        Chief_event_coordinator.Classes.RegressionTest0 regressionTest0_0 = new Chief_event_coordinator.Classes.RegressionTest0();
        regressionTest0_0.test4();
        boolean[] booleanArray7 = new boolean[] { false, false, true, false, false };
        boolean[] booleanArray9 = new boolean[] { true };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        regressionTest0_0.assertBooleanArrayEquals(booleanArray7, booleanArray9);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        Chief_event_coordinator.Classes.RegressionTest0 regressionTest0_0 = new Chief_event_coordinator.Classes.RegressionTest0();
        regressionTest0_0.test5();
        regressionTest0_0.test5();
        boolean[] booleanArray9 = new boolean[] { false, true, false, false, false, true };
        boolean[] booleanArray13 = new boolean[] { false, false, false };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        regressionTest0_0.assertBooleanArrayEquals(booleanArray9, booleanArray13);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        Chief_event_coordinator.Classes.RegressionTest0 regressionTest0_0 = new Chief_event_coordinator.Classes.RegressionTest0();
        boolean[] booleanArray7 = new boolean[] { false, true, true, false, true, false };
        boolean[] booleanArray10 = new boolean[] { false, false };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        regressionTest0_0.assertBooleanArrayEquals(booleanArray7, booleanArray10);
    }
}

