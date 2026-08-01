package Randoop;

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
        boolean boolean0 = Chief_event_coordinator.Classes.RegressionTest0.debug;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Chief_event_coordinator.Demo.ObserverPatternDemo observerPatternDemo0 = new Chief_event_coordinator.Demo.ObserverPatternDemo();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Chief_event_coordinator.Classes.Room room0 = null;
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver1 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room0);
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.CONFIRMED;
        // The following exception was thrown during execution in test generation
        try {
            roomAvailabilityObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Room.getRoomid()\" because \"this.room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedState0.extend(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Chief_event_coordinator.State.PendingState pendingState0 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Classes.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            pendingState0.cancel(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) (short) 10, (int) (byte) 0, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room capacity must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Chief_event_coordinator.Classes.Room room1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Booking booking2 = new Chief_event_coordinator.Classes.Booking("", room1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Chief_event_coordinator.State.CheckedInState checkedInState0 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Classes.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkedInState0.markNoShow(booking1);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot mark no-show a booking in state CHECKED_IN.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Chief_event_coordinator.State.PendingState pendingState0 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Classes.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            pendingState0.cancel(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Chief_event_coordinator.State.CheckedInState checkedInState0 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Classes.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkedInState0.cancel(booking1);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot cancel a booking in state CHECKED_IN.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Chief_event_coordinator.State.PendingState pendingState0 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Classes.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            pendingState0.markNoShow(booking1);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot mark no-show a booking in state PENDING.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Chief_event_coordinator.Classes.RoomStatus roomStatus0 = Chief_event_coordinator.Classes.RoomStatus.AVAILABLE;
        org.junit.Assert.assertTrue("'" + roomStatus0 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus0.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Chief_event_coordinator.Classes.RoomStatus roomStatus0 = Chief_event_coordinator.Classes.RoomStatus.OCCUPIED;
        org.junit.Assert.assertTrue("'" + roomStatus0 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.OCCUPIED + "'", roomStatus0.equals(Chief_event_coordinator.Classes.RoomStatus.OCCUPIED));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner1 = new Chief_event_coordinator.Classes.IdBadgeScanner((int) (short) 0);
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = idBadgeScanner1.scanBadge("hi!", badgeVerificationSystem3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Badge verification system is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Chief_event_coordinator.State.CheckedInState checkedInState0 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Classes.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkedInState0.checkIn(booking1);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot check in a booking in state CHECKED_IN.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Chief_event_coordinator.Persistence.RoomCSVManager roomCSVManager0 = new Chief_event_coordinator.Persistence.RoomCSVManager();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Chief_event_coordinator.Classes.RegressionTest regressionTest0 = new Chief_event_coordinator.Classes.RegressionTest();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = new Chief_event_coordinator.Classes.AdminPermssion("hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Chief_event_coordinator.Persistence.BookingCSVManager bookingCSVManager0 = new Chief_event_coordinator.Persistence.BookingCSVManager();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("hi!");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.CONFIRMED;
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner1 = new Chief_event_coordinator.Classes.IdBadgeScanner((int) (byte) -1);
        int int2 = idBadgeScanner1.getRoomid();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = extendedState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedState0.cancel(booking2);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot cancel a booking in state EXTENDED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "");
        Chief_event_coordinator.Classes.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            administrator4.viewRoomStatus(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Room.getRoomid()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = new Chief_event_coordinator.Classes.AdminPermssion("");
        java.lang.String str2 = adminPermssion1.getLevel();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            administrator4.closeRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Room.setStatus(Chief_event_coordinator.Classes.RoomStatus)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Chief_event_coordinator.State.PendingState pendingState0 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Classes.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            pendingState0.checkIn(booking1);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot check in a booking in state PENDING.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("hi!");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.State.ExtendedState extendedState3 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = extendedState3.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = Chief_event_coordinator.Observer.BookingStatus.CONFIRMED;
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus4, bookingStatus5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str7 = room6.getBuilding();
        administrator4.closeRoom(room6);
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.BookingFacade bookingFacade10 = new Chief_event_coordinator.Classes.BookingFacade(administrator4, badgeVerificationSystem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Badge verification system is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver1 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.CONFIRMED;
        Chief_event_coordinator.State.CancelledState cancelledState4 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = cancelledState4.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            paymentNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = extendedState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedState0.extend(booking2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver1 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.NO_SHOW;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Observer.BookingStatus.ordinal()\" because \"newStatus\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) (byte) 1, (int) (byte) 0, "Not specified", "Not specified");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room capacity must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Chief_event_coordinator.Observer.BookingStatus bookingStatus0 = Chief_event_coordinator.Observer.BookingStatus.NO_SHOW;
        java.lang.Class<?> wildcardClass1 = bookingStatus0.getClass();
        org.junit.Assert.assertTrue("'" + bookingStatus0 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus0.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator4.addRoom(room6);
        // The following exception was thrown during execution in test generation
        try {
            room6.setBuilding("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Building is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.markNoShow(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = extendedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedState0.cancel(booking3);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot cancel a booking in state EXTENDED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = extendedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedState0.markNoShow(booking3);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot mark no-show a booking in state EXTENDED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory1 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory1);
        Chief_event_coordinator.Classes.Administrator administrator5 = roomAdminFactory1.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str8 = room7.getBuilding();
        administrator5.closeRoom(room7);
        java.lang.String str10 = room7.getRoomLocation();
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Booking booking11 = new Chief_event_coordinator.Classes.Booking("", room7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Not specified" + "'", str8, "Not specified");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Chief_event_coordinator.Observer.BookingStatus bookingStatus0 = null;
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.State.BookingState bookingState1 = Chief_event_coordinator.State.BookingStateFactory.fromStatus(bookingStatus0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Observer.BookingStatus.ordinal()\" because \"status\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "");
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver5 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator4);
        Chief_event_coordinator.Classes.Booking booking6 = null;
        Chief_event_coordinator.State.ExtendedState extendedState7 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus8 = extendedState7.getStatus();
        Chief_event_coordinator.State.ExtendedState extendedState9 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus10 = extendedState9.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver5.onBookingStatusChanged(booking6, bookingStatus8, bookingStatus10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus8.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus10.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = confirmedState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.confirmDeposit(booking2);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot confirm deposit a booking in state CONFIRMED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Chief_event_coordinator.State.PendingState pendingState0 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = pendingState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            pendingState0.cancel(booking2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str2 = room1.getBuilding();
        int int3 = room1.getCapacity();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Not specified" + "'", str2, "Not specified");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Chief_event_coordinator.Observer.BookingStatus bookingStatus0 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        Chief_event_coordinator.State.BookingState bookingState1 = Chief_event_coordinator.State.BookingStateFactory.fromStatus(bookingStatus0);
        Chief_event_coordinator.Classes.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingState1.cancel(booking2);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot cancel a booking in state CHECKED_IN.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus0 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus0.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '4');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver2 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        Chief_event_coordinator.Classes.Booking booking3 = null;
        Chief_event_coordinator.State.ExtendedState extendedState4 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = extendedState4.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus6 = extendedState4.getStatus();
        Chief_event_coordinator.State.CheckedInState checkedInState7 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus8 = checkedInState7.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            roomAvailabilityObserver2.onBookingStatusChanged(booking3, bookingStatus6, bookingStatus8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getRoomName()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus6.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus8.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver1 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean3 = stubPayment0.charge((double) (short) -1);
        boolean boolean5 = stubPayment0.refund((double) 0);
        boolean boolean7 = stubPayment0.charge((double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Room room2 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str3 = room2.getBuilding();
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand4 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser0, room2);
        // The following exception was thrown during execution in test generation
        try {
            bookRoomCommand4.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.bookRoom(Chief_event_coordinator.Classes.Room)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Not specified" + "'", str3, "Not specified");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.cancel(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = new Chief_event_coordinator.Classes.AdminPermssion("");
        adminPermssion1.setLevel("");
        java.lang.Class<?> wildcardClass4 = adminPermssion1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Chief_event_coordinator.Classes.RegressionTest0.debug = false;
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator4.addRoom(room6);
        Chief_event_coordinator.Classes.BookingFacade bookingFacade8 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room10 = bookingFacade8.viewRoom((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 1 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator4.addRoom(room6);
        Chief_event_coordinator.Classes.BookingFacade bookingFacade8 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            bookingFacade8.closeRoom((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room -1 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '4');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver2 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        Chief_event_coordinator.Classes.Booking booking3 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        // The following exception was thrown during execution in test generation
        try {
            roomAvailabilityObserver2.onBookingStatusChanged(booking3, bookingStatus4, bookingStatus5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getRoomName()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem0 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        // The following exception was thrown during execution in test generation
        try {
            badgeVerificationSystem0.authorizeBadge("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Badge id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("Maintenance", "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("Maintenance", "Not specified");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            bookingFacade6.disableRoom((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 35 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = confirmedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = confirmedState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.markNoShow(booking3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.cancel(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Chief_event_coordinator.State.PendingState pendingState0 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = pendingState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            pendingState0.confirmDeposit(booking2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem0 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        // The following exception was thrown during execution in test generation
        try {
            badgeVerificationSystem0.revokeBadge("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Badge id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator4.addRoom(room6);
        Chief_event_coordinator.Classes.BookingFacade bookingFacade8 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = bookingFacade8.wasLastBadgeVerified((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 10 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Chief_event_coordinator.State.CheckedInState checkedInState0 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Classes.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkedInState0.checkIn(booking1);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot check in a booking in state CHECKED_IN.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str2 = room1.getBuilding();
        room1.setRoomLocation("Not specified");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Not specified" + "'", str2, "Not specified");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException1 = new Chief_event_coordinator.State.IllegalBookingTransitionException("");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException3 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        illegalBookingTransitionException1.addSuppressed((java.lang.Throwable) illegalBookingTransitionException3);
        java.lang.String str5 = illegalBookingTransitionException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief_event_coordinator.State.IllegalBookingTransitionException: hi!" + "'", str5, "Chief_event_coordinator.State.IllegalBookingTransitionException: hi!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room id must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor1 = new Chief_event_coordinator.Classes.OccupancySensor(0);
        int int2 = occupancySensor1.getRoomid();
        int int3 = occupancySensor1.getOccupantCount();
        int int4 = occupancySensor1.getRoomid();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver7 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator4);
        Chief_event_coordinator.Classes.Booking booking8 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus9 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        Chief_event_coordinator.State.BookingState bookingState10 = Chief_event_coordinator.State.BookingStateFactory.fromStatus(bookingStatus9);
        Chief_event_coordinator.State.ExtendedState extendedState11 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus12 = extendedState11.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver7.onBookingStatusChanged(booking8, bookingStatus9, bookingStatus12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus9.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(bookingState10);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus12.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator4.addRoom(room6);
        Chief_event_coordinator.Classes.BookingFacade bookingFacade8 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = bookingFacade8.wasLastBadgeVerified(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 1 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator4.closeRoom(room6, "Not specified");
        java.lang.String str9 = room6.getRoomLocation();
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Not specified" + "'", str9, "Not specified");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room(1);
        int int2 = room1.getRoomid();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = extendedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedState0.markNoShow(booking4);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot mark no-show a booking in state EXTENDED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = confirmedState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.cancel(booking2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = confirmedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = confirmedState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.checkIn(booking3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Chief_event_coordinator.State.CheckedInState checkedInState0 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = checkedInState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkedInState0.confirmDeposit(booking2);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot confirm deposit a booking in state CHECKED_IN.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room id must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator4.addRoom(room6);
        Chief_event_coordinator.Classes.BookingFacade bookingFacade8 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bookingFacade8.receiveOccupancyData((int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 10 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            bookingFacade6.enableRoom((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 10 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator6 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator9.addRoom(room11);
        administrator4.viewRoomStatus(room11);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor14 = room11.getOccupancySensor();
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertNotNull(occupancySensor14);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        adminPermssion1.setLevel("");
        adminPermssion1.setLevel("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!");
        org.junit.Assert.assertNotNull(adminPermssion1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator7 = roomAdminFactory0.createAdministrator("", "hi!");
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Chief_event_coordinator.State.PendingState pendingState0 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Classes.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            pendingState0.confirmDeposit(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room8 = bookingFacade6.viewRoom((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room -1 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor1 = new Chief_event_coordinator.Classes.OccupancySensor((-1));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = confirmedState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.checkIn(booking2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            bookingFacade6.authorizeBadge("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Badge id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Room room2 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str3 = room2.getBuilding();
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand4 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser0, room2);
        // The following exception was thrown during execution in test generation
        try {
            bookRoomCommand4.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.bookRoom(Chief_event_coordinator.Classes.Room)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Not specified" + "'", str3, "Not specified");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.checkIn(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator4.addRoom(room6);
        Chief_event_coordinator.Classes.BookingFacade bookingFacade8 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            bookingFacade8.enableRoom((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room -1 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator6 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator9.addRoom(room11);
        administrator4.viewRoomStatus(room11);
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) '4');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver16 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room15);
        administrator4.enableRoom(room15);
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str20 = room19.getBuilding();
        administrator4.closeRoom(room19, "hi!");
        java.lang.String str23 = room19.getRoomLocation();
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Not specified" + "'", str20, "Not specified");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Not specified" + "'", str23, "Not specified");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Chief_event_coordinator.Observer.BookingStatus bookingStatus0 = Chief_event_coordinator.Observer.BookingStatus.PENDING;
        org.junit.Assert.assertTrue("'" + bookingStatus0 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus0.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        adminPermssion1.setLevel("hi!");
        adminPermssion1.showPermission();
        org.junit.Assert.assertNotNull(adminPermssion1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("", "hi!");
        Chief_event_coordinator.Classes.Room room3 = null;
        Chief_event_coordinator.Command.AddRoomCommand addRoomCommand4 = new Chief_event_coordinator.Command.AddRoomCommand(administrator2, room3);
        // The following exception was thrown during execution in test generation
        try {
            addRoomCommand4.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Room.getRoomid()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str7 = room6.getBuilding();
        administrator4.closeRoom(room6);
        java.lang.String str9 = room6.getClosureReason();
        // The following exception was thrown during execution in test generation
        try {
            room6.setCapacity((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room capacity must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Maintenance" + "'", str9, "Maintenance");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Chief_event_coordinator.Classes.RegressionTest0 regressionTest0_0 = new Chief_event_coordinator.Classes.RegressionTest0();
        regressionTest0_0.test001();
        regressionTest0_0.test002();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("Not specified");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.State.ExtendedState extendedState4 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = extendedState4.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus6 = extendedState4.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus7 = extendedState4.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus6.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus7 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus7.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room8 = bookingFacade6.viewRoom(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 52 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str7 = room6.getBuilding();
        administrator4.closeRoom(room6);
        Chief_event_coordinator.Classes.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            administrator4.closeRoom(room9, "Chief_event_coordinator.State.IllegalBookingTransitionException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Room.setStatus(Chief_event_coordinator.Classes.RoomStatus)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory3 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion4 = roomAdminFactory3.createPermission();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion5 = roomAdminFactory3.createPermission();
        chiefEventCoordinator2.setFactory((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory3);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory7 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator8 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory7);
        Chief_event_coordinator.Classes.Administrator administrator11 = roomAdminFactory7.createAdministrator("hi!", "");
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator12 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory7);
        Chief_event_coordinator.Abstract_Factory.AdminFactory adminFactory13 = chiefEventCoordinator12.getFactory();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory14 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion15 = roomAdminFactory14.createPermission();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator16 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory14);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory17 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion18 = roomAdminFactory17.createPermission();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion19 = roomAdminFactory17.createPermission();
        chiefEventCoordinator16.setFactory((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory17);
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion21 = roomAdminFactory17.createPermission();
        chiefEventCoordinator12.setFactory((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory17);
        chiefEventCoordinator2.setFactory((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory17);
        org.junit.Assert.assertNotNull(adminPermssion1);
        org.junit.Assert.assertNotNull(adminPermssion4);
        org.junit.Assert.assertNotNull(adminPermssion5);
        org.junit.Assert.assertNotNull(administrator11);
        org.junit.Assert.assertNotNull(adminFactory13);
        org.junit.Assert.assertNotNull(adminPermssion15);
        org.junit.Assert.assertNotNull(adminPermssion18);
        org.junit.Assert.assertNotNull(adminPermssion19);
        org.junit.Assert.assertNotNull(adminPermssion21);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor1 = new Chief_event_coordinator.Classes.OccupancySensor(0);
        int int2 = occupancySensor1.getRoomid();
        int int3 = occupancySensor1.getOccupantCount();
        int int5 = occupancySensor1.detectOccupancy((int) (short) 100);
        int int7 = occupancySensor1.detectOccupancy((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        bookingFacade6.authorizeBadge("Not specified");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room10 = bookingFacade6.viewRoom((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 100 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        bookingFacade6.authorizeBadge("Not specified");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = bookingFacade6.wasLastBadgeVerified(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 0 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Chief_event_coordinator.State.PendingState pendingState0 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = pendingState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            pendingState0.confirmDeposit(booking2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bookingFacade6.receiveOccupancyData((int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 10 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner1 = new Chief_event_coordinator.Classes.IdBadgeScanner((int) (short) 0);
        boolean boolean2 = idBadgeScanner1.wasLastBadgeVerified();
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem4 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        boolean boolean5 = idBadgeScanner1.scanBadge("Not specified", badgeVerificationSystem4);
        java.lang.String str6 = idBadgeScanner1.getLastScannedBadgeId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Not specified" + "'", str6, "Not specified");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = new Chief_event_coordinator.Classes.AdminPermssion("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        bookingFacade6.authorizeBadge("Not specified");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = bookingFacade6.wasLastBadgeVerified((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 32 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator4.addRoom(room6);
        Chief_event_coordinator.Classes.BookingFacade bookingFacade8 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory9 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator10 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory9);
        Chief_event_coordinator.Classes.Administrator administrator13 = roomAdminFactory9.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory14 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator15 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory14);
        Chief_event_coordinator.Classes.Administrator administrator18 = roomAdminFactory14.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room20 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator18.addRoom(room20);
        administrator13.viewRoomStatus(room20);
        Chief_event_coordinator.Classes.Room room24 = new Chief_event_coordinator.Classes.Room((int) '4');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver25 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room24);
        administrator13.enableRoom(room24);
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand27 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator4, room24);
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay28 = new Chief_event_coordinator.Classes.AdminDisplay(administrator4);
        adminDisplay28.display();
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator13);
        org.junit.Assert.assertNotNull(administrator18);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException1 = new Chief_event_coordinator.State.IllegalBookingTransitionException("");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException3 = new Chief_event_coordinator.State.IllegalBookingTransitionException("");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException5 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        illegalBookingTransitionException3.addSuppressed((java.lang.Throwable) illegalBookingTransitionException5);
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException8 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        illegalBookingTransitionException3.addSuppressed((java.lang.Throwable) illegalBookingTransitionException8);
        illegalBookingTransitionException1.addSuppressed((java.lang.Throwable) illegalBookingTransitionException8);
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException12 = new Chief_event_coordinator.State.IllegalBookingTransitionException("");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException14 = new Chief_event_coordinator.State.IllegalBookingTransitionException("");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException16 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        illegalBookingTransitionException14.addSuppressed((java.lang.Throwable) illegalBookingTransitionException16);
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException19 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        illegalBookingTransitionException14.addSuppressed((java.lang.Throwable) illegalBookingTransitionException19);
        illegalBookingTransitionException12.addSuppressed((java.lang.Throwable) illegalBookingTransitionException19);
        illegalBookingTransitionException1.addSuppressed((java.lang.Throwable) illegalBookingTransitionException19);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException1 = new Chief_event_coordinator.State.IllegalBookingTransitionException("");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException3 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        illegalBookingTransitionException1.addSuppressed((java.lang.Throwable) illegalBookingTransitionException3);
        java.lang.String str5 = illegalBookingTransitionException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief_event_coordinator.State.IllegalBookingTransitionException: " + "'", str5, "Chief_event_coordinator.State.IllegalBookingTransitionException: ");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = extendedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedState0.checkIn(booking3);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot check in a booking in state EXTENDED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Chief_event_coordinator.State.PendingState pendingState0 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Classes.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            pendingState0.cancel(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver1 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean3 = stubPayment0.charge((double) (short) -1);
        boolean boolean5 = stubPayment0.refund((double) 100);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver6 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean8 = stubPayment0.refund((double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = extendedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedState0.confirmDeposit(booking3);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot confirm deposit a booking in state EXTENDED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("hi!");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.State.ConfirmedState confirmedState3 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = confirmedState3.getStatus();
        Chief_event_coordinator.State.CheckedInState checkedInState5 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus6 = checkedInState5.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus4, bookingStatus6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus6.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Chief_event_coordinator.State.CheckedInState checkedInState0 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = checkedInState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            checkedInState0.checkIn(booking2);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot check in a booking in state CHECKED_IN.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!");
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.State.ConfirmedState confirmedState4 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = confirmedState4.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            userNotificationObserver1.onBookingStatusChanged(booking2, bookingStatus3, bookingStatus5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("", "hi!");
        administrator2.setEmail("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Chief_event_coordinator.State.CancelledState cancelledState0 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = cancelledState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = cancelledState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cancelledState0.markNoShow(booking3);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot mark no-show a booking in state CANCELLED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Chief_event_coordinator.State.CancelledState cancelledState0 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Classes.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            cancelledState0.cancel(booking1);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot cancel a booking in state CANCELLED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator6 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str12 = room11.getBuilding();
        administrator9.closeRoom(room11);
        java.lang.String str14 = room11.getRoomLocation();
        administrator4.viewRoomStatus(room11);
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay16 = new Chief_event_coordinator.Classes.AdminDisplay(administrator4);
        java.lang.String str17 = administrator4.getEmail();
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay18 = new Chief_event_coordinator.Classes.AdminDisplay(administrator4);
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem19 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade20 = new Chief_event_coordinator.Classes.BookingFacade(administrator4, badgeVerificationSystem19);
        boolean boolean22 = badgeVerificationSystem19.verifyBadge("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!");
        org.junit.Assert.assertNotNull(adminPermssion1);
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Not specified" + "'", str12, "Not specified");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Not specified" + "'", str14, "Not specified");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Chief_event_coordinator.Classes.RegressionTest0 regressionTest0_0 = new Chief_event_coordinator.Classes.RegressionTest0();
        regressionTest0_0.test005();
        regressionTest0_0.test005();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = extendedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState0.getStatus();
        Chief_event_coordinator.Classes.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedState0.extend(booking4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Chief_event_coordinator.State.CancelledState cancelledState0 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Classes.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            cancelledState0.confirmDeposit(booking1);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot confirm deposit a booking in state CANCELLED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver7 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator4);
        Chief_event_coordinator.Classes.Booking booking8 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus9 = Chief_event_coordinator.Observer.BookingStatus.CONFIRMED;
        Chief_event_coordinator.State.ExtendedState extendedState10 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus11 = extendedState10.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            adminDashboardObserver7.onBookingStatusChanged(booking8, bookingStatus9, bookingStatus11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getBookingid()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus9.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus11.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        bookingFacade6.authorizeBadge("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bookingFacade6.receiveOccupancyData((int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 10 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        bookingFacade6.authorizeBadge("hi!");
        // The following exception was thrown during execution in test generation
        try {
            bookingFacade6.disableRoom(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 0 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator6 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str12 = room11.getBuilding();
        administrator9.closeRoom(room11);
        java.lang.String str14 = room11.getRoomLocation();
        administrator4.viewRoomStatus(room11);
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay16 = new Chief_event_coordinator.Classes.AdminDisplay(administrator4);
        java.lang.String str17 = administrator4.getEmail();
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay18 = new Chief_event_coordinator.Classes.AdminDisplay(administrator4);
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem19 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade20 = new Chief_event_coordinator.Classes.BookingFacade(administrator4, badgeVerificationSystem19);
        // The following exception was thrown during execution in test generation
        try {
            bookingFacade20.disableRoom((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 97 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(adminPermssion1);
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Not specified" + "'", str12, "Not specified");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Not specified" + "'", str14, "Not specified");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        commandInvoker0.executeCommand();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator6 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("hi!", "");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator9.closeRoom(room11, "Not specified");
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand14 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator4, room11);
        int int15 = room11.getRoomid();
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) '4');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver2 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room1);
        Chief_event_coordinator.Classes.Booking booking3 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = Chief_event_coordinator.Observer.BookingStatus.CONFIRMED;
        Chief_event_coordinator.State.ExtendedState extendedState5 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus6 = extendedState5.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            roomAvailabilityObserver2.onBookingStatusChanged(booking3, bookingStatus4, bookingStatus6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.getRoomName()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus6.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        bookingFacade6.authorizeBadge("hi!");
        // The following exception was thrown during execution in test generation
        try {
            bookingFacade6.closeRoomForMaintenance(0, "Chief_event_coordinator.State.IllegalBookingTransitionException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 0 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory3 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator4 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory3);
        Chief_event_coordinator.Classes.Administrator administrator7 = roomAdminFactory3.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str10 = room9.getBuilding();
        administrator7.closeRoom(room9);
        java.lang.String str12 = room9.getRoomLocation();
        java.lang.String str13 = room9.getBuilding();
        int int14 = room9.getRoomid();
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand16 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator2, room9, "hi!");
        closeRoomCommand16.execute();
        org.junit.Assert.assertNotNull(administrator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Not specified" + "'", str12, "Not specified");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Not specified" + "'", str13, "Not specified");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory1 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory1);
        Chief_event_coordinator.Classes.Administrator administrator5 = roomAdminFactory1.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str8 = room7.getBuilding();
        administrator5.closeRoom(room7);
        administrator5.setEmail("Not specified");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory12 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator13 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory12);
        Chief_event_coordinator.Classes.Administrator administrator16 = roomAdminFactory12.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room18 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator16.addRoom(room18);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory20 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator21 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory20);
        Chief_event_coordinator.Classes.Administrator administrator24 = roomAdminFactory20.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room26 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str27 = room26.getBuilding();
        administrator24.closeRoom(room26);
        java.lang.String str29 = room26.getClosureReason();
        administrator16.viewRoomStatus(room26);
        administrator5.viewRoomStatus(room26);
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand32 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser0, room26);
        org.junit.Assert.assertNotNull(administrator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Not specified" + "'", str8, "Not specified");
        org.junit.Assert.assertNotNull(administrator16);
        org.junit.Assert.assertNotNull(administrator24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Not specified" + "'", str27, "Not specified");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Maintenance" + "'", str29, "Maintenance");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator6 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator9.addRoom(room11);
        administrator4.viewRoomStatus(room11);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory14 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator15 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory14);
        Chief_event_coordinator.Classes.Administrator administrator18 = roomAdminFactory14.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory19 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator20 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory19);
        Chief_event_coordinator.Classes.Administrator administrator23 = roomAdminFactory19.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room25 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator23.addRoom(room25);
        administrator18.viewRoomStatus(room25);
        Chief_event_coordinator.Classes.Room room29 = new Chief_event_coordinator.Classes.Room((int) '4');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver30 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room29);
        administrator18.enableRoom(room29);
        Chief_event_coordinator.Command.EnableRoomCommand enableRoomCommand32 = new Chief_event_coordinator.Command.EnableRoomCommand(administrator4, room29);
        enableRoomCommand32.execute();
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertNotNull(administrator18);
        org.junit.Assert.assertNotNull(administrator23);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator4.addRoom(room6);
        Chief_event_coordinator.Classes.BookingFacade bookingFacade8 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = bookingFacade8.receiveOccupancyData(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 0 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str7 = room6.getBuilding();
        administrator4.closeRoom(room6);
        administrator4.setEmail("Not specified");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory11 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator12 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory11);
        Chief_event_coordinator.Classes.Administrator administrator15 = roomAdminFactory11.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room17 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator15.addRoom(room17);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory19 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator20 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory19);
        Chief_event_coordinator.Classes.Administrator administrator23 = roomAdminFactory19.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room25 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str26 = room25.getBuilding();
        administrator23.closeRoom(room25);
        java.lang.String str28 = room25.getClosureReason();
        administrator15.viewRoomStatus(room25);
        administrator4.viewRoomStatus(room25);
        Chief_event_coordinator.Classes.Administrator administrator31 = null;
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory32 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator33 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory32);
        Chief_event_coordinator.Classes.Administrator administrator36 = roomAdminFactory32.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room38 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator36.addRoom(room38);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory40 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator41 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory40);
        Chief_event_coordinator.Classes.Administrator administrator44 = roomAdminFactory40.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room46 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str47 = room46.getBuilding();
        administrator44.closeRoom(room46);
        java.lang.String str49 = room46.getClosureReason();
        administrator36.viewRoomStatus(room46);
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand52 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator31, room46, "hi!");
        Chief_event_coordinator.Command.EnableRoomCommand enableRoomCommand53 = new Chief_event_coordinator.Command.EnableRoomCommand(administrator4, room46);
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertNotNull(administrator15);
        org.junit.Assert.assertNotNull(administrator23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Not specified" + "'", str26, "Not specified");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Maintenance" + "'", str28, "Maintenance");
        org.junit.Assert.assertNotNull(administrator36);
        org.junit.Assert.assertNotNull(administrator44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Not specified" + "'", str47, "Not specified");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Maintenance" + "'", str49, "Maintenance");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator4.addRoom(room6);
        Chief_event_coordinator.Classes.BookingFacade bookingFacade8 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room10 = bookingFacade8.viewRoom((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 52 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Chief_event_coordinator.Observer.BookingStatus bookingStatus0 = Chief_event_coordinator.Observer.BookingStatus.ACTIVE;
        org.junit.Assert.assertTrue("'" + bookingStatus0 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.ACTIVE + "'", bookingStatus0.equals(Chief_event_coordinator.Observer.BookingStatus.ACTIVE));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        bookingFacade6.authorizeBadge("hi!");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room10 = bookingFacade6.viewRoom((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 10 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.refund((double) 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Chief_event_coordinator.State.NoShowState noShowState0 = new Chief_event_coordinator.State.NoShowState();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory2 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion3 = roomAdminFactory2.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator6 = roomAdminFactory2.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory7 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator8 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory7);
        Chief_event_coordinator.Classes.Administrator administrator11 = roomAdminFactory7.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room13 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str14 = room13.getBuilding();
        administrator11.closeRoom(room13);
        java.lang.String str16 = room13.getRoomLocation();
        administrator6.viewRoomStatus(room13);
        Chief_event_coordinator.Classes.Booking booking18 = new Chief_event_coordinator.Classes.Booking("hi!", room13);
        // The following exception was thrown during execution in test generation
        try {
            noShowState0.checkIn(booking18);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot check in a booking in state NO_SHOW.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(adminPermssion3);
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(administrator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Not specified" + "'", str14, "Not specified");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Not specified" + "'", str16, "Not specified");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner1 = new Chief_event_coordinator.Classes.IdBadgeScanner((int) '4');
        boolean boolean2 = idBadgeScanner1.wasLastBadgeVerified();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory1 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory1);
        Chief_event_coordinator.Classes.Administrator administrator5 = roomAdminFactory1.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator5.addRoom(room7);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory9 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator10 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory9);
        Chief_event_coordinator.Classes.Administrator administrator13 = roomAdminFactory9.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str16 = room15.getBuilding();
        administrator13.closeRoom(room15);
        java.lang.String str18 = room15.getClosureReason();
        administrator5.viewRoomStatus(room15);
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand21 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator0, room15, "hi!");
        Chief_event_coordinator.Classes.RoomStatus roomStatus22 = Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE;
        room15.setStatus(roomStatus22);
        org.junit.Assert.assertNotNull(administrator5);
        org.junit.Assert.assertNotNull(administrator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Not specified" + "'", str16, "Not specified");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Maintenance" + "'", str18, "Maintenance");
        org.junit.Assert.assertTrue("'" + roomStatus22 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE + "'", roomStatus22.equals(Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("Chief_event_coordinator.State.IllegalBookingTransitionException: ");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", "Maintenance");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory1 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion2 = roomAdminFactory1.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator5 = roomAdminFactory1.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator7 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory6);
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str13 = room12.getBuilding();
        administrator10.closeRoom(room12);
        java.lang.String str15 = room12.getRoomLocation();
        administrator5.viewRoomStatus(room12);
        Chief_event_coordinator.Classes.Booking booking17 = new Chief_event_coordinator.Classes.Booking("hi!", room12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = booking17.extend((float) 100L);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot extend a booking in state PENDING.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(adminPermssion2);
        org.junit.Assert.assertNotNull(administrator5);
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Not specified" + "'", str13, "Not specified");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Not specified" + "'", str15, "Not specified");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem6 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade7 = new Chief_event_coordinator.Classes.BookingFacade(administrator4, badgeVerificationSystem6);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory8 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator9 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory8);
        Chief_event_coordinator.Classes.Administrator administrator12 = roomAdminFactory8.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str15 = room14.getBuilding();
        administrator12.closeRoom(room14);
        java.lang.String str17 = room14.getClosureReason();
        int int18 = room14.getCapacity();
        Chief_event_coordinator.Classes.RoomStatus roomStatus19 = room14.getStatus();
        bookingFacade7.addRoom(room14);
        // The following exception was thrown during execution in test generation
        try {
            bookingFacade7.closeRoomForMaintenance(0, "Not specified");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 0 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(administrator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Not specified" + "'", str15, "Not specified");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Maintenance" + "'", str17, "Maintenance");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + roomStatus19 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE + "'", roomStatus19.equals(Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor1 = new Chief_event_coordinator.Classes.OccupancySensor((int) (byte) 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Chief_event_coordinator.State.CancelledState cancelledState0 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = cancelledState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = cancelledState0.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory4 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion5 = roomAdminFactory4.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator8 = roomAdminFactory4.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory9 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator10 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory9);
        Chief_event_coordinator.Classes.Administrator administrator13 = roomAdminFactory9.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str16 = room15.getBuilding();
        administrator13.closeRoom(room15);
        java.lang.String str18 = room15.getRoomLocation();
        administrator8.viewRoomStatus(room15);
        Chief_event_coordinator.Classes.Booking booking20 = new Chief_event_coordinator.Classes.Booking("hi!", room15);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        booking20.setStatus(bookingStatus21);
        // The following exception was thrown during execution in test generation
        try {
            cancelledState0.confirmDeposit(booking20);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot confirm deposit a booking in state CANCELLED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertNotNull(adminPermssion5);
        org.junit.Assert.assertNotNull(administrator8);
        org.junit.Assert.assertNotNull(administrator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Not specified" + "'", str16, "Not specified");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = extendedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState0.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory4 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion5 = roomAdminFactory4.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator8 = roomAdminFactory4.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory9 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator10 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory9);
        Chief_event_coordinator.Classes.Administrator administrator13 = roomAdminFactory9.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str16 = room15.getBuilding();
        administrator13.closeRoom(room15);
        java.lang.String str18 = room15.getRoomLocation();
        administrator8.viewRoomStatus(room15);
        Chief_event_coordinator.Classes.Booking booking20 = new Chief_event_coordinator.Classes.Booking("hi!", room15);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        booking20.setStatus(bookingStatus21);
        // The following exception was thrown during execution in test generation
        try {
            extendedState0.confirmDeposit(booking20);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot confirm deposit a booking in state EXTENDED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion5);
        org.junit.Assert.assertNotNull(administrator8);
        org.junit.Assert.assertNotNull(administrator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Not specified" + "'", str16, "Not specified");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator4.addRoom(room6);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory8 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator9 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory8);
        Chief_event_coordinator.Classes.Administrator administrator12 = roomAdminFactory8.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str15 = room14.getBuilding();
        administrator12.closeRoom(room14);
        java.lang.String str17 = room14.getClosureReason();
        administrator4.viewRoomStatus(room14);
        java.lang.String str19 = administrator4.getName();
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Not specified" + "'", str15, "Not specified");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Maintenance" + "'", str17, "Maintenance");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Command.CancelBookingCommand cancelBookingCommand3 = new Chief_event_coordinator.Command.CancelBookingCommand(registeredUser1, booking2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) cancelBookingCommand3);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion6 = roomAdminFactory5.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory10 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator11 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory10);
        Chief_event_coordinator.Classes.Administrator administrator14 = roomAdminFactory10.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str17 = room16.getBuilding();
        administrator14.closeRoom(room16);
        java.lang.String str19 = room16.getRoomLocation();
        administrator9.viewRoomStatus(room16);
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay21 = new Chief_event_coordinator.Classes.AdminDisplay(administrator9);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory22 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator23 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory22);
        Chief_event_coordinator.Classes.Administrator administrator26 = roomAdminFactory22.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room28 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str29 = room28.getBuilding();
        administrator26.closeRoom(room28);
        java.lang.String str31 = room28.getRoomLocation();
        java.lang.String str32 = room28.getBuilding();
        int int33 = room28.getRoomid();
        Chief_event_coordinator.Command.EnableRoomCommand enableRoomCommand34 = new Chief_event_coordinator.Command.EnableRoomCommand(administrator9, room28);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) enableRoomCommand34);
        org.junit.Assert.assertNotNull(adminPermssion6);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertNotNull(administrator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Not specified" + "'", str17, "Not specified");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Not specified" + "'", str19, "Not specified");
        org.junit.Assert.assertNotNull(administrator26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Not specified" + "'", str29, "Not specified");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Not specified" + "'", str31, "Not specified");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Not specified" + "'", str32, "Not specified");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Chief_event_coordinator.State.CancelledState cancelledState0 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = cancelledState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = cancelledState0.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory4 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator5 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory4);
        Chief_event_coordinator.Classes.Administrator administrator8 = roomAdminFactory4.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator8.addRoom(room10);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory12 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator13 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory12);
        Chief_event_coordinator.Classes.Administrator administrator16 = roomAdminFactory12.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room18 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str19 = room18.getBuilding();
        administrator16.closeRoom(room18);
        java.lang.String str21 = room18.getClosureReason();
        administrator8.viewRoomStatus(room18);
        Chief_event_coordinator.Classes.Booking booking23 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: ", room18);
        Chief_event_coordinator.Observer.StubPayment stubPayment24 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver25 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment24);
        booking23.removeObserver((Chief_event_coordinator.Observer.BookingObserver) paymentNotificationObserver25);
        // The following exception was thrown during execution in test generation
        try {
            cancelledState0.confirmDeposit(booking23);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot confirm deposit a booking in state CANCELLED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertNotNull(administrator8);
        org.junit.Assert.assertNotNull(administrator16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Not specified" + "'", str19, "Not specified");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Maintenance" + "'", str21, "Maintenance");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException1 = new Chief_event_coordinator.State.IllegalBookingTransitionException("");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException3 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        illegalBookingTransitionException1.addSuppressed((java.lang.Throwable) illegalBookingTransitionException3);
        java.lang.Throwable[] throwableArray5 = illegalBookingTransitionException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = illegalBookingTransitionException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator4.addRoom(room6);
        administrator4.setName("Maintenance");
        org.junit.Assert.assertNotNull(administrator4);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner1 = new Chief_event_coordinator.Classes.IdBadgeScanner((int) '4');
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem3 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        boolean boolean4 = idBadgeScanner1.scanBadge("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", badgeVerificationSystem3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("", "hi!");
        Chief_event_coordinator.Classes.Room room3 = null;
        Chief_event_coordinator.Command.AddRoomCommand addRoomCommand4 = new Chief_event_coordinator.Command.AddRoomCommand(administrator2, room3);
        java.util.HashMap<java.lang.Integer, Chief_event_coordinator.Classes.Booking> intMap5 = administrator2.viewBookings();
        java.lang.String str6 = administrator2.getEmail();
        org.junit.Assert.assertNotNull(intMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory3 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator4 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory3);
        Chief_event_coordinator.Classes.Administrator administrator7 = roomAdminFactory3.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str10 = room9.getBuilding();
        administrator7.closeRoom(room9);
        java.lang.String str12 = room9.getRoomLocation();
        java.lang.String str13 = room9.getBuilding();
        int int14 = room9.getRoomid();
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand16 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator2, room9, "hi!");
        administrator2.setName("Maintenance");
        org.junit.Assert.assertNotNull(administrator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Not specified" + "'", str12, "Not specified");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Not specified" + "'", str13, "Not specified");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory1 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion2 = roomAdminFactory1.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator5 = roomAdminFactory1.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator7 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory6);
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str13 = room12.getBuilding();
        administrator10.closeRoom(room12);
        java.lang.String str15 = room12.getRoomLocation();
        administrator5.viewRoomStatus(room12);
        Chief_event_coordinator.Classes.Booking booking17 = new Chief_event_coordinator.Classes.Booking("hi!", room12);
        // The following exception was thrown during execution in test generation
        try {
            booking17.markNoShow();
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot mark no-show a booking in state PENDING.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(adminPermssion2);
        org.junit.Assert.assertNotNull(administrator5);
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Not specified" + "'", str13, "Not specified");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Not specified" + "'", str15, "Not specified");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("", "hi!");
        administrator2.setName("Not specified");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room(1);
        administrator2.enableRoom(room6);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor8 = room6.getOccupancySensor();
        org.junit.Assert.assertNotNull(occupancySensor8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator7 = roomAdminFactory0.createAdministrator("Not specified", "");
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory0.createAdministrator("", "");
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator7);
        org.junit.Assert.assertNotNull(administrator10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Chief_event_coordinator.State.CheckedInState checkedInState0 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = checkedInState0.getStatus();
        Chief_event_coordinator.Observer.StubPayment stubPayment2 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver3 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment2);
        boolean boolean5 = stubPayment2.charge((double) (short) -1);
        boolean boolean7 = stubPayment2.refund((double) 100);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver8 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment2);
        Chief_event_coordinator.State.ConfirmedState confirmedState9 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus10 = confirmedState9.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory12 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion13 = roomAdminFactory12.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator16 = roomAdminFactory12.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory17 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator18 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory17);
        Chief_event_coordinator.Classes.Administrator administrator21 = roomAdminFactory17.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room23 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str24 = room23.getBuilding();
        administrator21.closeRoom(room23);
        java.lang.String str26 = room23.getRoomLocation();
        administrator16.viewRoomStatus(room23);
        Chief_event_coordinator.Classes.Booking booking28 = new Chief_event_coordinator.Classes.Booking("hi!", room23);
        confirmedState9.checkIn(booking28);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus30 = Chief_event_coordinator.Observer.BookingStatus.NO_SHOW;
        Chief_event_coordinator.State.CancelledState cancelledState31 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus32 = cancelledState31.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus33 = cancelledState31.getStatus();
        paymentNotificationObserver8.onBookingStatusChanged(booking28, bookingStatus30, bookingStatus33);
        checkedInState0.extend(booking28);
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus10.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNotNull(adminPermssion13);
        org.junit.Assert.assertNotNull(administrator16);
        org.junit.Assert.assertNotNull(administrator21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Not specified" + "'", str24, "Not specified");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Not specified" + "'", str26, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus30 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus30.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + bookingStatus32 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus32.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus33 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus33.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Chief_event_coordinator.State.PendingState pendingState0 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.State.ExtendedState extendedState1 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = extendedState1.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion7 = roomAdminFactory6.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory11 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator12 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory11);
        Chief_event_coordinator.Classes.Administrator administrator15 = roomAdminFactory11.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room17 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str18 = room17.getBuilding();
        administrator15.closeRoom(room17);
        java.lang.String str20 = room17.getRoomLocation();
        administrator10.viewRoomStatus(room17);
        Chief_event_coordinator.Classes.Booking booking22 = new Chief_event_coordinator.Classes.Booking("hi!", room17);
        extendedState1.extend(booking22);
        pendingState0.cancel(booking22);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = pendingState0.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion7);
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertNotNull(administrator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Not specified" + "'", str20, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus25.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner1 = new Chief_event_coordinator.Classes.IdBadgeScanner((int) '4');
        java.lang.String str2 = idBadgeScanner1.getLastScannedBadgeId();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem0 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        boolean boolean2 = badgeVerificationSystem0.verifyBadge("Maintenance");
        badgeVerificationSystem0.revokeBadge("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!");
        boolean boolean6 = badgeVerificationSystem0.verifyBadge("Chief_event_coordinator.State.IllegalBookingTransitionException: ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("", "");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator7 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory6);
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str13 = room12.getBuilding();
        administrator10.closeRoom(room12);
        java.lang.String str15 = room12.getRoomLocation();
        java.lang.String str16 = room12.getBuilding();
        int int17 = room12.getRoomid();
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand19 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator5, room12, "hi!");
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand20 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator2, room12);
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Not specified" + "'", str13, "Not specified");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Not specified" + "'", str15, "Not specified");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Not specified" + "'", str16, "Not specified");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor1 = new Chief_event_coordinator.Classes.OccupancySensor(0);
        int int2 = occupancySensor1.getRoomid();
        int int3 = occupancySensor1.getRoomid();
        int int4 = occupancySensor1.getRoomid();
        int int5 = occupancySensor1.getRoomid();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem6 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade7 = new Chief_event_coordinator.Classes.BookingFacade(administrator4, badgeVerificationSystem6);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory8 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator9 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory8);
        Chief_event_coordinator.Classes.Administrator administrator12 = roomAdminFactory8.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str15 = room14.getBuilding();
        administrator12.closeRoom(room14);
        java.lang.String str17 = room14.getClosureReason();
        int int18 = room14.getCapacity();
        Chief_event_coordinator.Classes.RoomStatus roomStatus19 = room14.getStatus();
        bookingFacade7.addRoom(room14);
        // The following exception was thrown during execution in test generation
        try {
            bookingFacade7.closeRoomForMaintenance((int) (short) -1, "Maintenance");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room -1 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(administrator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Not specified" + "'", str15, "Not specified");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Maintenance" + "'", str17, "Maintenance");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + roomStatus19 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE + "'", roomStatus19.equals(Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator6 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str12 = room11.getBuilding();
        administrator9.closeRoom(room11);
        java.lang.String str14 = room11.getRoomLocation();
        administrator4.viewRoomStatus(room11);
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay16 = new Chief_event_coordinator.Classes.AdminDisplay(administrator4);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory17 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator18 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory17);
        Chief_event_coordinator.Classes.Administrator administrator21 = roomAdminFactory17.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room23 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str24 = room23.getBuilding();
        administrator21.closeRoom(room23);
        java.lang.String str26 = room23.getRoomLocation();
        java.lang.String str27 = room23.getBuilding();
        int int28 = room23.getRoomid();
        Chief_event_coordinator.Command.EnableRoomCommand enableRoomCommand29 = new Chief_event_coordinator.Command.EnableRoomCommand(administrator4, room23);
        room23.setRoomLocation("Chief_event_coordinator.State.IllegalBookingTransitionException: ");
        java.lang.String str32 = room23.getBuilding();
        org.junit.Assert.assertNotNull(adminPermssion1);
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Not specified" + "'", str12, "Not specified");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Not specified" + "'", str14, "Not specified");
        org.junit.Assert.assertNotNull(administrator21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Not specified" + "'", str24, "Not specified");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Not specified" + "'", str26, "Not specified");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Not specified" + "'", str27, "Not specified");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Not specified" + "'", str32, "Not specified");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        bookingFacade6.authorizeBadge("Not specified");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = bookingFacade6.wasLastBadgeVerified(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 52 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 0L);
        boolean boolean4 = stubPayment0.charge((double) (short) -1);
        boolean boolean6 = stubPayment0.refund(1.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor1 = new Chief_event_coordinator.Classes.OccupancySensor(10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory1 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory1);
        Chief_event_coordinator.Classes.Administrator administrator5 = roomAdminFactory1.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator5.addRoom(room7);
        Chief_event_coordinator.Classes.BookingFacade bookingFacade9 = new Chief_event_coordinator.Classes.BookingFacade(administrator5);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory10 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator11 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory10);
        Chief_event_coordinator.Classes.Administrator administrator14 = roomAdminFactory10.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory15 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator16 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory15);
        Chief_event_coordinator.Classes.Administrator administrator19 = roomAdminFactory15.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room21 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator19.addRoom(room21);
        administrator14.viewRoomStatus(room21);
        Chief_event_coordinator.Classes.Room room25 = new Chief_event_coordinator.Classes.Room((int) '4');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver26 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room25);
        administrator14.enableRoom(room25);
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand28 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator5, room25);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) disableRoomCommand28);
        Chief_event_coordinator.Command.CommandInvoker commandInvoker30 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser31 = null;
        Chief_event_coordinator.Classes.Booking booking32 = null;
        Chief_event_coordinator.Command.CancelBookingCommand cancelBookingCommand33 = new Chief_event_coordinator.Command.CancelBookingCommand(registeredUser31, booking32);
        commandInvoker30.setCommand((Chief_event_coordinator.Command.Command) cancelBookingCommand33);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) cancelBookingCommand33);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand33.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.cancelBooking(Chief_event_coordinator.Classes.Booking)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator5);
        org.junit.Assert.assertNotNull(administrator14);
        org.junit.Assert.assertNotNull(administrator19);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator6 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str12 = room11.getBuilding();
        administrator9.closeRoom(room11);
        java.lang.String str14 = room11.getRoomLocation();
        administrator4.viewRoomStatus(room11);
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay16 = new Chief_event_coordinator.Classes.AdminDisplay(administrator4);
        java.lang.String str17 = administrator4.getEmail();
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay18 = new Chief_event_coordinator.Classes.AdminDisplay(administrator4);
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem19 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade20 = new Chief_event_coordinator.Classes.BookingFacade(administrator4, badgeVerificationSystem19);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory21 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator22 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory21);
        Chief_event_coordinator.Classes.Administrator administrator25 = roomAdminFactory21.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory26 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator27 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory26);
        Chief_event_coordinator.Classes.Administrator administrator30 = roomAdminFactory26.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room32 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator30.addRoom(room32);
        administrator25.viewRoomStatus(room32);
        User.RegisteredUser registeredUser35 = null;
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory36 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator37 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory36);
        Chief_event_coordinator.Classes.Administrator administrator40 = roomAdminFactory36.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory41 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator42 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory41);
        Chief_event_coordinator.Classes.Administrator administrator45 = roomAdminFactory41.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room47 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator45.addRoom(room47);
        administrator40.viewRoomStatus(room47);
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand50 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser35, room47);
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand51 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator25, room47);
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand52 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator4, room47);
        org.junit.Assert.assertNotNull(adminPermssion1);
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Not specified" + "'", str12, "Not specified");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Not specified" + "'", str14, "Not specified");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(administrator25);
        org.junit.Assert.assertNotNull(administrator30);
        org.junit.Assert.assertNotNull(administrator40);
        org.junit.Assert.assertNotNull(administrator45);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.State.ExtendedState extendedState1 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = extendedState1.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion7 = roomAdminFactory6.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory11 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator12 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory11);
        Chief_event_coordinator.Classes.Administrator administrator15 = roomAdminFactory11.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room17 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str18 = room17.getBuilding();
        administrator15.closeRoom(room17);
        java.lang.String str20 = room17.getRoomLocation();
        administrator10.viewRoomStatus(room17);
        Chief_event_coordinator.Classes.Booking booking22 = new Chief_event_coordinator.Classes.Booking("hi!", room17);
        extendedState1.extend(booking22);
        Chief_event_coordinator.State.ExtendedState extendedState24 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = extendedState24.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus26 = extendedState24.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory28 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion29 = roomAdminFactory28.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator32 = roomAdminFactory28.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory33 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator34 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory33);
        Chief_event_coordinator.Classes.Administrator administrator37 = roomAdminFactory33.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room39 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str40 = room39.getBuilding();
        administrator37.closeRoom(room39);
        java.lang.String str42 = room39.getRoomLocation();
        administrator32.viewRoomStatus(room39);
        Chief_event_coordinator.Classes.Booking booking44 = new Chief_event_coordinator.Classes.Booking("hi!", room39);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus45 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        booking44.setStatus(bookingStatus45);
        booking22.notifyObservers(bookingStatus26, bookingStatus45);
        Chief_event_coordinator.Command.CancelBookingCommand cancelBookingCommand48 = new Chief_event_coordinator.Command.CancelBookingCommand(registeredUser0, booking22);
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion7);
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertNotNull(administrator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Not specified" + "'", str20, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus25.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus26.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion29);
        org.junit.Assert.assertNotNull(administrator32);
        org.junit.Assert.assertNotNull(administrator37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Not specified" + "'", str40, "Not specified");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Not specified" + "'", str42, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus45 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus45.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory1 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory1);
        Chief_event_coordinator.Classes.Administrator administrator5 = roomAdminFactory1.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator5.addRoom(room7);
        Chief_event_coordinator.Classes.BookingFacade bookingFacade9 = new Chief_event_coordinator.Classes.BookingFacade(administrator5);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory10 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator11 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory10);
        Chief_event_coordinator.Classes.Administrator administrator14 = roomAdminFactory10.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory15 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator16 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory15);
        Chief_event_coordinator.Classes.Administrator administrator19 = roomAdminFactory15.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room21 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator19.addRoom(room21);
        administrator14.viewRoomStatus(room21);
        Chief_event_coordinator.Classes.Room room25 = new Chief_event_coordinator.Classes.Room((int) '4');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver26 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room25);
        administrator14.enableRoom(room25);
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand28 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator5, room25);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) disableRoomCommand28);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory30 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator31 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory30);
        Chief_event_coordinator.Classes.Administrator administrator34 = roomAdminFactory30.createAdministrator("hi!", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory35 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator36 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory35);
        Chief_event_coordinator.Classes.Administrator administrator39 = roomAdminFactory35.createAdministrator("hi!", "");
        Chief_event_coordinator.Classes.Room room41 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator39.closeRoom(room41, "Not specified");
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand44 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator34, room41);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) closeRoomCommand44);
        commandInvoker0.executeCommand();
        org.junit.Assert.assertNotNull(administrator5);
        org.junit.Assert.assertNotNull(administrator14);
        org.junit.Assert.assertNotNull(administrator19);
        org.junit.Assert.assertNotNull(administrator34);
        org.junit.Assert.assertNotNull(administrator39);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator6 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator9.addRoom(room11);
        administrator4.viewRoomStatus(room11);
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) '4');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver16 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room15);
        administrator4.enableRoom(room15);
        room15.setBuilding("hi!");
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator9);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver1 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean3 = stubPayment0.charge((double) (short) -1);
        boolean boolean5 = stubPayment0.refund((double) 100);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver6 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        Chief_event_coordinator.State.ConfirmedState confirmedState7 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus8 = confirmedState7.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory10 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion11 = roomAdminFactory10.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator14 = roomAdminFactory10.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory15 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator16 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory15);
        Chief_event_coordinator.Classes.Administrator administrator19 = roomAdminFactory15.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room21 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str22 = room21.getBuilding();
        administrator19.closeRoom(room21);
        java.lang.String str24 = room21.getRoomLocation();
        administrator14.viewRoomStatus(room21);
        Chief_event_coordinator.Classes.Booking booking26 = new Chief_event_coordinator.Classes.Booking("hi!", room21);
        confirmedState7.checkIn(booking26);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus28 = Chief_event_coordinator.Observer.BookingStatus.NO_SHOW;
        Chief_event_coordinator.State.CancelledState cancelledState29 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus30 = cancelledState29.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus31 = cancelledState29.getStatus();
        paymentNotificationObserver6.onBookingStatusChanged(booking26, bookingStatus28, bookingStatus31);
        Chief_event_coordinator.Observer.StubPayment stubPayment33 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver34 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment33);
        boolean boolean36 = stubPayment33.charge((double) (short) -1);
        boolean boolean38 = stubPayment33.refund((double) 100);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver39 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment33);
        booking26.removeObserver((Chief_event_coordinator.Observer.BookingObserver) paymentNotificationObserver39);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus8.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNotNull(adminPermssion11);
        org.junit.Assert.assertNotNull(administrator14);
        org.junit.Assert.assertNotNull(administrator19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Not specified" + "'", str22, "Not specified");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Not specified" + "'", str24, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus28 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus28.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + bookingStatus30 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus30.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus31 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus31.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        bookingFacade6.authorizeBadge("Not specified");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = bookingFacade6.receiveBadgeScanData((int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 0 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator4.addRoom(room6);
        Chief_event_coordinator.Classes.BookingFacade bookingFacade8 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            bookingFacade8.disableRoom(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 0 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Chief_event_coordinator.State.PendingState pendingState0 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = pendingState0.getStatus();
        User.RegisteredUser registeredUser2 = null;
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory4 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion5 = roomAdminFactory4.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator8 = roomAdminFactory4.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory9 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator10 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory9);
        Chief_event_coordinator.Classes.Administrator administrator13 = roomAdminFactory9.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str16 = room15.getBuilding();
        administrator13.closeRoom(room15);
        java.lang.String str18 = room15.getRoomLocation();
        administrator8.viewRoomStatus(room15);
        Chief_event_coordinator.Classes.Booking booking20 = new Chief_event_coordinator.Classes.Booking("hi!", room15);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        booking20.setStatus(bookingStatus21);
        Chief_event_coordinator.Command.ModifyBookingCommand modifyBookingCommand23 = new Chief_event_coordinator.Command.ModifyBookingCommand(registeredUser2, booking20);
        // The following exception was thrown during execution in test generation
        try {
            pendingState0.extend(booking20);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot extend a booking in state PENDING.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(adminPermssion5);
        org.junit.Assert.assertNotNull(administrator8);
        org.junit.Assert.assertNotNull(administrator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Not specified" + "'", str16, "Not specified");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) (byte) 0, (int) ' ', "", "Chief_event_coordinator.State.IllegalBookingTransitionException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room id must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Chief_event_coordinator.Demo.StatePatternDemo statePatternDemo0 = new Chief_event_coordinator.Demo.StatePatternDemo();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory2 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator3 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory2);
        Chief_event_coordinator.Classes.Administrator administrator6 = roomAdminFactory2.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room8 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator6.addRoom(room8);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory10 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator11 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory10);
        Chief_event_coordinator.Classes.Administrator administrator14 = roomAdminFactory10.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str17 = room16.getBuilding();
        administrator14.closeRoom(room16);
        java.lang.String str19 = room16.getClosureReason();
        administrator6.viewRoomStatus(room16);
        Chief_event_coordinator.Classes.Booking booking21 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: ", room16);
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand23 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking21, (float) ' ');
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(administrator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Not specified" + "'", str17, "Not specified");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Maintenance" + "'", str19, "Maintenance");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 10.0f);
        boolean boolean4 = stubPayment0.charge((double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem6 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade7 = new Chief_event_coordinator.Classes.BookingFacade(administrator4, badgeVerificationSystem6);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory8 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator9 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory8);
        Chief_event_coordinator.Classes.Administrator administrator12 = roomAdminFactory8.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str15 = room14.getBuilding();
        administrator12.closeRoom(room14);
        java.lang.String str17 = room14.getClosureReason();
        int int18 = room14.getCapacity();
        Chief_event_coordinator.Classes.RoomStatus roomStatus19 = room14.getStatus();
        bookingFacade7.addRoom(room14);
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room22 = bookingFacade7.viewRoom((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 0 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(administrator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Not specified" + "'", str15, "Not specified");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Maintenance" + "'", str17, "Maintenance");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + roomStatus19 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE + "'", roomStatus19.equals(Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory3 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator4 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory3);
        Chief_event_coordinator.Classes.Administrator administrator7 = roomAdminFactory3.createAdministrator("hi!", "hi!");
        chiefEventCoordinator2.setFactory((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory3);
        Chief_event_coordinator.Classes.Administrator administrator11 = chiefEventCoordinator2.generateAdminAccount("", "hi!");
        org.junit.Assert.assertNotNull(adminPermssion1);
        org.junit.Assert.assertNotNull(administrator7);
        org.junit.Assert.assertNotNull(administrator11);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory2 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion3 = roomAdminFactory2.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator6 = roomAdminFactory2.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory7 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator8 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory7);
        Chief_event_coordinator.Classes.Administrator administrator11 = roomAdminFactory7.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room13 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str14 = room13.getBuilding();
        administrator11.closeRoom(room13);
        java.lang.String str16 = room13.getRoomLocation();
        administrator6.viewRoomStatus(room13);
        Chief_event_coordinator.Classes.Booking booking18 = new Chief_event_coordinator.Classes.Booking("hi!", room13);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus19 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        booking18.setStatus(bookingStatus19);
        Chief_event_coordinator.State.ConfirmedState confirmedState21 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus22 = confirmedState21.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus23 = confirmedState21.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus24 = confirmedState21.getStatus();
        Chief_event_coordinator.State.CancelledState cancelledState25 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus26 = cancelledState25.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus27 = cancelledState25.getStatus();
        booking18.notifyObservers(bookingStatus24, bookingStatus27);
        Chief_event_coordinator.Classes.Room room29 = null;
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver30 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room29);
        booking18.removeObserver((Chief_event_coordinator.Observer.BookingObserver) roomAvailabilityObserver30);
        // The following exception was thrown during execution in test generation
        try {
            extendedState0.checkIn(booking18);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot check in a booking in state EXTENDED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(adminPermssion3);
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(administrator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Not specified" + "'", str14, "Not specified");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Not specified" + "'", str16, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus19.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus22.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus23.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus24.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus26.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus27.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory3 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator4 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory3);
        Chief_event_coordinator.Classes.Administrator administrator7 = roomAdminFactory3.createAdministrator("hi!", "hi!");
        chiefEventCoordinator2.setFactory((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory3);
        Chief_event_coordinator.Abstract_Factory.AdminFactory adminFactory9 = chiefEventCoordinator2.getFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator10 = new Chief_event_coordinator.ChiefEventCoordinator(adminFactory9);
        org.junit.Assert.assertNotNull(adminPermssion1);
        org.junit.Assert.assertNotNull(administrator7);
        org.junit.Assert.assertNotNull(adminFactory9);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Chief_event_coordinator.State.CancelledState cancelledState0 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = cancelledState0.getStatus();
        Chief_event_coordinator.State.ConfirmedState confirmedState2 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = confirmedState2.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion6 = roomAdminFactory5.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory10 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator11 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory10);
        Chief_event_coordinator.Classes.Administrator administrator14 = roomAdminFactory10.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str17 = room16.getBuilding();
        administrator14.closeRoom(room16);
        java.lang.String str19 = room16.getRoomLocation();
        administrator9.viewRoomStatus(room16);
        Chief_event_coordinator.Classes.Booking booking21 = new Chief_event_coordinator.Classes.Booking("hi!", room16);
        confirmedState2.checkIn(booking21);
        // The following exception was thrown during execution in test generation
        try {
            cancelledState0.extend(booking21);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot extend a booking in state CANCELLED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNotNull(adminPermssion6);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertNotNull(administrator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Not specified" + "'", str17, "Not specified");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Not specified" + "'", str19, "Not specified");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Chief_event_coordinator.State.NoShowState noShowState0 = new Chief_event_coordinator.State.NoShowState();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory2 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion3 = roomAdminFactory2.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator6 = roomAdminFactory2.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory7 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator8 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory7);
        Chief_event_coordinator.Classes.Administrator administrator11 = roomAdminFactory7.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room13 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str14 = room13.getBuilding();
        administrator11.closeRoom(room13);
        java.lang.String str16 = room13.getRoomLocation();
        administrator6.viewRoomStatus(room13);
        Chief_event_coordinator.Classes.Booking booking18 = new Chief_event_coordinator.Classes.Booking("hi!", room13);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus19 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        booking18.setStatus(bookingStatus19);
        Chief_event_coordinator.State.ConfirmedState confirmedState21 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus22 = confirmedState21.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus23 = confirmedState21.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus24 = confirmedState21.getStatus();
        Chief_event_coordinator.State.CancelledState cancelledState25 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus26 = cancelledState25.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus27 = cancelledState25.getStatus();
        booking18.notifyObservers(bookingStatus24, bookingStatus27);
        Chief_event_coordinator.Classes.Room room29 = null;
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver30 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room29);
        booking18.removeObserver((Chief_event_coordinator.Observer.BookingObserver) roomAvailabilityObserver30);
        // The following exception was thrown during execution in test generation
        try {
            noShowState0.confirmDeposit(booking18);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot confirm deposit a booking in state NO_SHOW.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(adminPermssion3);
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(administrator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Not specified" + "'", str14, "Not specified");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Not specified" + "'", str16, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus19.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus22.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus23.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus24.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus26.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus27.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.State.ExtendedState extendedState1 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = extendedState1.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion7 = roomAdminFactory6.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory11 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator12 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory11);
        Chief_event_coordinator.Classes.Administrator administrator15 = roomAdminFactory11.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room17 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str18 = room17.getBuilding();
        administrator15.closeRoom(room17);
        java.lang.String str20 = room17.getRoomLocation();
        administrator10.viewRoomStatus(room17);
        Chief_event_coordinator.Classes.Booking booking22 = new Chief_event_coordinator.Classes.Booking("hi!", room17);
        extendedState1.extend(booking22);
        confirmedState0.markNoShow(booking22);
        // The following exception was thrown during execution in test generation
        try {
            booking22.extend();
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot extend a booking in state NO_SHOW.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion7);
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertNotNull(administrator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Not specified" + "'", str20, "Not specified");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Chief_event_coordinator.Classes.RegressionTest0 regressionTest0_0 = new Chief_event_coordinator.Classes.RegressionTest0();
        regressionTest0_0.test005();
        regressionTest0_0.test001();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        bookingFacade6.authorizeBadge("Not specified");
        // The following exception was thrown during execution in test generation
        try {
            bookingFacade6.viewRoomStatus(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 1 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.State.PendingState pendingState1 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.State.ExtendedState extendedState2 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState2.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = extendedState2.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = extendedState2.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory7 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion8 = roomAdminFactory7.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator11 = roomAdminFactory7.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory12 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator13 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory12);
        Chief_event_coordinator.Classes.Administrator administrator16 = roomAdminFactory12.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room18 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str19 = room18.getBuilding();
        administrator16.closeRoom(room18);
        java.lang.String str21 = room18.getRoomLocation();
        administrator11.viewRoomStatus(room18);
        Chief_event_coordinator.Classes.Booking booking23 = new Chief_event_coordinator.Classes.Booking("hi!", room18);
        extendedState2.extend(booking23);
        pendingState1.cancel(booking23);
        Chief_event_coordinator.Command.CancelBookingCommand cancelBookingCommand26 = new Chief_event_coordinator.Command.CancelBookingCommand(registeredUser0, booking23);
        // The following exception was thrown during execution in test generation
        try {
            booking23.markNoShow();
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot mark no-show a booking in state CANCELLED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion8);
        org.junit.Assert.assertNotNull(administrator11);
        org.junit.Assert.assertNotNull(administrator16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Not specified" + "'", str19, "Not specified");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Not specified" + "'", str21, "Not specified");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = extendedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState0.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion6 = roomAdminFactory5.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory10 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator11 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory10);
        Chief_event_coordinator.Classes.Administrator administrator14 = roomAdminFactory10.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str17 = room16.getBuilding();
        administrator14.closeRoom(room16);
        java.lang.String str19 = room16.getRoomLocation();
        administrator9.viewRoomStatus(room16);
        Chief_event_coordinator.Classes.Booking booking21 = new Chief_event_coordinator.Classes.Booking("hi!", room16);
        extendedState0.extend(booking21);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus23 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.State.PendingState pendingState24 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = pendingState24.getStatus();
        booking21.notifyObservers(bookingStatus23, bookingStatus25);
        // The following exception was thrown during execution in test generation
        try {
            booking21.confirmDeposit();
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot confirm deposit a booking in state EXTENDED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion6);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertNotNull(administrator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Not specified" + "'", str17, "Not specified");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Not specified" + "'", str19, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus23.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus25.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory1 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory1);
        Chief_event_coordinator.Classes.Administrator administrator5 = roomAdminFactory1.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str8 = room7.getBuilding();
        administrator5.closeRoom(room7);
        java.lang.String str10 = room7.getRoomLocation();
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand11 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser0, room7);
        org.junit.Assert.assertNotNull(administrator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Not specified" + "'", str8, "Not specified");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator6 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str12 = room11.getBuilding();
        administrator9.closeRoom(room11);
        java.lang.String str14 = room11.getRoomLocation();
        administrator4.viewRoomStatus(room11);
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay16 = new Chief_event_coordinator.Classes.AdminDisplay(administrator4);
        java.lang.String str17 = administrator4.getEmail();
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay18 = new Chief_event_coordinator.Classes.AdminDisplay(administrator4);
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem19 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade20 = new Chief_event_coordinator.Classes.BookingFacade(administrator4, badgeVerificationSystem19);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory21 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator22 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory21);
        Chief_event_coordinator.Classes.Administrator administrator25 = roomAdminFactory21.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room27 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str28 = room27.getBuilding();
        administrator25.closeRoom(room27);
        administrator25.setEmail("Not specified");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory32 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator33 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory32);
        Chief_event_coordinator.Classes.Administrator administrator36 = roomAdminFactory32.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room38 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator36.addRoom(room38);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory40 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator41 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory40);
        Chief_event_coordinator.Classes.Administrator administrator44 = roomAdminFactory40.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room46 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str47 = room46.getBuilding();
        administrator44.closeRoom(room46);
        java.lang.String str49 = room46.getClosureReason();
        administrator36.viewRoomStatus(room46);
        administrator25.viewRoomStatus(room46);
        bookingFacade20.addRoom(room46);
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room54 = bookingFacade20.viewRoom(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 0 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(adminPermssion1);
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Not specified" + "'", str12, "Not specified");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Not specified" + "'", str14, "Not specified");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(administrator25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Not specified" + "'", str28, "Not specified");
        org.junit.Assert.assertNotNull(administrator36);
        org.junit.Assert.assertNotNull(administrator44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Not specified" + "'", str47, "Not specified");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Maintenance" + "'", str49, "Maintenance");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Chief_event_coordinator.State.NoShowState noShowState0 = new Chief_event_coordinator.State.NoShowState();
        Chief_event_coordinator.State.ExtendedState extendedState1 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = extendedState1.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion7 = roomAdminFactory6.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory11 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator12 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory11);
        Chief_event_coordinator.Classes.Administrator administrator15 = roomAdminFactory11.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room17 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str18 = room17.getBuilding();
        administrator15.closeRoom(room17);
        java.lang.String str20 = room17.getRoomLocation();
        administrator10.viewRoomStatus(room17);
        Chief_event_coordinator.Classes.Booking booking22 = new Chief_event_coordinator.Classes.Booking("hi!", room17);
        extendedState1.extend(booking22);
        booking22.extend();
        // The following exception was thrown during execution in test generation
        try {
            noShowState0.extend(booking22);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot extend a booking in state NO_SHOW.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion7);
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertNotNull(administrator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Not specified" + "'", str20, "Not specified");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = bookingFacade6.wasLastBadgeVerified((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 100 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = confirmedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = confirmedState0.getStatus();
        Chief_event_coordinator.State.ExtendedState extendedState3 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = extendedState3.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = extendedState3.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus6 = extendedState3.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory8 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion9 = roomAdminFactory8.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator12 = roomAdminFactory8.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory13 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator14 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory13);
        Chief_event_coordinator.Classes.Administrator administrator17 = roomAdminFactory13.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str20 = room19.getBuilding();
        administrator17.closeRoom(room19);
        java.lang.String str22 = room19.getRoomLocation();
        administrator12.viewRoomStatus(room19);
        Chief_event_coordinator.Classes.Booking booking24 = new Chief_event_coordinator.Classes.Booking("hi!", room19);
        extendedState3.extend(booking24);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus26 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.State.PendingState pendingState27 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus28 = pendingState27.getStatus();
        booking24.notifyObservers(bookingStatus26, bookingStatus28);
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver31 = new Chief_event_coordinator.Observer.UserNotificationObserver("Not specified");
        booking24.addObserver((Chief_event_coordinator.Observer.BookingObserver) userNotificationObserver31);
        confirmedState0.cancel(booking24);
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus6.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion9);
        org.junit.Assert.assertNotNull(administrator12);
        org.junit.Assert.assertNotNull(administrator17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Not specified" + "'", str20, "Not specified");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Not specified" + "'", str22, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus26.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus28 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus28.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver1 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean3 = stubPayment0.charge((double) (short) -1);
        boolean boolean5 = stubPayment0.refund((-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory1 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory1);
        Chief_event_coordinator.Classes.Administrator administrator5 = roomAdminFactory1.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator5.addRoom(room7);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory9 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator10 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory9);
        Chief_event_coordinator.Classes.Administrator administrator13 = roomAdminFactory9.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str16 = room15.getBuilding();
        administrator13.closeRoom(room15);
        java.lang.String str18 = room15.getClosureReason();
        administrator5.viewRoomStatus(room15);
        Chief_event_coordinator.Classes.Booking booking20 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: ", room15);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory21 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator22 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory21);
        Chief_event_coordinator.Classes.Administrator administrator25 = roomAdminFactory21.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room27 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str28 = room27.getBuilding();
        administrator25.closeRoom(room27);
        java.lang.String str30 = room27.getClosureReason();
        int int31 = room27.getCapacity();
        Chief_event_coordinator.Classes.RoomStatus roomStatus32 = room27.getStatus();
        Chief_event_coordinator.Classes.RoomStatus roomStatus33 = Chief_event_coordinator.Classes.RoomStatus.DISABLED;
        room27.setStatus(roomStatus33);
        booking20.setRoomName(room27);
        org.junit.Assert.assertNotNull(administrator5);
        org.junit.Assert.assertNotNull(administrator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Not specified" + "'", str16, "Not specified");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Maintenance" + "'", str18, "Maintenance");
        org.junit.Assert.assertNotNull(administrator25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Not specified" + "'", str28, "Not specified");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Maintenance" + "'", str30, "Maintenance");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + roomStatus32 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE + "'", roomStatus32.equals(Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE));
        org.junit.Assert.assertTrue("'" + roomStatus33 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.DISABLED + "'", roomStatus33.equals(Chief_event_coordinator.Classes.RoomStatus.DISABLED));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver1 = new Chief_event_coordinator.Observer.UserNotificationObserver("Maintenance");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator6 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str12 = room11.getBuilding();
        administrator9.closeRoom(room11);
        java.lang.String str14 = room11.getRoomLocation();
        administrator4.viewRoomStatus(room11);
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay16 = new Chief_event_coordinator.Classes.AdminDisplay(administrator4);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory17 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator18 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory17);
        Chief_event_coordinator.Classes.Administrator administrator21 = roomAdminFactory17.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room23 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str24 = room23.getBuilding();
        administrator21.closeRoom(room23);
        java.lang.String str26 = room23.getRoomLocation();
        java.lang.String str27 = room23.getBuilding();
        int int28 = room23.getRoomid();
        Chief_event_coordinator.Command.EnableRoomCommand enableRoomCommand29 = new Chief_event_coordinator.Command.EnableRoomCommand(administrator4, room23);
        Chief_event_coordinator.Classes.Room room31 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str32 = room31.getBuilding();
        Chief_event_coordinator.Classes.RoomStatus roomStatus33 = Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE;
        room31.setStatus(roomStatus33);
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand35 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator4, room31);
        org.junit.Assert.assertNotNull(adminPermssion1);
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Not specified" + "'", str12, "Not specified");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Not specified" + "'", str14, "Not specified");
        org.junit.Assert.assertNotNull(administrator21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Not specified" + "'", str24, "Not specified");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Not specified" + "'", str26, "Not specified");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Not specified" + "'", str27, "Not specified");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Not specified" + "'", str32, "Not specified");
        org.junit.Assert.assertTrue("'" + roomStatus33 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE + "'", roomStatus33.equals(Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "");
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver5 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator4);
        administrator4.setName("");
        Chief_event_coordinator.Classes.Room room8 = null;
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand9 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator4, room8);
        org.junit.Assert.assertNotNull(administrator4);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem0 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        boolean boolean2 = badgeVerificationSystem0.verifyBadge("Maintenance");
        badgeVerificationSystem0.revokeBadge("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!");
        boolean boolean6 = badgeVerificationSystem0.verifyBadge("Maintenance");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory1 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory1);
        Chief_event_coordinator.Classes.Administrator administrator5 = roomAdminFactory1.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator5.addRoom(room7);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory9 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator10 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory9);
        Chief_event_coordinator.Classes.Administrator administrator13 = roomAdminFactory9.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str16 = room15.getBuilding();
        administrator13.closeRoom(room15);
        java.lang.String str18 = room15.getClosureReason();
        administrator5.viewRoomStatus(room15);
        Chief_event_coordinator.Classes.Booking booking20 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: ", room15);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = booking20.getStatus();
        Chief_event_coordinator.State.BookingState bookingState22 = Chief_event_coordinator.State.BookingStateFactory.fromStatus(bookingStatus21);
        org.junit.Assert.assertNotNull(administrator5);
        org.junit.Assert.assertNotNull(administrator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Not specified" + "'", str16, "Not specified");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Maintenance" + "'", str18, "Maintenance");
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(bookingState22);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator4.addRoom(room6);
        Chief_event_coordinator.Classes.BookingFacade bookingFacade8 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            bookingFacade8.closeRoomForMaintenance(32, "Chief_event_coordinator.State.IllegalBookingTransitionException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 32 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory1 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion2 = roomAdminFactory1.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator5 = roomAdminFactory1.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator7 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory6);
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str13 = room12.getBuilding();
        administrator10.closeRoom(room12);
        java.lang.String str15 = room12.getRoomLocation();
        administrator5.viewRoomStatus(room12);
        Chief_event_coordinator.Classes.Booking booking17 = new Chief_event_coordinator.Classes.Booking("hi!", room12);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus18 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        booking17.setStatus(bookingStatus18);
        Chief_event_coordinator.State.ConfirmedState confirmedState20 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = confirmedState20.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus22 = confirmedState20.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus23 = confirmedState20.getStatus();
        Chief_event_coordinator.State.CancelledState cancelledState24 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = cancelledState24.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus26 = cancelledState24.getStatus();
        booking17.notifyObservers(bookingStatus23, bookingStatus26);
        Chief_event_coordinator.Classes.Room room28 = null;
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver29 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room28);
        booking17.removeObserver((Chief_event_coordinator.Observer.BookingObserver) roomAvailabilityObserver29);
        User.RegisteredUser registeredUser31 = null;
        booking17.setRegisteredUser(registeredUser31);
        org.junit.Assert.assertNotNull(adminPermssion2);
        org.junit.Assert.assertNotNull(administrator5);
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Not specified" + "'", str13, "Not specified");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Not specified" + "'", str15, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus22.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus23.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus25.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus26.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "");
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator5 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Abstract_Factory.AdminFactory adminFactory6 = chiefEventCoordinator5.getFactory();
        Chief_event_coordinator.Abstract_Factory.AdminFactory adminFactory7 = chiefEventCoordinator5.getFactory();
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(adminFactory6);
        org.junit.Assert.assertNotNull(adminFactory7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        boolean boolean2 = stubPayment0.charge((double) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Chief_event_coordinator.State.CancelledState cancelledState0 = new Chief_event_coordinator.State.CancelledState();
        User.RegisteredUser registeredUser2 = null;
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("", "hi!");
        administrator5.setName("Not specified");
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room(1);
        administrator5.enableRoom(room9);
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str13 = room12.getBuilding();
        Chief_event_coordinator.Classes.RoomStatus roomStatus14 = Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE;
        room12.setStatus(roomStatus14);
        room9.setStatus(roomStatus14);
        Chief_event_coordinator.Classes.Booking booking17 = new Chief_event_coordinator.Classes.Booking("Not specified", registeredUser2, room9);
        // The following exception was thrown during execution in test generation
        try {
            cancelledState0.checkIn(booking17);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot check in a booking in state CANCELLED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Not specified" + "'", str13, "Not specified");
        org.junit.Assert.assertTrue("'" + roomStatus14 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE + "'", roomStatus14.equals(Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.State.ExtendedState extendedState1 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = extendedState1.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion7 = roomAdminFactory6.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory11 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator12 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory11);
        Chief_event_coordinator.Classes.Administrator administrator15 = roomAdminFactory11.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room17 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str18 = room17.getBuilding();
        administrator15.closeRoom(room17);
        java.lang.String str20 = room17.getRoomLocation();
        administrator10.viewRoomStatus(room17);
        Chief_event_coordinator.Classes.Booking booking22 = new Chief_event_coordinator.Classes.Booking("hi!", room17);
        extendedState1.extend(booking22);
        confirmedState0.markNoShow(booking22);
        Chief_event_coordinator.Classes.Booking booking25 = null;
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.markNoShow(booking25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Booking.changeState(Chief_event_coordinator.State.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion7);
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertNotNull(administrator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Not specified" + "'", str20, "Not specified");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "");
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver5 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator4);
        administrator4.setName("");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory8 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator9 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory8);
        Chief_event_coordinator.Classes.Administrator administrator12 = roomAdminFactory8.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str15 = room14.getBuilding();
        administrator12.closeRoom(room14);
        java.lang.String str17 = room14.getClosureReason();
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand18 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator4, room14);
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Not specified" + "'", str15, "Not specified");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Maintenance" + "'", str17, "Maintenance");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        bookingFacade6.authorizeBadge("Not specified");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = bookingFacade6.getLastScannedBadgeId(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 0 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        java.lang.String str6 = administrator4.getName();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory7 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator8 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory7);
        Chief_event_coordinator.Classes.Administrator administrator11 = roomAdminFactory7.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room13 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str14 = room13.getBuilding();
        administrator11.closeRoom(room13);
        java.lang.String str16 = room13.getRoomLocation();
        java.lang.String str17 = room13.getBuilding();
        int int18 = room13.getRoomid();
        administrator4.enableRoom(room13);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory20 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator21 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory20);
        Chief_event_coordinator.Classes.Administrator administrator24 = roomAdminFactory20.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory25 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator26 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory25);
        Chief_event_coordinator.Classes.Administrator administrator29 = roomAdminFactory25.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room31 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator29.addRoom(room31);
        administrator24.viewRoomStatus(room31);
        Chief_event_coordinator.Classes.Room room35 = new Chief_event_coordinator.Classes.Room((int) '4');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver36 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room35);
        administrator24.enableRoom(room35);
        Chief_event_coordinator.Classes.Room room39 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str40 = room39.getBuilding();
        administrator24.closeRoom(room39, "hi!");
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand43 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator4, room39);
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(administrator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Not specified" + "'", str14, "Not specified");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Not specified" + "'", str16, "Not specified");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Not specified" + "'", str17, "Not specified");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(administrator24);
        org.junit.Assert.assertNotNull(administrator29);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Not specified" + "'", str40, "Not specified");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion3 = roomAdminFactory0.createPermission();
        org.junit.Assert.assertNotNull(adminPermssion1);
        org.junit.Assert.assertNotNull(adminPermssion3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = extendedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState0.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion6 = roomAdminFactory5.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory10 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator11 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory10);
        Chief_event_coordinator.Classes.Administrator administrator14 = roomAdminFactory10.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str17 = room16.getBuilding();
        administrator14.closeRoom(room16);
        java.lang.String str19 = room16.getRoomLocation();
        administrator9.viewRoomStatus(room16);
        Chief_event_coordinator.Classes.Booking booking21 = new Chief_event_coordinator.Classes.Booking("hi!", room16);
        extendedState0.extend(booking21);
        Chief_event_coordinator.Observer.StubPayment stubPayment23 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver24 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment23);
        boolean boolean26 = stubPayment23.charge((double) (short) -1);
        boolean boolean28 = stubPayment23.refund((double) 0);
        boolean boolean30 = stubPayment23.charge((double) (byte) 10);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver31 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment23);
        Chief_event_coordinator.Classes.Booking booking32 = null;
        Chief_event_coordinator.State.ConfirmedState confirmedState33 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus34 = confirmedState33.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus35 = confirmedState33.getStatus();
        Chief_event_coordinator.State.CheckedInState checkedInState36 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus37 = checkedInState36.getStatus();
        paymentNotificationObserver31.onBookingStatusChanged(booking32, bookingStatus35, bookingStatus37);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus39 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        booking21.notifyObservers(bookingStatus37, bookingStatus39);
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion6);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertNotNull(administrator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Not specified" + "'", str17, "Not specified");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Not specified" + "'", str19, "Not specified");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus34 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus34.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus35 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus35.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus37 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus37.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus39 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus39.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory2 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion3 = roomAdminFactory2.createPermission();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator4 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory2);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator6 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("hi!", "hi!");
        chiefEventCoordinator4.setFactory((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory11 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion12 = roomAdminFactory11.createPermission();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator13 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory11);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory14 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion15 = roomAdminFactory14.createPermission();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion16 = roomAdminFactory14.createPermission();
        chiefEventCoordinator13.setFactory((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory14);
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion18 = roomAdminFactory14.createPermission();
        chiefEventCoordinator4.setFactory((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory14);
        chiefEventCoordinator1.setFactory((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory14);
        org.junit.Assert.assertNotNull(adminPermssion3);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertNotNull(adminPermssion12);
        org.junit.Assert.assertNotNull(adminPermssion15);
        org.junit.Assert.assertNotNull(adminPermssion16);
        org.junit.Assert.assertNotNull(adminPermssion18);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException1 = new Chief_event_coordinator.State.IllegalBookingTransitionException("");
        java.lang.Throwable[] throwableArray2 = illegalBookingTransitionException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem0 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        boolean boolean2 = badgeVerificationSystem0.verifyBadge("Maintenance");
        boolean boolean4 = badgeVerificationSystem0.verifyBadge("Not specified");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator6 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator9.addRoom(room11);
        administrator4.viewRoomStatus(room11);
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) '4');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver16 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room15);
        administrator4.enableRoom(room15);
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str20 = room19.getBuilding();
        administrator4.closeRoom(room19, "hi!");
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor23 = room19.getOccupancySensor();
        Chief_event_coordinator.Classes.RoomStatus roomStatus24 = room19.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            room19.setCapacity((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room capacity must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Not specified" + "'", str20, "Not specified");
        org.junit.Assert.assertNotNull(occupancySensor23);
        org.junit.Assert.assertTrue("'" + roomStatus24 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE + "'", roomStatus24.equals(Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Chief_event_coordinator.Classes.Room room1 = null;
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Booking booking2 = new Chief_event_coordinator.Classes.Booking("Not specified", room1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        bookingFacade6.authorizeBadge("hi!");
        bookingFacade6.revokeBadge("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = bookingFacade6.getLastScannedBadgeId(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 1 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        User.RegisteredUser registeredUser2 = null;
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory3 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator4 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory3);
        Chief_event_coordinator.Classes.Administrator administrator7 = roomAdminFactory3.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str10 = room9.getBuilding();
        administrator7.closeRoom(room9);
        java.lang.String str12 = room9.getClosureReason();
        int int13 = room9.getCapacity();
        Chief_event_coordinator.Classes.Booking booking14 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", registeredUser2, room9);
        Chief_event_coordinator.Observer.StubPayment stubPayment15 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver16 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment15);
        boolean boolean18 = stubPayment15.charge((double) (short) -1);
        boolean boolean20 = stubPayment15.refund((double) 0);
        boolean boolean22 = stubPayment15.charge((double) (byte) 10);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver23 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment15);
        Chief_event_coordinator.Classes.Booking booking24 = null;
        Chief_event_coordinator.State.ConfirmedState confirmedState25 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus26 = confirmedState25.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus27 = confirmedState25.getStatus();
        Chief_event_coordinator.State.CheckedInState checkedInState28 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus29 = checkedInState28.getStatus();
        paymentNotificationObserver23.onBookingStatusChanged(booking24, bookingStatus27, bookingStatus29);
        booking14.removeObserver((Chief_event_coordinator.Observer.BookingObserver) paymentNotificationObserver23);
        confirmedState0.checkIn(booking14);
        User.RegisteredUser registeredUser33 = null;
        Chief_event_coordinator.State.PendingState pendingState34 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.State.ExtendedState extendedState35 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus36 = extendedState35.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus37 = extendedState35.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus38 = extendedState35.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory40 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion41 = roomAdminFactory40.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator44 = roomAdminFactory40.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory45 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator46 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory45);
        Chief_event_coordinator.Classes.Administrator administrator49 = roomAdminFactory45.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room51 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str52 = room51.getBuilding();
        administrator49.closeRoom(room51);
        java.lang.String str54 = room51.getRoomLocation();
        administrator44.viewRoomStatus(room51);
        Chief_event_coordinator.Classes.Booking booking56 = new Chief_event_coordinator.Classes.Booking("hi!", room51);
        extendedState35.extend(booking56);
        pendingState34.cancel(booking56);
        Chief_event_coordinator.Command.CancelBookingCommand cancelBookingCommand59 = new Chief_event_coordinator.Command.CancelBookingCommand(registeredUser33, booking56);
        confirmedState0.cancel(booking56);
        org.junit.Assert.assertNotNull(administrator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Maintenance" + "'", str12, "Maintenance");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus26.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus27.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus29 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus29.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus36 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus36.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus37 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus37.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus38 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus38.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion41);
        org.junit.Assert.assertNotNull(administrator44);
        org.junit.Assert.assertNotNull(administrator49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Not specified" + "'", str52, "Not specified");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Not specified" + "'", str54, "Not specified");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str7 = room6.getBuilding();
        administrator4.closeRoom(room6);
        Chief_event_coordinator.Classes.BookingFacade bookingFacade9 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.State.ConfirmedState confirmedState1 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = confirmedState1.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory4 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion5 = roomAdminFactory4.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator8 = roomAdminFactory4.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory9 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator10 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory9);
        Chief_event_coordinator.Classes.Administrator administrator13 = roomAdminFactory9.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str16 = room15.getBuilding();
        administrator13.closeRoom(room15);
        java.lang.String str18 = room15.getRoomLocation();
        administrator8.viewRoomStatus(room15);
        Chief_event_coordinator.Classes.Booking booking20 = new Chief_event_coordinator.Classes.Booking("hi!", room15);
        confirmedState1.checkIn(booking20);
        User.RegisteredUser registeredUser22 = booking20.getRegisteredUser();
        // The following exception was thrown during execution in test generation
        try {
            extendedState0.markNoShow(booking20);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot mark no-show a booking in state EXTENDED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNotNull(adminPermssion5);
        org.junit.Assert.assertNotNull(administrator8);
        org.junit.Assert.assertNotNull(administrator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Not specified" + "'", str16, "Not specified");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
        org.junit.Assert.assertNull(registeredUser22);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator6 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str12 = room11.getBuilding();
        administrator9.closeRoom(room11);
        java.lang.String str14 = room11.getRoomLocation();
        administrator4.viewRoomStatus(room11);
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay16 = new Chief_event_coordinator.Classes.AdminDisplay(administrator4);
        java.lang.String str17 = administrator4.getEmail();
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay18 = new Chief_event_coordinator.Classes.AdminDisplay(administrator4);
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem19 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade20 = new Chief_event_coordinator.Classes.BookingFacade(administrator4, badgeVerificationSystem19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = bookingFacade20.wasLastBadgeVerified((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room -1 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(adminPermssion1);
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Not specified" + "'", str12, "Not specified");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Not specified" + "'", str14, "Not specified");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Chief_event_coordinator.State.PendingState pendingState0 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.State.ExtendedState extendedState1 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = extendedState1.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion7 = roomAdminFactory6.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory11 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator12 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory11);
        Chief_event_coordinator.Classes.Administrator administrator15 = roomAdminFactory11.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room17 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str18 = room17.getBuilding();
        administrator15.closeRoom(room17);
        java.lang.String str20 = room17.getRoomLocation();
        administrator10.viewRoomStatus(room17);
        Chief_event_coordinator.Classes.Booking booking22 = new Chief_event_coordinator.Classes.Booking("hi!", room17);
        extendedState1.extend(booking22);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus24 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.State.PendingState pendingState25 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus26 = pendingState25.getStatus();
        booking22.notifyObservers(bookingStatus24, bookingStatus26);
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver29 = new Chief_event_coordinator.Observer.UserNotificationObserver("Not specified");
        booking22.addObserver((Chief_event_coordinator.Observer.BookingObserver) userNotificationObserver29);
        // The following exception was thrown during execution in test generation
        try {
            pendingState0.checkIn(booking22);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot check in a booking in state PENDING.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion7);
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertNotNull(administrator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Not specified" + "'", str20, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus24.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus26.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver7 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator4);
        java.util.List<java.lang.String> strList8 = adminDashboardObserver7.getActivityLog();
        User.RegisteredUser registeredUser9 = null;
        User.RegisteredUser registeredUser11 = null;
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory12 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator13 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory12);
        Chief_event_coordinator.Classes.Administrator administrator16 = roomAdminFactory12.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room18 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str19 = room18.getBuilding();
        administrator16.closeRoom(room18);
        java.lang.String str21 = room18.getClosureReason();
        int int22 = room18.getCapacity();
        Chief_event_coordinator.Classes.Booking booking23 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", registeredUser11, room18);
        Chief_event_coordinator.Observer.StubPayment stubPayment24 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver25 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment24);
        boolean boolean27 = stubPayment24.charge((double) (short) -1);
        boolean boolean29 = stubPayment24.refund((double) 0);
        boolean boolean31 = stubPayment24.charge((double) (byte) 10);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver32 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment24);
        Chief_event_coordinator.Classes.Booking booking33 = null;
        Chief_event_coordinator.State.ConfirmedState confirmedState34 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus35 = confirmedState34.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus36 = confirmedState34.getStatus();
        Chief_event_coordinator.State.CheckedInState checkedInState37 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus38 = checkedInState37.getStatus();
        paymentNotificationObserver32.onBookingStatusChanged(booking33, bookingStatus36, bookingStatus38);
        booking23.removeObserver((Chief_event_coordinator.Observer.BookingObserver) paymentNotificationObserver32);
        Chief_event_coordinator.Command.ModifyBookingCommand modifyBookingCommand41 = new Chief_event_coordinator.Command.ModifyBookingCommand(registeredUser9, booking23);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus42 = null;
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory44 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion45 = roomAdminFactory44.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator48 = roomAdminFactory44.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory49 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator50 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory49);
        Chief_event_coordinator.Classes.Administrator administrator53 = roomAdminFactory49.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room55 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str56 = room55.getBuilding();
        administrator53.closeRoom(room55);
        java.lang.String str58 = room55.getRoomLocation();
        administrator48.viewRoomStatus(room55);
        Chief_event_coordinator.Classes.Booking booking60 = new Chief_event_coordinator.Classes.Booking("hi!", room55);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus61 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        booking60.setStatus(bookingStatus61);
        Chief_event_coordinator.State.ConfirmedState confirmedState63 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus64 = confirmedState63.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus65 = confirmedState63.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus66 = confirmedState63.getStatus();
        Chief_event_coordinator.State.CancelledState cancelledState67 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus68 = cancelledState67.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus69 = cancelledState67.getStatus();
        booking60.notifyObservers(bookingStatus66, bookingStatus69);
        adminDashboardObserver7.onBookingStatusChanged(booking23, bookingStatus42, bookingStatus69);
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(administrator16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Not specified" + "'", str19, "Not specified");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Maintenance" + "'", str21, "Maintenance");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus35 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus35.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus36 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus36.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus38 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus38.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(adminPermssion45);
        org.junit.Assert.assertNotNull(administrator48);
        org.junit.Assert.assertNotNull(administrator53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Not specified" + "'", str56, "Not specified");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Not specified" + "'", str58, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus61 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus61.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus64 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus64.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus65 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus65.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus66 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus66.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus68 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus68.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus69 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus69.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        java.lang.String str6 = administrator4.getName();
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.BookingFacade bookingFacade8 = new Chief_event_coordinator.Classes.BookingFacade(administrator4, badgeVerificationSystem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Badge verification system is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator6 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str12 = room11.getBuilding();
        administrator9.closeRoom(room11);
        java.lang.String str14 = room11.getRoomLocation();
        administrator4.viewRoomStatus(room11);
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay16 = new Chief_event_coordinator.Classes.AdminDisplay(administrator4);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory17 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator18 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory17);
        Chief_event_coordinator.Classes.Administrator administrator21 = roomAdminFactory17.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory22 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator23 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory22);
        Chief_event_coordinator.Classes.Administrator administrator26 = roomAdminFactory22.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room28 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator26.addRoom(room28);
        administrator21.viewRoomStatus(room28);
        Chief_event_coordinator.Classes.Room room32 = new Chief_event_coordinator.Classes.Room((int) '4');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver33 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room32);
        administrator21.enableRoom(room32);
        administrator4.closeRoom(room32);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory36 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion37 = roomAdminFactory36.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator40 = roomAdminFactory36.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory41 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator42 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory41);
        Chief_event_coordinator.Classes.Administrator administrator45 = roomAdminFactory41.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room47 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str48 = room47.getBuilding();
        administrator45.closeRoom(room47);
        java.lang.String str50 = room47.getRoomLocation();
        administrator40.viewRoomStatus(room47);
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay52 = new Chief_event_coordinator.Classes.AdminDisplay(administrator40);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory53 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator54 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory53);
        Chief_event_coordinator.Classes.Administrator administrator57 = roomAdminFactory53.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room59 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str60 = room59.getBuilding();
        administrator57.closeRoom(room59);
        java.lang.String str62 = room59.getRoomLocation();
        java.lang.String str63 = room59.getBuilding();
        int int64 = room59.getRoomid();
        Chief_event_coordinator.Command.EnableRoomCommand enableRoomCommand65 = new Chief_event_coordinator.Command.EnableRoomCommand(administrator40, room59);
        room59.setRoomLocation("Chief_event_coordinator.State.IllegalBookingTransitionException: ");
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand69 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator4, room59, "Chief_event_coordinator.State.IllegalBookingTransitionException: hi!");
        org.junit.Assert.assertNotNull(adminPermssion1);
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Not specified" + "'", str12, "Not specified");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Not specified" + "'", str14, "Not specified");
        org.junit.Assert.assertNotNull(administrator21);
        org.junit.Assert.assertNotNull(administrator26);
        org.junit.Assert.assertNotNull(adminPermssion37);
        org.junit.Assert.assertNotNull(administrator40);
        org.junit.Assert.assertNotNull(administrator45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Not specified" + "'", str48, "Not specified");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Not specified" + "'", str50, "Not specified");
        org.junit.Assert.assertNotNull(administrator57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Not specified" + "'", str60, "Not specified");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Not specified" + "'", str62, "Not specified");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Not specified" + "'", str63, "Not specified");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 52 + "'", int64 == 52);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.State.ExtendedState extendedState1 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = extendedState1.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion7 = roomAdminFactory6.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory11 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator12 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory11);
        Chief_event_coordinator.Classes.Administrator administrator15 = roomAdminFactory11.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room17 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str18 = room17.getBuilding();
        administrator15.closeRoom(room17);
        java.lang.String str20 = room17.getRoomLocation();
        administrator10.viewRoomStatus(room17);
        Chief_event_coordinator.Classes.Booking booking22 = new Chief_event_coordinator.Classes.Booking("hi!", room17);
        extendedState1.extend(booking22);
        confirmedState0.markNoShow(booking22);
        // The following exception was thrown during execution in test generation
        try {
            booking22.confirmDeposit();
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot confirm deposit a booking in state NO_SHOW.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion7);
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertNotNull(administrator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Not specified" + "'", str20, "Not specified");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.State.ExtendedState extendedState1 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = extendedState1.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion7 = roomAdminFactory6.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory11 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator12 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory11);
        Chief_event_coordinator.Classes.Administrator administrator15 = roomAdminFactory11.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room17 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str18 = room17.getBuilding();
        administrator15.closeRoom(room17);
        java.lang.String str20 = room17.getRoomLocation();
        administrator10.viewRoomStatus(room17);
        Chief_event_coordinator.Classes.Booking booking22 = new Chief_event_coordinator.Classes.Booking("hi!", room17);
        extendedState1.extend(booking22);
        confirmedState0.markNoShow(booking22);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory25 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator26 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory25);
        Chief_event_coordinator.Classes.Administrator administrator29 = roomAdminFactory25.createAdministrator("hi!", "hi!");
        java.lang.String str30 = administrator29.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade31 = new Chief_event_coordinator.Classes.BookingFacade(administrator29);
        Chief_event_coordinator.Observer.AdminDashboardObserver adminDashboardObserver32 = new Chief_event_coordinator.Observer.AdminDashboardObserver(administrator29);
        java.util.List<java.lang.String> strList33 = adminDashboardObserver32.getActivityLog();
        booking22.addObserver((Chief_event_coordinator.Observer.BookingObserver) adminDashboardObserver32);
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion7);
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertNotNull(administrator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Not specified" + "'", str20, "Not specified");
        org.junit.Assert.assertNotNull(administrator29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator6 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator9.addRoom(room11);
        administrator4.viewRoomStatus(room11);
        User.RegisteredUser registeredUser14 = null;
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory15 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator16 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory15);
        Chief_event_coordinator.Classes.Administrator administrator19 = roomAdminFactory15.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory20 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator21 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory20);
        Chief_event_coordinator.Classes.Administrator administrator24 = roomAdminFactory20.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room26 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator24.addRoom(room26);
        administrator19.viewRoomStatus(room26);
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand29 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser14, room26);
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand30 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator4, room26);
        room26.setRoomLocation("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!");
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertNotNull(administrator19);
        org.junit.Assert.assertNotNull(administrator24);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Chief_event_coordinator.Classes.Administrator administrator3 = new Chief_event_coordinator.Classes.Administrator("", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory4 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator5 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory4);
        Chief_event_coordinator.Classes.Administrator administrator8 = roomAdminFactory4.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator8.addRoom(room10);
        Chief_event_coordinator.Classes.BookingFacade bookingFacade12 = new Chief_event_coordinator.Classes.BookingFacade(administrator8);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory13 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator14 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory13);
        Chief_event_coordinator.Classes.Administrator administrator17 = roomAdminFactory13.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory18 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator19 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory18);
        Chief_event_coordinator.Classes.Administrator administrator22 = roomAdminFactory18.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room24 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator22.addRoom(room24);
        administrator17.viewRoomStatus(room24);
        Chief_event_coordinator.Classes.Room room28 = new Chief_event_coordinator.Classes.Room((int) '4');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver29 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room28);
        administrator17.enableRoom(room28);
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand31 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator8, room28);
        administrator3.viewRoomStatus(room28);
        Chief_event_coordinator.Classes.Booking booking33 = new Chief_event_coordinator.Classes.Booking("Maintenance", room28);
        java.lang.String str34 = room28.getClosureReason();
        org.junit.Assert.assertNotNull(administrator8);
        org.junit.Assert.assertNotNull(administrator17);
        org.junit.Assert.assertNotNull(administrator22);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("", "hi!");
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator7 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory6);
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str13 = room12.getBuilding();
        administrator10.closeRoom(room12);
        java.lang.String str15 = room12.getRoomLocation();
        java.lang.String str16 = room12.getBuilding();
        int int17 = room12.getRoomid();
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand19 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator5, room12, "hi!");
        administrator2.enableRoom(room12);
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Not specified" + "'", str13, "Not specified");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Not specified" + "'", str15, "Not specified");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Not specified" + "'", str16, "Not specified");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver1 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        User.RegisteredUser registeredUser2 = null;
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory4 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion5 = roomAdminFactory4.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator8 = roomAdminFactory4.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory9 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator10 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory9);
        Chief_event_coordinator.Classes.Administrator administrator13 = roomAdminFactory9.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str16 = room15.getBuilding();
        administrator13.closeRoom(room15);
        java.lang.String str18 = room15.getRoomLocation();
        administrator8.viewRoomStatus(room15);
        Chief_event_coordinator.Classes.Booking booking20 = new Chief_event_coordinator.Classes.Booking("hi!", room15);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        booking20.setStatus(bookingStatus21);
        Chief_event_coordinator.Command.ModifyBookingCommand modifyBookingCommand23 = new Chief_event_coordinator.Command.ModifyBookingCommand(registeredUser2, booking20);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus24 = null;
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentNotificationObserver1.onBookingStatusChanged(booking20, bookingStatus24, bookingStatus25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Observer.BookingStatus.ordinal()\" because \"newStatus\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(adminPermssion5);
        org.junit.Assert.assertNotNull(administrator8);
        org.junit.Assert.assertNotNull(administrator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Not specified" + "'", str16, "Not specified");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException1 = new Chief_event_coordinator.State.IllegalBookingTransitionException("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory1 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory1);
        Chief_event_coordinator.Classes.Administrator administrator5 = roomAdminFactory1.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator5.addRoom(room7);
        Chief_event_coordinator.Classes.BookingFacade bookingFacade9 = new Chief_event_coordinator.Classes.BookingFacade(administrator5);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory10 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator11 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory10);
        Chief_event_coordinator.Classes.Administrator administrator14 = roomAdminFactory10.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory15 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator16 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory15);
        Chief_event_coordinator.Classes.Administrator administrator19 = roomAdminFactory15.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room21 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator19.addRoom(room21);
        administrator14.viewRoomStatus(room21);
        Chief_event_coordinator.Classes.Room room25 = new Chief_event_coordinator.Classes.Room((int) '4');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver26 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room25);
        administrator14.enableRoom(room25);
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand28 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator5, room25);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) disableRoomCommand28);
        User.RegisteredUser registeredUser30 = null;
        Chief_event_coordinator.Classes.Room room32 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str33 = room32.getBuilding();
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand34 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser30, room32);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) bookRoomCommand34);
        Chief_event_coordinator.Command.Command command36 = null;
        commandInvoker0.setCommand(command36);
        org.junit.Assert.assertNotNull(administrator5);
        org.junit.Assert.assertNotNull(administrator14);
        org.junit.Assert.assertNotNull(administrator19);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Not specified" + "'", str33, "Not specified");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Chief_event_coordinator.State.PendingState pendingState0 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory2 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator3 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory2);
        Chief_event_coordinator.Classes.Administrator administrator6 = roomAdminFactory2.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room8 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str9 = room8.getBuilding();
        administrator6.closeRoom(room8);
        java.lang.String str11 = room8.getRoomLocation();
        Chief_event_coordinator.Classes.Booking booking12 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", room8);
        pendingState0.confirmDeposit(booking12);
        Chief_event_coordinator.Observer.StubPayment stubPayment14 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver15 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment14);
        boolean boolean17 = stubPayment14.charge((double) (short) -1);
        boolean boolean19 = stubPayment14.refund((double) 100);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver20 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment14);
        Chief_event_coordinator.State.ConfirmedState confirmedState21 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus22 = confirmedState21.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory24 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion25 = roomAdminFactory24.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator28 = roomAdminFactory24.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory29 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator30 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory29);
        Chief_event_coordinator.Classes.Administrator administrator33 = roomAdminFactory29.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room35 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str36 = room35.getBuilding();
        administrator33.closeRoom(room35);
        java.lang.String str38 = room35.getRoomLocation();
        administrator28.viewRoomStatus(room35);
        Chief_event_coordinator.Classes.Booking booking40 = new Chief_event_coordinator.Classes.Booking("hi!", room35);
        confirmedState21.checkIn(booking40);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus42 = Chief_event_coordinator.Observer.BookingStatus.NO_SHOW;
        Chief_event_coordinator.State.CancelledState cancelledState43 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus44 = cancelledState43.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus45 = cancelledState43.getStatus();
        paymentNotificationObserver20.onBookingStatusChanged(booking40, bookingStatus42, bookingStatus45);
        // The following exception was thrown during execution in test generation
        try {
            pendingState0.extend(booking40);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot extend a booking in state PENDING.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Not specified" + "'", str9, "Not specified");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Not specified" + "'", str11, "Not specified");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus22.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertNotNull(adminPermssion25);
        org.junit.Assert.assertNotNull(administrator28);
        org.junit.Assert.assertNotNull(administrator33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Not specified" + "'", str36, "Not specified");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Not specified" + "'", str38, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus42 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus42.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + bookingStatus44 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus44.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus45 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus45.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bookingFacade6.receiveOccupancyData(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 0 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem6 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade7 = new Chief_event_coordinator.Classes.BookingFacade(administrator4, badgeVerificationSystem6);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory8 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator9 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory8);
        Chief_event_coordinator.Classes.Administrator administrator12 = roomAdminFactory8.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str15 = room14.getBuilding();
        administrator12.closeRoom(room14);
        java.lang.String str17 = room14.getClosureReason();
        int int18 = room14.getCapacity();
        Chief_event_coordinator.Classes.RoomStatus roomStatus19 = room14.getStatus();
        bookingFacade7.addRoom(room14);
        // The following exception was thrown during execution in test generation
        try {
            bookingFacade7.disableRoom((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 35 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(administrator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Not specified" + "'", str15, "Not specified");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Maintenance" + "'", str17, "Maintenance");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + roomStatus19 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE + "'", roomStatus19.equals(Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Chief_event_coordinator.State.CancelledState cancelledState0 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory2 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion3 = roomAdminFactory2.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator6 = roomAdminFactory2.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory7 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator8 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory7);
        Chief_event_coordinator.Classes.Administrator administrator11 = roomAdminFactory7.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room13 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str14 = room13.getBuilding();
        administrator11.closeRoom(room13);
        java.lang.String str16 = room13.getRoomLocation();
        administrator6.viewRoomStatus(room13);
        Chief_event_coordinator.Classes.Booking booking18 = new Chief_event_coordinator.Classes.Booking("hi!", room13);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus19 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        booking18.setStatus(bookingStatus19);
        Chief_event_coordinator.State.ConfirmedState confirmedState21 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus22 = confirmedState21.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus23 = confirmedState21.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus24 = confirmedState21.getStatus();
        Chief_event_coordinator.State.CancelledState cancelledState25 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus26 = cancelledState25.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus27 = cancelledState25.getStatus();
        booking18.notifyObservers(bookingStatus24, bookingStatus27);
        // The following exception was thrown during execution in test generation
        try {
            cancelledState0.markNoShow(booking18);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot mark no-show a booking in state CANCELLED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(adminPermssion3);
        org.junit.Assert.assertNotNull(administrator6);
        org.junit.Assert.assertNotNull(administrator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Not specified" + "'", str14, "Not specified");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Not specified" + "'", str16, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus19.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus22.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus23.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus24.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus26.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus27.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = extendedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState0.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion6 = roomAdminFactory5.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory10 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator11 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory10);
        Chief_event_coordinator.Classes.Administrator administrator14 = roomAdminFactory10.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str17 = room16.getBuilding();
        administrator14.closeRoom(room16);
        java.lang.String str19 = room16.getRoomLocation();
        administrator9.viewRoomStatus(room16);
        Chief_event_coordinator.Classes.Booking booking21 = new Chief_event_coordinator.Classes.Booking("hi!", room16);
        extendedState0.extend(booking21);
        booking21.extend();
        Chief_event_coordinator.State.CheckedInState checkedInState24 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = checkedInState24.getStatus();
        Chief_event_coordinator.State.ExtendedState extendedState26 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus27 = extendedState26.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus28 = extendedState26.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus29 = extendedState26.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory31 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion32 = roomAdminFactory31.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator35 = roomAdminFactory31.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory36 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator37 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory36);
        Chief_event_coordinator.Classes.Administrator administrator40 = roomAdminFactory36.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room42 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str43 = room42.getBuilding();
        administrator40.closeRoom(room42);
        java.lang.String str45 = room42.getRoomLocation();
        administrator35.viewRoomStatus(room42);
        Chief_event_coordinator.Classes.Booking booking47 = new Chief_event_coordinator.Classes.Booking("hi!", room42);
        extendedState26.extend(booking47);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus49 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.State.PendingState pendingState50 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus51 = pendingState50.getStatus();
        booking47.notifyObservers(bookingStatus49, bookingStatus51);
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver54 = new Chief_event_coordinator.Observer.UserNotificationObserver("Not specified");
        booking47.addObserver((Chief_event_coordinator.Observer.BookingObserver) userNotificationObserver54);
        checkedInState24.extend(booking47);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus57 = checkedInState24.getStatus();
        Chief_event_coordinator.State.CancelledState cancelledState58 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus59 = cancelledState58.getStatus();
        booking21.notifyObservers(bookingStatus57, bookingStatus59);
        User.RegisteredUser registeredUser61 = null;
        booking21.setRegisteredUser(registeredUser61);
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion6);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertNotNull(administrator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Not specified" + "'", str17, "Not specified");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Not specified" + "'", str19, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus25.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus27.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus28 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus28.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus29 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus29.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion32);
        org.junit.Assert.assertNotNull(administrator35);
        org.junit.Assert.assertNotNull(administrator40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Not specified" + "'", str43, "Not specified");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Not specified" + "'", str45, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus49 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus49.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus51 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus51.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus57 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus57.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus59 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus59.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.State.ExtendedState extendedState1 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState1.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = extendedState1.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion7 = roomAdminFactory6.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory11 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator12 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory11);
        Chief_event_coordinator.Classes.Administrator administrator15 = roomAdminFactory11.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room17 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str18 = room17.getBuilding();
        administrator15.closeRoom(room17);
        java.lang.String str20 = room17.getRoomLocation();
        administrator10.viewRoomStatus(room17);
        Chief_event_coordinator.Classes.Booking booking22 = new Chief_event_coordinator.Classes.Booking("hi!", room17);
        extendedState1.extend(booking22);
        confirmedState0.markNoShow(booking22);
        Chief_event_coordinator.State.ConfirmedState confirmedState25 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.State.ExtendedState extendedState26 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus27 = extendedState26.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus28 = extendedState26.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus29 = extendedState26.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory31 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion32 = roomAdminFactory31.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator35 = roomAdminFactory31.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory36 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator37 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory36);
        Chief_event_coordinator.Classes.Administrator administrator40 = roomAdminFactory36.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room42 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str43 = room42.getBuilding();
        administrator40.closeRoom(room42);
        java.lang.String str45 = room42.getRoomLocation();
        administrator35.viewRoomStatus(room42);
        Chief_event_coordinator.Classes.Booking booking47 = new Chief_event_coordinator.Classes.Booking("hi!", room42);
        extendedState26.extend(booking47);
        confirmedState25.markNoShow(booking47);
        confirmedState0.markNoShow(booking47);
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion7);
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertNotNull(administrator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Not specified" + "'", str18, "Not specified");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Not specified" + "'", str20, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus27.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus28 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus28.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus29 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus29.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion32);
        org.junit.Assert.assertNotNull(administrator35);
        org.junit.Assert.assertNotNull(administrator40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Not specified" + "'", str43, "Not specified");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Not specified" + "'", str45, "Not specified");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) (byte) 10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem6 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade7 = new Chief_event_coordinator.Classes.BookingFacade(administrator4, badgeVerificationSystem6);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory8 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator9 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory8);
        Chief_event_coordinator.Classes.Administrator administrator12 = roomAdminFactory8.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str15 = room14.getBuilding();
        administrator12.closeRoom(room14);
        java.lang.String str17 = room14.getClosureReason();
        int int18 = room14.getCapacity();
        Chief_event_coordinator.Classes.RoomStatus roomStatus19 = room14.getStatus();
        bookingFacade7.addRoom(room14);
        bookingFacade7.authorizeBadge("Chief_event_coordinator.State.IllegalBookingTransitionException: ");
        // The following exception was thrown during execution in test generation
        try {
            bookingFacade7.viewRoomStatus((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 0 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(administrator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Not specified" + "'", str15, "Not specified");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Maintenance" + "'", str17, "Maintenance");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + roomStatus19 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE + "'", roomStatus19.equals(Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator6 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory5);
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str12 = room11.getBuilding();
        administrator9.closeRoom(room11);
        java.lang.String str14 = room11.getRoomLocation();
        administrator4.viewRoomStatus(room11);
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay16 = new Chief_event_coordinator.Classes.AdminDisplay(administrator4);
        java.lang.String str17 = administrator4.getEmail();
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay18 = new Chief_event_coordinator.Classes.AdminDisplay(administrator4);
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem19 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade20 = new Chief_event_coordinator.Classes.BookingFacade(administrator4, badgeVerificationSystem19);
        administrator4.setEmail("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!");
        org.junit.Assert.assertNotNull(adminPermssion1);
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Not specified" + "'", str12, "Not specified");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Not specified" + "'", str14, "Not specified");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory3 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator4 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory3);
        chiefEventCoordinator2.setFactory((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory3);
        Chief_event_coordinator.Classes.Administrator administrator8 = roomAdminFactory3.createAdministrator("hi!", "Maintenance");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory10 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator11 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory10);
        Chief_event_coordinator.Classes.Administrator administrator14 = roomAdminFactory10.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator14.addRoom(room16);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory18 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator19 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory18);
        Chief_event_coordinator.Classes.Administrator administrator22 = roomAdminFactory18.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room24 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str25 = room24.getBuilding();
        administrator22.closeRoom(room24);
        java.lang.String str27 = room24.getClosureReason();
        administrator14.viewRoomStatus(room24);
        Chief_event_coordinator.Classes.Booking booking29 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: ", room24);
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand30 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator8, room24);
        Chief_event_coordinator.Classes.Administrator administrator31 = null;
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory32 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator33 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory32);
        Chief_event_coordinator.Classes.Administrator administrator36 = roomAdminFactory32.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room38 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator36.addRoom(room38);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory40 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator41 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory40);
        Chief_event_coordinator.Classes.Administrator administrator44 = roomAdminFactory40.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room46 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str47 = room46.getBuilding();
        administrator44.closeRoom(room46);
        java.lang.String str49 = room46.getClosureReason();
        administrator36.viewRoomStatus(room46);
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand52 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator31, room46, "hi!");
        Chief_event_coordinator.Command.AddRoomCommand addRoomCommand53 = new Chief_event_coordinator.Command.AddRoomCommand(administrator8, room46);
        addRoomCommand53.execute();
        org.junit.Assert.assertNotNull(adminPermssion1);
        org.junit.Assert.assertNotNull(administrator8);
        org.junit.Assert.assertNotNull(administrator14);
        org.junit.Assert.assertNotNull(administrator22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Not specified" + "'", str25, "Not specified");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Maintenance" + "'", str27, "Maintenance");
        org.junit.Assert.assertNotNull(administrator36);
        org.junit.Assert.assertNotNull(administrator44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Not specified" + "'", str47, "Not specified");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Maintenance" + "'", str49, "Maintenance");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = extendedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = extendedState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState0.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory5 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion6 = roomAdminFactory5.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator9 = roomAdminFactory5.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory10 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator11 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory10);
        Chief_event_coordinator.Classes.Administrator administrator14 = roomAdminFactory10.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str17 = room16.getBuilding();
        administrator14.closeRoom(room16);
        java.lang.String str19 = room16.getRoomLocation();
        administrator9.viewRoomStatus(room16);
        Chief_event_coordinator.Classes.Booking booking21 = new Chief_event_coordinator.Classes.Booking("hi!", room16);
        extendedState0.extend(booking21);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus23 = extendedState0.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion6);
        org.junit.Assert.assertNotNull(administrator9);
        org.junit.Assert.assertNotNull(administrator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Not specified" + "'", str17, "Not specified");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Not specified" + "'", str19, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus23.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Chief_event_coordinator.Observer.StubPayment stubPayment0 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver1 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment0);
        boolean boolean3 = stubPayment0.charge((double) (short) -1);
        boolean boolean5 = stubPayment0.refund((double) 100);
        boolean boolean7 = stubPayment0.charge((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Chief_event_coordinator.State.CancelledState cancelledState0 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = cancelledState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = cancelledState0.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory4 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator5 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory4);
        Chief_event_coordinator.Classes.Administrator administrator8 = roomAdminFactory4.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room10 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator8.addRoom(room10);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory12 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator13 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory12);
        Chief_event_coordinator.Classes.Administrator administrator16 = roomAdminFactory12.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room18 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str19 = room18.getBuilding();
        administrator16.closeRoom(room18);
        java.lang.String str21 = room18.getClosureReason();
        administrator8.viewRoomStatus(room18);
        Chief_event_coordinator.Classes.Booking booking23 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: ", room18);
        // The following exception was thrown during execution in test generation
        try {
            cancelledState0.checkIn(booking23);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot check in a booking in state CANCELLED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertNotNull(administrator8);
        org.junit.Assert.assertNotNull(administrator16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Not specified" + "'", str19, "Not specified");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Maintenance" + "'", str21, "Maintenance");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Chief_event_coordinator.Observer.BookingStatus bookingStatus0 = Chief_event_coordinator.Observer.BookingStatus.CANCELLED;
        org.junit.Assert.assertTrue("'" + bookingStatus0 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus0.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str7 = room6.getBuilding();
        administrator4.closeRoom(room6);
        java.lang.String str9 = room6.getRoomLocation();
        java.lang.String str10 = room6.getBuilding();
        int int11 = room6.getRoomid();
        room6.setRoomLocation("Not specified");
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Not specified" + "'", str9, "Not specified");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.State.ConfirmedState confirmedState1 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.State.ExtendedState extendedState2 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState2.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = extendedState2.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = extendedState2.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory7 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion8 = roomAdminFactory7.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator11 = roomAdminFactory7.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory12 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator13 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory12);
        Chief_event_coordinator.Classes.Administrator administrator16 = roomAdminFactory12.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room18 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str19 = room18.getBuilding();
        administrator16.closeRoom(room18);
        java.lang.String str21 = room18.getRoomLocation();
        administrator11.viewRoomStatus(room18);
        Chief_event_coordinator.Classes.Booking booking23 = new Chief_event_coordinator.Classes.Booking("hi!", room18);
        extendedState2.extend(booking23);
        confirmedState1.markNoShow(booking23);
        Chief_event_coordinator.Command.CancelBookingCommand cancelBookingCommand26 = new Chief_event_coordinator.Command.CancelBookingCommand(registeredUser0, booking23);
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion8);
        org.junit.Assert.assertNotNull(administrator11);
        org.junit.Assert.assertNotNull(administrator16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Not specified" + "'", str19, "Not specified");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Not specified" + "'", str21, "Not specified");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory1 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory1);
        Chief_event_coordinator.Classes.Administrator administrator5 = roomAdminFactory1.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room7 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator5.addRoom(room7);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory9 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator10 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory9);
        Chief_event_coordinator.Classes.Administrator administrator13 = roomAdminFactory9.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str16 = room15.getBuilding();
        administrator13.closeRoom(room15);
        java.lang.String str18 = room15.getClosureReason();
        administrator5.viewRoomStatus(room15);
        Chief_event_coordinator.Classes.Booking booking20 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: ", room15);
        Chief_event_coordinator.Observer.StubPayment stubPayment21 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver22 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment21);
        booking20.removeObserver((Chief_event_coordinator.Observer.BookingObserver) paymentNotificationObserver22);
        booking20.edit();
        booking20.edit();
        org.junit.Assert.assertNotNull(administrator5);
        org.junit.Assert.assertNotNull(administrator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Not specified" + "'", str16, "Not specified");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Maintenance" + "'", str18, "Maintenance");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory3 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator4 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory3);
        chiefEventCoordinator2.setFactory((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory3);
        Chief_event_coordinator.Classes.Administrator administrator8 = roomAdminFactory3.createAdministrator("hi!", "Maintenance");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory10 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator11 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory10);
        Chief_event_coordinator.Classes.Administrator administrator14 = roomAdminFactory10.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator14.addRoom(room16);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory18 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator19 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory18);
        Chief_event_coordinator.Classes.Administrator administrator22 = roomAdminFactory18.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room24 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str25 = room24.getBuilding();
        administrator22.closeRoom(room24);
        java.lang.String str27 = room24.getClosureReason();
        administrator14.viewRoomStatus(room24);
        Chief_event_coordinator.Classes.Booking booking29 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: ", room24);
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand30 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator8, room24);
        User.RegisteredUser registeredUser32 = null;
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory33 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator34 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory33);
        Chief_event_coordinator.Classes.Administrator administrator37 = roomAdminFactory33.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room39 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str40 = room39.getBuilding();
        administrator37.closeRoom(room39);
        java.lang.String str42 = room39.getClosureReason();
        int int43 = room39.getCapacity();
        Chief_event_coordinator.Classes.Booking booking44 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", registeredUser32, room39);
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand45 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator8, room39);
        org.junit.Assert.assertNotNull(adminPermssion1);
        org.junit.Assert.assertNotNull(administrator8);
        org.junit.Assert.assertNotNull(administrator14);
        org.junit.Assert.assertNotNull(administrator22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Not specified" + "'", str25, "Not specified");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Maintenance" + "'", str27, "Maintenance");
        org.junit.Assert.assertNotNull(administrator37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Not specified" + "'", str40, "Not specified");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Maintenance" + "'", str42, "Maintenance");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner1 = new Chief_event_coordinator.Classes.IdBadgeScanner((int) (byte) -1);
        java.lang.String str2 = idBadgeScanner1.getLastScannedBadgeId();
        java.lang.String str3 = idBadgeScanner1.getLastScannedBadgeId();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner6 = new Chief_event_coordinator.Classes.IdBadgeScanner((int) (short) 0);
        boolean boolean7 = idBadgeScanner6.wasLastBadgeVerified();
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem9 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        boolean boolean10 = idBadgeScanner6.scanBadge("Not specified", badgeVerificationSystem9);
        boolean boolean11 = idBadgeScanner1.scanBadge("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", badgeVerificationSystem9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory3 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion4 = roomAdminFactory3.createPermission();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion5 = roomAdminFactory3.createPermission();
        chiefEventCoordinator2.setFactory((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory3);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory7 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion8 = roomAdminFactory7.createPermission();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator9 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory7);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory10 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion11 = roomAdminFactory10.createPermission();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion12 = roomAdminFactory10.createPermission();
        chiefEventCoordinator9.setFactory((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory10);
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion14 = roomAdminFactory10.createPermission();
        chiefEventCoordinator2.setFactory((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory10);
        Chief_event_coordinator.Abstract_Factory.AdminFactory adminFactory16 = chiefEventCoordinator2.getFactory();
        org.junit.Assert.assertNotNull(adminPermssion1);
        org.junit.Assert.assertNotNull(adminPermssion4);
        org.junit.Assert.assertNotNull(adminPermssion5);
        org.junit.Assert.assertNotNull(adminPermssion8);
        org.junit.Assert.assertNotNull(adminPermssion11);
        org.junit.Assert.assertNotNull(adminPermssion12);
        org.junit.Assert.assertNotNull(adminPermssion14);
        org.junit.Assert.assertNotNull(adminFactory16);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "");
        Chief_event_coordinator.Classes.Administrator administrator7 = roomAdminFactory0.createAdministrator("Not specified", "hi!");
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertNotNull(administrator7);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str7 = room6.getBuilding();
        administrator4.closeRoom(room6);
        java.lang.String str9 = room6.getClosureReason();
        int int10 = room6.getCapacity();
        Chief_event_coordinator.Classes.RoomStatus roomStatus11 = room6.getStatus();
        int int12 = room6.getCapacity();
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Not specified" + "'", str7, "Not specified");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Maintenance" + "'", str9, "Maintenance");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + roomStatus11 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE + "'", roomStatus11.equals(Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        User.RegisteredUser registeredUser2 = null;
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory3 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator4 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory3);
        Chief_event_coordinator.Classes.Administrator administrator7 = roomAdminFactory3.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str10 = room9.getBuilding();
        administrator7.closeRoom(room9);
        java.lang.String str12 = room9.getClosureReason();
        int int13 = room9.getCapacity();
        Chief_event_coordinator.Classes.Booking booking14 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", registeredUser2, room9);
        Chief_event_coordinator.Observer.StubPayment stubPayment15 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver16 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment15);
        boolean boolean18 = stubPayment15.charge((double) (short) -1);
        boolean boolean20 = stubPayment15.refund((double) 0);
        boolean boolean22 = stubPayment15.charge((double) (byte) 10);
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver23 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment15);
        Chief_event_coordinator.Classes.Booking booking24 = null;
        Chief_event_coordinator.State.ConfirmedState confirmedState25 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus26 = confirmedState25.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus27 = confirmedState25.getStatus();
        Chief_event_coordinator.State.CheckedInState checkedInState28 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus29 = checkedInState28.getStatus();
        paymentNotificationObserver23.onBookingStatusChanged(booking24, bookingStatus27, bookingStatus29);
        booking14.removeObserver((Chief_event_coordinator.Observer.BookingObserver) paymentNotificationObserver23);
        confirmedState0.checkIn(booking14);
        User.RegisteredUser registeredUser33 = null;
        User.RegisteredUser registeredUser34 = null;
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory36 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion37 = roomAdminFactory36.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator40 = roomAdminFactory36.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory41 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator42 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory41);
        Chief_event_coordinator.Classes.Administrator administrator45 = roomAdminFactory41.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room47 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str48 = room47.getBuilding();
        administrator45.closeRoom(room47);
        java.lang.String str50 = room47.getRoomLocation();
        administrator40.viewRoomStatus(room47);
        Chief_event_coordinator.Classes.Booking booking52 = new Chief_event_coordinator.Classes.Booking("hi!", room47);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus53 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        booking52.setStatus(bookingStatus53);
        Chief_event_coordinator.Command.ModifyBookingCommand modifyBookingCommand55 = new Chief_event_coordinator.Command.ModifyBookingCommand(registeredUser34, booking52);
        Chief_event_coordinator.Command.CancelBookingCommand cancelBookingCommand56 = new Chief_event_coordinator.Command.CancelBookingCommand(registeredUser33, booking52);
        // The following exception was thrown during execution in test generation
        try {
            confirmedState0.confirmDeposit(booking52);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot confirm deposit a booking in state CONFIRMED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Not specified" + "'", str10, "Not specified");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Maintenance" + "'", str12, "Maintenance");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus26.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus27.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus29 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus29.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(adminPermssion37);
        org.junit.Assert.assertNotNull(administrator40);
        org.junit.Assert.assertNotNull(administrator45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Not specified" + "'", str48, "Not specified");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Not specified" + "'", str50, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus53 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus53.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        Chief_event_coordinator.State.CheckedInState checkedInState0 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = checkedInState0.getStatus();
        Chief_event_coordinator.Classes.Administrator administrator5 = new Chief_event_coordinator.Classes.Administrator("", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator7 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory6);
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator10.addRoom(room12);
        Chief_event_coordinator.Classes.BookingFacade bookingFacade14 = new Chief_event_coordinator.Classes.BookingFacade(administrator10);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory15 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator16 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory15);
        Chief_event_coordinator.Classes.Administrator administrator19 = roomAdminFactory15.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory20 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator21 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory20);
        Chief_event_coordinator.Classes.Administrator administrator24 = roomAdminFactory20.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room26 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator24.addRoom(room26);
        administrator19.viewRoomStatus(room26);
        Chief_event_coordinator.Classes.Room room30 = new Chief_event_coordinator.Classes.Room((int) '4');
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver31 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room30);
        administrator19.enableRoom(room30);
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand33 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator10, room30);
        administrator5.viewRoomStatus(room30);
        Chief_event_coordinator.Classes.Booking booking35 = new Chief_event_coordinator.Classes.Booking("Maintenance", room30);
        checkedInState0.extend(booking35);
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertNotNull(administrator19);
        org.junit.Assert.assertNotNull(administrator24);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner1 = new Chief_event_coordinator.Classes.IdBadgeScanner((int) (short) 0);
        int int2 = idBadgeScanner1.getRoomid();
        int int3 = idBadgeScanner1.getRoomid();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.State.ConfirmedState confirmedState1 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.State.ExtendedState extendedState2 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = extendedState2.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = extendedState2.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = extendedState2.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory7 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion8 = roomAdminFactory7.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator11 = roomAdminFactory7.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory12 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator13 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory12);
        Chief_event_coordinator.Classes.Administrator administrator16 = roomAdminFactory12.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room18 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str19 = room18.getBuilding();
        administrator16.closeRoom(room18);
        java.lang.String str21 = room18.getRoomLocation();
        administrator11.viewRoomStatus(room18);
        Chief_event_coordinator.Classes.Booking booking23 = new Chief_event_coordinator.Classes.Booking("hi!", room18);
        extendedState2.extend(booking23);
        confirmedState1.markNoShow(booking23);
        extendedState0.extend(booking23);
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion8);
        org.junit.Assert.assertNotNull(administrator11);
        org.junit.Assert.assertNotNull(administrator16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Not specified" + "'", str19, "Not specified");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Not specified" + "'", str21, "Not specified");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner1 = new Chief_event_coordinator.Classes.IdBadgeScanner(10);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator2 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion3 = roomAdminFactory0.createPermission();
        java.lang.String str4 = adminPermssion3.getLevel();
        org.junit.Assert.assertNotNull(adminPermssion1);
        org.junit.Assert.assertNotNull(adminPermssion3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Room Managed" + "'", str4, "Room Managed");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory1 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion2 = roomAdminFactory1.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator5 = roomAdminFactory1.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator7 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory6);
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str13 = room12.getBuilding();
        administrator10.closeRoom(room12);
        java.lang.String str15 = room12.getRoomLocation();
        administrator5.viewRoomStatus(room12);
        Chief_event_coordinator.Classes.Booking booking17 = new Chief_event_coordinator.Classes.Booking("hi!", room12);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory19 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator20 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory19);
        Chief_event_coordinator.Classes.Administrator administrator23 = roomAdminFactory19.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room25 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator23.addRoom(room25);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory27 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator28 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory27);
        Chief_event_coordinator.Classes.Administrator administrator31 = roomAdminFactory27.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room33 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str34 = room33.getBuilding();
        administrator31.closeRoom(room33);
        java.lang.String str36 = room33.getClosureReason();
        administrator23.viewRoomStatus(room33);
        Chief_event_coordinator.Classes.Booking booking38 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: ", room33);
        Chief_event_coordinator.Observer.StubPayment stubPayment39 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver40 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment39);
        booking38.removeObserver((Chief_event_coordinator.Observer.BookingObserver) paymentNotificationObserver40);
        booking17.addObserver((Chief_event_coordinator.Observer.BookingObserver) paymentNotificationObserver40);
        Chief_event_coordinator.State.ExtendedState extendedState43 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus44 = extendedState43.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus45 = extendedState43.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus46 = extendedState43.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory48 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion49 = roomAdminFactory48.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator52 = roomAdminFactory48.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory53 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator54 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory53);
        Chief_event_coordinator.Classes.Administrator administrator57 = roomAdminFactory53.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room59 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str60 = room59.getBuilding();
        administrator57.closeRoom(room59);
        java.lang.String str62 = room59.getRoomLocation();
        administrator52.viewRoomStatus(room59);
        Chief_event_coordinator.Classes.Booking booking64 = new Chief_event_coordinator.Classes.Booking("hi!", room59);
        extendedState43.extend(booking64);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus66 = Chief_event_coordinator.Observer.BookingStatus.EXTENDED;
        Chief_event_coordinator.State.PendingState pendingState67 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus68 = pendingState67.getStatus();
        booking64.notifyObservers(bookingStatus66, bookingStatus68);
        Chief_event_coordinator.Observer.UserNotificationObserver userNotificationObserver71 = new Chief_event_coordinator.Observer.UserNotificationObserver("Not specified");
        booking64.addObserver((Chief_event_coordinator.Observer.BookingObserver) userNotificationObserver71);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory74 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator75 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory74);
        Chief_event_coordinator.Classes.Administrator administrator78 = roomAdminFactory74.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room80 = new Chief_event_coordinator.Classes.Room((int) '4');
        administrator78.addRoom(room80);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory82 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator83 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory82);
        Chief_event_coordinator.Classes.Administrator administrator86 = roomAdminFactory82.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room88 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str89 = room88.getBuilding();
        administrator86.closeRoom(room88);
        java.lang.String str91 = room88.getClosureReason();
        administrator78.viewRoomStatus(room88);
        Chief_event_coordinator.Classes.Booking booking93 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: ", room88);
        Chief_event_coordinator.Observer.StubPayment stubPayment94 = new Chief_event_coordinator.Observer.StubPayment();
        Chief_event_coordinator.Observer.PaymentNotificationObserver paymentNotificationObserver95 = new Chief_event_coordinator.Observer.PaymentNotificationObserver((Chief_event_coordinator.Observer.Payment) stubPayment94);
        booking93.removeObserver((Chief_event_coordinator.Observer.BookingObserver) paymentNotificationObserver95);
        booking64.removeObserver((Chief_event_coordinator.Observer.BookingObserver) paymentNotificationObserver95);
        booking17.addObserver((Chief_event_coordinator.Observer.BookingObserver) paymentNotificationObserver95);
        org.junit.Assert.assertNotNull(adminPermssion2);
        org.junit.Assert.assertNotNull(administrator5);
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Not specified" + "'", str13, "Not specified");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Not specified" + "'", str15, "Not specified");
        org.junit.Assert.assertNotNull(administrator23);
        org.junit.Assert.assertNotNull(administrator31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Not specified" + "'", str34, "Not specified");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Maintenance" + "'", str36, "Maintenance");
        org.junit.Assert.assertTrue("'" + bookingStatus44 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus44.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus45 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus45.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus46 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus46.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion49);
        org.junit.Assert.assertNotNull(administrator52);
        org.junit.Assert.assertNotNull(administrator57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Not specified" + "'", str60, "Not specified");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Not specified" + "'", str62, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus66 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus66.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus68 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus68.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertNotNull(administrator78);
        org.junit.Assert.assertNotNull(administrator86);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Not specified" + "'", str89, "Not specified");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Maintenance" + "'", str91, "Maintenance");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner1 = new Chief_event_coordinator.Classes.IdBadgeScanner((int) (short) 0);
        boolean boolean2 = idBadgeScanner1.wasLastBadgeVerified();
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem4 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        boolean boolean5 = idBadgeScanner1.scanBadge("Not specified", badgeVerificationSystem4);
        badgeVerificationSystem4.authorizeBadge("Maintenance");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory1 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion2 = roomAdminFactory1.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator5 = roomAdminFactory1.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator7 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory6);
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str13 = room12.getBuilding();
        administrator10.closeRoom(room12);
        java.lang.String str15 = room12.getRoomLocation();
        administrator5.viewRoomStatus(room12);
        Chief_event_coordinator.Classes.Booking booking17 = new Chief_event_coordinator.Classes.Booking("hi!", room12);
        booking17.edit();
        org.junit.Assert.assertNotNull(adminPermssion2);
        org.junit.Assert.assertNotNull(administrator5);
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Not specified" + "'", str13, "Not specified");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Not specified" + "'", str15, "Not specified");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory1 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion2 = roomAdminFactory1.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator5 = roomAdminFactory1.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory6 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator7 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory6);
        Chief_event_coordinator.Classes.Administrator administrator10 = roomAdminFactory6.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str13 = room12.getBuilding();
        administrator10.closeRoom(room12);
        java.lang.String str15 = room12.getRoomLocation();
        administrator5.viewRoomStatus(room12);
        Chief_event_coordinator.Classes.Booking booking17 = new Chief_event_coordinator.Classes.Booking("hi!", room12);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus18 = Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN;
        booking17.setStatus(bookingStatus18);
        Chief_event_coordinator.State.ConfirmedState confirmedState20 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = confirmedState20.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus22 = confirmedState20.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus23 = confirmedState20.getStatus();
        Chief_event_coordinator.State.CancelledState cancelledState24 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus25 = cancelledState24.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus26 = cancelledState24.getStatus();
        booking17.notifyObservers(bookingStatus23, bookingStatus26);
        Chief_event_coordinator.Classes.Room room28 = null;
        Chief_event_coordinator.Observer.RoomAvailabilityObserver roomAvailabilityObserver29 = new Chief_event_coordinator.Observer.RoomAvailabilityObserver(room28);
        booking17.removeObserver((Chief_event_coordinator.Observer.BookingObserver) roomAvailabilityObserver29);
        // The following exception was thrown during execution in test generation
        try {
            booking17.checkIn();
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot check in a booking in state CHECKED_IN.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(adminPermssion2);
        org.junit.Assert.assertNotNull(administrator5);
        org.junit.Assert.assertNotNull(administrator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Not specified" + "'", str13, "Not specified");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Not specified" + "'", str15, "Not specified");
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus18.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus22.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus23.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus25.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus26.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion1 = roomAdminFactory0.createPermission();
        adminPermssion1.setLevel("");
        adminPermssion1.setLevel("Chief_event_coordinator.State.IllegalBookingTransitionException: ");
        org.junit.Assert.assertNotNull(adminPermssion1);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("", "hi!");
        Chief_event_coordinator.Classes.AdminDisplay adminDisplay3 = new Chief_event_coordinator.Classes.AdminDisplay(administrator2);
        adminDisplay3.display();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        Chief_event_coordinator.Classes.Administrator administrator2 = new Chief_event_coordinator.Classes.Administrator("", "hi!");
        Chief_event_coordinator.State.ExtendedState extendedState3 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = extendedState3.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus5 = extendedState3.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus6 = extendedState3.getStatus();
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory8 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.Classes.AdminPermssion adminPermssion9 = roomAdminFactory8.createPermission();
        Chief_event_coordinator.Classes.Administrator administrator12 = roomAdminFactory8.createAdministrator("Maintenance", "");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory13 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator14 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory13);
        Chief_event_coordinator.Classes.Administrator administrator17 = roomAdminFactory13.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str20 = room19.getBuilding();
        administrator17.closeRoom(room19);
        java.lang.String str22 = room19.getRoomLocation();
        administrator12.viewRoomStatus(room19);
        Chief_event_coordinator.Classes.Booking booking24 = new Chief_event_coordinator.Classes.Booking("hi!", room19);
        extendedState3.extend(booking24);
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory26 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator27 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory26);
        Chief_event_coordinator.Classes.Administrator administrator30 = roomAdminFactory26.createAdministrator("hi!", "hi!");
        Chief_event_coordinator.Classes.Room room32 = new Chief_event_coordinator.Classes.Room((int) '4');
        java.lang.String str33 = room32.getBuilding();
        administrator30.closeRoom(room32);
        java.lang.String str35 = room32.getRoomLocation();
        java.lang.String str36 = room32.getBuilding();
        int int37 = room32.getRoomid();
        Chief_event_coordinator.Classes.RoomStatus roomStatus38 = room32.getStatus();
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor39 = room32.getOccupancySensor();
        booking24.setRoomName(room32);
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand41 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator2, room32);
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus5 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus5.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus6.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        org.junit.Assert.assertNotNull(adminPermssion9);
        org.junit.Assert.assertNotNull(administrator12);
        org.junit.Assert.assertNotNull(administrator17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Not specified" + "'", str20, "Not specified");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Not specified" + "'", str22, "Not specified");
        org.junit.Assert.assertNotNull(administrator30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Not specified" + "'", str33, "Not specified");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Not specified" + "'", str35, "Not specified");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Not specified" + "'", str36, "Not specified");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertTrue("'" + roomStatus38 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE + "'", roomStatus38.equals(Chief_event_coordinator.Classes.RoomStatus.MAINTENANCE));
        org.junit.Assert.assertNotNull(occupancySensor39);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner1 = new Chief_event_coordinator.Classes.IdBadgeScanner(0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade6 = new Chief_event_coordinator.Classes.BookingFacade(administrator4);
        bookingFacade6.authorizeBadge("Not specified");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = bookingFacade6.wasLastBadgeVerified((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 1 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        Chief_event_coordinator.Abstract_Factory.RoomAdminFactory roomAdminFactory0 = new Chief_event_coordinator.Abstract_Factory.RoomAdminFactory();
        Chief_event_coordinator.ChiefEventCoordinator chiefEventCoordinator1 = new Chief_event_coordinator.ChiefEventCoordinator((Chief_event_coordinator.Abstract_Factory.AdminFactory) roomAdminFactory0);
        Chief_event_coordinator.Classes.Administrator administrator4 = roomAdminFactory0.createAdministrator("hi!", "hi!");
        java.lang.String str5 = administrator4.getName();
        Chief_event_coordinator.Classes.BadgeVerificationSystem badgeVerificationSystem6 = new Chief_event_coordinator.Classes.BadgeVerificationSystem();
        Chief_event_coordinator.Classes.BookingFacade bookingFacade7 = new Chief_event_coordinator.Classes.BookingFacade(administrator4, badgeVerificationSystem6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = bookingFacade7.getOccupancyCount(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room 100 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(administrator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        Chief_event_coordinator.Classes.RegressionTest0 regressionTest0_0 = new Chief_event_coordinator.Classes.RegressionTest0();
        regressionTest0_0.test001();
        regressionTest0_0.test003();
        regressionTest0_0.test002();
        regressionTest0_0.test002();
    }
}

