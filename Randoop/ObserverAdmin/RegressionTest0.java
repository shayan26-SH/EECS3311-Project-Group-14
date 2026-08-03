package Randoop.ObserverAdmin;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Chief_event_coordinator.Classes.RoomStatus roomStatus0 = Chief_event_coordinator.Classes.RoomStatus.OCCUPIED;
        java.lang.Class<?> wildcardClass1 = roomStatus0.getClass();
        org.junit.Assert.assertTrue("'" + roomStatus0 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.OCCUPIED + "'", roomStatus0.equals(Chief_event_coordinator.Classes.RoomStatus.OCCUPIED));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Chief_event_coordinator.Classes.RoomStatus roomStatus0 = Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE;
        org.junit.Assert.assertTrue("'" + roomStatus0 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE + "'", roomStatus0.equals(Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver1 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator0);
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room id must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("hi!");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) (short) 10, (int) (byte) 10, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Building is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver1 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator0);
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("hi!");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("hi!");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Chief_event_coordinator.Classes.RoomStatus roomStatus0 = Chief_event_coordinator.Classes.RoomStatus.DISABLED;
        org.junit.Assert.assertTrue("'" + roomStatus0 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.DISABLED + "'", roomStatus0.equals(Chief_event_coordinator.Classes.RoomStatus.DISABLED));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) (short) 0, (int) (byte) -1, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room id must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("Not specified");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("hi!");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver1 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator0);
        java.util.List<java.lang.String> strList2 = adminDashboardObserver1.getActivityLog();
        Chief_event_coordinator.Classes.Booking booking3 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver1.onBookingStatusChanged(booking3, bookingStatus4, bookingStatus5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("hi!");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.NO_SHOW;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room id must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        java.lang.Class<?> wildcardClass1 = stubPayment0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str2 = room1.getBuilding();
        int int3 = room1.getRoomid();
        int int4 = room1.getRoomid();
        // The following exception was thrown during execution in test generation
        try {
            room1.setBuilding("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Building is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Not specified" + "'", str2, "Not specified");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver1 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        // The following exception was thrown during execution in test generation
        try {
            paymentNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        room1.setRoomLocation("hi!");
        java.lang.String str4 = room1.getClosureReason();
        // The following exception was thrown during execution in test generation
        try {
            room1.setRoomLocation("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room location is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        administrator2.setName("Not specified");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        boolean boolean6 = stubPayment0.refund((double) 1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver7 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver1 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        // The following exception was thrown during execution in test generation
        try {
            paymentNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        boolean boolean6 = stubPayment0.refund((double) 1);
        boolean boolean8 = stubPayment0.refund((double) 'a');
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver9 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver2 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        Chief_event_coordinator.Classes.Booking booking3 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        // The following exception was thrown during execution in test generation
        try {
            roomAvailabilityObserver2.onBookingStatusChanged(booking3, bookingStatus4, bookingStatus5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getRoomName()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver1 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean3 = stubPayment0.charge((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (byte) 1);
        int int2 = room1.getCapacity();
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator5.viewRoomStatus(room7);
        int int9 = room7.getCapacity();
        Chief_event_coordinator.Classes.RoomStatus roomStatus10 = room7.getStatus();
        room1.setStatus(roomStatus10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + roomStatus10 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus10.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) ' ');
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver1 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator0);
        java.util.List<java.lang.String> strList2 = adminDashboardObserver1.getActivityLog();
        java.util.List<java.lang.String> strList3 = adminDashboardObserver1.getActivityLog();
        java.util.List<java.lang.String> strList4 = adminDashboardObserver1.getActivityLog();
        Chief_event_coordinator.Classes.Booking booking5 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus6 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus7 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver1.onBookingStatusChanged(booking5, bookingStatus6, bookingStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus6.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus7.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        room1.setRoomLocation("hi!");
        java.lang.String str4 = room1.getClosureReason();
        // The following exception was thrown during execution in test generation
        try {
            room1.setCapacity(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room capacity must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.NO_SHOW;
        Chief_event_coordinator.Observer.StubPayment stubPayment4 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver5 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment4);
        Chief_event_coordinator.Classes.Booking booking6 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus7 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus8 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver5.onBookingStatusChanged(booking6, bookingStatus7, bookingStatus8);
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus7.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus8.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver2 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        Chief_event_coordinator.Classes.Booking booking3 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment5 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver6 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment5);
        Chief_event_coordinator.Classes.Booking booking7 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus8 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus9 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver6.onBookingStatusChanged(booking7, bookingStatus8, bookingStatus9);
        // The following exception was thrown during execution in test generation
        try {
            roomAvailabilityObserver2.onBookingStatusChanged(booking3, bookingStatus4, bookingStatus9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getRoomName()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus8.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus9.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        java.lang.String str14 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str17 = room16.getBuilding();
        int int18 = room16.getRoomid();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner19 = room16.getIdBadgeScanner();
        administrator2.closeRoom(room16, "Not specified");
        java.lang.Class<?> wildcardClass22 = room16.getClass();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Not specified" + "'", str17, "Not specified");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(idBadgeScanner19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver9 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        Chief_event_coordinator.Classes.Booking booking10 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment11 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean13 = stubPayment11.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver14 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment11);
        Chief_event_coordinator.Classes.Booking booking15 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus16 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment17 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver18 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment17);
        Chief_event_coordinator.Classes.Booking booking19 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus20 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver18.onBookingStatusChanged(booking19, bookingStatus20, bookingStatus21);
        paymentNotificationObserver14.onBookingStatusChanged(booking15, bookingStatus16, bookingStatus20);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus24 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver9.onBookingStatusChanged(booking10, bookingStatus16, bookingStatus24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus16.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus20.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus24.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("Not specified", "");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("Not specified");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment4 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver5 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment4);
        Chief_event_coordinator.Classes.Booking booking6 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus7 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus8 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver5.onBookingStatusChanged(booking6, bookingStatus7, bookingStatus8);
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus7.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus8.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) (short) -1, (int) (short) 1, "", "Not specified");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room id must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        java.lang.String str7 = room5.getBuilding();
        administrator2.enableRoom(room5);
        java.lang.String str9 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            administrator2.closeRoom(room11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A closure reason is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap3 = administrator2.viewBookings();
        administrator2.setName("hi!");
        org.junit.Assert.assertNotNull(intMap3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver1 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean3 = stubPayment0.refund(100.0d);
        boolean boolean5 = stubPayment0.refund((double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("", "Not specified");
        administrator2.setName("Not specified");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str2 = room1.getBuilding();
        int int3 = room1.getCapacity();
        int int4 = room1.getRoomid();
        java.lang.String str5 = room1.getClosureReason();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Not specified" + "'", str2, "Not specified");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver1 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator0);
        java.util.List<java.lang.String> strList2 = adminDashboardObserver1.getActivityLog();
        java.util.List<java.lang.String> strList3 = adminDashboardObserver1.getActivityLog();
        java.util.List<java.lang.String> strList4 = adminDashboardObserver1.getActivityLog();
        Chief_event_coordinator.Classes.Booking booking5 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment6 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver7 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment6);
        boolean boolean9 = stubPayment6.refund(100.0d);
        boolean boolean11 = stubPayment6.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver12 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment6);
        Chief_event_coordinator.Classes.Booking booking13 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus14 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment15 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean17 = stubPayment15.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver18 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment15);
        Chief_event_coordinator.Classes.Booking booking19 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus20 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment21 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver22 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment21);
        Chief_event_coordinator.Classes.Booking booking23 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus24 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver22.onBookingStatusChanged(booking23, bookingStatus24, bookingStatus25);
        paymentNotificationObserver18.onBookingStatusChanged(booking19, bookingStatus20, bookingStatus24);
        paymentNotificationObserver12.onBookingStatusChanged(booking13, bookingStatus14, bookingStatus20);
        Chief_event_coordinator.Observer.StubPayment stubPayment29 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean31 = stubPayment29.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver32 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment29);
        Chief_event_coordinator.Classes.Booking booking33 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus34 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment35 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver36 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment35);
        Chief_event_coordinator.Classes.Booking booking37 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus38 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus39 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver36.onBookingStatusChanged(booking37, bookingStatus38, bookingStatus39);
        paymentNotificationObserver32.onBookingStatusChanged(booking33, bookingStatus34, bookingStatus38);
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver1.onBookingStatusChanged(booking5, bookingStatus14, bookingStatus38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus14.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus20.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus24.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus25.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus34 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus34.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus38 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus38.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus39 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus39.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str2 = room1.getBuilding();
        int int3 = room1.getRoomid();
        int int4 = room1.getRoomid();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner5 = room1.getIdBadgeScanner();
        int int6 = room1.getCapacity();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Not specified" + "'", str2, "Not specified");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(idBadgeScanner5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver1 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator0);
        java.util.List<java.lang.String> strList2 = adminDashboardObserver1.getActivityLog();
        java.util.List<java.lang.String> strList3 = adminDashboardObserver1.getActivityLog();
        Chief_event_coordinator.Classes.Booking booking4 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = Chief_event_coordinator.Observer.BookingStatus.NO_SHOW;
        Chief_event_coordinator.Observer.StubPayment stubPayment6 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver7 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment6);
        boolean boolean9 = stubPayment6.refund(100.0d);
        boolean boolean11 = stubPayment6.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver12 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment6);
        Chief_event_coordinator.Classes.Booking booking13 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus14 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment15 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean17 = stubPayment15.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver18 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment15);
        Chief_event_coordinator.Classes.Booking booking19 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus20 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment21 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver22 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment21);
        Chief_event_coordinator.Classes.Booking booking23 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus24 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver22.onBookingStatusChanged(booking23, bookingStatus24, bookingStatus25);
        paymentNotificationObserver18.onBookingStatusChanged(booking19, bookingStatus20, bookingStatus24);
        paymentNotificationObserver12.onBookingStatusChanged(booking13, bookingStatus14, bookingStatus20);
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver1.onBookingStatusChanged(booking4, bookingStatus5, bookingStatus20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus14.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus20.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus24.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus25.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (short) 10);
        room1.setBuilding("hi!");
        java.lang.String str4 = room1.getClosureReason();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        java.lang.String str6 = administrator2.getName();
        Chief_event_coordinator.Classes.Administrator administrator9 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator12 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator12.viewRoomStatus(room14);
        administrator9.enableRoom(room14);
        Chief_event_coordinator.Classes.Administrator administrator19 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room21 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator19.viewRoomStatus(room21);
        int int23 = room21.getCapacity();
        administrator9.disableRoom(room21);
        // The following exception was thrown during execution in test generation
        try {
            administrator2.closeRoom(room21, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A closure reason is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver3 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        administrator2.setEmail("hi!");
        java.lang.Class<?> wildcardClass6 = administrator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        boolean boolean6 = stubPayment0.refund((double) 1);
        boolean boolean8 = stubPayment0.refund(10.0d);
        boolean boolean10 = stubPayment0.refund((double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str2 = room1.getBuilding();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver3 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        Chief_event_coordinator.Classes.Booking booking4 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment5 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver6 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment5);
        boolean boolean8 = stubPayment5.refund(100.0d);
        boolean boolean10 = stubPayment5.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver11 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment5);
        Chief_event_coordinator.Classes.Booking booking12 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus13 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment14 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean16 = stubPayment14.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver17 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment14);
        Chief_event_coordinator.Classes.Booking booking18 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus19 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment20 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver21 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment20);
        Chief_event_coordinator.Classes.Booking booking22 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus23 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus24 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver21.onBookingStatusChanged(booking22, bookingStatus23, bookingStatus24);
        paymentNotificationObserver17.onBookingStatusChanged(booking18, bookingStatus19, bookingStatus23);
        paymentNotificationObserver11.onBookingStatusChanged(booking12, bookingStatus13, bookingStatus19);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus28 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        // The following exception was thrown during execution in test generation
        try {
            roomAvailabilityObserver3.onBookingStatusChanged(booking4, bookingStatus19, bookingStatus28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getRoomName()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Not specified" + "'", str2, "Not specified");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus13.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus19.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus23.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus24.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus28 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus28.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator5.viewRoomStatus(room7);
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator12 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator12.viewRoomStatus(room14);
        int int16 = room14.getCapacity();
        administrator2.disableRoom(room14);
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap18 = administrator2.viewBookings();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(intMap18);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver1 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator0);
        java.util.List<java.lang.String> strList2 = adminDashboardObserver1.getActivityLog();
        java.util.List<java.lang.String> strList3 = adminDashboardObserver1.getActivityLog();
        java.util.List<java.lang.String> strList4 = adminDashboardObserver1.getActivityLog();
        Chief_event_coordinator.Classes.Booking booking5 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus6 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        Chief_event_coordinator.Observer.StubPayment stubPayment7 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver8 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment7);
        boolean boolean10 = stubPayment7.refund(100.0d);
        boolean boolean12 = stubPayment7.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver13 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment7);
        Chief_event_coordinator.Classes.Booking booking14 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment15 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean17 = stubPayment15.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver18 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment15);
        Chief_event_coordinator.Classes.Booking booking19 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus20 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment21 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver22 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment21);
        Chief_event_coordinator.Classes.Booking booking23 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus24 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver22.onBookingStatusChanged(booking23, bookingStatus24, bookingStatus25);
        paymentNotificationObserver18.onBookingStatusChanged(booking19, bookingStatus20, bookingStatus24);
        Chief_event_coordinator.Observer.StubPayment stubPayment28 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver29 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment28);
        Chief_event_coordinator.Classes.Booking booking30 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus31 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus32 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver29.onBookingStatusChanged(booking30, bookingStatus31, bookingStatus32);
        paymentNotificationObserver13.onBookingStatusChanged(booking14, bookingStatus24, bookingStatus31);
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver1.onBookingStatusChanged(booking5, bookingStatus6, bookingStatus31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus6.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus20.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus24.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus25.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus31 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus31.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus32 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus32.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment3 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver4 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment3);
        boolean boolean6 = stubPayment3.refund(100.0d);
        boolean boolean8 = stubPayment3.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver9 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment3);
        Chief_event_coordinator.Classes.Booking booking10 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment11 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean13 = stubPayment11.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver14 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment11);
        Chief_event_coordinator.Classes.Booking booking15 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus16 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment17 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver18 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment17);
        Chief_event_coordinator.Classes.Booking booking19 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus20 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver18.onBookingStatusChanged(booking19, bookingStatus20, bookingStatus21);
        paymentNotificationObserver14.onBookingStatusChanged(booking15, bookingStatus16, bookingStatus20);
        Chief_event_coordinator.Observer.StubPayment stubPayment24 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver25 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment24);
        Chief_event_coordinator.Classes.Booking booking26 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus27 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus28 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver25.onBookingStatusChanged(booking26, bookingStatus27, bookingStatus28);
        paymentNotificationObserver9.onBookingStatusChanged(booking10, bookingStatus20, bookingStatus27);
        Chief_event_coordinator.Observer.StubPayment stubPayment31 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean33 = stubPayment31.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver34 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment31);
        Chief_event_coordinator.Classes.Booking booking35 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus36 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment37 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver38 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment37);
        Chief_event_coordinator.Classes.Booking booking39 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus40 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus41 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver38.onBookingStatusChanged(booking39, bookingStatus40, bookingStatus41);
        paymentNotificationObserver34.onBookingStatusChanged(booking35, bookingStatus36, bookingStatus40);
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus20, bookingStatus36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus16.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus20.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus27.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus28 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus28.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus36 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus36.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus40 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus40.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus41 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus41.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        java.lang.String str6 = administrator2.getName();
        Chief_event_coordinator.Classes.Administrator administrator9 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator9.viewRoomStatus(room11);
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        room14.setRoomLocation("hi!");
        java.lang.String str17 = room14.getClosureReason();
        room14.setRoomLocation("hi!");
        administrator9.enableRoom(room14);
        Chief_event_coordinator.Classes.Room room22 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor23 = room22.getOccupancySensor();
        administrator9.addRoom(room22);
        administrator2.viewRoomStatus(room22);
        java.lang.String str26 = administrator2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(occupancySensor23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor2 = room1.getOccupancySensor();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver3 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        room1.setCapacity(35);
        org.junit.Assert.assertNotNull(occupancySensor2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver3 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        Chief_event_coordinator.Classes.Booking booking4 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment6 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver7 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment6);
        Chief_event_coordinator.Classes.Booking booking8 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus9 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus10 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver7.onBookingStatusChanged(booking8, bookingStatus9, bookingStatus10);
        paymentNotificationObserver3.onBookingStatusChanged(booking4, bookingStatus5, bookingStatus9);
        Chief_event_coordinator.Classes.Booking booking13 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment14 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver15 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment14);
        boolean boolean17 = stubPayment14.refund(100.0d);
        boolean boolean19 = stubPayment14.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver20 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment14);
        Chief_event_coordinator.Classes.Booking booking21 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment22 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean24 = stubPayment22.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver25 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment22);
        Chief_event_coordinator.Classes.Booking booking26 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus27 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment28 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver29 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment28);
        Chief_event_coordinator.Classes.Booking booking30 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus31 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus32 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver29.onBookingStatusChanged(booking30, bookingStatus31, bookingStatus32);
        paymentNotificationObserver25.onBookingStatusChanged(booking26, bookingStatus27, bookingStatus31);
        Chief_event_coordinator.Observer.StubPayment stubPayment35 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver36 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment35);
        Chief_event_coordinator.Classes.Booking booking37 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus38 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus39 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver36.onBookingStatusChanged(booking37, bookingStatus38, bookingStatus39);
        paymentNotificationObserver20.onBookingStatusChanged(booking21, bookingStatus31, bookingStatus38);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus42 = Chief_event_coordinator.Observer.BookingStatus.NO_SHOW;
        // The following exception was thrown during execution in test generation
        try {
            paymentNotificationObserver3.onBookingStatusChanged(booking13, bookingStatus38, bookingStatus42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus9.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus10.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus27.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus31 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus31.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus32 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus32.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus38 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus38.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus39 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus39.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus42 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus42.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str10 = room9.getBuilding();
        java.lang.String str11 = room9.getClosureReason();
        administrator2.disableRoom(room9);
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor15 = room14.getOccupancySensor();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver16 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room14);
        administrator2.viewRoomStatus(room14);
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner18 = room14.getIdBadgeScanner();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(idBadgeScanner18);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room id must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        java.lang.String str7 = room5.getBuilding();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str11 = room10.getRoomLocation();
        administrator2.disableRoom(room10);
        java.lang.String str13 = room10.getRoomLocation();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Not specified" + "'", str11, "Not specified");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Not specified" + "'", str13, "Not specified");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        room1.setRoomLocation("hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        boolean boolean6 = stubPayment0.refund((double) 1);
        boolean boolean8 = stubPayment0.refund(10.0d);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver9 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver3 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        Chief_event_coordinator.Classes.Booking booking4 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment5 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver6 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment5);
        Chief_event_coordinator.Classes.Booking booking7 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus8 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus9 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver6.onBookingStatusChanged(booking7, bookingStatus8, bookingStatus9);
        Chief_event_coordinator.Observer.StubPayment stubPayment11 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver12 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment11);
        Chief_event_coordinator.Classes.Booking booking13 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus14 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus15 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver12.onBookingStatusChanged(booking13, bookingStatus14, bookingStatus15);
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver3.onBookingStatusChanged(booking4, bookingStatus8, bookingStatus15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus8.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus9.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus14.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus15.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        room1.setRoomLocation("hi!");
        java.lang.String str4 = room1.getClosureReason();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver1 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean3 = stubPayment0.refund(100.0d);
        boolean boolean5 = stubPayment0.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver6 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean8 = stubPayment0.charge((double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        java.lang.String str4 = administrator2.getName();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver5 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str8 = room7.getRoomLocation();
        administrator2.closeRoom(room7);
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str12 = room11.getRoomLocation();
        java.lang.String str13 = room11.getRoomLocation();
        administrator2.addRoom(room11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Not specified" + "'", str8, "Not specified");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Not specified" + "'", str12, "Not specified");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Not specified" + "'", str13, "Not specified");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator16 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str17 = administrator16.getEmail();
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor20 = room19.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner21 = room19.getIdBadgeScanner();
        administrator16.enableRoom(room19);
        administrator2.viewRoomStatus(room19);
        Chief_event_coordinator.Classes.Administrator administrator26 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str27 = administrator26.getEmail();
        Chief_event_coordinator.Classes.Room room29 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str30 = room29.getRoomLocation();
        java.lang.String str31 = room29.getBuilding();
        administrator26.enableRoom(room29);
        Chief_event_coordinator.Classes.Room room34 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str35 = room34.getRoomLocation();
        administrator26.disableRoom(room34);
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver37 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room34);
        administrator2.enableRoom(room34);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor20);
        org.junit.Assert.assertNotNull(idBadgeScanner21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Not specified" + "'", str30, "Not specified");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Not specified" + "'", str31, "Not specified");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Not specified" + "'", str35, "Not specified");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        boolean boolean6 = stubPayment0.charge((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Administrator administrator10 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver13 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room12);
        administrator10.addRoom(room12);
        administrator2.enableRoom(room12);
        java.lang.String str16 = room12.getClosureReason();
        java.lang.Class<?> wildcardClass17 = room12.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver3 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        administrator2.setEmail("hi!");
        administrator2.setEmail("");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor16 = room15.getOccupancySensor();
        administrator2.addRoom(room15);
        java.lang.String str18 = room15.getRoomLocation();
        int int19 = room15.getCapacity();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(occupancySensor16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        boolean boolean6 = stubPayment0.refund((double) 1);
        boolean boolean8 = stubPayment0.refund((double) (-1));
        boolean boolean10 = stubPayment0.refund((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver9 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        Chief_event_coordinator.Classes.Booking booking10 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus11 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus12 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver9.onBookingStatusChanged(booking10, bookingStatus11, bookingStatus12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus11.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus12.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str2 = room1.getBuilding();
        int int3 = room1.getCapacity();
        int int4 = room1.getRoomid();
        // The following exception was thrown during execution in test generation
        try {
            room1.setCapacity((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room capacity must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Not specified" + "'", str2, "Not specified");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("Not specified");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment3 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean5 = stubPayment3.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver6 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment3);
        Chief_event_coordinator.Classes.Booking booking7 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus8 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment9 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver10 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment9);
        Chief_event_coordinator.Classes.Booking booking11 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus12 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus13 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver10.onBookingStatusChanged(booking11, bookingStatus12, bookingStatus13);
        paymentNotificationObserver6.onBookingStatusChanged(booking7, bookingStatus8, bookingStatus12);
        Chief_event_coordinator.Observer.StubPayment stubPayment16 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean18 = stubPayment16.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver19 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment16);
        Chief_event_coordinator.Classes.Booking booking20 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment22 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver23 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment22);
        Chief_event_coordinator.Classes.Booking booking24 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus26 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver23.onBookingStatusChanged(booking24, bookingStatus25, bookingStatus26);
        paymentNotificationObserver19.onBookingStatusChanged(booking20, bookingStatus21, bookingStatus25);
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus12, bookingStatus25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus8.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus12.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus13.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus25.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus26.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (short) 100);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor2 = room1.getOccupancySensor();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver3 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        java.lang.Class<?> wildcardClass4 = room1.getClass();
        org.junit.Assert.assertNotNull(occupancySensor2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator16 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str17 = administrator16.getEmail();
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor20 = room19.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner21 = room19.getIdBadgeScanner();
        administrator16.enableRoom(room19);
        administrator2.closeRoom(room19);
        java.lang.Class<?> wildcardClass24 = administrator2.getClass();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor20);
        org.junit.Assert.assertNotNull(idBadgeScanner21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        java.lang.String str7 = room5.getBuilding();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str11 = room10.getRoomLocation();
        administrator2.disableRoom(room10);
        java.lang.Class<?> wildcardClass13 = room10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Not specified" + "'", str11, "Not specified");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("Not specified");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment3 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean5 = stubPayment3.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver6 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment3);
        Chief_event_coordinator.Classes.Booking booking7 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus8 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment9 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver10 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment9);
        Chief_event_coordinator.Classes.Booking booking11 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus12 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus13 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver10.onBookingStatusChanged(booking11, bookingStatus12, bookingStatus13);
        paymentNotificationObserver6.onBookingStatusChanged(booking7, bookingStatus8, bookingStatus12);
        Chief_event_coordinator.Classes.Booking booking16 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment17 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver18 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment17);
        boolean boolean20 = stubPayment17.refund(100.0d);
        boolean boolean22 = stubPayment17.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver23 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment17);
        Chief_event_coordinator.Classes.Booking booking24 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment26 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean28 = stubPayment26.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver29 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment26);
        Chief_event_coordinator.Classes.Booking booking30 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus31 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment32 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver33 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment32);
        Chief_event_coordinator.Classes.Booking booking34 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus35 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus36 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver33.onBookingStatusChanged(booking34, bookingStatus35, bookingStatus36);
        paymentNotificationObserver29.onBookingStatusChanged(booking30, bookingStatus31, bookingStatus35);
        paymentNotificationObserver23.onBookingStatusChanged(booking24, bookingStatus25, bookingStatus31);
        Chief_event_coordinator.Observer.StubPayment stubPayment40 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver41 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment40);
        boolean boolean43 = stubPayment40.refund(100.0d);
        boolean boolean45 = stubPayment40.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver46 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment40);
        Chief_event_coordinator.Classes.Booking booking47 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment48 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean50 = stubPayment48.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver51 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment48);
        Chief_event_coordinator.Classes.Booking booking52 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus53 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment54 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver55 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment54);
        Chief_event_coordinator.Classes.Booking booking56 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus57 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus58 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver55.onBookingStatusChanged(booking56, bookingStatus57, bookingStatus58);
        paymentNotificationObserver51.onBookingStatusChanged(booking52, bookingStatus53, bookingStatus57);
        Chief_event_coordinator.Observer.StubPayment stubPayment61 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver62 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment61);
        Chief_event_coordinator.Classes.Booking booking63 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus64 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus65 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver62.onBookingStatusChanged(booking63, bookingStatus64, bookingStatus65);
        paymentNotificationObserver46.onBookingStatusChanged(booking47, bookingStatus57, bookingStatus64);
        paymentNotificationObserver6.onBookingStatusChanged(booking16, bookingStatus31, bookingStatus57);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus69 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus31, bookingStatus69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus8.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus12.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus13.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus25.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus31 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus31.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus35 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus35.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus36 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus36.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus53 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus53.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus57 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus57.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus58 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus58.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus64 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus64.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus65 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus65.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus69 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus69.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver3 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean5 = stubPayment0.charge((double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        boolean boolean6 = stubPayment0.charge((double) 1.0f);
        boolean boolean8 = stubPayment0.charge(10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str8 = room7.getBuilding();
        int int9 = room7.getCapacity();
        administrator2.enableRoom(room7);
        java.lang.String str11 = room7.getRoomLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Not specified" + "'", str8, "Not specified");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Not specified" + "'", str11, "Not specified");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver2 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        int int3 = room1.getCapacity();
        Chief_event_coordinator.Classes.RoomStatus roomStatus4 = room1.getStatus();
        Chief_event_coordinator.Classes.RoomStatus roomStatus5 = room1.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + roomStatus4 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus4.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + roomStatus5 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus5.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) (short) -1, (int) (short) 100, "Not specified", "Not specified");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room id must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (byte) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor2 = room1.getOccupancySensor();
        org.junit.Assert.assertNotNull(occupancySensor2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor16 = room15.getOccupancySensor();
        administrator2.addRoom(room15);
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver20 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room19);
        int int21 = room19.getCapacity();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner22 = room19.getIdBadgeScanner();
        administrator2.disableRoom(room19);
        java.lang.String str24 = administrator2.getName();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(occupancySensor16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(idBadgeScanner22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) (short) 100, 0, "Not specified", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room capacity must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.NO_SHOW;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.CONFIRMED;
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        boolean boolean6 = stubPayment0.charge((double) 1.0f);
        boolean boolean8 = stubPayment0.refund((double) 1);
        boolean boolean10 = stubPayment0.charge((-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        java.lang.String str14 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str17 = room16.getBuilding();
        int int18 = room16.getRoomid();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner19 = room16.getIdBadgeScanner();
        administrator2.closeRoom(room16, "Not specified");
        // The following exception was thrown during execution in test generation
        try {
            room16.setCapacity(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room capacity must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Not specified" + "'", str17, "Not specified");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(idBadgeScanner19);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        java.lang.String str14 = administrator2.getEmail();
        administrator2.setName("hi!");
        java.lang.String str17 = administrator2.getEmail();
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap18 = administrator2.viewBookings();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(intMap18);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver3 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        Chief_event_coordinator.Classes.Booking booking4 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment5 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean7 = stubPayment5.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver8 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment5);
        Chief_event_coordinator.Classes.Booking booking9 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus10 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment11 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver12 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment11);
        Chief_event_coordinator.Classes.Booking booking13 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus14 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus15 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver12.onBookingStatusChanged(booking13, bookingStatus14, bookingStatus15);
        paymentNotificationObserver8.onBookingStatusChanged(booking9, bookingStatus10, bookingStatus14);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus18 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver3.onBookingStatusChanged(booking4, bookingStatus10, bookingStatus18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus10.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus14.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus15.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus18.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        boolean boolean6 = stubPayment0.charge((double) 1.0f);
        boolean boolean8 = stubPayment0.refund((double) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor2 = room1.getOccupancySensor();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver3 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        java.lang.String str4 = room1.getClosureReason();
        // The following exception was thrown during execution in test generation
        try {
            room1.setCapacity((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room capacity must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(occupancySensor2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str2 = room1.getBuilding();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver3 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        // The following exception was thrown during execution in test generation
        try {
            room1.setRoomLocation("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room location is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Not specified" + "'", str2, "Not specified");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver2 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        int int3 = room1.getCapacity();
        java.lang.String str4 = room1.getClosureReason();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Administrator administrator10 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver13 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room12);
        administrator10.addRoom(room12);
        administrator2.enableRoom(room12);
        administrator2.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        boolean boolean6 = stubPayment0.charge((double) 1.0f);
        boolean boolean8 = stubPayment0.refund((double) 1);
        boolean boolean10 = stubPayment0.refund((double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor16 = room15.getOccupancySensor();
        administrator2.addRoom(room15);
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str20 = room19.getBuilding();
        administrator2.enableRoom(room19);
        java.lang.Class<?> wildcardClass22 = administrator2.getClass();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(occupancySensor16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Not specified" + "'", str20, "Not specified");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        java.lang.String str4 = administrator2.getName();
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str7 = room6.getClosureReason();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner8 = room6.getIdBadgeScanner();
        administrator2.addRoom(room6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(idBadgeScanner8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor16 = room15.getOccupancySensor();
        administrator2.addRoom(room15);
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver20 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room19);
        int int21 = room19.getCapacity();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner22 = room19.getIdBadgeScanner();
        administrator2.disableRoom(room19);
        Chief_event_coordinator.Classes.Room room25 = new Chief_event_coordinator.Classes.Room((int) '#');
        room25.setRoomLocation("hi!");
        java.lang.String str28 = room25.getClosureReason();
        room25.setRoomLocation("hi!");
        java.lang.String str31 = room25.getClosureReason();
        administrator2.viewRoomStatus(room25);
        Chief_event_coordinator.Classes.Administrator administrator35 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room37 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator35.viewRoomStatus(room37);
        int int39 = room37.getCapacity();
        Chief_event_coordinator.Classes.RoomStatus roomStatus40 = room37.getStatus();
        room25.setStatus(roomStatus40);
        // The following exception was thrown during execution in test generation
        try {
            room25.setRoomLocation("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room location is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(occupancySensor16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(idBadgeScanner22);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + roomStatus40 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus40.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        java.lang.String str7 = room5.getBuilding();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str11 = room10.getRoomLocation();
        administrator2.disableRoom(room10);
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver13 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room10);
        Chief_event_coordinator.Classes.Booking booking14 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment15 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver16 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment15);
        boolean boolean18 = stubPayment15.refund(100.0d);
        boolean boolean20 = stubPayment15.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver21 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment15);
        Chief_event_coordinator.Classes.Booking booking22 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment23 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean25 = stubPayment23.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver26 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment23);
        Chief_event_coordinator.Classes.Booking booking27 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus28 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment29 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver30 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment29);
        Chief_event_coordinator.Classes.Booking booking31 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus32 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus33 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver30.onBookingStatusChanged(booking31, bookingStatus32, bookingStatus33);
        paymentNotificationObserver26.onBookingStatusChanged(booking27, bookingStatus28, bookingStatus32);
        Chief_event_coordinator.Observer.StubPayment stubPayment36 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver37 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment36);
        Chief_event_coordinator.Classes.Booking booking38 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus39 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus40 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver37.onBookingStatusChanged(booking38, bookingStatus39, bookingStatus40);
        paymentNotificationObserver21.onBookingStatusChanged(booking22, bookingStatus32, bookingStatus39);
        Chief_event_coordinator.Observer.StubPayment stubPayment43 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean45 = stubPayment43.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver46 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment43);
        Chief_event_coordinator.Classes.Booking booking47 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus48 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment49 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver50 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment49);
        Chief_event_coordinator.Classes.Booking booking51 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus52 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus53 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver50.onBookingStatusChanged(booking51, bookingStatus52, bookingStatus53);
        paymentNotificationObserver46.onBookingStatusChanged(booking47, bookingStatus48, bookingStatus52);
        // The following exception was thrown during execution in test generation
        try {
            roomAvailabilityObserver13.onBookingStatusChanged(booking14, bookingStatus39, bookingStatus48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getRoomName()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Not specified" + "'", str11, "Not specified");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus28 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus28.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus32 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus32.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus33 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus33.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus39 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus39.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus40 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus40.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus48 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus48.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus52 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus52.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus53 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus53.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        boolean boolean6 = stubPayment0.refund((double) 1);
        boolean boolean8 = stubPayment0.refund(10.0d);
        boolean boolean10 = stubPayment0.refund((double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        java.lang.String str14 = administrator2.getEmail();
        administrator2.setName("hi!");
        administrator2.setEmail("Not specified");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.refund((double) (short) -1);
        boolean boolean4 = stubPayment0.refund((double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getBuilding();
        administrator2.addRoom(room5);
        Chief_event_coordinator.Classes.RoomStatus roomStatus8 = room5.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            room5.setBuilding("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Building is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertTrue("'" + roomStatus8 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus8.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor2 = room1.getOccupancySensor();
        Chief_event_coordinator.Classes.RoomStatus roomStatus3 = room1.getStatus();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        Chief_event_coordinator.Classes.RoomStatus roomStatus7 = room5.getStatus();
        room1.setStatus(roomStatus7);
        org.junit.Assert.assertNotNull(occupancySensor2);
        org.junit.Assert.assertTrue("'" + roomStatus3 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus3.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertTrue("'" + roomStatus7 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus7.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        java.lang.String str4 = administrator2.getName();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver5 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str8 = room7.getRoomLocation();
        administrator2.closeRoom(room7);
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str12 = room11.getBuilding();
        java.lang.String str13 = room11.getClosureReason();
        Chief_event_coordinator.Classes.Administrator administrator16 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room18 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator16.viewRoomStatus(room18);
        int int20 = room18.getCapacity();
        Chief_event_coordinator.Classes.RoomStatus roomStatus21 = room18.getStatus();
        room11.setStatus(roomStatus21);
        room7.setStatus(roomStatus21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Not specified" + "'", str8, "Not specified");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Not specified" + "'", str12, "Not specified");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + roomStatus21 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus21.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getBuilding();
        Chief_event_coordinator.Classes.Administrator administrator10 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str11 = administrator10.getEmail();
        Chief_event_coordinator.Classes.Room room13 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str14 = room13.getBuilding();
        administrator10.addRoom(room13);
        Chief_event_coordinator.Classes.RoomStatus roomStatus16 = room13.getStatus();
        room4.setStatus(roomStatus16);
        int int18 = room4.getRoomid();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Not specified" + "'", str14, "Not specified");
        org.junit.Assert.assertTrue("'" + roomStatus16 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus16.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver2 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        room1.setBuilding("hi!");
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        Chief_event_coordinator.Classes.Booking booking6 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus7 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus8 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        // The following exception was thrown during execution in test generation
        try {
            roomAvailabilityObserver5.onBookingStatusChanged(booking6, bookingStatus7, bookingStatus8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getRoomName()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus8.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver9 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap10 = administrator2.viewBookings();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver11 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        Chief_event_coordinator.Classes.Booking booking12 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment13 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean15 = stubPayment13.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver16 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment13);
        Chief_event_coordinator.Classes.Booking booking17 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus18 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment19 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver20 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment19);
        Chief_event_coordinator.Classes.Booking booking21 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus22 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus23 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver20.onBookingStatusChanged(booking21, bookingStatus22, bookingStatus23);
        paymentNotificationObserver16.onBookingStatusChanged(booking17, bookingStatus18, bookingStatus22);
        Chief_event_coordinator.Classes.Booking booking26 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment27 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver28 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment27);
        boolean boolean30 = stubPayment27.refund(100.0d);
        boolean boolean32 = stubPayment27.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver33 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment27);
        Chief_event_coordinator.Classes.Booking booking34 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus35 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment36 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean38 = stubPayment36.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver39 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment36);
        Chief_event_coordinator.Classes.Booking booking40 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus41 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment42 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver43 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment42);
        Chief_event_coordinator.Classes.Booking booking44 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus45 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus46 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver43.onBookingStatusChanged(booking44, bookingStatus45, bookingStatus46);
        paymentNotificationObserver39.onBookingStatusChanged(booking40, bookingStatus41, bookingStatus45);
        paymentNotificationObserver33.onBookingStatusChanged(booking34, bookingStatus35, bookingStatus41);
        Chief_event_coordinator.Observer.StubPayment stubPayment50 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver51 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment50);
        boolean boolean53 = stubPayment50.refund(100.0d);
        boolean boolean55 = stubPayment50.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver56 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment50);
        Chief_event_coordinator.Classes.Booking booking57 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment58 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean60 = stubPayment58.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver61 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment58);
        Chief_event_coordinator.Classes.Booking booking62 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus63 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment64 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver65 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment64);
        Chief_event_coordinator.Classes.Booking booking66 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus67 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus68 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver65.onBookingStatusChanged(booking66, bookingStatus67, bookingStatus68);
        paymentNotificationObserver61.onBookingStatusChanged(booking62, bookingStatus63, bookingStatus67);
        Chief_event_coordinator.Observer.StubPayment stubPayment71 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver72 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment71);
        Chief_event_coordinator.Classes.Booking booking73 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus74 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus75 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver72.onBookingStatusChanged(booking73, bookingStatus74, bookingStatus75);
        paymentNotificationObserver56.onBookingStatusChanged(booking57, bookingStatus67, bookingStatus74);
        paymentNotificationObserver16.onBookingStatusChanged(booking26, bookingStatus41, bookingStatus67);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus79 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver11.onBookingStatusChanged(booking12, bookingStatus67, bookingStatus79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertNotNull(intMap10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus18.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus22.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus23.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus35 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus35.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus41 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus41.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus45 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus45.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus46 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus46.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus63 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus63.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus67 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus67.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus68 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus68.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus74 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus74.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus75 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus75.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus79 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus79.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        java.lang.String str7 = room5.getBuilding();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str11 = room10.getRoomLocation();
        administrator2.disableRoom(room10);
        Chief_event_coordinator.Classes.Administrator administrator15 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room17 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator15.viewRoomStatus(room17);
        Chief_event_coordinator.Classes.Room room20 = new Chief_event_coordinator.Classes.Room((int) '#');
        room20.setRoomLocation("hi!");
        java.lang.String str23 = room20.getClosureReason();
        room20.setRoomLocation("hi!");
        administrator15.enableRoom(room20);
        Chief_event_coordinator.Classes.Room room28 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor29 = room28.getOccupancySensor();
        administrator15.addRoom(room28);
        Chief_event_coordinator.Classes.Room room32 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver33 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room32);
        int int34 = room32.getCapacity();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner35 = room32.getIdBadgeScanner();
        administrator15.disableRoom(room32);
        Chief_event_coordinator.Classes.Room room38 = new Chief_event_coordinator.Classes.Room((int) '#');
        room38.setRoomLocation("hi!");
        java.lang.String str41 = room38.getClosureReason();
        room38.setRoomLocation("hi!");
        java.lang.String str44 = room38.getClosureReason();
        administrator15.viewRoomStatus(room38);
        administrator2.addRoom(room38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Not specified" + "'", str11, "Not specified");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(occupancySensor29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(idBadgeScanner35);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        int int2 = room1.getCapacity();
        int int3 = room1.getRoomid();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor11 = room10.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner12 = room10.getIdBadgeScanner();
        administrator2.enableRoom(room10);
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str16 = room15.getClosureReason();
        Chief_event_coordinator.Classes.RoomStatus roomStatus17 = room15.getStatus();
        administrator2.closeRoom(room15);
        Chief_event_coordinator.Classes.Administrator administrator21 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room23 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver24 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room23);
        administrator21.addRoom(room23);
        java.lang.String str26 = administrator21.getEmail();
        Chief_event_coordinator.Classes.Administrator administrator29 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room31 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver32 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room31);
        administrator29.addRoom(room31);
        administrator21.enableRoom(room31);
        java.lang.String str35 = room31.getClosureReason();
        administrator2.viewRoomStatus(room31);
        java.lang.String str37 = room31.getRoomLocation();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertNotNull(occupancySensor11);
        org.junit.Assert.assertNotNull(idBadgeScanner12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + roomStatus17 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus17.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Not specified" + "'", str37, "Not specified");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator5.viewRoomStatus(room7);
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator12 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator12.viewRoomStatus(room14);
        int int16 = room14.getCapacity();
        administrator2.disableRoom(room14);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver18 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        administrator2.setName("");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver1 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean3 = stubPayment0.charge((double) 1.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver4 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator5.viewRoomStatus(room7);
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator12 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator12.viewRoomStatus(room14);
        int int16 = room14.getCapacity();
        administrator2.disableRoom(room14);
        room14.setBuilding("Not specified");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver2 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        int int3 = room1.getCapacity();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner4 = room1.getIdBadgeScanner();
        room1.setRoomLocation("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(idBadgeScanner4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver2 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        room1.setBuilding("hi!");
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        Chief_event_coordinator.Classes.Booking booking6 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment7 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver8 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment7);
        boolean boolean10 = stubPayment7.refund(100.0d);
        boolean boolean12 = stubPayment7.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver13 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment7);
        Chief_event_coordinator.Classes.Booking booking14 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus15 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment16 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean18 = stubPayment16.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver19 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment16);
        Chief_event_coordinator.Classes.Booking booking20 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment22 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver23 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment22);
        Chief_event_coordinator.Classes.Booking booking24 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus26 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver23.onBookingStatusChanged(booking24, bookingStatus25, bookingStatus26);
        paymentNotificationObserver19.onBookingStatusChanged(booking20, bookingStatus21, bookingStatus25);
        paymentNotificationObserver13.onBookingStatusChanged(booking14, bookingStatus15, bookingStatus21);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus30 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        // The following exception was thrown during execution in test generation
        try {
            roomAvailabilityObserver5.onBookingStatusChanged(booking6, bookingStatus21, bookingStatus30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getRoomName()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus15.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus25.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus26.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus30 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus30.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((-1), (int) (short) 0, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room id must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (short) 10);
        room1.setBuilding("hi!");
        java.lang.String str4 = room1.getBuilding();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        boolean boolean6 = stubPayment0.refund((double) 1);
        boolean boolean8 = stubPayment0.refund((double) 'a');
        boolean boolean10 = stubPayment0.charge((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("Not specified");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment3 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver4 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment3);
        boolean boolean6 = stubPayment3.refund(100.0d);
        boolean boolean8 = stubPayment3.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver9 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment3);
        Chief_event_coordinator.Classes.Booking booking10 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment11 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean13 = stubPayment11.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver14 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment11);
        Chief_event_coordinator.Classes.Booking booking15 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus16 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment17 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver18 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment17);
        Chief_event_coordinator.Classes.Booking booking19 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus20 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver18.onBookingStatusChanged(booking19, bookingStatus20, bookingStatus21);
        paymentNotificationObserver14.onBookingStatusChanged(booking15, bookingStatus16, bookingStatus20);
        Chief_event_coordinator.Observer.StubPayment stubPayment24 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver25 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment24);
        Chief_event_coordinator.Classes.Booking booking26 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus27 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus28 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver25.onBookingStatusChanged(booking26, bookingStatus27, bookingStatus28);
        paymentNotificationObserver9.onBookingStatusChanged(booking10, bookingStatus20, bookingStatus27);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus31 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus20, bookingStatus31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus16.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus20.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus27.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus28 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus28.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus31 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus31.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator16 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str17 = administrator16.getEmail();
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor20 = room19.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner21 = room19.getIdBadgeScanner();
        administrator16.enableRoom(room19);
        administrator2.closeRoom(room19);
        int int24 = room19.getRoomid();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor20);
        org.junit.Assert.assertNotNull(idBadgeScanner21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str2 = room1.getClosureReason();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner3 = room1.getIdBadgeScanner();
        int int4 = room1.getRoomid();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(idBadgeScanner3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str2 = room1.getClosureReason();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner3 = room1.getIdBadgeScanner();
        java.lang.Class<?> wildcardClass4 = idBadgeScanner3.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(idBadgeScanner3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor2 = room1.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner3 = room1.getIdBadgeScanner();
        // The following exception was thrown during execution in test generation
        try {
            room1.setRoomLocation("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room location is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(occupancySensor2);
        org.junit.Assert.assertNotNull(idBadgeScanner3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver9 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        Chief_event_coordinator.Classes.Booking booking10 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment11 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean13 = stubPayment11.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver14 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment11);
        Chief_event_coordinator.Classes.Booking booking15 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus16 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment17 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver18 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment17);
        Chief_event_coordinator.Classes.Booking booking19 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus20 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver18.onBookingStatusChanged(booking19, bookingStatus20, bookingStatus21);
        paymentNotificationObserver14.onBookingStatusChanged(booking15, bookingStatus16, bookingStatus20);
        Chief_event_coordinator.Classes.Booking booking24 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment25 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver26 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment25);
        boolean boolean28 = stubPayment25.refund(100.0d);
        boolean boolean30 = stubPayment25.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver31 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment25);
        Chief_event_coordinator.Classes.Booking booking32 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus33 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment34 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean36 = stubPayment34.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver37 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment34);
        Chief_event_coordinator.Classes.Booking booking38 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus39 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment40 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver41 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment40);
        Chief_event_coordinator.Classes.Booking booking42 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus43 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus44 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver41.onBookingStatusChanged(booking42, bookingStatus43, bookingStatus44);
        paymentNotificationObserver37.onBookingStatusChanged(booking38, bookingStatus39, bookingStatus43);
        paymentNotificationObserver31.onBookingStatusChanged(booking32, bookingStatus33, bookingStatus39);
        Chief_event_coordinator.Observer.StubPayment stubPayment48 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver49 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment48);
        boolean boolean51 = stubPayment48.refund(100.0d);
        boolean boolean53 = stubPayment48.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver54 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment48);
        Chief_event_coordinator.Classes.Booking booking55 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment56 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean58 = stubPayment56.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver59 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment56);
        Chief_event_coordinator.Classes.Booking booking60 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus61 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment62 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver63 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment62);
        Chief_event_coordinator.Classes.Booking booking64 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus65 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus66 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver63.onBookingStatusChanged(booking64, bookingStatus65, bookingStatus66);
        paymentNotificationObserver59.onBookingStatusChanged(booking60, bookingStatus61, bookingStatus65);
        Chief_event_coordinator.Observer.StubPayment stubPayment69 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver70 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment69);
        Chief_event_coordinator.Classes.Booking booking71 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus72 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus73 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver70.onBookingStatusChanged(booking71, bookingStatus72, bookingStatus73);
        paymentNotificationObserver54.onBookingStatusChanged(booking55, bookingStatus65, bookingStatus72);
        paymentNotificationObserver14.onBookingStatusChanged(booking24, bookingStatus39, bookingStatus65);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus77 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver9.onBookingStatusChanged(booking10, bookingStatus65, bookingStatus77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus16.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus20.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus33 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus33.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus39 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus39.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus43 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus43.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus44 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus44.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus61 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus61.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus65 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus65.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus66 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus66.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus72 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus72.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus73 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus73.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus77 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus77.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator16 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str17 = administrator16.getEmail();
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor20 = room19.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner21 = room19.getIdBadgeScanner();
        administrator16.enableRoom(room19);
        administrator2.viewRoomStatus(room19);
        administrator2.setEmail("hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor20);
        org.junit.Assert.assertNotNull(idBadgeScanner21);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver9 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap10 = administrator2.viewBookings();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver11 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.lang.String str12 = administrator2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertNotNull(intMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        java.lang.String str7 = room5.getBuilding();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str11 = room10.getRoomLocation();
        administrator2.disableRoom(room10);
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver13 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room10);
        java.lang.Class<?> wildcardClass14 = room10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Not specified" + "'", str11, "Not specified");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        administrator2.setEmail("Not specified");
        Chief_event_coordinator.Classes.Administrator administrator8 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str9 = administrator8.getEmail();
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor12 = room11.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner13 = room11.getIdBadgeScanner();
        administrator8.enableRoom(room11);
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor17 = room16.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner18 = room16.getIdBadgeScanner();
        administrator8.enableRoom(room16);
        administrator2.viewRoomStatus(room16);
        int int21 = room16.getRoomid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor12);
        org.junit.Assert.assertNotNull(idBadgeScanner13);
        org.junit.Assert.assertNotNull(occupancySensor17);
        org.junit.Assert.assertNotNull(idBadgeScanner18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str2 = room1.getBuilding();
        int int3 = room1.getCapacity();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        Chief_event_coordinator.Classes.RoomStatus roomStatus7 = room5.getStatus();
        room1.setStatus(roomStatus7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Not specified" + "'", str2, "Not specified");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertTrue("'" + roomStatus7 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus7.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor11 = room10.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner12 = room10.getIdBadgeScanner();
        administrator2.enableRoom(room10);
        administrator2.setEmail("hi!");
        java.lang.String str16 = administrator2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertNotNull(occupancySensor11);
        org.junit.Assert.assertNotNull(idBadgeScanner12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver5 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver6 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean8 = stubPayment0.charge((double) '4');
        boolean boolean10 = stubPayment0.charge((double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str10 = room9.getBuilding();
        java.lang.String str11 = room9.getClosureReason();
        administrator2.disableRoom(room9);
        Chief_event_coordinator.Classes.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            administrator2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Room.setStatus(Chief_event_coordinator.Classes.RoomStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        administrator2.setEmail("Not specified");
        Chief_event_coordinator.Classes.Administrator administrator8 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str9 = administrator8.getEmail();
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor12 = room11.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner13 = room11.getIdBadgeScanner();
        administrator8.enableRoom(room11);
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor17 = room16.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner18 = room16.getIdBadgeScanner();
        administrator8.enableRoom(room16);
        administrator2.viewRoomStatus(room16);
        Chief_event_coordinator.Classes.Room room22 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str23 = room22.getBuilding();
        int int24 = room22.getCapacity();
        administrator2.closeRoom(room22);
        Chief_event_coordinator.Classes.Room room26 = null;
        // The following exception was thrown during execution in test generation
        try {
            administrator2.viewRoomStatus(room26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Room.getRoomid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor12);
        org.junit.Assert.assertNotNull(idBadgeScanner13);
        org.junit.Assert.assertNotNull(occupancySensor17);
        org.junit.Assert.assertNotNull(idBadgeScanner18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Not specified" + "'", str23, "Not specified");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator16 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str17 = administrator16.getEmail();
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor20 = room19.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner21 = room19.getIdBadgeScanner();
        administrator16.enableRoom(room19);
        administrator2.closeRoom(room19);
        administrator2.setEmail("Not specified");
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap26 = administrator2.viewBookings();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor20);
        org.junit.Assert.assertNotNull(idBadgeScanner21);
        org.junit.Assert.assertNotNull(intMap26);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver1 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator0);
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment3 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver4 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment3);
        Chief_event_coordinator.Classes.Booking booking5 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus6 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus7 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver4.onBookingStatusChanged(booking5, bookingStatus6, bookingStatus7);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus9 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver1.onBookingStatusChanged(booking2, bookingStatus7, bookingStatus9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus6.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus7.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        java.lang.String str7 = room5.getBuilding();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str11 = room10.getRoomLocation();
        administrator2.disableRoom(room10);
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver13 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room10);
        // The following exception was thrown during execution in test generation
        try {
            room10.setBuilding("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Building is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Not specified" + "'", str11, "Not specified");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room(10, 35, "", "Not specified");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Building is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        java.lang.String str6 = administrator2.getEmail();
        java.lang.String str7 = administrator2.getName();
        Chief_event_coordinator.Classes.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            administrator2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Room.getRoomid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        java.lang.String str6 = room4.getBuilding();
        int int7 = room4.getRoomid();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room(100);
        Chief_event_coordinator.Classes.RoomStatus roomStatus2 = room1.getStatus();
        org.junit.Assert.assertTrue("'" + roomStatus2 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus2.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '4');
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver1 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator0);
        java.util.List<java.lang.String> strList2 = adminDashboardObserver1.getActivityLog();
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str2 = room1.getBuilding();
        int int3 = room1.getRoomid();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner4 = room1.getIdBadgeScanner();
        int int5 = room1.getRoomid();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Not specified" + "'", str2, "Not specified");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(idBadgeScanner4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver1 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator0);
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment3 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean5 = stubPayment3.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver6 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment3);
        Chief_event_coordinator.Classes.Booking booking7 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus8 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment9 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver10 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment9);
        Chief_event_coordinator.Classes.Booking booking11 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus12 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus13 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver10.onBookingStatusChanged(booking11, bookingStatus12, bookingStatus13);
        paymentNotificationObserver6.onBookingStatusChanged(booking7, bookingStatus8, bookingStatus12);
        Chief_event_coordinator.Observer.StubPayment stubPayment16 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver17 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment16);
        Chief_event_coordinator.Classes.Booking booking18 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus19 = Chief_event_coordinator.Observer.BookingStatus.CONFIRMED;
        Chief_event_coordinator.Observer.StubPayment stubPayment20 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean22 = stubPayment20.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver23 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment20);
        Chief_event_coordinator.Classes.Booking booking24 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment26 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver27 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment26);
        Chief_event_coordinator.Classes.Booking booking28 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus29 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus30 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver27.onBookingStatusChanged(booking28, bookingStatus29, bookingStatus30);
        paymentNotificationObserver23.onBookingStatusChanged(booking24, bookingStatus25, bookingStatus29);
        paymentNotificationObserver17.onBookingStatusChanged(booking18, bookingStatus19, bookingStatus29);
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver1.onBookingStatusChanged(booking2, bookingStatus12, bookingStatus29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus8.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus12.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus13.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus19.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus25.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus29 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus29.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus30 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus30.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor11 = room10.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner12 = room10.getIdBadgeScanner();
        administrator2.enableRoom(room10);
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str16 = room15.getClosureReason();
        Chief_event_coordinator.Classes.RoomStatus roomStatus17 = room15.getStatus();
        administrator2.closeRoom(room15);
        Chief_event_coordinator.Classes.Administrator administrator21 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room23 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver24 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room23);
        administrator21.addRoom(room23);
        java.lang.String str26 = administrator21.getEmail();
        Chief_event_coordinator.Classes.Administrator administrator29 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room31 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver32 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room31);
        administrator29.addRoom(room31);
        administrator21.enableRoom(room31);
        java.lang.String str35 = room31.getClosureReason();
        administrator2.viewRoomStatus(room31);
        java.lang.Class<?> wildcardClass37 = room31.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertNotNull(occupancySensor11);
        org.junit.Assert.assertNotNull(idBadgeScanner12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + roomStatus17 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus17.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator5.viewRoomStatus(room7);
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator12 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator12.viewRoomStatus(room14);
        int int16 = room14.getCapacity();
        administrator2.disableRoom(room14);
        java.lang.String str18 = room14.getBuilding();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        java.lang.String str7 = room5.getBuilding();
        administrator2.enableRoom(room5);
        java.lang.String str9 = administrator2.getEmail();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver10 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.lang.String str11 = administrator2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver3 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        administrator2.setEmail("hi!");
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap6 = administrator2.viewBookings();
        org.junit.Assert.assertNotNull(intMap6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge(10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str10 = room9.getBuilding();
        java.lang.String str11 = room9.getClosureReason();
        administrator2.disableRoom(room9);
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor15 = room14.getOccupancySensor();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver16 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room14);
        administrator2.viewRoomStatus(room14);
        Chief_event_coordinator.Classes.Administrator administrator20 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str21 = administrator20.getEmail();
        Chief_event_coordinator.Classes.Room room23 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str24 = room23.getRoomLocation();
        java.lang.String str25 = room23.getBuilding();
        administrator20.enableRoom(room23);
        administrator2.closeRoom(room23);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Not specified" + "'", str24, "Not specified");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Not specified" + "'", str25, "Not specified");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        java.lang.String str6 = administrator2.getName();
        Chief_event_coordinator.Classes.Administrator administrator9 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator9.viewRoomStatus(room11);
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        room14.setRoomLocation("hi!");
        java.lang.String str17 = room14.getClosureReason();
        room14.setRoomLocation("hi!");
        administrator9.enableRoom(room14);
        Chief_event_coordinator.Classes.Room room22 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor23 = room22.getOccupancySensor();
        administrator9.addRoom(room22);
        administrator2.viewRoomStatus(room22);
        java.lang.String str26 = room22.getRoomLocation();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(occupancySensor23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Not specified" + "'", str26, "Not specified");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str10 = room9.getBuilding();
        java.lang.String str11 = room9.getClosureReason();
        administrator2.disableRoom(room9);
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor15 = room14.getOccupancySensor();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver16 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room14);
        administrator2.viewRoomStatus(room14);
        Chief_event_coordinator.Classes.Administrator administrator20 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room22 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver23 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room22);
        administrator20.addRoom(room22);
        java.lang.String str25 = administrator20.getEmail();
        Chief_event_coordinator.Classes.Administrator administrator28 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room30 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver31 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room30);
        administrator28.addRoom(room30);
        administrator20.enableRoom(room30);
        java.lang.String str34 = room30.getRoomLocation();
        Chief_event_coordinator.Classes.Room room36 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str37 = room36.getClosureReason();
        Chief_event_coordinator.Classes.RoomStatus roomStatus38 = room36.getStatus();
        room30.setStatus(roomStatus38);
        room14.setStatus(roomStatus38);
        room14.setRoomLocation("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Not specified" + "'", str34, "Not specified");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + roomStatus38 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus38.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator5.viewRoomStatus(room7);
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str12 = room11.getBuilding();
        java.lang.String str13 = room11.getClosureReason();
        Chief_event_coordinator.Classes.Administrator administrator16 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room18 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator16.viewRoomStatus(room18);
        int int20 = room18.getCapacity();
        Chief_event_coordinator.Classes.RoomStatus roomStatus21 = room18.getStatus();
        room11.setStatus(roomStatus21);
        room7.setStatus(roomStatus21);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Not specified" + "'", str12, "Not specified");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + roomStatus21 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus21.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        java.lang.String str7 = room5.getBuilding();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str11 = room10.getRoomLocation();
        administrator2.disableRoom(room10);
        administrator2.setName("");
        administrator2.setName("hi!");
        administrator2.setEmail("Maintenance");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Not specified" + "'", str11, "Not specified");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver3 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        Chief_event_coordinator.Classes.Booking booking4 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment6 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver7 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment6);
        Chief_event_coordinator.Classes.Booking booking8 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus9 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus10 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver7.onBookingStatusChanged(booking8, bookingStatus9, bookingStatus10);
        paymentNotificationObserver3.onBookingStatusChanged(booking4, bookingStatus5, bookingStatus9);
        Chief_event_coordinator.Classes.Booking booking13 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment14 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver15 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment14);
        boolean boolean17 = stubPayment14.refund(100.0d);
        boolean boolean19 = stubPayment14.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver20 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment14);
        Chief_event_coordinator.Classes.Booking booking21 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus22 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment23 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean25 = stubPayment23.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver26 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment23);
        Chief_event_coordinator.Classes.Booking booking27 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus28 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment29 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver30 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment29);
        Chief_event_coordinator.Classes.Booking booking31 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus32 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus33 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver30.onBookingStatusChanged(booking31, bookingStatus32, bookingStatus33);
        paymentNotificationObserver26.onBookingStatusChanged(booking27, bookingStatus28, bookingStatus32);
        paymentNotificationObserver20.onBookingStatusChanged(booking21, bookingStatus22, bookingStatus28);
        Chief_event_coordinator.Observer.StubPayment stubPayment37 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver38 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment37);
        boolean boolean40 = stubPayment37.refund(100.0d);
        boolean boolean42 = stubPayment37.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver43 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment37);
        Chief_event_coordinator.Classes.Booking booking44 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment45 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean47 = stubPayment45.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver48 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment45);
        Chief_event_coordinator.Classes.Booking booking49 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus50 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment51 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver52 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment51);
        Chief_event_coordinator.Classes.Booking booking53 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus54 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus55 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver52.onBookingStatusChanged(booking53, bookingStatus54, bookingStatus55);
        paymentNotificationObserver48.onBookingStatusChanged(booking49, bookingStatus50, bookingStatus54);
        Chief_event_coordinator.Observer.StubPayment stubPayment58 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver59 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment58);
        Chief_event_coordinator.Classes.Booking booking60 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus61 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus62 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver59.onBookingStatusChanged(booking60, bookingStatus61, bookingStatus62);
        paymentNotificationObserver43.onBookingStatusChanged(booking44, bookingStatus54, bookingStatus61);
        paymentNotificationObserver3.onBookingStatusChanged(booking13, bookingStatus28, bookingStatus54);
        java.lang.Class<?> wildcardClass66 = paymentNotificationObserver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus9.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus10.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus22.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus28 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus28.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus32 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus32.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus33 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus33.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus50 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus50.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus54 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus54.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus55 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus55.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus61 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus61.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus62 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus62.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator5.viewRoomStatus(room7);
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator12 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator12.viewRoomStatus(room14);
        int int16 = room14.getCapacity();
        administrator2.disableRoom(room14);
        // The following exception was thrown during execution in test generation
        try {
            room14.setRoomLocation("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room location is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.refund((double) (short) -1);
        boolean boolean4 = stubPayment0.refund(0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver1 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator0);
        java.util.List<java.lang.String> strList2 = adminDashboardObserver1.getActivityLog();
        java.util.List<java.lang.String> strList3 = adminDashboardObserver1.getActivityLog();
        java.util.List<java.lang.String> strList4 = adminDashboardObserver1.getActivityLog();
        java.util.List<java.lang.String> strList5 = adminDashboardObserver1.getActivityLog();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor16 = room15.getOccupancySensor();
        administrator2.addRoom(room15);
        administrator2.setName("hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(occupancySensor16);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) (short) 10);
        administrator2.viewRoomStatus(room15);
        Chief_event_coordinator.Classes.RoomStatus roomStatus17 = room15.getStatus();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + roomStatus17 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus17.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("Maintenance", "Not specified");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        int int6 = room4.getCapacity();
        java.lang.String str7 = room4.getBuilding();
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver10 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room9);
        int int11 = room9.getCapacity();
        Chief_event_coordinator.Classes.RoomStatus roomStatus12 = room9.getStatus();
        room4.setStatus(roomStatus12);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + roomStatus12 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus12.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver2 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        int int3 = room1.getCapacity();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner4 = room1.getIdBadgeScanner();
        java.lang.String str5 = room1.getClosureReason();
        room1.setCapacity((int) (short) 10);
        java.lang.Class<?> wildcardClass8 = room1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(idBadgeScanner4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        java.lang.String str7 = room5.getBuilding();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str11 = room10.getRoomLocation();
        administrator2.disableRoom(room10);
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap13 = administrator2.viewBookings();
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap14 = administrator2.viewBookings();
        administrator2.setName("Maintenance");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Not specified" + "'", str11, "Not specified");
        org.junit.Assert.assertNotNull(intMap13);
        org.junit.Assert.assertNotNull(intMap14);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver1 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator0);
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment3 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver4 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment3);
        Chief_event_coordinator.Classes.Booking booking5 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus6 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus7 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver4.onBookingStatusChanged(booking5, bookingStatus6, bookingStatus7);
        Chief_event_coordinator.Observer.StubPayment stubPayment9 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver10 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment9);
        Chief_event_coordinator.Classes.Booking booking11 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment12 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver13 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment12);
        boolean boolean15 = stubPayment12.refund(100.0d);
        boolean boolean17 = stubPayment12.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver18 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment12);
        Chief_event_coordinator.Classes.Booking booking19 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus20 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment21 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean23 = stubPayment21.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver24 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment21);
        Chief_event_coordinator.Classes.Booking booking25 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus26 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment27 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver28 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment27);
        Chief_event_coordinator.Classes.Booking booking29 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus30 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus31 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver28.onBookingStatusChanged(booking29, bookingStatus30, bookingStatus31);
        paymentNotificationObserver24.onBookingStatusChanged(booking25, bookingStatus26, bookingStatus30);
        paymentNotificationObserver18.onBookingStatusChanged(booking19, bookingStatus20, bookingStatus26);
        Chief_event_coordinator.Observer.StubPayment stubPayment35 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver36 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment35);
        boolean boolean38 = stubPayment35.refund(100.0d);
        boolean boolean40 = stubPayment35.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver41 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment35);
        Chief_event_coordinator.Classes.Booking booking42 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus43 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment44 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean46 = stubPayment44.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver47 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment44);
        Chief_event_coordinator.Classes.Booking booking48 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus49 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment50 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver51 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment50);
        Chief_event_coordinator.Classes.Booking booking52 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus53 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus54 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver51.onBookingStatusChanged(booking52, bookingStatus53, bookingStatus54);
        paymentNotificationObserver47.onBookingStatusChanged(booking48, bookingStatus49, bookingStatus53);
        paymentNotificationObserver41.onBookingStatusChanged(booking42, bookingStatus43, bookingStatus49);
        paymentNotificationObserver10.onBookingStatusChanged(booking11, bookingStatus20, bookingStatus49);
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver1.onBookingStatusChanged(booking2, bookingStatus6, bookingStatus49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus6.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus7.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus20.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus26.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus30 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus30.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus31 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus31.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus43 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus43.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus49 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus49.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus53 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus53.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus54 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus54.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Administrator administrator10 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver13 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room12);
        administrator10.addRoom(room12);
        administrator2.enableRoom(room12);
        java.lang.String str16 = room12.getClosureReason();
        int int17 = room12.getRoomid();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("", "Maintenance");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str10 = room9.getBuilding();
        java.lang.String str11 = room9.getClosureReason();
        administrator2.disableRoom(room9);
        int int13 = room9.getRoomid();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver9 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap10 = administrator2.viewBookings();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver11 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap12 = administrator2.viewBookings();
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap13 = administrator2.viewBookings();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertNotNull(intMap10);
        org.junit.Assert.assertNotNull(intMap12);
        org.junit.Assert.assertNotNull(intMap13);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        boolean boolean6 = stubPayment0.refund((double) 1);
        boolean boolean8 = stubPayment0.refund((double) (-1));
        boolean boolean10 = stubPayment0.charge((-1.0d));
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver11 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver1 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean3 = stubPayment0.refund(100.0d);
        boolean boolean5 = stubPayment0.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver6 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        Chief_event_coordinator.Classes.Booking booking7 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment8 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean10 = stubPayment8.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver11 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment8);
        Chief_event_coordinator.Classes.Booking booking12 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus13 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment14 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver15 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment14);
        Chief_event_coordinator.Classes.Booking booking16 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus17 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus18 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver15.onBookingStatusChanged(booking16, bookingStatus17, bookingStatus18);
        paymentNotificationObserver11.onBookingStatusChanged(booking12, bookingStatus13, bookingStatus17);
        Chief_event_coordinator.Observer.StubPayment stubPayment21 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver22 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment21);
        Chief_event_coordinator.Classes.Booking booking23 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus24 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver22.onBookingStatusChanged(booking23, bookingStatus24, bookingStatus25);
        paymentNotificationObserver6.onBookingStatusChanged(booking7, bookingStatus17, bookingStatus24);
        java.lang.Class<?> wildcardClass28 = bookingStatus17.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus13.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus17.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus18.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus24.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus25.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Administrator administrator10 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver13 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room12);
        administrator10.addRoom(room12);
        administrator2.enableRoom(room12);
        java.lang.Class<?> wildcardClass16 = administrator2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver1 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean3 = stubPayment0.charge((double) 100);
        boolean boolean5 = stubPayment0.refund((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        java.lang.String str14 = administrator2.getEmail();
        java.lang.String str15 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Administrator administrator18 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room20 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver21 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room20);
        administrator18.addRoom(room20);
        java.lang.String str23 = administrator18.getEmail();
        java.lang.String str24 = administrator18.getEmail();
        Chief_event_coordinator.Classes.Room room26 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver27 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room26);
        int int28 = room26.getCapacity();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner29 = room26.getIdBadgeScanner();
        java.lang.String str30 = room26.getClosureReason();
        administrator18.closeRoom(room26);
        administrator2.viewRoomStatus(room26);
        java.lang.String str33 = room26.getClosureReason();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(idBadgeScanner29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Maintenance" + "'", str33, "Maintenance");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        java.lang.String str14 = administrator2.getEmail();
        java.lang.String str15 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Administrator administrator18 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room20 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver21 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room20);
        administrator18.addRoom(room20);
        java.lang.String str23 = administrator18.getEmail();
        java.lang.String str24 = administrator18.getEmail();
        Chief_event_coordinator.Classes.Room room26 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver27 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room26);
        int int28 = room26.getCapacity();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner29 = room26.getIdBadgeScanner();
        java.lang.String str30 = room26.getClosureReason();
        administrator18.closeRoom(room26);
        administrator2.viewRoomStatus(room26);
        administrator2.setName("Maintenance");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(idBadgeScanner29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor2 = room1.getOccupancySensor();
        room1.setBuilding("hi!");
        room1.setCapacity((int) (short) 1);
        org.junit.Assert.assertNotNull(occupancySensor2);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver1 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean3 = stubPayment0.refund((double) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room id must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor16 = room15.getOccupancySensor();
        administrator2.addRoom(room15);
        java.lang.String str18 = administrator2.getName();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(occupancySensor16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        java.lang.String str4 = administrator2.getName();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver5 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.util.List<java.lang.String> strList6 = adminDashboardObserver5.getActivityLog();
        java.util.List<java.lang.String> strList7 = adminDashboardObserver5.getActivityLog();
        java.util.List<java.lang.String> strList8 = adminDashboardObserver5.getActivityLog();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        administrator2.setEmail("Not specified");
        Chief_event_coordinator.Classes.Administrator administrator8 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str9 = administrator8.getEmail();
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor12 = room11.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner13 = room11.getIdBadgeScanner();
        administrator8.enableRoom(room11);
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor17 = room16.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner18 = room16.getIdBadgeScanner();
        administrator8.enableRoom(room16);
        administrator2.viewRoomStatus(room16);
        room16.setCapacity((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor12);
        org.junit.Assert.assertNotNull(idBadgeScanner13);
        org.junit.Assert.assertNotNull(occupancySensor17);
        org.junit.Assert.assertNotNull(idBadgeScanner18);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator5.viewRoomStatus(room7);
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator12 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str13 = administrator12.getEmail();
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor16 = room15.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner17 = room15.getIdBadgeScanner();
        administrator12.enableRoom(room15);
        Chief_event_coordinator.Classes.Room room20 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor21 = room20.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner22 = room20.getIdBadgeScanner();
        administrator12.enableRoom(room20);
        administrator2.enableRoom(room20);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor16);
        org.junit.Assert.assertNotNull(idBadgeScanner17);
        org.junit.Assert.assertNotNull(occupancySensor21);
        org.junit.Assert.assertNotNull(idBadgeScanner22);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("Maintenance", "hi!");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        java.lang.String str4 = administrator2.getName();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver5 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.util.List<java.lang.String> strList6 = adminDashboardObserver5.getActivityLog();
        Chief_event_coordinator.Classes.Booking booking7 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment8 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver9 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment8);
        Chief_event_coordinator.Classes.Booking booking10 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus11 = Chief_event_coordinator.Observer.BookingStatus.CONFIRMED;
        Chief_event_coordinator.Observer.StubPayment stubPayment12 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean14 = stubPayment12.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver15 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment12);
        Chief_event_coordinator.Classes.Booking booking16 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus17 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment18 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver19 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment18);
        Chief_event_coordinator.Classes.Booking booking20 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus22 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver19.onBookingStatusChanged(booking20, bookingStatus21, bookingStatus22);
        paymentNotificationObserver15.onBookingStatusChanged(booking16, bookingStatus17, bookingStatus21);
        paymentNotificationObserver9.onBookingStatusChanged(booking10, bookingStatus11, bookingStatus21);
        Chief_event_coordinator.Observer.StubPayment stubPayment26 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver27 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment26);
        Chief_event_coordinator.Classes.Booking booking28 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment29 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver30 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment29);
        boolean boolean32 = stubPayment29.refund(100.0d);
        boolean boolean34 = stubPayment29.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver35 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment29);
        Chief_event_coordinator.Classes.Booking booking36 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus37 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment38 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean40 = stubPayment38.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver41 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment38);
        Chief_event_coordinator.Classes.Booking booking42 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus43 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment44 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver45 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment44);
        Chief_event_coordinator.Classes.Booking booking46 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus47 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus48 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver45.onBookingStatusChanged(booking46, bookingStatus47, bookingStatus48);
        paymentNotificationObserver41.onBookingStatusChanged(booking42, bookingStatus43, bookingStatus47);
        paymentNotificationObserver35.onBookingStatusChanged(booking36, bookingStatus37, bookingStatus43);
        Chief_event_coordinator.Observer.StubPayment stubPayment52 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver53 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment52);
        boolean boolean55 = stubPayment52.refund(100.0d);
        boolean boolean57 = stubPayment52.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver58 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment52);
        Chief_event_coordinator.Classes.Booking booking59 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment60 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean62 = stubPayment60.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver63 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment60);
        Chief_event_coordinator.Classes.Booking booking64 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus65 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment66 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver67 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment66);
        Chief_event_coordinator.Classes.Booking booking68 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus69 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus70 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver67.onBookingStatusChanged(booking68, bookingStatus69, bookingStatus70);
        paymentNotificationObserver63.onBookingStatusChanged(booking64, bookingStatus65, bookingStatus69);
        Chief_event_coordinator.Observer.StubPayment stubPayment73 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver74 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment73);
        Chief_event_coordinator.Classes.Booking booking75 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus76 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus77 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver74.onBookingStatusChanged(booking75, bookingStatus76, bookingStatus77);
        paymentNotificationObserver58.onBookingStatusChanged(booking59, bookingStatus69, bookingStatus76);
        paymentNotificationObserver27.onBookingStatusChanged(booking28, bookingStatus43, bookingStatus69);
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver5.onBookingStatusChanged(booking7, bookingStatus21, bookingStatus43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus11.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus17.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus22.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus37 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus37.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus43 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus43.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus47 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus47.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus48 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus48.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus65 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus65.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus69 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus69.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus70 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus70.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus76 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus76.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus77 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus77.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator5.viewRoomStatus(room7);
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator12 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator12.viewRoomStatus(room14);
        int int16 = room14.getCapacity();
        administrator2.disableRoom(room14);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver18 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.util.List<java.lang.String> strList19 = adminDashboardObserver18.getActivityLog();
        Chief_event_coordinator.Classes.Booking booking20 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus22 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver18.onBookingStatusChanged(booking20, bookingStatus21, bookingStatus22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver3 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        administrator2.setEmail("Not specified");
        Chief_event_coordinator.Classes.Administrator administrator8 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver11 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room10);
        administrator8.addRoom(room10);
        java.lang.String str13 = administrator8.getEmail();
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str16 = room15.getBuilding();
        java.lang.String str17 = room15.getClosureReason();
        administrator8.disableRoom(room15);
        administrator2.closeRoom(room15);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Not specified" + "'", str16, "Not specified");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor11 = room10.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner12 = room10.getIdBadgeScanner();
        administrator2.enableRoom(room10);
        room10.setBuilding("Maintenance");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertNotNull(occupancySensor11);
        org.junit.Assert.assertNotNull(idBadgeScanner12);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver5 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver6 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean8 = stubPayment0.charge((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        boolean boolean6 = stubPayment0.refund((double) 1);
        boolean boolean8 = stubPayment0.refund((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        room4.setBuilding("hi!");
        administrator2.addRoom(room4);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor9 = room4.getOccupancySensor();
        org.junit.Assert.assertNotNull(occupancySensor9);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        java.lang.String str7 = room5.getBuilding();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str11 = room10.getRoomLocation();
        administrator2.disableRoom(room10);
        room10.setCapacity((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Not specified" + "'", str11, "Not specified");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator16 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str17 = administrator16.getEmail();
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor20 = room19.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner21 = room19.getIdBadgeScanner();
        administrator16.enableRoom(room19);
        administrator2.closeRoom(room19);
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver24 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room19);
        Chief_event_coordinator.Classes.Booking booking25 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus26 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment27 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver28 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment27);
        Chief_event_coordinator.Classes.Booking booking29 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment30 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver31 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment30);
        boolean boolean33 = stubPayment30.refund(100.0d);
        boolean boolean35 = stubPayment30.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver36 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment30);
        Chief_event_coordinator.Classes.Booking booking37 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus38 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment39 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean41 = stubPayment39.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver42 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment39);
        Chief_event_coordinator.Classes.Booking booking43 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus44 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment45 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver46 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment45);
        Chief_event_coordinator.Classes.Booking booking47 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus48 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus49 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver46.onBookingStatusChanged(booking47, bookingStatus48, bookingStatus49);
        paymentNotificationObserver42.onBookingStatusChanged(booking43, bookingStatus44, bookingStatus48);
        paymentNotificationObserver36.onBookingStatusChanged(booking37, bookingStatus38, bookingStatus44);
        Chief_event_coordinator.Observer.StubPayment stubPayment53 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver54 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment53);
        boolean boolean56 = stubPayment53.refund(100.0d);
        boolean boolean58 = stubPayment53.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver59 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment53);
        Chief_event_coordinator.Classes.Booking booking60 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus61 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment62 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean64 = stubPayment62.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver65 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment62);
        Chief_event_coordinator.Classes.Booking booking66 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus67 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment68 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver69 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment68);
        Chief_event_coordinator.Classes.Booking booking70 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus71 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus72 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver69.onBookingStatusChanged(booking70, bookingStatus71, bookingStatus72);
        paymentNotificationObserver65.onBookingStatusChanged(booking66, bookingStatus67, bookingStatus71);
        paymentNotificationObserver59.onBookingStatusChanged(booking60, bookingStatus61, bookingStatus67);
        paymentNotificationObserver28.onBookingStatusChanged(booking29, bookingStatus38, bookingStatus67);
        Chief_event_coordinator.Classes.Booking booking77 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus78 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment79 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver80 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment79);
        Chief_event_coordinator.Classes.Booking booking81 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus82 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus83 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver80.onBookingStatusChanged(booking81, bookingStatus82, bookingStatus83);
        paymentNotificationObserver28.onBookingStatusChanged(booking77, bookingStatus78, bookingStatus83);
        // The following exception was thrown during execution in test generation
        try {
            roomAvailabilityObserver24.onBookingStatusChanged(booking25, bookingStatus26, bookingStatus83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getRoomName()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor20);
        org.junit.Assert.assertNotNull(idBadgeScanner21);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus38 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus38.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus44 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus44.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus48 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus48.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus49 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus49.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus61 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus61.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus67 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus67.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus71 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus71.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus72 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus72.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus78 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus78.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus82 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus82.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus83 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus83.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        java.lang.String str8 = administrator2.getEmail();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver9 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        Chief_event_coordinator.Classes.Administrator administrator12 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver15 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room14);
        administrator12.addRoom(room14);
        java.lang.String str17 = administrator12.getEmail();
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str20 = room19.getBuilding();
        java.lang.String str21 = room19.getClosureReason();
        administrator12.disableRoom(room19);
        Chief_event_coordinator.Classes.Room room24 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor25 = room24.getOccupancySensor();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver26 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room24);
        administrator12.viewRoomStatus(room24);
        Chief_event_coordinator.Classes.Room room29 = new Chief_event_coordinator.Classes.Room((int) '#');
        room29.setRoomLocation("hi!");
        administrator12.closeRoom(room29);
        administrator2.addRoom(room29);
        Chief_event_coordinator.Classes.Administrator administrator36 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room38 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator36.viewRoomStatus(room38);
        java.lang.String str40 = room38.getBuilding();
        java.lang.String str41 = room38.getRoomLocation();
        // The following exception was thrown during execution in test generation
        try {
            administrator2.closeRoom(room38, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A closure reason is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Not specified" + "'", str20, "Not specified");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(occupancySensor25);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Not specified" + "'", str40, "Not specified");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Not specified" + "'", str41, "Not specified");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver9 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap10 = administrator2.viewBookings();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver11 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        Chief_event_coordinator.Classes.Booking booking12 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment13 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean15 = stubPayment13.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver16 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment13);
        Chief_event_coordinator.Classes.Booking booking17 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus18 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment19 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver20 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment19);
        Chief_event_coordinator.Classes.Booking booking21 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus22 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus23 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver20.onBookingStatusChanged(booking21, bookingStatus22, bookingStatus23);
        paymentNotificationObserver16.onBookingStatusChanged(booking17, bookingStatus18, bookingStatus22);
        Chief_event_coordinator.Observer.StubPayment stubPayment26 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver27 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment26);
        boolean boolean29 = stubPayment26.refund(100.0d);
        boolean boolean31 = stubPayment26.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver32 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment26);
        Chief_event_coordinator.Classes.Booking booking33 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus34 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment35 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean37 = stubPayment35.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver38 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment35);
        Chief_event_coordinator.Classes.Booking booking39 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus40 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment41 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver42 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment41);
        Chief_event_coordinator.Classes.Booking booking43 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus44 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus45 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver42.onBookingStatusChanged(booking43, bookingStatus44, bookingStatus45);
        paymentNotificationObserver38.onBookingStatusChanged(booking39, bookingStatus40, bookingStatus44);
        paymentNotificationObserver32.onBookingStatusChanged(booking33, bookingStatus34, bookingStatus40);
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver11.onBookingStatusChanged(booking12, bookingStatus18, bookingStatus40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertNotNull(intMap10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus18.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus22.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus23.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus34 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus34.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus40 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus40.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus44 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus44.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus45 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus45.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator5.viewRoomStatus(room7);
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator12 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator12.viewRoomStatus(room14);
        int int16 = room14.getCapacity();
        administrator2.disableRoom(room14);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver18 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        Chief_event_coordinator.Classes.Booking booking19 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment20 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver21 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment20);
        Chief_event_coordinator.Classes.Booking booking22 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment23 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver24 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment23);
        boolean boolean26 = stubPayment23.refund(100.0d);
        boolean boolean28 = stubPayment23.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver29 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment23);
        Chief_event_coordinator.Classes.Booking booking30 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus31 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment32 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean34 = stubPayment32.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver35 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment32);
        Chief_event_coordinator.Classes.Booking booking36 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus37 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment38 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver39 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment38);
        Chief_event_coordinator.Classes.Booking booking40 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus41 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus42 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver39.onBookingStatusChanged(booking40, bookingStatus41, bookingStatus42);
        paymentNotificationObserver35.onBookingStatusChanged(booking36, bookingStatus37, bookingStatus41);
        paymentNotificationObserver29.onBookingStatusChanged(booking30, bookingStatus31, bookingStatus37);
        Chief_event_coordinator.Observer.StubPayment stubPayment46 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver47 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment46);
        boolean boolean49 = stubPayment46.refund(100.0d);
        boolean boolean51 = stubPayment46.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver52 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment46);
        Chief_event_coordinator.Classes.Booking booking53 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus54 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment55 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean57 = stubPayment55.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver58 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment55);
        Chief_event_coordinator.Classes.Booking booking59 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus60 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment61 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver62 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment61);
        Chief_event_coordinator.Classes.Booking booking63 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus64 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus65 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver62.onBookingStatusChanged(booking63, bookingStatus64, bookingStatus65);
        paymentNotificationObserver58.onBookingStatusChanged(booking59, bookingStatus60, bookingStatus64);
        paymentNotificationObserver52.onBookingStatusChanged(booking53, bookingStatus54, bookingStatus60);
        paymentNotificationObserver21.onBookingStatusChanged(booking22, bookingStatus31, bookingStatus60);
        Chief_event_coordinator.Observer.StubPayment stubPayment70 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver71 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment70);
        Chief_event_coordinator.Classes.Booking booking72 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus73 = Chief_event_coordinator.Observer.BookingStatus.CONFIRMED;
        Chief_event_coordinator.Observer.StubPayment stubPayment74 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean76 = stubPayment74.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver77 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment74);
        Chief_event_coordinator.Classes.Booking booking78 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus79 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment80 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver81 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment80);
        Chief_event_coordinator.Classes.Booking booking82 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus83 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus84 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver81.onBookingStatusChanged(booking82, bookingStatus83, bookingStatus84);
        paymentNotificationObserver77.onBookingStatusChanged(booking78, bookingStatus79, bookingStatus83);
        paymentNotificationObserver71.onBookingStatusChanged(booking72, bookingStatus73, bookingStatus83);
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver18.onBookingStatusChanged(booking19, bookingStatus60, bookingStatus73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus31 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus31.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus37 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus37.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus41 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus41.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus42 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus42.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus54 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus54.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus60 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus60.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus64 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus64.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus65 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus65.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus73 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus73.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus79 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus79.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus83 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus83.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus84 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus84.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        administrator2.setEmail("Not specified");
        Chief_event_coordinator.Classes.Administrator administrator8 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str9 = administrator8.getEmail();
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor12 = room11.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner13 = room11.getIdBadgeScanner();
        administrator8.enableRoom(room11);
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor17 = room16.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner18 = room16.getIdBadgeScanner();
        administrator8.enableRoom(room16);
        administrator2.viewRoomStatus(room16);
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver21 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room16);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor22 = room16.getOccupancySensor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor12);
        org.junit.Assert.assertNotNull(idBadgeScanner13);
        org.junit.Assert.assertNotNull(occupancySensor17);
        org.junit.Assert.assertNotNull(idBadgeScanner18);
        org.junit.Assert.assertNotNull(occupancySensor22);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver9 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap10 = administrator2.viewBookings();
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver13 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room12);
        administrator2.enableRoom(room12);
        // The following exception was thrown during execution in test generation
        try {
            room12.setCapacity(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room capacity must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertNotNull(intMap10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("Not specified", "Maintenance");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver9 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap10 = administrator2.viewBookings();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver11 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.util.List<java.lang.String> strList12 = adminDashboardObserver11.getActivityLog();
        Chief_event_coordinator.Classes.Booking booking13 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment14 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver15 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment14);
        Chief_event_coordinator.Classes.Booking booking16 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment17 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver18 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment17);
        boolean boolean20 = stubPayment17.refund(100.0d);
        boolean boolean22 = stubPayment17.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver23 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment17);
        Chief_event_coordinator.Classes.Booking booking24 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment26 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean28 = stubPayment26.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver29 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment26);
        Chief_event_coordinator.Classes.Booking booking30 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus31 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment32 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver33 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment32);
        Chief_event_coordinator.Classes.Booking booking34 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus35 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus36 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver33.onBookingStatusChanged(booking34, bookingStatus35, bookingStatus36);
        paymentNotificationObserver29.onBookingStatusChanged(booking30, bookingStatus31, bookingStatus35);
        paymentNotificationObserver23.onBookingStatusChanged(booking24, bookingStatus25, bookingStatus31);
        Chief_event_coordinator.Observer.StubPayment stubPayment40 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver41 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment40);
        boolean boolean43 = stubPayment40.refund(100.0d);
        boolean boolean45 = stubPayment40.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver46 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment40);
        Chief_event_coordinator.Classes.Booking booking47 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus48 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment49 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean51 = stubPayment49.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver52 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment49);
        Chief_event_coordinator.Classes.Booking booking53 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus54 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment55 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver56 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment55);
        Chief_event_coordinator.Classes.Booking booking57 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus58 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus59 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver56.onBookingStatusChanged(booking57, bookingStatus58, bookingStatus59);
        paymentNotificationObserver52.onBookingStatusChanged(booking53, bookingStatus54, bookingStatus58);
        paymentNotificationObserver46.onBookingStatusChanged(booking47, bookingStatus48, bookingStatus54);
        paymentNotificationObserver15.onBookingStatusChanged(booking16, bookingStatus25, bookingStatus54);
        Chief_event_coordinator.Classes.Booking booking64 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus65 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment66 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver67 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment66);
        Chief_event_coordinator.Classes.Booking booking68 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus69 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus70 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver67.onBookingStatusChanged(booking68, bookingStatus69, bookingStatus70);
        paymentNotificationObserver15.onBookingStatusChanged(booking64, bookingStatus65, bookingStatus70);
        Chief_event_coordinator.Observer.StubPayment stubPayment73 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver74 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment73);
        Chief_event_coordinator.Classes.Booking booking75 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus76 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus77 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver74.onBookingStatusChanged(booking75, bookingStatus76, bookingStatus77);
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver11.onBookingStatusChanged(booking13, bookingStatus70, bookingStatus76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertNotNull(intMap10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus25.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus31 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus31.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus35 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus35.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus36 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus36.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus48 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus48.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus54 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus54.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus58 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus58.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus59 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus59.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus65 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus65.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus69 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus69.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus70 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus70.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus76 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus76.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus77 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus77.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str2 = room1.getRoomLocation();
        // The following exception was thrown during execution in test generation
        try {
            room1.setBuilding("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Building is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Not specified" + "'", str2, "Not specified");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver3 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        Chief_event_coordinator.Classes.Booking booking4 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment6 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver7 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment6);
        Chief_event_coordinator.Classes.Booking booking8 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus9 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus10 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver7.onBookingStatusChanged(booking8, bookingStatus9, bookingStatus10);
        paymentNotificationObserver3.onBookingStatusChanged(booking4, bookingStatus5, bookingStatus9);
        Chief_event_coordinator.Classes.Booking booking13 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment14 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver15 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment14);
        boolean boolean17 = stubPayment14.refund(100.0d);
        boolean boolean19 = stubPayment14.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver20 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment14);
        Chief_event_coordinator.Classes.Booking booking21 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus22 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment23 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean25 = stubPayment23.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver26 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment23);
        Chief_event_coordinator.Classes.Booking booking27 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus28 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment29 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver30 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment29);
        Chief_event_coordinator.Classes.Booking booking31 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus32 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus33 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver30.onBookingStatusChanged(booking31, bookingStatus32, bookingStatus33);
        paymentNotificationObserver26.onBookingStatusChanged(booking27, bookingStatus28, bookingStatus32);
        paymentNotificationObserver20.onBookingStatusChanged(booking21, bookingStatus22, bookingStatus28);
        Chief_event_coordinator.Observer.StubPayment stubPayment37 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean39 = stubPayment37.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver40 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment37);
        Chief_event_coordinator.Classes.Booking booking41 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus42 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment43 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver44 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment43);
        Chief_event_coordinator.Classes.Booking booking45 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus46 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus47 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver44.onBookingStatusChanged(booking45, bookingStatus46, bookingStatus47);
        paymentNotificationObserver40.onBookingStatusChanged(booking41, bookingStatus42, bookingStatus46);
        paymentNotificationObserver3.onBookingStatusChanged(booking13, bookingStatus22, bookingStatus42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus9.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus10.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus22.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus28 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus28.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus32 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus32.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus33 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus33.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus42 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus42.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus46 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus46.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus47 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus47.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        java.lang.String str8 = administrator2.getEmail();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver9 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.lang.Class<?> wildcardClass10 = administrator2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        java.lang.String str4 = administrator2.getName();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver5 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.lang.Class<?> wildcardClass6 = administrator2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver3 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        Chief_event_coordinator.Classes.Booking booking4 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment6 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver7 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment6);
        Chief_event_coordinator.Classes.Booking booking8 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus9 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus10 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver7.onBookingStatusChanged(booking8, bookingStatus9, bookingStatus10);
        paymentNotificationObserver3.onBookingStatusChanged(booking4, bookingStatus5, bookingStatus9);
        Chief_event_coordinator.Classes.Booking booking13 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment14 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver15 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment14);
        boolean boolean17 = stubPayment14.refund(100.0d);
        boolean boolean19 = stubPayment14.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver20 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment14);
        Chief_event_coordinator.Classes.Booking booking21 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus22 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment23 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean25 = stubPayment23.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver26 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment23);
        Chief_event_coordinator.Classes.Booking booking27 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus28 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment29 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver30 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment29);
        Chief_event_coordinator.Classes.Booking booking31 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus32 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus33 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver30.onBookingStatusChanged(booking31, bookingStatus32, bookingStatus33);
        paymentNotificationObserver26.onBookingStatusChanged(booking27, bookingStatus28, bookingStatus32);
        paymentNotificationObserver20.onBookingStatusChanged(booking21, bookingStatus22, bookingStatus28);
        Chief_event_coordinator.Observer.StubPayment stubPayment37 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver38 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment37);
        boolean boolean40 = stubPayment37.refund(100.0d);
        boolean boolean42 = stubPayment37.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver43 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment37);
        Chief_event_coordinator.Classes.Booking booking44 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment45 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean47 = stubPayment45.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver48 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment45);
        Chief_event_coordinator.Classes.Booking booking49 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus50 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment51 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver52 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment51);
        Chief_event_coordinator.Classes.Booking booking53 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus54 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus55 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver52.onBookingStatusChanged(booking53, bookingStatus54, bookingStatus55);
        paymentNotificationObserver48.onBookingStatusChanged(booking49, bookingStatus50, bookingStatus54);
        Chief_event_coordinator.Observer.StubPayment stubPayment58 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver59 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment58);
        Chief_event_coordinator.Classes.Booking booking60 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus61 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus62 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver59.onBookingStatusChanged(booking60, bookingStatus61, bookingStatus62);
        paymentNotificationObserver43.onBookingStatusChanged(booking44, bookingStatus54, bookingStatus61);
        paymentNotificationObserver3.onBookingStatusChanged(booking13, bookingStatus28, bookingStatus54);
        java.lang.Class<?> wildcardClass66 = bookingStatus28.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus9.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus10.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus22.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus28 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus28.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus32 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus32.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus33 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus33.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus50 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus50.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus54 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus54.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus55 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus55.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus61 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus61.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus62 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus62.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        java.lang.String str7 = room5.getBuilding();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str11 = room10.getRoomLocation();
        administrator2.disableRoom(room10);
        int int13 = room10.getCapacity();
        java.lang.String str14 = room10.getBuilding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Not specified" + "'", str11, "Not specified");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Not specified" + "'", str14, "Not specified");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str2 = room1.getRoomLocation();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner3 = room1.getIdBadgeScanner();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Not specified" + "'", str2, "Not specified");
        org.junit.Assert.assertNotNull(idBadgeScanner3);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver9 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        Chief_event_coordinator.Classes.Booking booking10 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus11 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment12 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean14 = stubPayment12.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver15 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment12);
        Chief_event_coordinator.Classes.Booking booking16 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus17 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment18 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver19 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment18);
        Chief_event_coordinator.Classes.Booking booking20 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus22 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver19.onBookingStatusChanged(booking20, bookingStatus21, bookingStatus22);
        paymentNotificationObserver15.onBookingStatusChanged(booking16, bookingStatus17, bookingStatus21);
        Chief_event_coordinator.Classes.Booking booking25 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment26 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver27 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment26);
        boolean boolean29 = stubPayment26.refund(100.0d);
        boolean boolean31 = stubPayment26.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver32 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment26);
        Chief_event_coordinator.Classes.Booking booking33 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus34 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment35 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean37 = stubPayment35.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver38 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment35);
        Chief_event_coordinator.Classes.Booking booking39 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus40 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment41 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver42 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment41);
        Chief_event_coordinator.Classes.Booking booking43 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus44 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus45 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver42.onBookingStatusChanged(booking43, bookingStatus44, bookingStatus45);
        paymentNotificationObserver38.onBookingStatusChanged(booking39, bookingStatus40, bookingStatus44);
        paymentNotificationObserver32.onBookingStatusChanged(booking33, bookingStatus34, bookingStatus40);
        Chief_event_coordinator.Observer.StubPayment stubPayment49 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver50 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment49);
        boolean boolean52 = stubPayment49.refund(100.0d);
        boolean boolean54 = stubPayment49.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver55 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment49);
        Chief_event_coordinator.Classes.Booking booking56 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment57 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean59 = stubPayment57.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver60 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment57);
        Chief_event_coordinator.Classes.Booking booking61 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus62 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment63 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver64 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment63);
        Chief_event_coordinator.Classes.Booking booking65 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus66 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus67 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver64.onBookingStatusChanged(booking65, bookingStatus66, bookingStatus67);
        paymentNotificationObserver60.onBookingStatusChanged(booking61, bookingStatus62, bookingStatus66);
        Chief_event_coordinator.Observer.StubPayment stubPayment70 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver71 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment70);
        Chief_event_coordinator.Classes.Booking booking72 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus73 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus74 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver71.onBookingStatusChanged(booking72, bookingStatus73, bookingStatus74);
        paymentNotificationObserver55.onBookingStatusChanged(booking56, bookingStatus66, bookingStatus73);
        paymentNotificationObserver15.onBookingStatusChanged(booking25, bookingStatus40, bookingStatus66);
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver9.onBookingStatusChanged(booking10, bookingStatus11, bookingStatus66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus11.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus17.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus22.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus34 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus34.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus40 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus40.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus44 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus44.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus45 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus45.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus62 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus62.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus66 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus66.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus67 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus67.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus73 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus73.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus74 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus74.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str10 = room9.getBuilding();
        java.lang.String str11 = room9.getClosureReason();
        administrator2.disableRoom(room9);
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor15 = room14.getOccupancySensor();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver16 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room14);
        administrator2.viewRoomStatus(room14);
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str20 = room19.getClosureReason();
        Chief_event_coordinator.Classes.RoomStatus roomStatus21 = room19.getStatus();
        administrator2.enableRoom(room19);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + roomStatus21 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus21.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("", "");
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver3 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator5.viewRoomStatus(room7);
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator12 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator12.viewRoomStatus(room14);
        int int16 = room14.getCapacity();
        administrator2.disableRoom(room14);
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) '#');
        room19.setRoomLocation("hi!");
        java.lang.String str22 = room19.getRoomLocation();
        administrator2.closeRoom(room19);
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap24 = administrator2.viewBookings();
        java.lang.Class<?> wildcardClass25 = administrator2.getClass();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(intMap24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor11 = room10.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner12 = room10.getIdBadgeScanner();
        administrator2.enableRoom(room10);
        administrator2.setEmail("hi!");
        Chief_event_coordinator.Classes.Room room17 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str18 = room17.getRoomLocation();
        java.lang.String str19 = room17.getRoomLocation();
        administrator2.viewRoomStatus(room17);
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap21 = administrator2.viewBookings();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertNotNull(occupancySensor11);
        org.junit.Assert.assertNotNull(idBadgeScanner12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Not specified" + "'", str19, "Not specified");
        org.junit.Assert.assertNotNull(intMap21);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        room1.setRoomLocation("hi!");
        java.lang.String str4 = room1.getClosureReason();
        room1.setRoomLocation("hi!");
        java.lang.String str7 = room1.getBuilding();
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor10 = room9.getOccupancySensor();
        Chief_event_coordinator.Classes.RoomStatus roomStatus11 = room9.getStatus();
        room1.setStatus(roomStatus11);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertNotNull(occupancySensor10);
        org.junit.Assert.assertTrue("'" + roomStatus11 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus11.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver3 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean5 = stubPayment0.refund((double) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator5.viewRoomStatus(room7);
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator12 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator12.viewRoomStatus(room14);
        int int16 = room14.getCapacity();
        administrator2.disableRoom(room14);
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) '#');
        room19.setRoomLocation("hi!");
        java.lang.String str22 = room19.getRoomLocation();
        administrator2.closeRoom(room19);
        java.lang.String str24 = room19.getClosureReason();
        int int25 = room19.getCapacity();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Maintenance" + "'", str24, "Maintenance");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (byte) 1);
        int int2 = room1.getCapacity();
        java.lang.String str3 = room1.getClosureReason();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver4 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        Chief_event_coordinator.Classes.Booking booking5 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus6 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus7 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        // The following exception was thrown during execution in test generation
        try {
            roomAvailabilityObserver4.onBookingStatusChanged(booking5, bookingStatus6, bookingStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getRoomName()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus7.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room(1, 35, "hi!", "Not specified");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        java.lang.String str6 = administrator2.getName();
        Chief_event_coordinator.Classes.Administrator administrator9 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator9.viewRoomStatus(room11);
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        room14.setRoomLocation("hi!");
        java.lang.String str17 = room14.getClosureReason();
        room14.setRoomLocation("hi!");
        administrator9.enableRoom(room14);
        Chief_event_coordinator.Classes.Room room22 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor23 = room22.getOccupancySensor();
        administrator9.addRoom(room22);
        administrator2.viewRoomStatus(room22);
        administrator2.setEmail("");
        java.lang.String str28 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room29 = null;
        // The following exception was thrown during execution in test generation
        try {
            administrator2.enableRoom(room29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Room.setStatus(Chief_event_coordinator.Classes.RoomStatus)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(occupancySensor23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        java.lang.String str14 = administrator2.getEmail();
        administrator2.setName("hi!");
        java.lang.String str17 = administrator2.getEmail();
        administrator2.setName("hi!");
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver20 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.lang.String str21 = administrator2.getName();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator5.viewRoomStatus(room7);
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator12 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator12.viewRoomStatus(room14);
        int int16 = room14.getCapacity();
        administrator2.disableRoom(room14);
        int int18 = room14.getCapacity();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        java.lang.String str7 = room5.getBuilding();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.RoomStatus roomStatus9 = Chief_event_coordinator.Classes.RoomStatus.AVAILABLE;
        room5.setStatus(roomStatus9);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor11 = room5.getOccupancySensor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertTrue("'" + roomStatus9 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus9.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
        org.junit.Assert.assertNotNull(occupancySensor11);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor11 = room10.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner12 = room10.getIdBadgeScanner();
        administrator2.enableRoom(room10);
        administrator2.setEmail("hi!");
        Chief_event_coordinator.Classes.Administrator administrator18 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room20 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator18.viewRoomStatus(room20);
        java.lang.String str22 = administrator18.getName();
        Chief_event_coordinator.Classes.Administrator administrator25 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room27 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator25.viewRoomStatus(room27);
        java.lang.String str29 = administrator25.getName();
        administrator25.setName("Not specified");
        Chief_event_coordinator.Classes.Room room33 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor34 = room33.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner35 = room33.getIdBadgeScanner();
        administrator25.enableRoom(room33);
        java.lang.String str37 = room33.getBuilding();
        administrator18.closeRoom(room33);
        administrator2.enableRoom(room33);
        Chief_event_coordinator.Classes.Administrator administrator42 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str43 = administrator42.getEmail();
        administrator42.setEmail("Not specified");
        Chief_event_coordinator.Classes.Administrator administrator48 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str49 = administrator48.getEmail();
        Chief_event_coordinator.Classes.Room room51 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor52 = room51.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner53 = room51.getIdBadgeScanner();
        administrator48.enableRoom(room51);
        Chief_event_coordinator.Classes.Room room56 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor57 = room56.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner58 = room56.getIdBadgeScanner();
        administrator48.enableRoom(room56);
        administrator42.viewRoomStatus(room56);
        administrator2.viewRoomStatus(room56);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertNotNull(occupancySensor11);
        org.junit.Assert.assertNotNull(idBadgeScanner12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor34);
        org.junit.Assert.assertNotNull(idBadgeScanner35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Not specified" + "'", str37, "Not specified");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor52);
        org.junit.Assert.assertNotNull(idBadgeScanner53);
        org.junit.Assert.assertNotNull(occupancySensor57);
        org.junit.Assert.assertNotNull(idBadgeScanner58);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (byte) 1);
        int int2 = room1.getCapacity();
        java.lang.String str3 = room1.getClosureReason();
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor4 = room1.getOccupancySensor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(occupancySensor4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap3 = administrator2.viewBookings();
        java.lang.String str4 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor7 = room6.getOccupancySensor();
        Chief_event_coordinator.Classes.RoomStatus roomStatus8 = room6.getStatus();
        administrator2.addRoom(room6);
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str12 = room11.getRoomLocation();
        java.lang.String str13 = room11.getRoomLocation();
        administrator2.disableRoom(room11);
        java.lang.String str15 = room11.getBuilding();
        org.junit.Assert.assertNotNull(intMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor7);
        org.junit.Assert.assertTrue("'" + roomStatus8 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus8.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Not specified" + "'", str12, "Not specified");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Not specified" + "'", str13, "Not specified");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Not specified" + "'", str15, "Not specified");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str10 = room9.getBuilding();
        java.lang.String str11 = room9.getClosureReason();
        administrator2.disableRoom(room9);
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor15 = room14.getOccupancySensor();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver16 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room14);
        administrator2.viewRoomStatus(room14);
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) '#');
        room19.setRoomLocation("hi!");
        administrator2.closeRoom(room19);
        administrator2.setEmail("");
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap25 = administrator2.viewBookings();
        Chief_event_coordinator.Classes.Administrator administrator28 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str29 = administrator28.getEmail();
        Chief_event_coordinator.Classes.Room room31 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str32 = room31.getRoomLocation();
        java.lang.String str33 = room31.getBuilding();
        administrator28.enableRoom(room31);
        Chief_event_coordinator.Classes.Room room36 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str37 = room36.getRoomLocation();
        administrator28.disableRoom(room36);
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver39 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room36);
        Chief_event_coordinator.Classes.RoomStatus roomStatus40 = room36.getStatus();
        administrator2.disableRoom(room36);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNotNull(intMap25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Not specified" + "'", str32, "Not specified");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Not specified" + "'", str33, "Not specified");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Not specified" + "'", str37, "Not specified");
        org.junit.Assert.assertTrue("'" + roomStatus40 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.DISABLED + "'", roomStatus40.equals(Chief_event_coordinator.Classes.RoomStatus.DISABLED));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str10 = room9.getBuilding();
        java.lang.String str11 = room9.getClosureReason();
        administrator2.disableRoom(room9);
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor15 = room14.getOccupancySensor();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver16 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room14);
        administrator2.viewRoomStatus(room14);
        administrator2.setEmail("Not specified");
        Chief_event_coordinator.Classes.Administrator administrator22 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room24 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator22.viewRoomStatus(room24);
        Chief_event_coordinator.Classes.Room room27 = new Chief_event_coordinator.Classes.Room((int) '#');
        room27.setRoomLocation("hi!");
        java.lang.String str30 = room27.getClosureReason();
        room27.setRoomLocation("hi!");
        administrator22.enableRoom(room27);
        Chief_event_coordinator.Classes.Administrator administrator36 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str37 = administrator36.getEmail();
        Chief_event_coordinator.Classes.Room room39 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor40 = room39.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner41 = room39.getIdBadgeScanner();
        administrator36.enableRoom(room39);
        administrator22.viewRoomStatus(room39);
        Chief_event_coordinator.Classes.Administrator administrator46 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str47 = administrator46.getEmail();
        java.lang.String str48 = administrator46.getName();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver49 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator46);
        Chief_event_coordinator.Classes.Room room51 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str52 = room51.getRoomLocation();
        administrator46.closeRoom(room51);
        administrator22.disableRoom(room51);
        administrator2.closeRoom(room51, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor40);
        org.junit.Assert.assertNotNull(idBadgeScanner41);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Not specified" + "'", str52, "Not specified");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver8 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room7);
        administrator5.addRoom(room7);
        int int10 = room7.getCapacity();
        administrator2.enableRoom(room7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver9 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        Chief_event_coordinator.Classes.Booking booking10 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus11 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment12 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver13 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment12);
        Chief_event_coordinator.Classes.Booking booking14 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment15 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver16 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment15);
        boolean boolean18 = stubPayment15.refund(100.0d);
        boolean boolean20 = stubPayment15.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver21 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment15);
        Chief_event_coordinator.Classes.Booking booking22 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus23 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment24 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean26 = stubPayment24.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver27 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment24);
        Chief_event_coordinator.Classes.Booking booking28 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus29 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment30 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver31 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment30);
        Chief_event_coordinator.Classes.Booking booking32 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus33 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus34 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver31.onBookingStatusChanged(booking32, bookingStatus33, bookingStatus34);
        paymentNotificationObserver27.onBookingStatusChanged(booking28, bookingStatus29, bookingStatus33);
        paymentNotificationObserver21.onBookingStatusChanged(booking22, bookingStatus23, bookingStatus29);
        Chief_event_coordinator.Observer.StubPayment stubPayment38 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver39 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment38);
        boolean boolean41 = stubPayment38.refund(100.0d);
        boolean boolean43 = stubPayment38.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver44 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment38);
        Chief_event_coordinator.Classes.Booking booking45 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus46 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment47 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean49 = stubPayment47.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver50 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment47);
        Chief_event_coordinator.Classes.Booking booking51 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus52 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment53 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver54 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment53);
        Chief_event_coordinator.Classes.Booking booking55 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus56 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus57 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver54.onBookingStatusChanged(booking55, bookingStatus56, bookingStatus57);
        paymentNotificationObserver50.onBookingStatusChanged(booking51, bookingStatus52, bookingStatus56);
        paymentNotificationObserver44.onBookingStatusChanged(booking45, bookingStatus46, bookingStatus52);
        paymentNotificationObserver13.onBookingStatusChanged(booking14, bookingStatus23, bookingStatus52);
        Chief_event_coordinator.Classes.Booking booking62 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus63 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment64 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver65 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment64);
        Chief_event_coordinator.Classes.Booking booking66 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus67 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus68 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver65.onBookingStatusChanged(booking66, bookingStatus67, bookingStatus68);
        paymentNotificationObserver13.onBookingStatusChanged(booking62, bookingStatus63, bookingStatus68);
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver9.onBookingStatusChanged(booking10, bookingStatus11, bookingStatus68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus23.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus29 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus29.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus33 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus33.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus34 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus34.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus46 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus46.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus52 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus52.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus56 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus56.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus57 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus57.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus63 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus63.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus67 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus67.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus68 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus68.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (byte) 1);
        int int2 = room1.getCapacity();
        java.lang.String str3 = room1.getClosureReason();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver4 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        Chief_event_coordinator.Classes.Booking booking5 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus6 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment7 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver8 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment7);
        Chief_event_coordinator.Classes.Booking booking9 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus10 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus11 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver8.onBookingStatusChanged(booking9, bookingStatus10, bookingStatus11);
        // The following exception was thrown during execution in test generation
        try {
            roomAvailabilityObserver4.onBookingStatusChanged(booking5, bookingStatus6, bookingStatus10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getRoomName()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus6.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus10.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus11.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        java.lang.String str8 = administrator2.getEmail();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver9 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        Chief_event_coordinator.Classes.Administrator administrator12 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver15 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room14);
        administrator12.addRoom(room14);
        java.lang.String str17 = administrator12.getEmail();
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str20 = room19.getBuilding();
        java.lang.String str21 = room19.getClosureReason();
        administrator12.disableRoom(room19);
        Chief_event_coordinator.Classes.Room room24 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor25 = room24.getOccupancySensor();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver26 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room24);
        administrator12.viewRoomStatus(room24);
        Chief_event_coordinator.Classes.Room room29 = new Chief_event_coordinator.Classes.Room((int) '#');
        room29.setRoomLocation("hi!");
        administrator12.closeRoom(room29);
        administrator2.addRoom(room29);
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap34 = administrator2.viewBookings();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Not specified" + "'", str20, "Not specified");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(occupancySensor25);
        org.junit.Assert.assertNotNull(intMap34);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        java.lang.String str6 = administrator2.getName();
        Chief_event_coordinator.Classes.Administrator administrator9 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap10 = administrator9.viewBookings();
        java.lang.String str11 = administrator9.getEmail();
        Chief_event_coordinator.Classes.Room room13 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor14 = room13.getOccupancySensor();
        Chief_event_coordinator.Classes.RoomStatus roomStatus15 = room13.getStatus();
        administrator9.addRoom(room13);
        administrator2.addRoom(room13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(intMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor14);
        org.junit.Assert.assertTrue("'" + roomStatus15 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus15.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        java.lang.String str7 = room5.getBuilding();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.RoomStatus roomStatus9 = Chief_event_coordinator.Classes.RoomStatus.AVAILABLE;
        room5.setStatus(roomStatus9);
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver11 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertTrue("'" + roomStatus9 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus9.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        room4.setBuilding("hi!");
        administrator2.addRoom(room4);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str11 = room10.getBuilding();
        int int12 = room10.getCapacity();
        java.lang.String str13 = room10.getRoomLocation();
        java.lang.String str14 = room10.getClosureReason();
        administrator2.closeRoom(room10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Not specified" + "'", str11, "Not specified");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Not specified" + "'", str13, "Not specified");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        java.lang.String str4 = administrator2.getName();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver5 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        Chief_event_coordinator.Classes.Administrator administrator8 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str9 = administrator8.getEmail();
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor12 = room11.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner13 = room11.getIdBadgeScanner();
        administrator8.enableRoom(room11);
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor17 = room16.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner18 = room16.getIdBadgeScanner();
        administrator8.enableRoom(room16);
        administrator8.setEmail("hi!");
        Chief_event_coordinator.Classes.Administrator administrator24 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room26 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator24.viewRoomStatus(room26);
        java.lang.String str28 = administrator24.getName();
        Chief_event_coordinator.Classes.Administrator administrator31 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room33 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator31.viewRoomStatus(room33);
        java.lang.String str35 = administrator31.getName();
        administrator31.setName("Not specified");
        Chief_event_coordinator.Classes.Room room39 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor40 = room39.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner41 = room39.getIdBadgeScanner();
        administrator31.enableRoom(room39);
        java.lang.String str43 = room39.getBuilding();
        administrator24.closeRoom(room39);
        administrator8.enableRoom(room39);
        administrator2.addRoom(room39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor12);
        org.junit.Assert.assertNotNull(idBadgeScanner13);
        org.junit.Assert.assertNotNull(occupancySensor17);
        org.junit.Assert.assertNotNull(idBadgeScanner18);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor40);
        org.junit.Assert.assertNotNull(idBadgeScanner41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Not specified" + "'", str43, "Not specified");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("Not specified");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment3 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver4 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment3);
        Chief_event_coordinator.Classes.Booking booking5 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus6 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus7 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver4.onBookingStatusChanged(booking5, bookingStatus6, bookingStatus7);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus9 = Chief_event_coordinator.Observer.BookingStatus.CONFIRMED;
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus7, bookingStatus9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus6.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus7.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus9.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str10 = room9.getBuilding();
        java.lang.String str11 = room9.getClosureReason();
        administrator2.disableRoom(room9);
        java.lang.String str13 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Administrator administrator16 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room18 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator16.viewRoomStatus(room18);
        Chief_event_coordinator.Classes.Room room21 = new Chief_event_coordinator.Classes.Room((int) '#');
        room21.setRoomLocation("hi!");
        java.lang.String str24 = room21.getClosureReason();
        room21.setRoomLocation("hi!");
        administrator16.enableRoom(room21);
        java.lang.String str28 = administrator16.getEmail();
        administrator16.setName("hi!");
        Chief_event_coordinator.Classes.Administrator administrator33 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str34 = administrator33.getEmail();
        administrator33.setEmail("Not specified");
        Chief_event_coordinator.Classes.Administrator administrator39 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str40 = administrator39.getEmail();
        Chief_event_coordinator.Classes.Room room42 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor43 = room42.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner44 = room42.getIdBadgeScanner();
        administrator39.enableRoom(room42);
        Chief_event_coordinator.Classes.Room room47 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor48 = room47.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner49 = room47.getIdBadgeScanner();
        administrator39.enableRoom(room47);
        administrator33.viewRoomStatus(room47);
        administrator16.disableRoom(room47);
        administrator2.viewRoomStatus(room47);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor43);
        org.junit.Assert.assertNotNull(idBadgeScanner44);
        org.junit.Assert.assertNotNull(occupancySensor48);
        org.junit.Assert.assertNotNull(idBadgeScanner49);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        administrator2.setEmail("Not specified");
        Chief_event_coordinator.Classes.Administrator administrator8 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str9 = administrator8.getEmail();
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor12 = room11.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner13 = room11.getIdBadgeScanner();
        administrator8.enableRoom(room11);
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor17 = room16.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner18 = room16.getIdBadgeScanner();
        administrator8.enableRoom(room16);
        administrator2.viewRoomStatus(room16);
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver21 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room16);
        Chief_event_coordinator.Classes.Booking booking22 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus23 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        Chief_event_coordinator.Observer.StubPayment stubPayment24 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean26 = stubPayment24.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver27 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment24);
        Chief_event_coordinator.Classes.Booking booking28 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus29 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment30 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver31 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment30);
        Chief_event_coordinator.Classes.Booking booking32 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus33 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus34 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver31.onBookingStatusChanged(booking32, bookingStatus33, bookingStatus34);
        paymentNotificationObserver27.onBookingStatusChanged(booking28, bookingStatus29, bookingStatus33);
        Chief_event_coordinator.Classes.Booking booking37 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment38 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver39 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment38);
        boolean boolean41 = stubPayment38.refund(100.0d);
        boolean boolean43 = stubPayment38.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver44 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment38);
        Chief_event_coordinator.Classes.Booking booking45 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus46 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment47 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean49 = stubPayment47.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver50 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment47);
        Chief_event_coordinator.Classes.Booking booking51 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus52 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment53 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver54 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment53);
        Chief_event_coordinator.Classes.Booking booking55 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus56 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus57 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver54.onBookingStatusChanged(booking55, bookingStatus56, bookingStatus57);
        paymentNotificationObserver50.onBookingStatusChanged(booking51, bookingStatus52, bookingStatus56);
        paymentNotificationObserver44.onBookingStatusChanged(booking45, bookingStatus46, bookingStatus52);
        Chief_event_coordinator.Observer.StubPayment stubPayment61 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver62 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment61);
        boolean boolean64 = stubPayment61.refund(100.0d);
        boolean boolean66 = stubPayment61.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver67 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment61);
        Chief_event_coordinator.Classes.Booking booking68 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment69 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean71 = stubPayment69.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver72 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment69);
        Chief_event_coordinator.Classes.Booking booking73 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus74 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment75 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver76 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment75);
        Chief_event_coordinator.Classes.Booking booking77 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus78 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus79 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver76.onBookingStatusChanged(booking77, bookingStatus78, bookingStatus79);
        paymentNotificationObserver72.onBookingStatusChanged(booking73, bookingStatus74, bookingStatus78);
        Chief_event_coordinator.Observer.StubPayment stubPayment82 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver83 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment82);
        Chief_event_coordinator.Classes.Booking booking84 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus85 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus86 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver83.onBookingStatusChanged(booking84, bookingStatus85, bookingStatus86);
        paymentNotificationObserver67.onBookingStatusChanged(booking68, bookingStatus78, bookingStatus85);
        paymentNotificationObserver27.onBookingStatusChanged(booking37, bookingStatus52, bookingStatus78);
        // The following exception was thrown during execution in test generation
        try {
            roomAvailabilityObserver21.onBookingStatusChanged(booking22, bookingStatus23, bookingStatus78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getRoomName()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor12);
        org.junit.Assert.assertNotNull(idBadgeScanner13);
        org.junit.Assert.assertNotNull(occupancySensor17);
        org.junit.Assert.assertNotNull(idBadgeScanner18);
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus23.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus29 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus29.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus33 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus33.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus34 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus34.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus46 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus46.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus52 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus52.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus56 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus56.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus57 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus57.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus74 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus74.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus78 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus78.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus79 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus79.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus85 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus85.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus86 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus86.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor2 = room1.getOccupancySensor();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver3 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        Chief_event_coordinator.Classes.Booking booking4 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = Chief_event_coordinator.Observer.BookingStatus.NO_SHOW;
        Chief_event_coordinator.Observer.StubPayment stubPayment6 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver7 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment6);
        boolean boolean9 = stubPayment6.refund(100.0d);
        boolean boolean11 = stubPayment6.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver12 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment6);
        Chief_event_coordinator.Classes.Booking booking13 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus14 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment15 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean17 = stubPayment15.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver18 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment15);
        Chief_event_coordinator.Classes.Booking booking19 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus20 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment21 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver22 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment21);
        Chief_event_coordinator.Classes.Booking booking23 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus24 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver22.onBookingStatusChanged(booking23, bookingStatus24, bookingStatus25);
        paymentNotificationObserver18.onBookingStatusChanged(booking19, bookingStatus20, bookingStatus24);
        paymentNotificationObserver12.onBookingStatusChanged(booking13, bookingStatus14, bookingStatus20);
        // The following exception was thrown during execution in test generation
        try {
            roomAvailabilityObserver3.onBookingStatusChanged(booking4, bookingStatus5, bookingStatus14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getRoomName()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(occupancySensor2);
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus14.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus20.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus24.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus25.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor11 = room10.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner12 = room10.getIdBadgeScanner();
        administrator2.enableRoom(room10);
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str16 = room15.getClosureReason();
        Chief_event_coordinator.Classes.RoomStatus roomStatus17 = room15.getStatus();
        administrator2.closeRoom(room15);
        Chief_event_coordinator.Classes.Administrator administrator21 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room23 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver24 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room23);
        administrator21.addRoom(room23);
        java.lang.String str26 = administrator21.getEmail();
        Chief_event_coordinator.Classes.Administrator administrator29 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room31 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver32 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room31);
        administrator29.addRoom(room31);
        administrator21.enableRoom(room31);
        java.lang.String str35 = room31.getClosureReason();
        administrator2.viewRoomStatus(room31);
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner37 = room31.getIdBadgeScanner();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertNotNull(occupancySensor11);
        org.junit.Assert.assertNotNull(idBadgeScanner12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + roomStatus17 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus17.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(idBadgeScanner37);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        java.lang.String str14 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str17 = room16.getBuilding();
        int int18 = room16.getRoomid();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner19 = room16.getIdBadgeScanner();
        administrator2.closeRoom(room16, "Not specified");
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver22 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        Chief_event_coordinator.Classes.Administrator administrator25 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap26 = administrator25.viewBookings();
        java.lang.String str27 = administrator25.getEmail();
        Chief_event_coordinator.Classes.Room room29 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor30 = room29.getOccupancySensor();
        Chief_event_coordinator.Classes.RoomStatus roomStatus31 = room29.getStatus();
        administrator25.addRoom(room29);
        Chief_event_coordinator.Classes.Room room34 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str35 = room34.getRoomLocation();
        java.lang.String str36 = room34.getRoomLocation();
        administrator25.disableRoom(room34);
        administrator2.addRoom(room34);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Not specified" + "'", str17, "Not specified");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(idBadgeScanner19);
        org.junit.Assert.assertNotNull(intMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor30);
        org.junit.Assert.assertTrue("'" + roomStatus31 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus31.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Not specified" + "'", str35, "Not specified");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Not specified" + "'", str36, "Not specified");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str2 = room1.getBuilding();
        java.lang.String str3 = room1.getClosureReason();
        Chief_event_coordinator.Classes.Administrator administrator6 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room8 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator6.viewRoomStatus(room8);
        int int10 = room8.getCapacity();
        Chief_event_coordinator.Classes.RoomStatus roomStatus11 = room8.getStatus();
        room1.setStatus(roomStatus11);
        int int13 = room1.getCapacity();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver14 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Not specified" + "'", str2, "Not specified");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + roomStatus11 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus11.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        boolean boolean6 = stubPayment0.refund((double) 1);
        boolean boolean8 = stubPayment0.refund((double) (-1));
        boolean boolean10 = stubPayment0.charge((-1.0d));
        boolean boolean12 = stubPayment0.charge(0.0d);
        boolean boolean14 = stubPayment0.refund(0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor16 = room15.getOccupancySensor();
        administrator2.addRoom(room15);
        java.lang.String str18 = room15.getRoomLocation();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner19 = room15.getIdBadgeScanner();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(occupancySensor16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
        org.junit.Assert.assertNotNull(idBadgeScanner19);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator5.viewRoomStatus(room7);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) '#');
        room10.setRoomLocation("hi!");
        java.lang.String str13 = room10.getClosureReason();
        room10.setRoomLocation("hi!");
        administrator5.enableRoom(room10);
        Chief_event_coordinator.Classes.Room room18 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor19 = room18.getOccupancySensor();
        administrator5.addRoom(room18);
        Chief_event_coordinator.Classes.Room room22 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver23 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room22);
        int int24 = room22.getCapacity();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner25 = room22.getIdBadgeScanner();
        administrator5.disableRoom(room22);
        Chief_event_coordinator.Classes.Room room28 = new Chief_event_coordinator.Classes.Room((int) '#');
        room28.setRoomLocation("hi!");
        java.lang.String str31 = room28.getClosureReason();
        room28.setRoomLocation("hi!");
        java.lang.String str34 = room28.getClosureReason();
        administrator5.viewRoomStatus(room28);
        Chief_event_coordinator.Classes.Administrator administrator38 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room40 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator38.viewRoomStatus(room40);
        int int42 = room40.getCapacity();
        Chief_event_coordinator.Classes.RoomStatus roomStatus43 = room40.getStatus();
        room28.setStatus(roomStatus43);
        administrator2.addRoom(room28);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver46 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(occupancySensor19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(idBadgeScanner25);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + roomStatus43 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus43.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        java.lang.String str7 = room5.getBuilding();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str11 = room10.getRoomLocation();
        administrator2.disableRoom(room10);
        administrator2.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Not specified" + "'", str11, "Not specified");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str2 = room1.getBuilding();
        int int3 = room1.getRoomid();
        int int4 = room1.getRoomid();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner5 = room1.getIdBadgeScanner();
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room1.getOccupancySensor();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Not specified" + "'", str2, "Not specified");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(idBadgeScanner5);
        org.junit.Assert.assertNotNull(occupancySensor6);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        java.lang.String str14 = administrator2.getEmail();
        administrator2.setName("hi!");
        Chief_event_coordinator.Classes.Administrator administrator19 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room21 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator19.viewRoomStatus(room21);
        int int23 = room21.getCapacity();
        java.lang.String str24 = room21.getBuilding();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner25 = room21.getIdBadgeScanner();
        administrator2.addRoom(room21);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Not specified" + "'", str24, "Not specified");
        org.junit.Assert.assertNotNull(idBadgeScanner25);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room5.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room5.getIdBadgeScanner();
        administrator2.enableRoom(room5);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver9 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap10 = administrator2.viewBookings();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver11 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap12 = administrator2.viewBookings();
        java.lang.String str13 = administrator2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor6);
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        org.junit.Assert.assertNotNull(intMap10);
        org.junit.Assert.assertNotNull(intMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor16 = room15.getOccupancySensor();
        administrator2.addRoom(room15);
        room15.setBuilding("Maintenance");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(occupancySensor16);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        java.lang.String str6 = administrator2.getName();
        administrator2.setEmail("Maintenance");
        java.lang.String str9 = administrator2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Maintenance" + "'", str9, "Maintenance");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        boolean boolean6 = stubPayment0.refund((double) 1);
        boolean boolean8 = stubPayment0.refund((double) 'a');
        boolean boolean10 = stubPayment0.refund((double) 0);
        boolean boolean12 = stubPayment0.charge((double) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        java.lang.String str4 = administrator2.getName();
        java.lang.String str5 = administrator2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        java.lang.String str4 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str7 = room6.getBuilding();
        int int8 = room6.getRoomid();
        int int9 = room6.getRoomid();
        administrator2.disableRoom(room6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str10 = room9.getBuilding();
        java.lang.String str11 = room9.getClosureReason();
        administrator2.disableRoom(room9);
        room9.setBuilding("Maintenance");
        int int15 = room9.getRoomid();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator16 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str17 = administrator16.getEmail();
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor20 = room19.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner21 = room19.getIdBadgeScanner();
        administrator16.enableRoom(room19);
        administrator2.viewRoomStatus(room19);
        Chief_event_coordinator.Classes.Room room25 = new Chief_event_coordinator.Classes.Room((int) '#');
        int int26 = room25.getCapacity();
        java.lang.String str27 = room25.getClosureReason();
        administrator2.closeRoom(room25);
        Chief_event_coordinator.Classes.Administrator administrator31 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room33 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator31.viewRoomStatus(room33);
        Chief_event_coordinator.Classes.Room room36 = new Chief_event_coordinator.Classes.Room((int) '#');
        room36.setRoomLocation("hi!");
        java.lang.String str39 = room36.getClosureReason();
        room36.setRoomLocation("hi!");
        administrator31.enableRoom(room36);
        Chief_event_coordinator.Classes.Room room44 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor45 = room44.getOccupancySensor();
        administrator31.addRoom(room44);
        Chief_event_coordinator.Classes.Room room48 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str49 = room48.getBuilding();
        administrator31.enableRoom(room48);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor51 = room48.getOccupancySensor();
        administrator2.enableRoom(room48);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor20);
        org.junit.Assert.assertNotNull(idBadgeScanner21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(occupancySensor45);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Not specified" + "'", str49, "Not specified");
        org.junit.Assert.assertNotNull(occupancySensor51);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver3 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        administrator2.setEmail("Not specified");
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver6 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        java.lang.String str6 = administrator2.getName();
        administrator2.setName("Not specified");
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor11 = room10.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner12 = room10.getIdBadgeScanner();
        administrator2.enableRoom(room10);
        java.lang.String str14 = room10.getBuilding();
        java.lang.String str15 = room10.getClosureReason();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor11);
        org.junit.Assert.assertNotNull(idBadgeScanner12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Not specified" + "'", str14, "Not specified");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '#');
        room1.setRoomLocation("hi!");
        java.lang.String str4 = room1.getClosureReason();
        room1.setRoomLocation("hi!");
        java.lang.String str7 = room1.getClosureReason();
        java.lang.String str8 = room1.getRoomLocation();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator16 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str17 = administrator16.getEmail();
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor20 = room19.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner21 = room19.getIdBadgeScanner();
        administrator16.enableRoom(room19);
        administrator2.closeRoom(room19);
        administrator2.setEmail("Not specified");
        administrator2.setName("");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor20);
        org.junit.Assert.assertNotNull(idBadgeScanner21);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.refund((double) (short) 10);
        boolean boolean6 = stubPayment0.refund(0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver5 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room4);
        administrator2.addRoom(room4);
        java.lang.String str7 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str10 = room9.getBuilding();
        java.lang.String str11 = room9.getClosureReason();
        administrator2.disableRoom(room9);
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor15 = room14.getOccupancySensor();
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver16 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room14);
        administrator2.viewRoomStatus(room14);
        Chief_event_coordinator.Classes.Administrator administrator20 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room22 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator20.viewRoomStatus(room22);
        Chief_event_coordinator.Classes.Room room25 = new Chief_event_coordinator.Classes.Room((int) '#');
        room25.setRoomLocation("hi!");
        java.lang.String str28 = room25.getClosureReason();
        room25.setRoomLocation("hi!");
        administrator20.enableRoom(room25);
        java.lang.String str32 = administrator20.getEmail();
        Chief_event_coordinator.Classes.Room room34 = new Chief_event_coordinator.Classes.Room((int) '#');
        java.lang.String str35 = room34.getBuilding();
        int int36 = room34.getRoomid();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner37 = room34.getIdBadgeScanner();
        administrator20.closeRoom(room34, "Not specified");
        administrator2.enableRoom(room34);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver41 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(occupancySensor15);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Not specified" + "'", str35, "Not specified");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(idBadgeScanner37);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str3 = administrator2.getEmail();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        java.lang.String str6 = room5.getRoomLocation();
        java.lang.String str7 = room5.getBuilding();
        administrator2.enableRoom(room5);
        java.lang.String str9 = administrator2.getEmail();
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver10 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator2);
        java.util.List<java.lang.String> strList11 = adminDashboardObserver10.getActivityLog();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver3 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("Not specified");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment3 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver4 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment3);
        Chief_event_coordinator.Classes.Booking booking5 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment6 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver7 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment6);
        boolean boolean9 = stubPayment6.refund(100.0d);
        boolean boolean11 = stubPayment6.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver12 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment6);
        Chief_event_coordinator.Classes.Booking booking13 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus14 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment15 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean17 = stubPayment15.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver18 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment15);
        Chief_event_coordinator.Classes.Booking booking19 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus20 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment21 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver22 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment21);
        Chief_event_coordinator.Classes.Booking booking23 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus24 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver22.onBookingStatusChanged(booking23, bookingStatus24, bookingStatus25);
        paymentNotificationObserver18.onBookingStatusChanged(booking19, bookingStatus20, bookingStatus24);
        paymentNotificationObserver12.onBookingStatusChanged(booking13, bookingStatus14, bookingStatus20);
        Chief_event_coordinator.Observer.StubPayment stubPayment29 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver30 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment29);
        boolean boolean32 = stubPayment29.refund(100.0d);
        boolean boolean34 = stubPayment29.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver35 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment29);
        Chief_event_coordinator.Classes.Booking booking36 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment37 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean39 = stubPayment37.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver40 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment37);
        Chief_event_coordinator.Classes.Booking booking41 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus42 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment43 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver44 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment43);
        Chief_event_coordinator.Classes.Booking booking45 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus46 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus47 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver44.onBookingStatusChanged(booking45, bookingStatus46, bookingStatus47);
        paymentNotificationObserver40.onBookingStatusChanged(booking41, bookingStatus42, bookingStatus46);
        Chief_event_coordinator.Observer.StubPayment stubPayment50 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver51 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment50);
        Chief_event_coordinator.Classes.Booking booking52 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus53 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus54 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver51.onBookingStatusChanged(booking52, bookingStatus53, bookingStatus54);
        paymentNotificationObserver35.onBookingStatusChanged(booking36, bookingStatus46, bookingStatus53);
        paymentNotificationObserver4.onBookingStatusChanged(booking5, bookingStatus20, bookingStatus46);
        Chief_event_coordinator.Observer.StubPayment stubPayment58 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver59 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment58);
        Chief_event_coordinator.Classes.Booking booking60 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus61 = Chief_event_coordinator.Observer.BookingStatus.CONFIRMED;
        Chief_event_coordinator.Observer.StubPayment stubPayment62 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean64 = stubPayment62.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver65 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment62);
        Chief_event_coordinator.Classes.Booking booking66 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus67 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment68 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver69 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment68);
        Chief_event_coordinator.Classes.Booking booking70 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus71 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus72 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver69.onBookingStatusChanged(booking70, bookingStatus71, bookingStatus72);
        paymentNotificationObserver65.onBookingStatusChanged(booking66, bookingStatus67, bookingStatus71);
        paymentNotificationObserver59.onBookingStatusChanged(booking60, bookingStatus61, bookingStatus71);
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus46, bookingStatus71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus14.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus20.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus24.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus25.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus42 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus42.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus46 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus46.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus47 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus47.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus53 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus53.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus54 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus54.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + bookingStatus61 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus61.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus67 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus67.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus71 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus71.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus72 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus72.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("Not specified");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment3 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver4 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment3);
        Chief_event_coordinator.Classes.Booking booking5 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus6 = Chief_event_coordinator.Observer.BookingStatus.CONFIRMED;
        Chief_event_coordinator.Observer.StubPayment stubPayment7 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean9 = stubPayment7.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver10 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment7);
        Chief_event_coordinator.Classes.Booking booking11 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus12 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment13 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver14 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment13);
        Chief_event_coordinator.Classes.Booking booking15 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus16 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus17 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver14.onBookingStatusChanged(booking15, bookingStatus16, bookingStatus17);
        paymentNotificationObserver10.onBookingStatusChanged(booking11, bookingStatus12, bookingStatus16);
        paymentNotificationObserver4.onBookingStatusChanged(booking5, bookingStatus6, bookingStatus16);
        Chief_event_coordinator.Observer.StubPayment stubPayment21 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver22 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment21);
        Chief_event_coordinator.Classes.Booking booking23 = null;
        Chief_event_coordinator.Observer.StubPayment stubPayment24 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver25 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment24);
        boolean boolean27 = stubPayment24.refund(100.0d);
        boolean boolean29 = stubPayment24.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver30 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment24);
        Chief_event_coordinator.Classes.Booking booking31 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus32 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment33 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean35 = stubPayment33.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver36 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment33);
        Chief_event_coordinator.Classes.Booking booking37 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus38 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment39 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver40 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment39);
        Chief_event_coordinator.Classes.Booking booking41 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus42 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus43 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver40.onBookingStatusChanged(booking41, bookingStatus42, bookingStatus43);
        paymentNotificationObserver36.onBookingStatusChanged(booking37, bookingStatus38, bookingStatus42);
        paymentNotificationObserver30.onBookingStatusChanged(booking31, bookingStatus32, bookingStatus38);
        Chief_event_coordinator.Observer.StubPayment stubPayment47 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver48 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment47);
        boolean boolean50 = stubPayment47.refund(100.0d);
        boolean boolean52 = stubPayment47.charge((double) 0.0f);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver53 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment47);
        Chief_event_coordinator.Classes.Booking booking54 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus55 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        Chief_event_coordinator.Observer.StubPayment stubPayment56 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean58 = stubPayment56.refund((double) (short) -1);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver59 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment56);
        Chief_event_coordinator.Classes.Booking booking60 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus61 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.StubPayment stubPayment62 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver63 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment62);
        Chief_event_coordinator.Classes.Booking booking64 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus65 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus66 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        paymentNotificationObserver63.onBookingStatusChanged(booking64, bookingStatus65, bookingStatus66);
        paymentNotificationObserver59.onBookingStatusChanged(booking60, bookingStatus61, bookingStatus65);
        paymentNotificationObserver53.onBookingStatusChanged(booking54, bookingStatus55, bookingStatus61);
        paymentNotificationObserver22.onBookingStatusChanged(booking23, bookingStatus32, bookingStatus61);
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus16, bookingStatus61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus6.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus12.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus16.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus17.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus32 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus32.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus38 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus38.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus42 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus42.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus43 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus43.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus55 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus55.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus61 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus61.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus65 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus65.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus66 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus66.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator5.viewRoomStatus(room7);
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator12 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator12.viewRoomStatus(room14);
        int int16 = room14.getCapacity();
        administrator2.disableRoom(room14);
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) '#');
        room19.setRoomLocation("hi!");
        java.lang.String str22 = room19.getRoomLocation();
        administrator2.closeRoom(room19);
        java.lang.String str24 = room19.getClosureReason();
        java.lang.String str25 = room19.getBuilding();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Maintenance" + "'", str24, "Maintenance");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Not specified" + "'", str25, "Not specified");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator2.viewRoomStatus(room4);
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        room7.setRoomLocation("hi!");
        java.lang.String str10 = room7.getClosureReason();
        room7.setRoomLocation("hi!");
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator16 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        java.lang.String str17 = administrator16.getEmail();
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor20 = room19.getOccupancySensor();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner21 = room19.getIdBadgeScanner();
        administrator16.enableRoom(room19);
        administrator2.closeRoom(room19);
        administrator2.setEmail("Not specified");
        Chief_event_coordinator.Classes.Room room26 = null;
        // The following exception was thrown during execution in test generation
        try {
            administrator2.addRoom(room26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Room.getRoomid()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(occupancySensor20);
        org.junit.Assert.assertNotNull(idBadgeScanner21);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator5.viewRoomStatus(room7);
        administrator2.enableRoom(room7);
        Chief_event_coordinator.Classes.Administrator administrator12 = new Chief_event_coordinator.Classes.Administrator("hi!", "");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '#');
        administrator12.viewRoomStatus(room14);
        int int16 = room14.getCapacity();
        administrator2.disableRoom(room14);
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) '#');
        room19.setRoomLocation("hi!");
        java.lang.String str22 = room19.getRoomLocation();
        administrator2.closeRoom(room19);
        java.lang.String str24 = room19.getClosureReason();
        int int25 = room19.getRoomid();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Maintenance" + "'", str24, "Maintenance");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) 10L);
        java.lang.Class<?> wildcardClass5 = stubPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}

