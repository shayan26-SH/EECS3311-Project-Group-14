package Chief_event_coordinator.Classes;

import java.util.HashMap;

public class Administrator {

	private String name;
	private String email;
	private HashMap<Integer, Room> rooms = new HashMap<>();

	public Administrator(String name, String email) {
		this.name = name;
		this.email = email;
	}

	/**
	 * @return String return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return String return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public void addRoom(Room room) {
		rooms.put(room.getRoomid(), room);
		System.out.println("Room " + room.getRoomid() + "Addeed");
	}

	public void closeRoom(Room room) {
		room.setStatus("Closed");
		System.out.println("Room " + room.getRoomid() + "Closed");
	}

	public void enableRoom(Room room) {
		room.setStatus("Enable");
		System.out.println("Room " + room.getRoomid() + "Enable");
	}

	public void disableRoom(Room room) {
		room.setStatus("Disable");
		System.out.println("Room " + room.getRoomid() + "Disable");

	}

	public void viewRoomStatus(Room room) {
		System.out.println("Room: " + room.getRoomid() + "Status: " + room.getStatus());
	}

	public HashMap<Integer, Booking> viewBookings() {
		System.out.println("Viewing all bookings");
		return new HashMap<>();
	}
}
