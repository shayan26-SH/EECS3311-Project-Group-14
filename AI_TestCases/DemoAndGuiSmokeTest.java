package AI_TestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import Demo.RoomAvailableGUI;
import Demo.RoomSchedulerGUI;
import java.awt.GraphicsEnvironment;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.junit.jupiter.api.Test;

public class DemoAndGuiSmokeTest {

  @Test
  void statePatternDemoRunsAllOfItsExamples() {
    String output = captureOutput(() ->
      Chief_event_coordinator.Demo.StatePatternDemo.main(new String[0])
    );
    assertTrue(output.contains("state EXTENDED"));
    assertTrue(output.contains("state CANCELLED"));
    assertTrue(output.contains("state NO_SHOW"));
    assertTrue(output.contains("Blocked:"));
    assertFalse(output.contains("[BUG]"));
  }

  @Test
  void observerDemoAndTopLevelWrapperRunWithoutChangingFixtureFiles()
    throws Exception {
    Path rooms = Path.of("Chief_event_coordinator", "data", "rooms.csv");
    Path bookings = Path.of(
      "Chief_event_coordinator",
      "data",
      "bookings.csv"
    );
    if (!Files.exists(rooms) || !Files.exists(bookings)) {
      return;
    }

    byte[] originalRooms = Files.readAllBytes(rooms);
    byte[] originalBookings = Files.readAllBytes(bookings);
    try {
      String directOutput = captureCheckedOutput(() ->
        Chief_event_coordinator.Demo.ObserverPatternDemo.main(new String[0])
      );
      assertTrue(directOutput.contains("Initial state"));
      assertTrue(directOutput.contains("Persist changes back to CSV"));

      String wrapperOutput = captureCheckedOutput(() ->
        Demo.ObserverPatternDemo.main(new String[0])
      );
      assertTrue(wrapperOutput.contains("Saved."));
    } finally {
      Files.write(rooms, originalRooms);
      Files.write(bookings, originalBookings);
    }
  }

  @Test
  void guiPureHelpersCoverFormattingAndRateBranches() throws Exception {
    assertEquals(
      90,
      invokeStatic(
        "minutesBetween",
        new Class<?>[] { LocalTime.class, LocalTime.class },
        LocalTime.of(9, 15),
        LocalTime.of(10, 45)
      )
    );
    assertEquals(
      "student@yorku.ca",
      invokeStatic(
        "normalizeEmail",
        new Class<?>[] { String.class },
        "  Student@YorkU.CA "
      )
    );
    assertEquals(
      "",
      invokeStatic(
        "normalizeEmail",
        new Class<?>[] { String.class },
        new Object[] { null }
      )
    );
    assertEquals(
      "room/101 line two",
      invokeStatic(
        "safe",
        new Class<?>[] { String.class },
        "room|101\nline two"
      )
    );
    assertEquals(
      "",
      invokeStatic("safe", new Class<?>[] { String.class }, new Object[] { null })
    );
    assertEquals(20.0f, hourlyRate("Faculty"));
    assertEquals(15.0f, hourlyRate("Staff"));
    assertEquals(35.0f, hourlyRate("Partner"));
    assertEquals(25.0f, hourlyRate("Student"));
  }

  @Test
  void guiWindowsBuildAndDisposeWhenADisplayIsAvailable() throws Exception {
    if (GraphicsEnvironment.isHeadless()) {
      return;
    }

    JFrame[] windows = new JFrame[2];
    SwingUtilities.invokeAndWait(() -> {
      windows[0] = new RoomAvailableGUI();
      windows[1] = new RoomSchedulerGUI();
    });
    try {
      assertEquals("YorkU Conference Room Scheduler", windows[0].getTitle());
      assertEquals("YorkU Conference Room Scheduler", windows[1].getTitle());
      assertTrue(windows[0].getContentPane().getComponentCount() >= 3);
      assertTrue(windows[1].getContentPane().getComponentCount() >= 3);
    } finally {
      SwingUtilities.invokeAndWait(() -> {
        windows[0].dispose();
        windows[1].dispose();
      });
    }
  }

  private static float hourlyRate(String type) throws Exception {
    return (Float) invokeStatic(
      "hourlyRateFor",
      new Class<?>[] { String.class },
      type
    );
  }

  private static Object invokeStatic(
    String methodName,
    Class<?>[] parameterTypes,
    Object... arguments
  ) throws Exception {
    Method method = RoomSchedulerGUI.class.getDeclaredMethod(
      methodName,
      parameterTypes
    );
    method.setAccessible(true);
    return method.invoke(null, arguments);
  }

  private interface CheckedAction {
    void run() throws Exception;
  }

  private static String captureCheckedOutput(CheckedAction action)
    throws Exception {
    PrintStream original = System.out;
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    try {
      System.setOut(new PrintStream(output));
      action.run();
      return output.toString();
    } finally {
      System.setOut(original);
    }
  }

  private static String captureOutput(Runnable action) {
    try {
      return captureCheckedOutput(action::run);
    } catch (Exception exception) {
      throw new AssertionError(exception);
    }
  }
}