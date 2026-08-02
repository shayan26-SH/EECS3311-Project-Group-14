package Test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/**
 * Runs the complete JUnit 5 test suite for the conference-room scheduler.
 *
 * The selected test classes cover the core domain model, abstract factory,
 * command, state, observer, facade, strategy, persistence, demo, and GUI code.
 */
@Suite
@SelectClasses({
  CoreDomainTest.class,
  ChiefEventCoordinatorTest.class,
  CommandPatternTest.class,
  BookingStateObserverTest.class,
  PaymentStrategyTest.class,
  PersistenceTest.class,
  DemoAndGuiSmokeTest.class,
  RoomSchedulerGUITest.class,
  AbstractBookingStateTest.class,
})
public class AllTest {
	
}
