package Chief_event_coordinator.Classes;

public class Booking {
	private String bookingid;
	private Room roomName;

	public Booking(String bookingid, Room roomName) {
		this.bookingid = bookingid;
		this.roomName = roomName;
	}

	/**
	 * @return the bookingid
	 */
	public String getBookingid() {
		return bookingid;
	}

	/**
	 * @param bookingid the bookingid to set
	 */
	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}

	/**
	 * @return the roomName
	 */
	public Room getRoomName() {
		return roomName;
	}

	/**
	 * @param roomName the roomName to set
	 */
	public void setRoomName(Room roomName) {
		this.roomName = roomName;
	}

}
