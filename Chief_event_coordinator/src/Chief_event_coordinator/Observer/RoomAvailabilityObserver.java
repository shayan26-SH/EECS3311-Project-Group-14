package Chief_event_coordinator.Observer;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Classes.RoomStatus;

/**
 * RoomAvailabilityObserver
 *
 * Concrete Observer. Keeps a Room's availability in sync with its
 * bookings, satisfying the Administrator's "View/manage room
 * availability" use case (Req6, Req7) without the Administrator
 * having to poll every booking manually.
 *
 *   - CONFIRMED / CHECKED_IN -> room marked OCCUPIED
 *   - CANCELLED / NO_SHOW    -> room marked AVAILABLE (if not disabled/maintenance)
 */
public class RoomAvailabilityObserver implements BookingObserver {

    private final Room room;

    public RoomAvailabilityObserver(Room room) {
        this.room = room;
    }

    @Override
    public void onBookingStatusChanged(Booking booking, BookingStatus oldStatus, BookingStatus newStatus) {
        if (room.getRoomid() != booking.getRoomId()) {
            return; // this observer only cares about its own room
        }

        switch (newStatus) {
            case CONFIRMED:
            case CHECKED_IN:
                if (room.getStatus() == RoomStatus.AVAILABLE) {
                    room.setStatus(RoomStatus.OCCUPIED);
                }
                break;
            case CANCELLED:
            case NO_SHOW:
                if (room.getStatus() == RoomStatus.OCCUPIED) {
                    room.setStatus(RoomStatus.AVAILABLE);
                }
                break;
            default:
                break;
        }

        System.out.println("[RoomAvailability] Room " + room.getRoomid()
                + " status is now " + room.getStatus());
    }
}
