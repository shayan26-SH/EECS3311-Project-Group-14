# Observer Pattern - Tazwar's D2 Scope

## Files
- `Chief_event_coordinator/src/Chief_event_coordinator/Observer/` — new package: BookingStatus, BookingObserver, BookingSubject, Payment (placeholder), StubPayment (placeholder), PaymentNotificationObserver, RoomAvailabilityObserver, UserNotificationObserver, AdminDashboardObserver
- `Chief_event_coordinator/src/Chief_event_coordinator/Classes/Booking.java` — filled in (was empty), implements BookingSubject
- `Chief_event_coordinator/src/Chief_event_coordinator/Classes/Room.java` — extended with RoomStatus field (additive, old constructor/getters still work)
- `Chief_event_coordinator/src/Chief_event_coordinator/Classes/RoomStatus.java` — new
- `Chief_event_coordinator/src/Chief_event_coordinator/Classes/Administrator.java` — stub methods (addRoom/enableRoom/disableRoom/closeRoom/viewRoomStatus/viewBookings) implemented
- `Chief_event_coordinator/src/Chief_event_coordinator/Persistence/` — BookingCSVManager, RoomCSVManager (CSV "database", same CsvReader/CsvWriter style as csv-example)
- `Chief_event_coordinator/src/Chief_event_coordinator/Demo/ObserverPatternDemo.java` — runnable end-to-end demo (usable for the demo video)
- `data/rooms.csv`, `data/bookings.csv` — sample data
- `lib/javacsv.jar` — same CSV dependency used in csv-example

## BUILD FLAG FOR TEAM
main branch has an empty `module-info.java` and .classpath targets a Java module
(JavaSE-25). Adding javacsv.jar as a classpath dependency will not compile under
the module system without either deleting module-info.java (recommended, matches
csv-example's plain-classpath setup) or adding `requires javacsv;`. Did not change
this myself since it's a shared build-config decision — flagging for discussion.

## Integration seams for teammates
- `BookingStatus` enum: if Jasveer's State pattern implements booking lifecycle
  as State classes, keep this enum as the single shared status vocabulary rather
  than duplicating it.
- `Payment` interface + `StubPayment`: placeholder until Shayan's Factory Method
  produces real Payment classes (CreditCardPayment/DebitCardPayment/
  InstitutionalBillingPayment). Swap StubPayment for real ones, or make Shayan's
  classes implement this interface.
- `RoomAvailabilityObserver` and `AdminDashboardObserver` are natural attachment
  points for Tara's Command pattern (EnableRoomCommand, DisableRoomCommand, etc.)
  if those commands call the same Administrator methods.
