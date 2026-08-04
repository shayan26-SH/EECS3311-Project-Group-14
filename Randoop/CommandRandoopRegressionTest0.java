package Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CommandRandoopRegressionTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test01");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Classes.Room room1 = null;
        Chief_event_coordinator.Command.AddRoomCommand addRoomCommand2 = new Chief_event_coordinator.Command.AddRoomCommand(administrator0, room1);
        // The following exception was thrown during execution in test generation
        try {
            addRoomCommand2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Administrator.addRoom(Chief_event_coordinator.Classes.Room)\" because \"this.administrator\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test02");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Classes.Room room1 = null;
        Chief_event_coordinator.Command.AddRoomCommand addRoomCommand2 = new Chief_event_coordinator.Command.AddRoomCommand(administrator0, room1);
        // The following exception was thrown during execution in test generation
        try {
            addRoomCommand2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Administrator.addRoom(Chief_event_coordinator.Classes.Room)\" because \"this.administrator\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test03");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Classes.Room room1 = null;
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand2 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator0, room1);
        java.lang.Class<?> wildcardClass3 = disableRoomCommand2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test04");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Classes.Room room1 = null;
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand2 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator0, room1);
        // The following exception was thrown during execution in test generation
        try {
            disableRoomCommand2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Administrator.disableRoom(Chief_event_coordinator.Classes.Room)\" because \"this.administrator\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test05");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Room room1 = null;
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand2 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser0, room1);
        // The following exception was thrown during execution in test generation
        try {
            bookRoomCommand2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.bookRoom(Chief_event_coordinator.Classes.Room)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test06");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ModifyBookingCommand modifyBookingCommand2 = new Chief_event_coordinator.Command.ModifyBookingCommand(registeredUser0, booking1);
        // The following exception was thrown during execution in test generation
        try {
            modifyBookingCommand2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.modifyBooking(Chief_event_coordinator.Classes.Booking)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test07");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Classes.Room room1 = null;
        Chief_event_coordinator.Command.AddRoomCommand addRoomCommand2 = new Chief_event_coordinator.Command.AddRoomCommand(administrator0, room1);
        java.lang.Class<?> wildcardClass3 = addRoomCommand2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test08");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test09");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Classes.Room room1 = null;
        Chief_event_coordinator.Command.EnableRoomCommand enableRoomCommand2 = new Chief_event_coordinator.Command.EnableRoomCommand(administrator0, room1);
        // The following exception was thrown during execution in test generation
        try {
            enableRoomCommand2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Administrator.enableRoom(Chief_event_coordinator.Classes.Room)\" because \"this.administrator\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test10");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.CancelBookingCommand cancelBookingCommand2 = new Chief_event_coordinator.Command.CancelBookingCommand(registeredUser0, booking1);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.cancelBooking(Chief_event_coordinator.Classes.Booking)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test11");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        Chief_event_coordinator.Classes.Administrator administrator1 = null;
        Chief_event_coordinator.Classes.Room room2 = null;
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand3 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator1, room2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) disableRoomCommand3);
        java.lang.Class<?> wildcardClass5 = commandInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test12");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        Chief_event_coordinator.Classes.Administrator administrator1 = null;
        Chief_event_coordinator.Classes.Room room2 = null;
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand3 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator1, room2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) disableRoomCommand3);
        // The following exception was thrown during execution in test generation
        try {
            commandInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Administrator.disableRoom(Chief_event_coordinator.Classes.Room)\" because \"this.administrator\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test13");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.CancelBookingCommand cancelBookingCommand2 = new Chief_event_coordinator.Command.CancelBookingCommand(registeredUser0, booking1);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.cancelBooking(Chief_event_coordinator.Classes.Booking)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test14");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Room room2 = null;
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand3 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser1, room2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) bookRoomCommand3);
        // The following exception was thrown during execution in test generation
        try {
            commandInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.bookRoom(Chief_event_coordinator.Classes.Room)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test15");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) 10);
        java.lang.Class<?> wildcardClass4 = extendBookingCommand3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test16");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Classes.Room room1 = null;
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand2 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator0, room1);
        // The following exception was thrown during execution in test generation
        try {
            closeRoomCommand2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Administrator.closeRoom(Chief_event_coordinator.Classes.Room)\" because \"this.administrator\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test17");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test18");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        Chief_event_coordinator.Classes.Administrator administrator1 = null;
        Chief_event_coordinator.Classes.Room room2 = null;
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand3 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator1, room2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) disableRoomCommand3);
        // The following exception was thrown during execution in test generation
        try {
            disableRoomCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Administrator.disableRoom(Chief_event_coordinator.Classes.Room)\" because \"this.administrator\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test19");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Room room2 = null;
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand3 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser1, room2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) bookRoomCommand3);
        // The following exception was thrown during execution in test generation
        try {
            bookRoomCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.bookRoom(Chief_event_coordinator.Classes.Room)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test20");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand4 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser1, booking2, (float) (byte) -1);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) extendBookingCommand4);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand4.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test21");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test22");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Classes.Room room1 = null;
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand3 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator0, room1, "");
        // The following exception was thrown during execution in test generation
        try {
            closeRoomCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Administrator.closeRoom(Chief_event_coordinator.Classes.Room, String)\" because \"this.administrator\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test23");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test24");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Classes.Room room1 = null;
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand3 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator0, room1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            closeRoomCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Administrator.closeRoom(Chief_event_coordinator.Classes.Room, String)\" because \"this.administrator\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test25");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        commandInvoker0.executeCommand();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test26");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Room room1 = null;
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand2 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser0, room1);
        java.lang.Class<?> wildcardClass3 = bookRoomCommand2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test27");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test28");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand4 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser1, booking2, (float) 100L);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) extendBookingCommand4);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand4.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test29");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test30");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Room room2 = null;
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand3 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser1, room2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) bookRoomCommand3);
        User.RegisteredUser registeredUser5 = null;
        Chief_event_coordinator.Classes.Booking booking6 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand8 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser5, booking6, (float) 10);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) extendBookingCommand8);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test31");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Command.CancelBookingCommand cancelBookingCommand3 = new Chief_event_coordinator.Command.CancelBookingCommand(registeredUser1, booking2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) cancelBookingCommand3);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.cancelBooking(Chief_event_coordinator.Classes.Booking)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test32");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) 'a');
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test33");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Room room2 = null;
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand3 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser1, room2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) bookRoomCommand3);
        java.lang.Class<?> wildcardClass5 = bookRoomCommand3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test34");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand4 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser1, booking2, (float) (byte) -1);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) extendBookingCommand4);
        // The following exception was thrown during execution in test generation
        try {
            commandInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test35");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Command.CancelBookingCommand cancelBookingCommand3 = new Chief_event_coordinator.Command.CancelBookingCommand(registeredUser1, booking2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) cancelBookingCommand3);
        Chief_event_coordinator.Command.Command command5 = null;
        commandInvoker0.setCommand(command5);
        java.lang.Class<?> wildcardClass7 = commandInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test36");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) 'a');
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test37");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) 10);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test38");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Room room2 = null;
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand3 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser1, room2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) bookRoomCommand3);
        // The following exception was thrown during execution in test generation
        try {
            bookRoomCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.bookRoom(Chief_event_coordinator.Classes.Room)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test39");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Command.CancelBookingCommand cancelBookingCommand3 = new Chief_event_coordinator.Command.CancelBookingCommand(registeredUser1, booking2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) cancelBookingCommand3);
        java.lang.Class<?> wildcardClass5 = commandInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test40");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test41");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand4 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser1, booking2, (float) 100L);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) extendBookingCommand4);
        Chief_event_coordinator.Command.CommandInvoker commandInvoker6 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser7 = null;
        Chief_event_coordinator.Classes.Room room8 = null;
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand9 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser7, room8);
        commandInvoker6.setCommand((Chief_event_coordinator.Command.Command) bookRoomCommand9);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) bookRoomCommand9);
        // The following exception was thrown during execution in test generation
        try {
            bookRoomCommand9.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.bookRoom(Chief_event_coordinator.Classes.Room)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test42");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Classes.Room room1 = null;
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand2 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator0, room1);
        // The following exception was thrown during execution in test generation
        try {
            closeRoomCommand2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Administrator.closeRoom(Chief_event_coordinator.Classes.Room)\" because \"this.administrator\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test43");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand4 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser1, booking2, (float) 100L);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) extendBookingCommand4);
        User.RegisteredUser registeredUser6 = null;
        Chief_event_coordinator.Classes.Booking booking7 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand9 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser6, booking7, (float) (short) -1);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) extendBookingCommand9);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand9.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test44");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test45");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) (-1));
        java.lang.Class<?> wildcardClass4 = extendBookingCommand3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test46");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        Chief_event_coordinator.Classes.Administrator administrator1 = null;
        Chief_event_coordinator.Classes.Room room2 = null;
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand3 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator1, room2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) disableRoomCommand3);
        Chief_event_coordinator.Command.CommandInvoker commandInvoker5 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser6 = null;
        Chief_event_coordinator.Classes.Room room7 = null;
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand8 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser6, room7);
        commandInvoker5.setCommand((Chief_event_coordinator.Command.Command) bookRoomCommand8);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) bookRoomCommand8);
        // The following exception was thrown during execution in test generation
        try {
            bookRoomCommand8.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.bookRoom(Chief_event_coordinator.Classes.Room)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test47");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand4 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser1, booking2, (float) 100L);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) extendBookingCommand4);
        Chief_event_coordinator.Command.CommandInvoker commandInvoker6 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser7 = null;
        Chief_event_coordinator.Classes.Room room8 = null;
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand9 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser7, room8);
        commandInvoker6.setCommand((Chief_event_coordinator.Command.Command) bookRoomCommand9);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) bookRoomCommand9);
        // The following exception was thrown during execution in test generation
        try {
            bookRoomCommand9.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.bookRoom(Chief_event_coordinator.Classes.Room)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test48");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        Chief_event_coordinator.Classes.Administrator administrator1 = null;
        Chief_event_coordinator.Classes.Room room2 = null;
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand3 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator1, room2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) disableRoomCommand3);
        Chief_event_coordinator.Command.CommandInvoker commandInvoker5 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser6 = null;
        Chief_event_coordinator.Classes.Room room7 = null;
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand8 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser6, room7);
        commandInvoker5.setCommand((Chief_event_coordinator.Command.Command) bookRoomCommand8);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) bookRoomCommand8);
        java.lang.Class<?> wildcardClass11 = bookRoomCommand8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test49");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) (short) 1);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test50");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) (byte) 100);
        java.lang.Class<?> wildcardClass4 = extendBookingCommand3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test51");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        Chief_event_coordinator.Classes.Administrator administrator1 = null;
        Chief_event_coordinator.Classes.Room room2 = null;
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand3 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator1, room2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) disableRoomCommand3);
        java.lang.Class<?> wildcardClass5 = disableRoomCommand3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test52");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand4 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser1, booking2, (float) 100L);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) extendBookingCommand4);
        java.lang.Class<?> wildcardClass6 = commandInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test53");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) (byte) 10);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test54");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        Chief_event_coordinator.Classes.Administrator administrator1 = null;
        Chief_event_coordinator.Classes.Room room2 = null;
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand3 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator1, room2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) disableRoomCommand3);
        Chief_event_coordinator.Command.CommandInvoker commandInvoker5 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser6 = null;
        Chief_event_coordinator.Classes.Room room7 = null;
        Chief_event_coordinator.Command.BookRoomCommand bookRoomCommand8 = new Chief_event_coordinator.Command.BookRoomCommand(registeredUser6, room7);
        commandInvoker5.setCommand((Chief_event_coordinator.Command.Command) bookRoomCommand8);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) bookRoomCommand8);
        // The following exception was thrown during execution in test generation
        try {
            bookRoomCommand8.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.bookRoom(Chief_event_coordinator.Classes.Room)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test55");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) 1L);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test56");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Classes.Room room1 = null;
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand3 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator0, room1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            closeRoomCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Chief_event_coordinator.Classes.Administrator.closeRoom(Chief_event_coordinator.Classes.Room, String)\" because \"this.administrator\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test57");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand4 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser1, booking2, (float) (byte) -1);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) extendBookingCommand4);
        Chief_event_coordinator.Command.CommandInvoker commandInvoker6 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser7 = null;
        Chief_event_coordinator.Classes.Booking booking8 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand10 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser7, booking8, (float) (byte) -1);
        commandInvoker6.setCommand((Chief_event_coordinator.Command.Command) extendBookingCommand10);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) extendBookingCommand10);
        // The following exception was thrown during execution in test generation
        try {
            commandInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test58");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) '4');
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test59");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) 0);
        java.lang.Class<?> wildcardClass4 = extendBookingCommand3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test60");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) ' ');
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test61");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Command.CancelBookingCommand cancelBookingCommand3 = new Chief_event_coordinator.Command.CancelBookingCommand(registeredUser1, booking2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) cancelBookingCommand3);
        // The following exception was thrown during execution in test generation
        try {
            commandInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.cancelBooking(Chief_event_coordinator.Classes.Booking)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test62");
        Chief_event_coordinator.Classes.Administrator administrator0 = null;
        Chief_event_coordinator.Classes.Room room1 = null;
        Chief_event_coordinator.Command.CloseRoomCommand closeRoomCommand3 = new Chief_event_coordinator.Command.CloseRoomCommand(administrator0, room1, "");
        java.lang.Class<?> wildcardClass4 = closeRoomCommand3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test63");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test64");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Command.CancelBookingCommand cancelBookingCommand3 = new Chief_event_coordinator.Command.CancelBookingCommand(registeredUser1, booking2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) cancelBookingCommand3);
        // The following exception was thrown during execution in test generation
        try {
            cancelBookingCommand3.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.cancelBooking(Chief_event_coordinator.Classes.Booking)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test65");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        Chief_event_coordinator.Classes.Administrator administrator1 = null;
        Chief_event_coordinator.Classes.Room room2 = null;
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand3 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator1, room2);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) disableRoomCommand3);
        User.RegisteredUser registeredUser5 = null;
        Chief_event_coordinator.Classes.Booking booking6 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand8 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser5, booking6, (float) 10);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) extendBookingCommand8);
        Chief_event_coordinator.Classes.Administrator administrator10 = null;
        Chief_event_coordinator.Classes.Room room11 = null;
        Chief_event_coordinator.Command.DisableRoomCommand disableRoomCommand12 = new Chief_event_coordinator.Command.DisableRoomCommand(administrator10, room11);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) disableRoomCommand12);
        java.lang.Class<?> wildcardClass14 = commandInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test66");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, 100.0f);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test67");
        Chief_event_coordinator.Command.CommandInvoker commandInvoker0 = new Chief_event_coordinator.Command.CommandInvoker();
        User.RegisteredUser registeredUser1 = null;
        Chief_event_coordinator.Classes.Booking booking2 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand4 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser1, booking2, (float) (byte) -1);
        commandInvoker0.setCommand((Chief_event_coordinator.Command.Command) extendBookingCommand4);
        // The following exception was thrown during execution in test generation
        try {
            extendBookingCommand4.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"User.RegisteredUser.extendBooking(Chief_event_coordinator.Classes.Booking, float)\" because \"this.user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CommandRandoopRegressionTest0.test68");
        User.RegisteredUser registeredUser0 = null;
        Chief_event_coordinator.Classes.Booking booking1 = null;
        Chief_event_coordinator.Command.ExtendBookingCommand extendBookingCommand3 = new Chief_event_coordinator.Command.ExtendBookingCommand(registeredUser0, booking1, 10.0f);
        java.lang.Class<?> wildcardClass4 = extendBookingCommand3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}

