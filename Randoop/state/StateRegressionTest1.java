package Randoop.state;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StateRegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test501");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room3 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room3.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner6 = room3.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking7 = new Chief_event_coordinator.Classes.Booking("hi!", room3);
        extendedState0.extend(booking7);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus9 = booking7.getStatus();
        Chief_event_coordinator.State.ConfirmedState confirmedState10 = new Chief_event_coordinator.State.ConfirmedState();
        User.RegisteredUser registeredUser12 = null;
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room15.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner18 = room15.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking19 = new Chief_event_coordinator.Classes.Booking("hi!", room15);
        Chief_event_coordinator.Classes.Booking booking20 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", registeredUser12, room15);
        confirmedState10.checkIn(booking20);
        Chief_event_coordinator.Classes.Room room24 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room24.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner27 = room24.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking28 = new Chief_event_coordinator.Classes.Booking("hi!", room24);
        confirmedState10.cancel(booking28);
        Chief_event_coordinator.State.ConfirmedState confirmedState30 = new Chief_event_coordinator.State.ConfirmedState();
        User.RegisteredUser registeredUser32 = null;
        Chief_event_coordinator.Classes.Room room35 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room35.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner38 = room35.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking39 = new Chief_event_coordinator.Classes.Booking("hi!", room35);
        Chief_event_coordinator.Classes.Booking booking40 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", registeredUser32, room35);
        confirmedState30.checkIn(booking40);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus42 = booking40.getStatus();
        Chief_event_coordinator.State.ConfirmedState confirmedState43 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room46 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room46.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner49 = room46.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking50 = new Chief_event_coordinator.Classes.Booking("hi!", room46);
        confirmedState43.cancel(booking50);
        Chief_event_coordinator.State.CancelledState cancelledState52 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus53 = cancelledState52.getStatus();
        booking50.changeState((Chief_event_coordinator.State.BookingState) cancelledState52);
        Chief_event_coordinator.Classes.Room room57 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room57.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner60 = room57.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking61 = new Chief_event_coordinator.Classes.Booking("hi!", room57);
        booking50.setRoomName(room57);
        java.lang.String str63 = booking50.getBookingid();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus64 = booking50.getStatus();
        booking40.setStatus(bookingStatus64);
        confirmedState10.markNoShow(booking40);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus67 = confirmedState10.getStatus();
        booking7.setStatus(bookingStatus67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner6);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus9.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner38);
        org.junit.Assert.assertTrue("'" + bookingStatus42 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus42.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner49);
        org.junit.Assert.assertTrue("'" + bookingStatus53 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus53.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "hi!" + "'", str63.equals("hi!"));
        org.junit.Assert.assertTrue("'" + bookingStatus64 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus64.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus67 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus67.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test502");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room3 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room3.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner6 = room3.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking7 = new Chief_event_coordinator.Classes.Booking("hi!", room3);
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room9.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner12 = room9.getIdBadgeScanner();
        booking7.setRoomName(room9);
        Chief_event_coordinator.State.ConfirmedState confirmedState14 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room17 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room17.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner20 = room17.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking21 = new Chief_event_coordinator.Classes.Booking("hi!", room17);
        confirmedState14.cancel(booking21);
        Chief_event_coordinator.State.CancelledState cancelledState23 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus24 = cancelledState23.getStatus();
        booking21.changeState((Chief_event_coordinator.State.BookingState) cancelledState23);
        boolean boolean26 = booking21.cancel();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus27 = booking21.getStatus();
        Chief_event_coordinator.State.ConfirmedState confirmedState28 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room31 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room31.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner34 = room31.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking35 = new Chief_event_coordinator.Classes.Booking("hi!", room31);
        confirmedState28.cancel(booking35);
        Chief_event_coordinator.State.CancelledState cancelledState37 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus38 = cancelledState37.getStatus();
        booking35.changeState((Chief_event_coordinator.State.BookingState) cancelledState37);
        Chief_event_coordinator.Classes.Room room42 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room42.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner45 = room42.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking46 = new Chief_event_coordinator.Classes.Booking("hi!", room42);
        booking35.setRoomName(room42);
        java.lang.String str48 = booking35.getBookingid();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus49 = booking35.getStatus();
        booking7.notifyObservers(bookingStatus27, bookingStatus49);
        boolean boolean51 = booking7.cancel();
        confirmedState0.markNoShow(booking7);
        Chief_event_coordinator.State.PendingState pendingState53 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus54 = pendingState53.getStatus();
        Chief_event_coordinator.State.ExtendedState extendedState55 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room58 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room58.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner61 = room58.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking62 = new Chief_event_coordinator.Classes.Booking("hi!", room58);
        extendedState55.extend(booking62);
        pendingState53.confirmDeposit(booking62);
        Chief_event_coordinator.State.ConfirmedState confirmedState65 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room68 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room68.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner71 = room68.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking72 = new Chief_event_coordinator.Classes.Booking("hi!", room68);
        confirmedState65.cancel(booking72);
        boolean boolean75 = booking72.extend((float) 1);
        boolean boolean77 = booking72.extend((float) ' ');
        pendingState53.confirmDeposit(booking72);
        confirmedState0.checkIn(booking72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner20);
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus24.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus27.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner34);
        org.junit.Assert.assertTrue("'" + bookingStatus38 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus38.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        org.junit.Assert.assertTrue("'" + bookingStatus49 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus49.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + bookingStatus54 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus54.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test503");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) (short) 100, (int) '#', "", "Not specified");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Building is required.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test504");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room3 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room3.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner6 = room3.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking7 = new Chief_event_coordinator.Classes.Booking("hi!", room3);
        confirmedState0.cancel(booking7);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus9 = confirmedState0.getStatus();
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) (short) 10);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor13 = room12.getOccupancySensor();
        Chief_event_coordinator.Classes.Booking booking14 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", room12);
        confirmedState0.checkIn(booking14);
        Chief_event_coordinator.State.ExtendedState extendedState16 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room19.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner22 = room19.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking23 = new Chief_event_coordinator.Classes.Booking("hi!", room19);
        extendedState16.extend(booking23);
        java.lang.String str25 = booking23.getBookingid();
        confirmedState0.cancel(booking23);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus27 = confirmedState0.getStatus();
        User.RegisteredUser registeredUser29 = null;
        Chief_event_coordinator.Classes.Room room31 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room31.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner34 = room31.getIdBadgeScanner();
        int int35 = room31.getCapacity();
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor36 = room31.getOccupancySensor();
        Chief_event_coordinator.Classes.Booking booking37 = new Chief_event_coordinator.Classes.Booking("hi!", registeredUser29, room31);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus38 = booking37.getStatus();
        confirmedState0.checkIn(booking37);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = booking37.cancel();
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot cancel a booking in state CHECKED_IN.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner6);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus9.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus27.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor36);
        org.junit.Assert.assertTrue("'" + bookingStatus38 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus38.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test505");
        Chief_event_coordinator.Classes.Room room2 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room2.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner5 = room2.getIdBadgeScanner();
        int int6 = room2.getRoomid();
        room2.setBuilding("Not specified");
        int int9 = room2.getRoomid();
        Chief_event_coordinator.Classes.Booking booking10 = new Chief_event_coordinator.Classes.Booking("hi!", room2);
        Chief_event_coordinator.State.ConfirmedState confirmedState11 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room14.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner17 = room14.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking18 = new Chief_event_coordinator.Classes.Booking("hi!", room14);
        confirmedState11.cancel(booking18);
        Chief_event_coordinator.State.CancelledState cancelledState20 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = cancelledState20.getStatus();
        booking18.changeState((Chief_event_coordinator.State.BookingState) cancelledState20);
        boolean boolean23 = booking18.cancel();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus24 = booking18.getStatus();
        Chief_event_coordinator.State.CancelledState cancelledState25 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus26 = cancelledState25.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus27 = cancelledState25.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus28 = cancelledState25.getStatus();
        booking10.notifyObservers(bookingStatus24, bookingStatus28);
        Chief_event_coordinator.Classes.Room room30 = booking10.getRoomName();
        Chief_event_coordinator.Observer.BookingObserver bookingObserver31 = null;
        booking10.removeObserver(bookingObserver31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner17);
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus24.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus26.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus27.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus28 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus28.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(room30);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test506");
        Chief_event_coordinator.Classes.Room room2 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room2.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner5 = room2.getIdBadgeScanner();
        int int6 = room2.getRoomid();
        room2.setBuilding("Not specified");
        int int9 = room2.getRoomid();
        Chief_event_coordinator.Classes.Booking booking10 = new Chief_event_coordinator.Classes.Booking("hi!", room2);
        User.RegisteredUser registeredUser11 = null;
        booking10.setRegisteredUser(registeredUser11);
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room14.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner17 = room14.getIdBadgeScanner();
        int int18 = room14.getRoomid();
        room14.setCapacity((int) '#');
        boolean boolean21 = booking10.edit(room14);
        int int22 = room14.getRoomid();
        Chief_event_coordinator.Classes.RoomStatus roomStatus23 = room14.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + roomStatus23 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus23.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test507");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        User.RegisteredUser registeredUser2 = null;
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room5.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner8 = room5.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking9 = new Chief_event_coordinator.Classes.Booking("hi!", room5);
        Chief_event_coordinator.Classes.Booking booking10 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", registeredUser2, room5);
        confirmedState0.checkIn(booking10);
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room14.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner17 = room14.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking18 = new Chief_event_coordinator.Classes.Booking("hi!", room14);
        confirmedState0.cancel(booking18);
        Chief_event_coordinator.Classes.Room room20 = booking18.getRoomName();
        java.lang.String str21 = booking18.getBookingid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(room20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test508");
        Chief_event_coordinator.Classes.Room room3 = new Chief_event_coordinator.Classes.Room((int) 'a');
        int int4 = room3.getRoomid();
        Chief_event_coordinator.Classes.Booking booking5 = new Chief_event_coordinator.Classes.Booking("Not specified", room3);
        Chief_event_coordinator.Classes.Booking booking6 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", room3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test509");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room3 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room3.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner6 = room3.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking7 = new Chief_event_coordinator.Classes.Booking("hi!", room3);
        extendedState0.extend(booking7);
        Chief_event_coordinator.Classes.Room room9 = booking7.getRoomName();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus10 = booking7.getStatus();
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room12.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner15 = room12.getIdBadgeScanner();
        int int16 = room12.getRoomid();
        java.lang.String str17 = room12.getRoomLocation();
        Chief_event_coordinator.Classes.RoomStatus roomStatus18 = room12.getStatus();
        room12.setCapacity((int) (short) 1);
        booking7.setRoomName(room12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(room9);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus10.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Not specified" + "'", str17.equals("Not specified"));
        org.junit.Assert.assertTrue("'" + roomStatus18 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus18.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test510");
        Chief_event_coordinator.State.CheckedInState checkedInState0 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.State.ConfirmedState confirmedState1 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = confirmedState1.getStatus();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room5.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner8 = room5.getIdBadgeScanner();
        int int9 = room5.getRoomid();
        room5.setBuilding("Not specified");
        int int12 = room5.getRoomid();
        Chief_event_coordinator.Classes.Booking booking13 = new Chief_event_coordinator.Classes.Booking("hi!", room5);
        User.RegisteredUser registeredUser14 = null;
        booking13.setRegisteredUser(registeredUser14);
        confirmedState1.checkIn(booking13);
        checkedInState0.extend(booking13);
        Chief_event_coordinator.Observer.BookingObserver bookingObserver18 = null;
        booking13.removeObserver(bookingObserver18);
        Chief_event_coordinator.Observer.BookingObserver bookingObserver20 = null;
        booking13.addObserver(bookingObserver20);
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test511");
        // The following exception was thrown during execution in test generation
        try {
            Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) (short) -1, 0, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Room id must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test512");
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.State.ExtendedState extendedState2 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room5.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner8 = room5.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking9 = new Chief_event_coordinator.Classes.Booking("hi!", room5);
        extendedState2.extend(booking9);
        Chief_event_coordinator.Classes.Room room11 = booking9.getRoomName();
        room11.setBuilding("Not specified");
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor14 = room11.getOccupancySensor();
        Chief_event_coordinator.Classes.Booking booking15 = new Chief_event_coordinator.Classes.Booking("hi!", registeredUser1, room11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(room11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor14);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test513");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = confirmedState0.getStatus();
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room4.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room4.getIdBadgeScanner();
        int int8 = room4.getRoomid();
        room4.setBuilding("Not specified");
        int int11 = room4.getRoomid();
        Chief_event_coordinator.Classes.Booking booking12 = new Chief_event_coordinator.Classes.Booking("hi!", room4);
        User.RegisteredUser registeredUser13 = null;
        booking12.setRegisteredUser(registeredUser13);
        confirmedState0.checkIn(booking12);
        Chief_event_coordinator.State.PendingState pendingState16 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus17 = pendingState16.getStatus();
        Chief_event_coordinator.State.ExtendedState extendedState18 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room21 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room21.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner24 = room21.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking25 = new Chief_event_coordinator.Classes.Booking("hi!", room21);
        extendedState18.extend(booking25);
        pendingState16.confirmDeposit(booking25);
        booking25.markNoShow();
        confirmedState0.checkIn(booking25);
        User.RegisteredUser registeredUser31 = null;
        Chief_event_coordinator.Classes.Room room33 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room33.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner36 = room33.getIdBadgeScanner();
        int int37 = room33.getCapacity();
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor38 = room33.getOccupancySensor();
        Chief_event_coordinator.Classes.Booking booking39 = new Chief_event_coordinator.Classes.Booking("hi!", registeredUser31, room33);
        boolean boolean40 = booking25.edit(room33);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor41 = room33.getOccupancySensor();
        java.lang.String str42 = room33.getClosureReason();
        room33.setRoomLocation("Chief_event_coordinator.State.IllegalBookingTransitionException: ");
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus17.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test514");
        Chief_event_coordinator.Classes.Room room2 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room2.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner5 = room2.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking6 = new Chief_event_coordinator.Classes.Booking("hi!", room2);
        booking6.setBookingid("Not specified");
        User.RegisteredUser registeredUser9 = null;
        booking6.setRegisteredUser(registeredUser9);
        Chief_event_coordinator.State.CheckedInState checkedInState11 = new Chief_event_coordinator.State.CheckedInState();
        booking6.changeState((Chief_event_coordinator.State.BookingState) checkedInState11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner5);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test515");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = confirmedState0.getStatus();
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room4.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room4.getIdBadgeScanner();
        int int8 = room4.getRoomid();
        room4.setBuilding("Not specified");
        int int11 = room4.getRoomid();
        Chief_event_coordinator.Classes.Booking booking12 = new Chief_event_coordinator.Classes.Booking("hi!", room4);
        User.RegisteredUser registeredUser13 = null;
        booking12.setRegisteredUser(registeredUser13);
        confirmedState0.checkIn(booking12);
        booking12.extend();
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) 'a');
        Chief_event_coordinator.Classes.Booking booking20 = new Chief_event_coordinator.Classes.Booking("hi!", room19);
        room19.setBuilding("Not specified");
        boolean boolean23 = booking12.edit(room19);
        Chief_event_coordinator.Observer.BookingObserver bookingObserver24 = null;
        booking12.removeObserver(bookingObserver24);
        Chief_event_coordinator.Classes.Room room26 = booking12.getRoomName();
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(room26);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test516");
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Room room3 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room3.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner6 = room3.getIdBadgeScanner();
        int int7 = room3.getCapacity();
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor8 = room3.getOccupancySensor();
        Chief_event_coordinator.Classes.Booking booking9 = new Chief_event_coordinator.Classes.Booking("hi!", registeredUser1, room3);
        // The following exception was thrown during execution in test generation
        try {
            booking9.checkIn();
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot check in a booking in state PENDING.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor8);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test517");
        Chief_event_coordinator.Classes.Room room2 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room2.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner5 = room2.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking6 = new Chief_event_coordinator.Classes.Booking("hi!", room2);
        Chief_event_coordinator.State.ConfirmedState confirmedState7 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus8 = confirmedState7.getStatus();
        Chief_event_coordinator.State.NoShowState noShowState9 = new Chief_event_coordinator.State.NoShowState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus10 = noShowState9.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus11 = noShowState9.getStatus();
        booking6.notifyObservers(bookingStatus8, bookingStatus11);
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) 'a');
        int int15 = room14.getRoomid();
        boolean boolean16 = booking6.edit(room14);
        Chief_event_coordinator.Classes.Room room18 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.Room room21 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room21.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner24 = room21.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking25 = new Chief_event_coordinator.Classes.Booking("hi!", room21);
        Chief_event_coordinator.State.ConfirmedState confirmedState26 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus27 = confirmedState26.getStatus();
        Chief_event_coordinator.State.NoShowState noShowState28 = new Chief_event_coordinator.State.NoShowState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus29 = noShowState28.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus30 = noShowState28.getStatus();
        booking25.notifyObservers(bookingStatus27, bookingStatus30);
        Chief_event_coordinator.Classes.Room room33 = new Chief_event_coordinator.Classes.Room((int) (short) 10);
        booking25.setRoomName(room33);
        Chief_event_coordinator.Classes.RoomStatus roomStatus35 = room33.getStatus();
        room18.setStatus(roomStatus35);
        room14.setStatus(roomStatus35);
        java.lang.String str38 = room14.getClosureReason();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner5);
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus8.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus10.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus11.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner24);
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus27.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus29 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus29.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + bookingStatus30 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus30.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + roomStatus35 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus35.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test518");
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Room room3 = new Chief_event_coordinator.Classes.Room((int) (short) 100);
        Chief_event_coordinator.Classes.Booking booking4 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: ", registeredUser1, room3);
        java.lang.String str5 = booking4.getBookingid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Chief_event_coordinator.State.IllegalBookingTransitionException: " + "'", str5.equals("Chief_event_coordinator.State.IllegalBookingTransitionException: "));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test519");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room3 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room3.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner6 = room3.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking7 = new Chief_event_coordinator.Classes.Booking("hi!", room3);
        confirmedState0.cancel(booking7);
        Chief_event_coordinator.State.CancelledState cancelledState9 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus10 = cancelledState9.getStatus();
        booking7.changeState((Chief_event_coordinator.State.BookingState) cancelledState9);
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room14.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner17 = room14.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking18 = new Chief_event_coordinator.Classes.Booking("hi!", room14);
        booking7.setRoomName(room14);
        Chief_event_coordinator.Classes.Room room20 = booking7.getRoomName();
        Chief_event_coordinator.Classes.Room room21 = booking7.getRoomName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner6);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus10.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(room20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(room21);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test520");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room3 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room3.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner6 = room3.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking7 = new Chief_event_coordinator.Classes.Booking("hi!", room3);
        confirmedState0.cancel(booking7);
        Chief_event_coordinator.State.CancelledState cancelledState9 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus10 = cancelledState9.getStatus();
        booking7.changeState((Chief_event_coordinator.State.BookingState) cancelledState9);
        Chief_event_coordinator.State.ExtendedState extendedState12 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room15 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room15.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner18 = room15.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking19 = new Chief_event_coordinator.Classes.Booking("hi!", room15);
        extendedState12.extend(booking19);
        Chief_event_coordinator.Classes.Room room21 = booking19.getRoomName();
        Chief_event_coordinator.Classes.RoomStatus roomStatus22 = room21.getStatus();
        room21.setBuilding("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!");
        booking7.setRoomName(room21);
        Chief_event_coordinator.State.ConfirmedState confirmedState26 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus27 = confirmedState26.getStatus();
        Chief_event_coordinator.Classes.Room room30 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room30.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner33 = room30.getIdBadgeScanner();
        int int34 = room30.getRoomid();
        room30.setBuilding("Not specified");
        int int37 = room30.getRoomid();
        Chief_event_coordinator.Classes.Booking booking38 = new Chief_event_coordinator.Classes.Booking("hi!", room30);
        User.RegisteredUser registeredUser39 = null;
        booking38.setRegisteredUser(registeredUser39);
        confirmedState26.checkIn(booking38);
        booking38.extend();
        Chief_event_coordinator.Classes.Room room45 = new Chief_event_coordinator.Classes.Room((int) 'a');
        Chief_event_coordinator.Classes.Booking booking46 = new Chief_event_coordinator.Classes.Booking("hi!", room45);
        room45.setBuilding("Not specified");
        boolean boolean49 = booking38.edit(room45);
        Chief_event_coordinator.Classes.Room room52 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room52.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner55 = room52.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking56 = new Chief_event_coordinator.Classes.Booking("hi!", room52);
        boolean boolean57 = booking38.edit(room52);
        boolean boolean58 = booking7.edit(room52);
        Chief_event_coordinator.Classes.RoomStatus roomStatus59 = room52.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner6);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus10.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(room21);
        org.junit.Assert.assertTrue("'" + roomStatus22 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus22.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus27.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + roomStatus59 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus59.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test521");
        Chief_event_coordinator.Classes.Room room2 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room2.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner5 = room2.getIdBadgeScanner();
        int int6 = room2.getRoomid();
        room2.setCapacity((int) '#');
        Chief_event_coordinator.State.ConfirmedState confirmedState9 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room12.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner15 = room12.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking16 = new Chief_event_coordinator.Classes.Booking("hi!", room12);
        confirmedState9.cancel(booking16);
        Chief_event_coordinator.State.CancelledState cancelledState18 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus19 = cancelledState18.getStatus();
        booking16.changeState((Chief_event_coordinator.State.BookingState) cancelledState18);
        Chief_event_coordinator.Classes.Room room23 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room23.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner26 = room23.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking27 = new Chief_event_coordinator.Classes.Booking("hi!", room23);
        booking16.setRoomName(room23);
        int int29 = room23.getCapacity();
        room23.setRoomLocation("Not specified");
        Chief_event_coordinator.Classes.Room room33 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room33.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner36 = room33.getIdBadgeScanner();
        int int37 = room33.getRoomid();
        java.lang.String str38 = room33.getRoomLocation();
        Chief_event_coordinator.Classes.RoomStatus roomStatus39 = room33.getStatus();
        room23.setStatus(roomStatus39);
        room2.setStatus(roomStatus39);
        Chief_event_coordinator.Classes.Booking booking42 = new Chief_event_coordinator.Classes.Booking("hi!", room2);
        booking42.confirmDeposit();
        java.lang.String str44 = booking42.getBookingid();
        // The following exception was thrown during execution in test generation
        try {
            booking42.confirmDeposit();
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot confirm deposit a booking in state CONFIRMED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner15);
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus19.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Not specified" + "'", str38.equals("Not specified"));
        org.junit.Assert.assertTrue("'" + roomStatus39 + "' != '" + Chief_event_coordinator.Classes.RoomStatus.AVAILABLE + "'", roomStatus39.equals(Chief_event_coordinator.Classes.RoomStatus.AVAILABLE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test522");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room3 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room3.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner6 = room3.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking7 = new Chief_event_coordinator.Classes.Booking("hi!", room3);
        extendedState0.extend(booking7);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus9 = booking7.getStatus();
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room12.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner15 = room12.getIdBadgeScanner();
        int int16 = room12.getRoomid();
        room12.setBuilding("Not specified");
        int int19 = room12.getRoomid();
        Chief_event_coordinator.Classes.Booking booking20 = new Chief_event_coordinator.Classes.Booking("hi!", room12);
        User.RegisteredUser registeredUser21 = null;
        booking20.setRegisteredUser(registeredUser21);
        Chief_event_coordinator.Classes.Room room24 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room24.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner27 = room24.getIdBadgeScanner();
        int int28 = room24.getRoomid();
        room24.setCapacity((int) '#');
        boolean boolean31 = booking20.edit(room24);
        int int32 = room24.getRoomid();
        booking7.setRoomName(room24);
        java.lang.String str34 = room24.getBuilding();
        java.lang.String str35 = room24.getBuilding();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner6);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus9.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test523");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        User.RegisteredUser registeredUser2 = null;
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room5.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner8 = room5.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking9 = new Chief_event_coordinator.Classes.Booking("hi!", room5);
        Chief_event_coordinator.Classes.Booking booking10 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", registeredUser2, room5);
        confirmedState0.checkIn(booking10);
        Chief_event_coordinator.Classes.Room room13 = new Chief_event_coordinator.Classes.Room((int) (short) 1);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor14 = room13.getOccupancySensor();
        boolean boolean15 = booking10.edit(room13);
        int int16 = room13.getRoomid();
        int int17 = room13.getRoomid();
        int int18 = room13.getRoomid();
        int int19 = room13.getCapacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test524");
        Chief_event_coordinator.State.PendingState pendingState0 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = pendingState0.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus2 = pendingState0.getStatus();
        Chief_event_coordinator.State.CheckedInState checkedInState3 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus4 = checkedInState3.getStatus();
        Chief_event_coordinator.State.ConfirmedState confirmedState5 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus6 = confirmedState5.getStatus();
        Chief_event_coordinator.Classes.Room room9 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room9.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner12 = room9.getIdBadgeScanner();
        int int13 = room9.getRoomid();
        room9.setBuilding("Not specified");
        int int16 = room9.getRoomid();
        Chief_event_coordinator.Classes.Booking booking17 = new Chief_event_coordinator.Classes.Booking("hi!", room9);
        User.RegisteredUser registeredUser18 = null;
        booking17.setRegisteredUser(registeredUser18);
        confirmedState5.checkIn(booking17);
        Chief_event_coordinator.State.PendingState pendingState21 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus22 = pendingState21.getStatus();
        Chief_event_coordinator.State.ExtendedState extendedState23 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room26 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room26.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner29 = room26.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking30 = new Chief_event_coordinator.Classes.Booking("hi!", room26);
        extendedState23.extend(booking30);
        pendingState21.confirmDeposit(booking30);
        booking30.markNoShow();
        confirmedState5.checkIn(booking30);
        Chief_event_coordinator.Classes.Room room37 = new Chief_event_coordinator.Classes.Room((int) 'a');
        Chief_event_coordinator.Classes.Booking booking38 = new Chief_event_coordinator.Classes.Booking("hi!", room37);
        User.RegisteredUser registeredUser39 = booking38.getRegisteredUser();
        boolean boolean40 = booking38.cancel();
        confirmedState5.cancel(booking38);
        checkedInState3.extend(booking38);
        Chief_event_coordinator.Classes.Room room45 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room45.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner48 = room45.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking49 = new Chief_event_coordinator.Classes.Booking("hi!", room45);
        Chief_event_coordinator.State.ConfirmedState confirmedState50 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus51 = confirmedState50.getStatus();
        Chief_event_coordinator.State.NoShowState noShowState52 = new Chief_event_coordinator.State.NoShowState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus53 = noShowState52.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus54 = noShowState52.getStatus();
        booking49.notifyObservers(bookingStatus51, bookingStatus54);
        Chief_event_coordinator.Classes.Room room58 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room58.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner61 = room58.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking62 = new Chief_event_coordinator.Classes.Booking("hi!", room58);
        Chief_event_coordinator.State.ConfirmedState confirmedState63 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus64 = confirmedState63.getStatus();
        Chief_event_coordinator.State.NoShowState noShowState65 = new Chief_event_coordinator.State.NoShowState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus66 = noShowState65.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus67 = noShowState65.getStatus();
        booking62.notifyObservers(bookingStatus64, bookingStatus67);
        booking38.notifyObservers(bookingStatus51, bookingStatus67);
        Chief_event_coordinator.Classes.Room room70 = booking38.getRoomName();
        Chief_event_coordinator.Observer.BookingObserver bookingObserver71 = null;
        booking38.addObserver(bookingObserver71);
        // The following exception was thrown during execution in test generation
        try {
            pendingState0.confirmDeposit(booking38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Observer.BookingObserver.onBookingStatusChanged(Chief_event_coordinator.Classes.Booking, Chief_event_coordinator.Observer.BookingStatus, Chief_event_coordinator.Observer.BookingStatus)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus2 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus2.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        org.junit.Assert.assertTrue("'" + bookingStatus4 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus4.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus6.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus22.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(registeredUser39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner48);
        org.junit.Assert.assertTrue("'" + bookingStatus51 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus51.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus53 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus53.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + bookingStatus54 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus54.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner61);
        org.junit.Assert.assertTrue("'" + bookingStatus64 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus64.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus66 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus66.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + bookingStatus67 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus67.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(room70);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test525");
        Chief_event_coordinator.State.CheckedInState checkedInState0 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = checkedInState0.getStatus();
        Chief_event_coordinator.State.ConfirmedState confirmedState2 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = confirmedState2.getStatus();
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room6.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner9 = room6.getIdBadgeScanner();
        int int10 = room6.getRoomid();
        room6.setBuilding("Not specified");
        int int13 = room6.getRoomid();
        Chief_event_coordinator.Classes.Booking booking14 = new Chief_event_coordinator.Classes.Booking("hi!", room6);
        User.RegisteredUser registeredUser15 = null;
        booking14.setRegisteredUser(registeredUser15);
        confirmedState2.checkIn(booking14);
        Chief_event_coordinator.State.PendingState pendingState18 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus19 = pendingState18.getStatus();
        Chief_event_coordinator.State.ExtendedState extendedState20 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room23 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room23.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner26 = room23.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking27 = new Chief_event_coordinator.Classes.Booking("hi!", room23);
        extendedState20.extend(booking27);
        pendingState18.confirmDeposit(booking27);
        booking27.markNoShow();
        confirmedState2.checkIn(booking27);
        Chief_event_coordinator.Classes.Room room34 = new Chief_event_coordinator.Classes.Room((int) 'a');
        Chief_event_coordinator.Classes.Booking booking35 = new Chief_event_coordinator.Classes.Booking("hi!", room34);
        User.RegisteredUser registeredUser36 = booking35.getRegisteredUser();
        boolean boolean37 = booking35.cancel();
        confirmedState2.cancel(booking35);
        checkedInState0.extend(booking35);
        Chief_event_coordinator.Classes.Room room42 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room42.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner45 = room42.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking46 = new Chief_event_coordinator.Classes.Booking("hi!", room42);
        Chief_event_coordinator.State.ConfirmedState confirmedState47 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus48 = confirmedState47.getStatus();
        Chief_event_coordinator.State.NoShowState noShowState49 = new Chief_event_coordinator.State.NoShowState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus50 = noShowState49.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus51 = noShowState49.getStatus();
        booking46.notifyObservers(bookingStatus48, bookingStatus51);
        Chief_event_coordinator.Classes.Room room55 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room55.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner58 = room55.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking59 = new Chief_event_coordinator.Classes.Booking("hi!", room55);
        Chief_event_coordinator.State.ConfirmedState confirmedState60 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus61 = confirmedState60.getStatus();
        Chief_event_coordinator.State.NoShowState noShowState62 = new Chief_event_coordinator.State.NoShowState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus63 = noShowState62.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus64 = noShowState62.getStatus();
        booking59.notifyObservers(bookingStatus61, bookingStatus64);
        booking35.notifyObservers(bookingStatus48, bookingStatus64);
        Chief_event_coordinator.Classes.Room room67 = booking35.getRoomName();
        Chief_event_coordinator.State.ConfirmedState confirmedState68 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room71 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room71.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner74 = room71.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking75 = new Chief_event_coordinator.Classes.Booking("hi!", room71);
        confirmedState68.cancel(booking75);
        Chief_event_coordinator.State.CancelledState cancelledState77 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus78 = cancelledState77.getStatus();
        booking75.changeState((Chief_event_coordinator.State.BookingState) cancelledState77);
        Chief_event_coordinator.Classes.Room room82 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room82.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner85 = room82.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking86 = new Chief_event_coordinator.Classes.Booking("hi!", room82);
        booking75.setRoomName(room82);
        int int88 = room82.getCapacity();
        java.lang.String str89 = room82.getRoomLocation();
        int int90 = room82.getCapacity();
        booking35.setRoomName(room82);
        java.lang.String str92 = booking35.getBookingid();
        // The following exception was thrown during execution in test generation
        try {
            booking35.checkIn();
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot check in a booking in state EXTENDED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus19.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(registeredUser36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner45);
        org.junit.Assert.assertTrue("'" + bookingStatus48 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus48.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus50 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus50.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + bookingStatus51 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus51.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner58);
        org.junit.Assert.assertTrue("'" + bookingStatus61 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus61.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus63 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus63.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + bookingStatus64 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus64.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(room67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner74);
        org.junit.Assert.assertTrue("'" + bookingStatus78 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus78.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "Not specified" + "'", str89.equals("Not specified"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "hi!" + "'", str92.equals("hi!"));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test526");
        Chief_event_coordinator.State.CheckedInState checkedInState0 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = checkedInState0.getStatus();
        Chief_event_coordinator.State.ConfirmedState confirmedState2 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus3 = confirmedState2.getStatus();
        Chief_event_coordinator.Classes.Room room6 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room6.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner9 = room6.getIdBadgeScanner();
        int int10 = room6.getRoomid();
        room6.setBuilding("Not specified");
        int int13 = room6.getRoomid();
        Chief_event_coordinator.Classes.Booking booking14 = new Chief_event_coordinator.Classes.Booking("hi!", room6);
        User.RegisteredUser registeredUser15 = null;
        booking14.setRegisteredUser(registeredUser15);
        confirmedState2.checkIn(booking14);
        Chief_event_coordinator.State.PendingState pendingState18 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus19 = pendingState18.getStatus();
        Chief_event_coordinator.State.ExtendedState extendedState20 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room23 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room23.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner26 = room23.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking27 = new Chief_event_coordinator.Classes.Booking("hi!", room23);
        extendedState20.extend(booking27);
        pendingState18.confirmDeposit(booking27);
        booking27.markNoShow();
        confirmedState2.checkIn(booking27);
        Chief_event_coordinator.Classes.Room room34 = new Chief_event_coordinator.Classes.Room((int) 'a');
        Chief_event_coordinator.Classes.Booking booking35 = new Chief_event_coordinator.Classes.Booking("hi!", room34);
        User.RegisteredUser registeredUser36 = booking35.getRegisteredUser();
        boolean boolean37 = booking35.cancel();
        confirmedState2.cancel(booking35);
        checkedInState0.extend(booking35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = booking35.extend((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Extension duration must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus3.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus19.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(registeredUser36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test527");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room3 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room3.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner6 = room3.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking7 = new Chief_event_coordinator.Classes.Booking("hi!", room3);
        confirmedState0.cancel(booking7);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus9 = confirmedState0.getStatus();
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) (short) 10);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor13 = room12.getOccupancySensor();
        Chief_event_coordinator.Classes.Booking booking14 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", room12);
        confirmedState0.checkIn(booking14);
        Chief_event_coordinator.State.ExtendedState extendedState16 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room19 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room19.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner22 = room19.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking23 = new Chief_event_coordinator.Classes.Booking("hi!", room19);
        extendedState16.extend(booking23);
        java.lang.String str25 = booking23.getBookingid();
        confirmedState0.cancel(booking23);
        Chief_event_coordinator.State.ConfirmedState confirmedState27 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room30 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room30.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner33 = room30.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking34 = new Chief_event_coordinator.Classes.Booking("hi!", room30);
        confirmedState27.cancel(booking34);
        Chief_event_coordinator.State.CancelledState cancelledState36 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus37 = cancelledState36.getStatus();
        booking34.changeState((Chief_event_coordinator.State.BookingState) cancelledState36);
        Chief_event_coordinator.Classes.Room room41 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room41.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner44 = room41.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking45 = new Chief_event_coordinator.Classes.Booking("hi!", room41);
        booking34.setRoomName(room41);
        Chief_event_coordinator.Classes.Room room47 = booking34.getRoomName();
        Chief_event_coordinator.State.ExtendedState extendedState48 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room51 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room51.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner54 = room51.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking55 = new Chief_event_coordinator.Classes.Booking("hi!", room51);
        extendedState48.extend(booking55);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus57 = extendedState48.getStatus();
        Chief_event_coordinator.Classes.Room room60 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room60.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner63 = room60.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking64 = new Chief_event_coordinator.Classes.Booking("hi!", room60);
        Chief_event_coordinator.State.ConfirmedState confirmedState65 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus66 = confirmedState65.getStatus();
        Chief_event_coordinator.State.NoShowState noShowState67 = new Chief_event_coordinator.State.NoShowState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus68 = noShowState67.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus69 = noShowState67.getStatus();
        booking64.notifyObservers(bookingStatus66, bookingStatus69);
        Chief_event_coordinator.Observer.BookingObserver bookingObserver71 = null;
        booking64.addObserver(bookingObserver71);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus73 = booking64.getStatus();
        booking34.notifyObservers(bookingStatus57, bookingStatus73);
        confirmedState0.checkIn(booking34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner6);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus9.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner33);
        org.junit.Assert.assertTrue("'" + bookingStatus37 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus37.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(room47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner54);
        org.junit.Assert.assertTrue("'" + bookingStatus57 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.EXTENDED + "'", bookingStatus57.equals(Chief_event_coordinator.Observer.BookingStatus.EXTENDED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner63);
        org.junit.Assert.assertTrue("'" + bookingStatus66 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus66.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus68 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus68.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + bookingStatus69 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus69.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + bookingStatus73 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus73.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test528");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room3 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room3.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner6 = room3.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking7 = new Chief_event_coordinator.Classes.Booking("hi!", room3);
        confirmedState0.cancel(booking7);
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room11.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner14 = room11.getIdBadgeScanner();
        int int15 = room11.getRoomid();
        room11.setBuilding("Not specified");
        int int18 = room11.getRoomid();
        Chief_event_coordinator.Classes.Booking booking19 = new Chief_event_coordinator.Classes.Booking("hi!", room11);
        User.RegisteredUser registeredUser20 = null;
        booking19.setRegisteredUser(registeredUser20);
        Chief_event_coordinator.Classes.Room room23 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room23.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner26 = room23.getIdBadgeScanner();
        int int27 = room23.getRoomid();
        room23.setCapacity((int) '#');
        boolean boolean30 = booking19.edit(room23);
        confirmedState0.markNoShow(booking19);
        java.lang.Class<?> wildcardClass32 = confirmedState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test529");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException1 = new Chief_event_coordinator.State.IllegalBookingTransitionException("Chief_event_coordinator.State.IllegalBookingTransitionException: ");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException3 = new Chief_event_coordinator.State.IllegalBookingTransitionException("Chief_event_coordinator.State.IllegalBookingTransitionException: ");
        illegalBookingTransitionException1.addSuppressed((java.lang.Throwable) illegalBookingTransitionException3);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test530");
        Chief_event_coordinator.State.CheckedInState checkedInState0 = new Chief_event_coordinator.State.CheckedInState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = checkedInState0.getStatus();
        Chief_event_coordinator.State.ConfirmedState confirmedState2 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room5.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner8 = room5.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking9 = new Chief_event_coordinator.Classes.Booking("hi!", room5);
        confirmedState2.cancel(booking9);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus11 = confirmedState2.getStatus();
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) (short) 10);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor15 = room14.getOccupancySensor();
        Chief_event_coordinator.Classes.Booking booking16 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", room14);
        confirmedState2.checkIn(booking16);
        Chief_event_coordinator.State.ExtendedState extendedState18 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room21 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room21.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner24 = room21.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking25 = new Chief_event_coordinator.Classes.Booking("hi!", room21);
        extendedState18.extend(booking25);
        java.lang.String str27 = booking25.getBookingid();
        confirmedState2.cancel(booking25);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus29 = confirmedState2.getStatus();
        User.RegisteredUser registeredUser31 = null;
        Chief_event_coordinator.Classes.Room room33 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room33.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner36 = room33.getIdBadgeScanner();
        int int37 = room33.getCapacity();
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor38 = room33.getOccupancySensor();
        Chief_event_coordinator.Classes.Booking booking39 = new Chief_event_coordinator.Classes.Booking("hi!", registeredUser31, room33);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus40 = booking39.getStatus();
        confirmedState2.checkIn(booking39);
        Chief_event_coordinator.State.ConfirmedState confirmedState42 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room45 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room45.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner48 = room45.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking49 = new Chief_event_coordinator.Classes.Booking("hi!", room45);
        confirmedState42.cancel(booking49);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus51 = confirmedState42.getStatus();
        Chief_event_coordinator.Classes.Room room54 = new Chief_event_coordinator.Classes.Room((int) (short) 10);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor55 = room54.getOccupancySensor();
        Chief_event_coordinator.Classes.Booking booking56 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", room54);
        confirmedState42.checkIn(booking56);
        Chief_event_coordinator.State.ExtendedState extendedState58 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room61 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room61.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner64 = room61.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking65 = new Chief_event_coordinator.Classes.Booking("hi!", room61);
        extendedState58.extend(booking65);
        java.lang.String str67 = booking65.getBookingid();
        confirmedState42.cancel(booking65);
        Chief_event_coordinator.State.ConfirmedState confirmedState69 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room72 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room72.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner75 = room72.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking76 = new Chief_event_coordinator.Classes.Booking("hi!", room72);
        confirmedState69.cancel(booking76);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus78 = confirmedState69.getStatus();
        booking65.setStatus(bookingStatus78);
        confirmedState2.cancel(booking65);
        // The following exception was thrown during execution in test generation
        try {
            checkedInState0.confirmDeposit(booking65);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot confirm deposit a booking in state CHECKED_IN.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner8);
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus11.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + bookingStatus29 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus29.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor38);
        org.junit.Assert.assertTrue("'" + bookingStatus40 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus40.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner48);
        org.junit.Assert.assertTrue("'" + bookingStatus51 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus51.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "hi!" + "'", str67.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner75);
        org.junit.Assert.assertTrue("'" + bookingStatus78 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus78.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test531");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.State.ExtendedState extendedState1 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room4.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room4.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking8 = new Chief_event_coordinator.Classes.Booking("hi!", room4);
        extendedState1.extend(booking8);
        java.lang.String str10 = booking8.getBookingid();
        extendedState0.extend(booking8);
        booking8.extend();
        // The following exception was thrown during execution in test generation
        try {
            booking8.markNoShow();
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot mark no-show a booking in state EXTENDED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test532");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.State.ExtendedState extendedState1 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room4.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room4.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking8 = new Chief_event_coordinator.Classes.Booking("hi!", room4);
        extendedState1.extend(booking8);
        java.lang.String str10 = booking8.getBookingid();
        extendedState0.extend(booking8);
        Chief_event_coordinator.State.ConfirmedState confirmedState12 = new Chief_event_coordinator.State.ConfirmedState();
        User.RegisteredUser registeredUser14 = null;
        Chief_event_coordinator.Classes.Room room17 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room17.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner20 = room17.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking21 = new Chief_event_coordinator.Classes.Booking("hi!", room17);
        Chief_event_coordinator.Classes.Booking booking22 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", registeredUser14, room17);
        confirmedState12.checkIn(booking22);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus24 = booking22.getStatus();
        Chief_event_coordinator.State.ConfirmedState confirmedState25 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room28 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room28.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner31 = room28.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking32 = new Chief_event_coordinator.Classes.Booking("hi!", room28);
        confirmedState25.cancel(booking32);
        Chief_event_coordinator.State.CancelledState cancelledState34 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus35 = cancelledState34.getStatus();
        booking32.changeState((Chief_event_coordinator.State.BookingState) cancelledState34);
        Chief_event_coordinator.Classes.Room room39 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room39.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner42 = room39.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking43 = new Chief_event_coordinator.Classes.Booking("hi!", room39);
        booking32.setRoomName(room39);
        java.lang.String str45 = booking32.getBookingid();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus46 = booking32.getStatus();
        booking22.setStatus(bookingStatus46);
        java.lang.String str48 = booking22.getBookingid();
        extendedState0.extend(booking22);
        Chief_event_coordinator.Observer.BookingObserver bookingObserver50 = null;
        booking22.addObserver(bookingObserver50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner20);
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus24.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner31);
        org.junit.Assert.assertTrue("'" + bookingStatus35 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus35.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertTrue("'" + bookingStatus46 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus46.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Chief_event_coordinator.State.IllegalBookingTransitionException: hi!" + "'", str48.equals("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!"));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test533");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room3 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room3.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner6 = room3.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking7 = new Chief_event_coordinator.Classes.Booking("hi!", room3);
        extendedState0.extend(booking7);
        Chief_event_coordinator.State.ConfirmedState confirmedState9 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room12 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room12.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner15 = room12.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking16 = new Chief_event_coordinator.Classes.Booking("hi!", room12);
        confirmedState9.cancel(booking16);
        Chief_event_coordinator.State.CancelledState cancelledState18 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus19 = cancelledState18.getStatus();
        booking16.changeState((Chief_event_coordinator.State.BookingState) cancelledState18);
        User.RegisteredUser registeredUser21 = null;
        booking16.setRegisteredUser(registeredUser21);
        extendedState0.extend(booking16);
        Chief_event_coordinator.State.ConfirmedState confirmedState24 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room27 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room27.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner30 = room27.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking31 = new Chief_event_coordinator.Classes.Booking("hi!", room27);
        confirmedState24.cancel(booking31);
        extendedState0.extend(booking31);
        Chief_event_coordinator.State.ConfirmedState confirmedState34 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room37 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room37.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner40 = room37.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking41 = new Chief_event_coordinator.Classes.Booking("hi!", room37);
        confirmedState34.cancel(booking41);
        Chief_event_coordinator.State.CancelledState cancelledState43 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus44 = cancelledState43.getStatus();
        booking41.changeState((Chief_event_coordinator.State.BookingState) cancelledState43);
        boolean boolean46 = booking41.cancel();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus47 = booking41.getStatus();
        Chief_event_coordinator.State.BookingState bookingState48 = Chief_event_coordinator.State.BookingStateFactory.fromStatus(bookingStatus47);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus49 = null;
        booking31.notifyObservers(bookingStatus47, bookingStatus49);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = booking31.cancel();
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot cancel a booking in state EXTENDED.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner15);
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus19.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner40);
        org.junit.Assert.assertTrue("'" + bookingStatus44 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus44.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + bookingStatus47 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus47.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingState48);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test534");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room1.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner4 = room1.getIdBadgeScanner();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner5 = room1.getIdBadgeScanner();
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room1.getOccupancySensor();
        java.lang.String str7 = room1.getClosureReason();
        java.lang.String str8 = room1.getRoomLocation();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner9 = room1.getIdBadgeScanner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Not specified" + "'", str8.equals("Not specified"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner9);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test535");
        Chief_event_coordinator.State.ExtendedState extendedState0 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.State.ExtendedState extendedState1 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room4 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room4.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner7 = room4.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking8 = new Chief_event_coordinator.Classes.Booking("hi!", room4);
        extendedState1.extend(booking8);
        java.lang.String str10 = booking8.getBookingid();
        extendedState0.extend(booking8);
        Chief_event_coordinator.State.ConfirmedState confirmedState12 = new Chief_event_coordinator.State.ConfirmedState();
        User.RegisteredUser registeredUser14 = null;
        Chief_event_coordinator.Classes.Room room17 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room17.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner20 = room17.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking21 = new Chief_event_coordinator.Classes.Booking("hi!", room17);
        Chief_event_coordinator.Classes.Booking booking22 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", registeredUser14, room17);
        confirmedState12.checkIn(booking22);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus24 = booking22.getStatus();
        Chief_event_coordinator.State.ConfirmedState confirmedState25 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room28 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room28.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner31 = room28.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking32 = new Chief_event_coordinator.Classes.Booking("hi!", room28);
        confirmedState25.cancel(booking32);
        Chief_event_coordinator.State.CancelledState cancelledState34 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus35 = cancelledState34.getStatus();
        booking32.changeState((Chief_event_coordinator.State.BookingState) cancelledState34);
        Chief_event_coordinator.Classes.Room room39 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room39.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner42 = room39.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking43 = new Chief_event_coordinator.Classes.Booking("hi!", room39);
        booking32.setRoomName(room39);
        java.lang.String str45 = booking32.getBookingid();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus46 = booking32.getStatus();
        booking22.setStatus(bookingStatus46);
        java.lang.String str48 = booking22.getBookingid();
        extendedState0.extend(booking22);
        Chief_event_coordinator.Observer.BookingObserver bookingObserver50 = null;
        booking22.removeObserver(bookingObserver50);
        Chief_event_coordinator.State.ConfirmedState confirmedState52 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room55 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room55.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner58 = room55.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking59 = new Chief_event_coordinator.Classes.Booking("hi!", room55);
        confirmedState52.cancel(booking59);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus61 = confirmedState52.getStatus();
        Chief_event_coordinator.State.BookingState bookingState62 = Chief_event_coordinator.State.BookingStateFactory.fromStatus(bookingStatus61);
        booking22.setStatus(bookingStatus61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner20);
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN + "'", bookingStatus24.equals(Chief_event_coordinator.Observer.BookingStatus.CHECKED_IN));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner31);
        org.junit.Assert.assertTrue("'" + bookingStatus35 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus35.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        org.junit.Assert.assertTrue("'" + bookingStatus46 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus46.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Chief_event_coordinator.State.IllegalBookingTransitionException: hi!" + "'", str48.equals("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner58);
        org.junit.Assert.assertTrue("'" + bookingStatus61 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus61.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingState62);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test536");
        Chief_event_coordinator.State.PendingState pendingState0 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = pendingState0.getStatus();
        Chief_event_coordinator.State.ExtendedState extendedState2 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room5.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner8 = room5.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking9 = new Chief_event_coordinator.Classes.Booking("hi!", room5);
        extendedState2.extend(booking9);
        pendingState0.confirmDeposit(booking9);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus12 = pendingState0.getStatus();
        Chief_event_coordinator.State.ConfirmedState confirmedState13 = new Chief_event_coordinator.State.ConfirmedState();
        User.RegisteredUser registeredUser15 = null;
        Chief_event_coordinator.Classes.Room room18 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room18.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner21 = room18.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking22 = new Chief_event_coordinator.Classes.Booking("hi!", room18);
        Chief_event_coordinator.Classes.Booking booking23 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", registeredUser15, room18);
        confirmedState13.checkIn(booking23);
        Chief_event_coordinator.Observer.BookingObserver bookingObserver25 = null;
        booking23.removeObserver(bookingObserver25);
        pendingState0.cancel(booking23);
        Chief_event_coordinator.State.ConfirmedState confirmedState28 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room31 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room31.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner34 = room31.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking35 = new Chief_event_coordinator.Classes.Booking("hi!", room31);
        confirmedState28.cancel(booking35);
        Chief_event_coordinator.Classes.Room room39 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room39.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner42 = room39.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking43 = new Chief_event_coordinator.Classes.Booking("hi!", room39);
        Chief_event_coordinator.Classes.Room room45 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room45.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner48 = room45.getIdBadgeScanner();
        booking43.setRoomName(room45);
        confirmedState28.checkIn(booking43);
        Chief_event_coordinator.State.ConfirmedState confirmedState51 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room54 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room54.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner57 = room54.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking58 = new Chief_event_coordinator.Classes.Booking("hi!", room54);
        confirmedState51.cancel(booking58);
        boolean boolean61 = booking58.extend((float) 1);
        Chief_event_coordinator.Observer.BookingObserver bookingObserver62 = null;
        booking58.removeObserver(bookingObserver62);
        confirmedState28.cancel(booking58);
        booking58.edit();
        booking58.setBookingid("Chief_event_coordinator.State.IllegalBookingTransitionException: ");
        // The following exception was thrown during execution in test generation
        try {
            pendingState0.markNoShow(booking58);
            org.junit.Assert.fail("Expected exception of type Chief_event_coordinator.State.IllegalBookingTransitionException; message: Cannot mark no-show a booking in state PENDING.");
        } catch (Chief_event_coordinator.State.IllegalBookingTransitionException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner8);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus12.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test537");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        User.RegisteredUser registeredUser2 = null;
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room5.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner8 = room5.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking9 = new Chief_event_coordinator.Classes.Booking("hi!", room5);
        Chief_event_coordinator.Classes.Booking booking10 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", registeredUser2, room5);
        confirmedState0.checkIn(booking10);
        Chief_event_coordinator.Classes.Room room14 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room14.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner17 = room14.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking18 = new Chief_event_coordinator.Classes.Booking("hi!", room14);
        confirmedState0.cancel(booking18);
        Chief_event_coordinator.Classes.Room room20 = booking18.getRoomName();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus21 = booking18.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(room20);
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus21.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test538");
        Chief_event_coordinator.Classes.Room room3 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room3.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner6 = room3.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking7 = new Chief_event_coordinator.Classes.Booking("hi!", room3);
        Chief_event_coordinator.State.ConfirmedState confirmedState8 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus9 = confirmedState8.getStatus();
        Chief_event_coordinator.State.NoShowState noShowState10 = new Chief_event_coordinator.State.NoShowState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus11 = noShowState10.getStatus();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus12 = noShowState10.getStatus();
        booking7.notifyObservers(bookingStatus9, bookingStatus12);
        Chief_event_coordinator.Observer.BookingObserver bookingObserver14 = null;
        booking7.addObserver(bookingObserver14);
        booking7.edit();
        Chief_event_coordinator.Classes.Room room17 = booking7.getRoomName();
        int int18 = room17.getCapacity();
        Chief_event_coordinator.Classes.Booking booking19 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: ", room17);
        int int20 = room17.getRoomid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner6);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus9.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus11.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus12.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(room17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test539");
        Chief_event_coordinator.State.ConfirmedState confirmedState0 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room3 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room3.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner6 = room3.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking7 = new Chief_event_coordinator.Classes.Booking("hi!", room3);
        confirmedState0.cancel(booking7);
        Chief_event_coordinator.Classes.Room room11 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room11.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner14 = room11.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking15 = new Chief_event_coordinator.Classes.Booking("hi!", room11);
        Chief_event_coordinator.Classes.Room room17 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room17.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner20 = room17.getIdBadgeScanner();
        booking15.setRoomName(room17);
        confirmedState0.checkIn(booking15);
        Chief_event_coordinator.State.ConfirmedState confirmedState23 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room26 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room26.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner29 = room26.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking30 = new Chief_event_coordinator.Classes.Booking("hi!", room26);
        confirmedState23.cancel(booking30);
        boolean boolean33 = booking30.extend((float) 1);
        Chief_event_coordinator.Observer.BookingObserver bookingObserver34 = null;
        booking30.removeObserver(bookingObserver34);
        confirmedState0.cancel(booking30);
        Chief_event_coordinator.State.ConfirmedState confirmedState37 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.State.ConfirmedState confirmedState38 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room41 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room41.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner44 = room41.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking45 = new Chief_event_coordinator.Classes.Booking("hi!", room41);
        confirmedState38.cancel(booking45);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus47 = confirmedState38.getStatus();
        Chief_event_coordinator.Classes.Room room50 = new Chief_event_coordinator.Classes.Room((int) (short) 10);
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor51 = room50.getOccupancySensor();
        Chief_event_coordinator.Classes.Booking booking52 = new Chief_event_coordinator.Classes.Booking("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!", room50);
        confirmedState38.checkIn(booking52);
        confirmedState37.markNoShow(booking52);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus55 = booking52.getStatus();
        confirmedState0.markNoShow(booking52);
        Chief_event_coordinator.State.ConfirmedState confirmedState57 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus58 = confirmedState57.getStatus();
        Chief_event_coordinator.Classes.Room room61 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room61.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner64 = room61.getIdBadgeScanner();
        int int65 = room61.getRoomid();
        room61.setBuilding("Not specified");
        int int68 = room61.getRoomid();
        Chief_event_coordinator.Classes.Booking booking69 = new Chief_event_coordinator.Classes.Booking("hi!", room61);
        User.RegisteredUser registeredUser70 = null;
        booking69.setRegisteredUser(registeredUser70);
        confirmedState57.checkIn(booking69);
        booking69.extend();
        Chief_event_coordinator.Classes.Room room76 = new Chief_event_coordinator.Classes.Room((int) 'a');
        Chief_event_coordinator.Classes.Booking booking77 = new Chief_event_coordinator.Classes.Booking("hi!", room76);
        room76.setBuilding("Not specified");
        boolean boolean80 = booking69.edit(room76);
        confirmedState0.markNoShow(booking69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner44);
        org.junit.Assert.assertTrue("'" + bookingStatus47 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus47.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor51);
        org.junit.Assert.assertTrue("'" + bookingStatus55 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus55.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + bookingStatus58 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CONFIRMED + "'", bookingStatus58.equals(Chief_event_coordinator.Observer.BookingStatus.CONFIRMED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 97 + "'", int65 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 97 + "'", int68 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test540");
        Chief_event_coordinator.State.PendingState pendingState0 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus1 = pendingState0.getStatus();
        Chief_event_coordinator.State.ExtendedState extendedState2 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room5 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room5.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner8 = room5.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking9 = new Chief_event_coordinator.Classes.Booking("hi!", room5);
        extendedState2.extend(booking9);
        pendingState0.confirmDeposit(booking9);
        Chief_event_coordinator.Observer.BookingStatus bookingStatus12 = pendingState0.getStatus();
        Chief_event_coordinator.State.ConfirmedState confirmedState13 = new Chief_event_coordinator.State.ConfirmedState();
        Chief_event_coordinator.Classes.Room room16 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room16.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner19 = room16.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking20 = new Chief_event_coordinator.Classes.Booking("hi!", room16);
        confirmedState13.cancel(booking20);
        Chief_event_coordinator.State.CancelledState cancelledState22 = new Chief_event_coordinator.State.CancelledState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus23 = cancelledState22.getStatus();
        booking20.changeState((Chief_event_coordinator.State.BookingState) cancelledState22);
        boolean boolean25 = booking20.cancel();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus26 = booking20.getStatus();
        Chief_event_coordinator.State.NoShowState noShowState27 = new Chief_event_coordinator.State.NoShowState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus28 = noShowState27.getStatus();
        booking20.changeState((Chief_event_coordinator.State.BookingState) noShowState27);
        pendingState0.confirmDeposit(booking20);
        Chief_event_coordinator.State.PendingState pendingState31 = new Chief_event_coordinator.State.PendingState();
        Chief_event_coordinator.Observer.BookingStatus bookingStatus32 = pendingState31.getStatus();
        Chief_event_coordinator.State.ExtendedState extendedState33 = new Chief_event_coordinator.State.ExtendedState();
        Chief_event_coordinator.Classes.Room room36 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room36.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner39 = room36.getIdBadgeScanner();
        Chief_event_coordinator.Classes.Booking booking40 = new Chief_event_coordinator.Classes.Booking("hi!", room36);
        extendedState33.extend(booking40);
        pendingState31.confirmDeposit(booking40);
        booking40.markNoShow();
        Chief_event_coordinator.Observer.BookingObserver bookingObserver44 = null;
        booking40.removeObserver(bookingObserver44);
        pendingState0.cancel(booking40);
        org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus1.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner8);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus12.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner19);
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus23.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.CANCELLED + "'", bookingStatus26.equals(Chief_event_coordinator.Observer.BookingStatus.CANCELLED));
        org.junit.Assert.assertTrue("'" + bookingStatus28 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.NO_SHOW + "'", bookingStatus28.equals(Chief_event_coordinator.Observer.BookingStatus.NO_SHOW));
        org.junit.Assert.assertTrue("'" + bookingStatus32 + "' != '" + Chief_event_coordinator.Observer.BookingStatus.PENDING + "'", bookingStatus32.equals(Chief_event_coordinator.Observer.BookingStatus.PENDING));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner39);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test541");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException1 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException3 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        illegalBookingTransitionException1.addSuppressed((java.lang.Throwable) illegalBookingTransitionException3);
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException6 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException8 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        illegalBookingTransitionException6.addSuppressed((java.lang.Throwable) illegalBookingTransitionException8);
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException11 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException13 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        illegalBookingTransitionException11.addSuppressed((java.lang.Throwable) illegalBookingTransitionException13);
        illegalBookingTransitionException6.addSuppressed((java.lang.Throwable) illegalBookingTransitionException11);
        illegalBookingTransitionException3.addSuppressed((java.lang.Throwable) illegalBookingTransitionException11);
        java.lang.Throwable[] throwableArray17 = illegalBookingTransitionException3.getSuppressed();
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException19 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException21 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        illegalBookingTransitionException19.addSuppressed((java.lang.Throwable) illegalBookingTransitionException21);
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException24 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException26 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        illegalBookingTransitionException24.addSuppressed((java.lang.Throwable) illegalBookingTransitionException26);
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException29 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException31 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        illegalBookingTransitionException29.addSuppressed((java.lang.Throwable) illegalBookingTransitionException31);
        illegalBookingTransitionException24.addSuppressed((java.lang.Throwable) illegalBookingTransitionException29);
        illegalBookingTransitionException21.addSuppressed((java.lang.Throwable) illegalBookingTransitionException29);
        java.lang.Throwable[] throwableArray35 = illegalBookingTransitionException21.getSuppressed();
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException37 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException39 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        illegalBookingTransitionException37.addSuppressed((java.lang.Throwable) illegalBookingTransitionException39);
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException42 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException44 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        illegalBookingTransitionException42.addSuppressed((java.lang.Throwable) illegalBookingTransitionException44);
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException47 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        Chief_event_coordinator.State.IllegalBookingTransitionException illegalBookingTransitionException49 = new Chief_event_coordinator.State.IllegalBookingTransitionException("hi!");
        illegalBookingTransitionException47.addSuppressed((java.lang.Throwable) illegalBookingTransitionException49);
        illegalBookingTransitionException42.addSuppressed((java.lang.Throwable) illegalBookingTransitionException47);
        illegalBookingTransitionException39.addSuppressed((java.lang.Throwable) illegalBookingTransitionException47);
        java.lang.Throwable[] throwableArray53 = illegalBookingTransitionException39.getSuppressed();
        illegalBookingTransitionException21.addSuppressed((java.lang.Throwable) illegalBookingTransitionException39);
        illegalBookingTransitionException3.addSuppressed((java.lang.Throwable) illegalBookingTransitionException39);
        java.lang.String str56 = illegalBookingTransitionException39.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(throwableArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "Chief_event_coordinator.State.IllegalBookingTransitionException: hi!" + "'", str56.equals("Chief_event_coordinator.State.IllegalBookingTransitionException: hi!"));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StateRegressionTest1.test542");
        Chief_event_coordinator.Classes.Room room1 = new Chief_event_coordinator.Classes.Room((int) 'a');
        room1.setBuilding("hi!");
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner4 = room1.getIdBadgeScanner();
        Chief_event_coordinator.Classes.IdBadgeScanner idBadgeScanner5 = room1.getIdBadgeScanner();
        Chief_event_coordinator.Classes.OccupancySensor occupancySensor6 = room1.getOccupancySensor();
        java.lang.String str7 = room1.getClosureReason();
        int int8 = room1.getRoomid();
        int int9 = room1.getRoomid();
        int int10 = room1.getCapacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(idBadgeScanner5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(occupancySensor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }
}

