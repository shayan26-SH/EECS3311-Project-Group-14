package Chief_event_coordinator.Demo;

import AccountType.AccountType;
import Chief_event_coordinator.Classes.Administrator;
import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Classes.RoomStatus;
import Chief_event_coordinator.Persistence.BookingCSVManager;
import Chief_event_coordinator.Persistence.RoomCSVManager;
import User.RegisteredUser;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class RoomAvailableGUI extends JFrame {

  private List<Room> rooms = new ArrayList<Room>();
  private List<Booking> bookings = new ArrayList<Booking>();

  private RoomCSVManager roomCSVManager = new RoomCSVManager();
  private BookingCSVManager bookingCSVManager = new BookingCSVManager();

  private Administrator admin;
  private RegisteredUser registeredUser;

  private DefaultListModel<String> roomListModel = new DefaultListModel<String>();
  private DefaultListModel<String> bookingListModel = new DefaultListModel<String>();

  private JList<String> roomList = new JList<String>(roomListModel);
  private JList<String> bookingList = new JList<String>(bookingListModel);

  private JTextField addRoomField = new JTextField();
  private JTextField extendHoursField = new JTextField();

  private String roomsPath;
  private String bookingsPath;

  public RoomAvailableGUI() {
    super("YorkU Conference Room Scheduler");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(900, 550);
    setLocationRelativeTo(null);
    setLayout(new BorderLayout(12, 12));

    roomsPath = findDataPath("rooms.csv");
    bookingsPath = findDataPath("bookings.csv");

    loadData();
    initComponents();
  }

  private void initComponents() {
    JLabel header = new JLabel(
      "Conference Room Scheduler",
      SwingConstants.CENTER
    );
    header.setFont(new Font("SansSerif", Font.BOLD, 20));
    add(header, BorderLayout.NORTH);

    JPanel centerPanel = new JPanel(new GridLayout(1, 2, 12, 12));
    centerPanel.add(createRoomPanel());
    centerPanel.add(createBookingPanel());
    add(centerPanel, BorderLayout.CENTER);

    JButton saveButton = new JButton("Save Data to CSV");
    saveButton.addActionListener(this::onSaveData);
    JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    bottomPanel.add(saveButton);
    add(bottomPanel, BorderLayout.SOUTH);
  }

  private JPanel createRoomPanel() {
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout(10, 10));
    panel.setBorder(BorderFactory.createTitledBorder("Rooms"));

    roomList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    JScrollPane roomScroll = new JScrollPane(roomList);
    panel.add(roomScroll, BorderLayout.CENTER);

    JPanel roomActions = new JPanel(new GridLayout(6, 1, 6, 6));
    JButton addRoomButton = new JButton("Add Room");
    addRoomButton.addActionListener(this::onAddRoom);
    roomActions.add(
      createLabeledPanel("New Room ID", addRoomField, addRoomButton)
    );

    JButton enableRoomButton = new JButton("Enable Room");
    enableRoomButton.addActionListener(this::onEnableRoom);
    roomActions.add(enableRoomButton);

    JButton disableRoomButton = new JButton("Disable Room");
    disableRoomButton.addActionListener(this::onDisableRoom);
    roomActions.add(disableRoomButton);

    JButton closeRoomButton = new JButton("Close for Maintenance");
    closeRoomButton.addActionListener(this::onCloseRoom);
    roomActions.add(closeRoomButton);

    JButton viewStatusButton = new JButton("View Room Status");
    viewStatusButton.addActionListener(this::onViewRoomStatus);
    roomActions.add(viewStatusButton);

    panel.add(roomActions, BorderLayout.SOUTH);
    return panel;
  }

  private JPanel createBookingPanel() {
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout(10, 10));
    panel.setBorder(BorderFactory.createTitledBorder("Bookings"));

    bookingList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    JScrollPane bookingScroll = new JScrollPane(bookingList);
    panel.add(bookingScroll, BorderLayout.CENTER);

    JPanel bookingActions = new JPanel(new GridLayout(5, 1, 6, 6));
    JButton bookRoomButton = new JButton("Book Selected Room");
    bookRoomButton.addActionListener(this::onBookRoom);
    bookingActions.add(bookRoomButton);

    JButton cancelBookingButton = new JButton("Cancel Booking");
    cancelBookingButton.addActionListener(this::onCancelBooking);
    bookingActions.add(cancelBookingButton);

    JPanel extendPanel = new JPanel(new BorderLayout(6, 6));
    extendPanel.add(new JLabel("Extend Hours"), BorderLayout.WEST);
    extendPanel.add(extendHoursField, BorderLayout.CENTER);
    bookingActions.add(extendPanel);

    JButton extendBookingButton = new JButton("Extend Booking");
    extendBookingButton.addActionListener(this::onExtendBooking);
    bookingActions.add(extendBookingButton);

    JButton refreshButton = new JButton("Refresh Listings");
    refreshButton.addActionListener(e -> refreshLists());
    bookingActions.add(refreshButton);

    panel.add(bookingActions, BorderLayout.SOUTH);
    return panel;
  }

  private JPanel createLabeledPanel(
    String labelText,
    JComponent field,
    JButton button
  ) {
    JPanel panel = new JPanel(new BorderLayout(6, 6));
    panel.add(new JLabel(labelText), BorderLayout.NORTH);
    panel.add(field, BorderLayout.CENTER);
    panel.add(button, BorderLayout.EAST);
    return panel;
  }

  private void loadData() {
    try {
      rooms = roomCSVManager.load(roomsPath);
      Map<Integer, Room> roomsById = new HashMap<Integer, Room>();
      for (Room room : rooms) {
        roomsById.put(room.getRoomid(), room);
      }

      bookings = bookingCSVManager.load(bookingsPath, roomsById);
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(
        this,
        "Unable to load CSV data: " + ex.getMessage(),
        "Load Error",
        JOptionPane.ERROR_MESSAGE
      );
      rooms = new ArrayList<Room>();
      bookings = new ArrayList<Booking>();
    }

    admin = new Administrator("Admin", "admin@yorku.ca");
    for (Room room : rooms) {
      admin.addRoom(room);
    }

    registeredUser =
      new RegisteredUser(
        "Alice",
        "alice@yorku.ca",
        "password123",
        new AccountType("Student", 0.0f, true),
        1001
      );

    refreshLists();
  }

  private void refreshLists() {
    roomListModel.clear();
    for (Room room : rooms) {
      roomListModel.addElement(
        String.format("Room %d - %s", room.getRoomid(), room.getStatus())
      );
    }

    bookingListModel.clear();
    for (Booking booking : bookings) {
      Room room = booking.getRoomName();
      String roomText = room == null
        ? "unknown room"
        : "Room " + room.getRoomid();
      bookingListModel.addElement(
        String.format(
          "%s -> %s [%s]",
          booking.getBookingid(),
          roomText,
          booking.getStatus()
        )
      );
    }
  }

  private Room getSelectedRoom() {
    int index = roomList.getSelectedIndex();
    return index >= 0 && index < rooms.size() ? rooms.get(index) : null;
  }

  private Booking getSelectedBooking() {
    int index = bookingList.getSelectedIndex();
    return index >= 0 && index < bookings.size() ? bookings.get(index) : null;
  }

  private void onAddRoom(ActionEvent event) {
    try {
      String text = addRoomField.getText().trim();
      if (text.isEmpty()) {
        JOptionPane.showMessageDialog(
          this,
          "Please enter a room ID.",
          "Input Required",
          JOptionPane.WARNING_MESSAGE
        );
        return;
      }

      int roomId = Integer.parseInt(text);
      for (Room existing : rooms) {
        if (existing.getRoomid() == roomId) {
          JOptionPane.showMessageDialog(
            this,
            "Room " + roomId + " already exists.",
            "Duplicate Room",
            JOptionPane.WARNING_MESSAGE
          );
          return;
        }
      }

      Room room = new Room(roomId);
      admin.addRoom(room);
      rooms.add(room);
      refreshLists();
      addRoomField.setText("");

      JOptionPane.showMessageDialog(
        this,
        "Room " + roomId + " added.",
        "Room Added",
        JOptionPane.INFORMATION_MESSAGE
      );
    } catch (NumberFormatException ex) {
      JOptionPane.showMessageDialog(
        this,
        "Room ID must be a number.",
        "Invalid Input",
        JOptionPane.ERROR_MESSAGE
      );
    }
  }

  private void onEnableRoom(ActionEvent event) {
    Room room = getSelectedRoom();
    if (room == null) {
      JOptionPane.showMessageDialog(
        this,
        "Select a room to enable.",
        "No Room Selected",
        JOptionPane.WARNING_MESSAGE
      );
      return;
    }
    admin.enableRoom(room);
    refreshLists();
  }

  private void onDisableRoom(ActionEvent event) {
    Room room = getSelectedRoom();
    if (room == null) {
      JOptionPane.showMessageDialog(
        this,
        "Select a room to disable.",
        "No Room Selected",
        JOptionPane.WARNING_MESSAGE
      );
      return;
    }
    admin.disableRoom(room);
    refreshLists();
  }

  private void onCloseRoom(ActionEvent event) {
    Room room = getSelectedRoom();
    if (room == null) {
      JOptionPane.showMessageDialog(
        this,
        "Select a room to close.",
        "No Room Selected",
        JOptionPane.WARNING_MESSAGE
      );
      return;
    }
    admin.closeRoom(room);
    refreshLists();
  }

  private void onViewRoomStatus(ActionEvent event) {
    Room room = getSelectedRoom();
    if (room == null) {
      JOptionPane.showMessageDialog(
        this,
        "Select a room to view status.",
        "No Room Selected",
        JOptionPane.WARNING_MESSAGE
      );
      return;
    }
    JOptionPane.showMessageDialog(
      this,
      String.format("Room %d is %s.", room.getRoomid(), room.getStatus()),
      "Room Status",
      JOptionPane.INFORMATION_MESSAGE
    );
  }

  private void onBookRoom(ActionEvent event) {
    Room room = getSelectedRoom();
    if (room == null) {
      JOptionPane.showMessageDialog(
        this,
        "Select a room to book.",
        "No Room Selected",
        JOptionPane.WARNING_MESSAGE
      );
      return;
    }

    if (room.getStatus() != RoomStatus.AVAILABLE) {
      JOptionPane.showMessageDialog(
        this,
        "Room " + room.getRoomid() + " is not available for booking.",
        "Room Not Available",
        JOptionPane.WARNING_MESSAGE
      );
      return;
    }

    Booking booking = registeredUser.bookRoom(room);
    bookings.add(booking);
    refreshLists();
    JOptionPane.showMessageDialog(
      this,
      "Created booking " +
      booking.getBookingid() +
      " for room " +
      room.getRoomid() +
      ".",
      "Booking Created",
      JOptionPane.INFORMATION_MESSAGE
    );
  }

  private void onCancelBooking(ActionEvent event) {
    Booking booking = getSelectedBooking();
    if (booking == null) {
      JOptionPane.showMessageDialog(
        this,
        "Select a booking to cancel.",
        "No Booking Selected",
        JOptionPane.WARNING_MESSAGE
      );
      return;
    }

    if (!booking.cancel()) {
      JOptionPane.showMessageDialog(
        this,
        "Booking is already cancelled.",
        "Cancel Failed",
        JOptionPane.INFORMATION_MESSAGE
      );
      return;
    }

    refreshLists();
    JOptionPane.showMessageDialog(
      this,
      "Booking " + booking.getBookingid() + " was cancelled.",
      "Booking Cancelled",
      JOptionPane.INFORMATION_MESSAGE
    );
  }

  private void onExtendBooking(ActionEvent event) {
    Booking booking = getSelectedBooking();
    if (booking == null) {
      JOptionPane.showMessageDialog(
        this,
        "Select a booking to extend.",
        "No Booking Selected",
        JOptionPane.WARNING_MESSAGE
      );
      return;
    }

    try {
      String text = extendHoursField.getText().trim();
      if (text.isEmpty()) {
        JOptionPane.showMessageDialog(
          this,
          "Enter the number of hours to extend.",
          "Input Required",
          JOptionPane.WARNING_MESSAGE
        );
        return;
      }

      float hours = Float.parseFloat(text);
      if (hours <= 0) {
        JOptionPane.showMessageDialog(
          this,
          "Extend hours must be positive.",
          "Invalid Input",
          JOptionPane.ERROR_MESSAGE
        );
        return;
      }

      if (!booking.extend(hours)) {
        JOptionPane.showMessageDialog(
          this,
          "Unable to extend this booking.",
          "Extend Failed",
          JOptionPane.INFORMATION_MESSAGE
        );
        return;
      }

      refreshLists();
      extendHoursField.setText("");
      JOptionPane.showMessageDialog(
        this,
        "Booking " +
        booking.getBookingid() +
        " extended by " +
        hours +
        " hour(s).",
        "Booking Extended",
        JOptionPane.INFORMATION_MESSAGE
      );
    } catch (NumberFormatException ex) {
      JOptionPane.showMessageDialog(
        this,
        "Hours must be a valid number.",
        "Invalid Input",
        JOptionPane.ERROR_MESSAGE
      );
    }
  }

  private void onSaveData(ActionEvent event) {
    try {
      roomCSVManager.save(roomsPath, rooms);
      bookingCSVManager.save(bookingsPath, bookings);
      JOptionPane.showMessageDialog(
        this,
        "Room and booking data saved to CSV.",
        "Save Complete",
        JOptionPane.INFORMATION_MESSAGE
      );
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(
        this,
        "Unable to save CSV data: " + ex.getMessage(),
        "Save Error",
        JOptionPane.ERROR_MESSAGE
      );
    }
  }

  private String findDataPath(String fileName) {
    File path1 = new File("Chief_event_coordinator/data/" + fileName);
    if (path1.exists()) {
      return path1.getPath();
    }
    File path2 = new File("data/" + fileName);
    if (path2.exists()) {
      return path2.getPath();
    }
    return path2.getPath();
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      RoomAvailableGUI gui = new RoomAvailableGUI();
      gui.setVisible(true);
    });
  }
}
