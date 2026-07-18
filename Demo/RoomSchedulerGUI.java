package Demo;

import AccountType.AccountType;
import Chief_event_coordinator.Abstract_Factory.RoomAdminFactory;
import Chief_event_coordinator.ChiefEventCoordinator;
import Chief_event_coordinator.Classes.Administrator;
import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Classes.RoomStatus;
import Chief_event_coordinator.Persistence.BookingCSVManager;
import Chief_event_coordinator.Persistence.RoomCSVManager;
import User.RegisteredUser;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 * Complete Swing GUI for the YorkU Conference Room Scheduler.
 *
 * This class deliberately uses the methods that already exist in the team's
 * Room, Booking, RegisteredUser, Administrator, and ChiefEventCoordinator
 * classes. Information that those classes do not currently store (date/time,
 * capacity/features, payment, and check-in) is kept in small GUI-side records
 * and saved to sidecar CSV files. The records can later be moved into the
 * domain classes without changing the screens.
 */
public class RoomSchedulerGUI extends JFrame {

  private static final String AUTH_CARD = "auth";
  private static final String USER_CARD = "user";
  private static final String ADMIN_CARD = "admin";
  private static final String COORDINATOR_CARD = "coordinator";

  private static class RoomProfile {

    private int capacity;
    private String features;

    RoomProfile(int capacity, String features) {
      this.capacity = capacity;
      this.features = features == null ? "" : features;
    }
  }

  private static class BookingDetails {

    private String ownerEmail;
    private LocalDate date;
    private LocalTime start;
    private LocalTime end;
    private float duration;
    private String paymentStatus = "PENDING";
    private String paymentMethod = "NONE";
    private boolean checkedIn;

    BookingDetails(
      String ownerEmail,
      LocalDate date,
      LocalTime start,
      LocalTime end
    ) {
      this.ownerEmail = ownerEmail;
      this.date = date;
      this.start = start;
      this.end = end;
      this.duration = minutesBetween(start, end) / 60.0f;
    }
  }

  private final List<Room> rooms = new ArrayList<Room>();
  private final List<Booking> bookings = new ArrayList<Booking>();
  private final List<Administrator> createdAdmins = new ArrayList<Administrator>();
  private final Map<String, RegisteredUser> usersByEmail = new HashMap<String, RegisteredUser>();
  private final Map<Integer, RoomProfile> roomProfiles = new HashMap<Integer, RoomProfile>();
  private final Map<String, BookingDetails> bookingDetails = new HashMap<String, BookingDetails>();
  private final Map<String, String> adminPermissions = new HashMap<String, String>();
  private final Set<String> verifiedEmails = new HashSet<String>();
  private final Set<String> badgeScannedBookings = new HashSet<String>();
  private final Set<String> occupancyConfirmedBookings = new HashSet<String>();

  private final RoomCSVManager roomCSVManager = new RoomCSVManager();
  private final BookingCSVManager bookingCSVManager = new BookingCSVManager();

  private Administrator admin;
  private RegisteredUser registeredUser;
  private ChiefEventCoordinator chiefEventCoordinator;

  private final DefaultListModel<String> userRoomModel = new DefaultListModel<String>();
  private final DefaultListModel<String> userBookingModel = new DefaultListModel<String>();
  private final DefaultListModel<String> adminRoomModel = new DefaultListModel<String>();
  private final DefaultListModel<String> adminBookingModel = new DefaultListModel<String>();
  private final DefaultListModel<String> coordinatorAdminModel = new DefaultListModel<String>();

  private final JList<String> userRoomList = new JList<String>(userRoomModel);
  private final JList<String> userBookingList = new JList<String>(
    userBookingModel
  );
  private final JList<String> adminRoomList = new JList<String>(adminRoomModel);
  private final JList<String> adminBookingList = new JList<String>(
    adminBookingModel
  );
  private final JList<String> coordinatorAdminList = new JList<String>(
    coordinatorAdminModel
  );

  private final JTextField authName = new JTextField();
  private final JTextField authEmail = new JTextField();
  private final JPasswordField authPassword = new JPasswordField();
  private final JComboBox<String> authAccountType = new JComboBox<String>(
    new String[] { "Student", "Faculty", "Staff", "Partner" }
  );
  private final JTextField authOrgId = new JTextField();

  private final JTextField searchDate = new JTextField();
  private final JTextField searchStart = new JTextField();
  private final JTextField searchEnd = new JTextField();
  private final JTextField searchCapacity = new JTextField();
  private final JTextField searchFeatures = new JTextField();

  private final JTextField editDate = new JTextField();
  private final JTextField editStart = new JTextField();
  private final JTextField editEnd = new JTextField();
  private final JTextField extendHours = new JTextField();

  private final JComboBox<String> paymentMethod = new JComboBox<String>(
    new String[] { "Credit Card", "Debit Card", "Institutional Billing" }
  );
  private final JTextField paymentCard = new JTextField();
  private final JTextField paymentExpiry = new JTextField();
  private final JTextField paymentCvv = new JTextField();
  private final JTextField paymentInstitution = new JTextField();
  private final JTextField paymentAccount = new JTextField();
  private final JTextField paymentEmail = new JTextField();
  private final JLabel paymentStatus = new JLabel(
    "Payment status: select a booking"
  );
  private final JLabel checkInStatus = new JLabel(
    "Check-in status: select a booking"
  );

  private final JTextField adminRoomId = new JTextField();
  private final JTextField adminCapacity = new JTextField();
  private final JTextField adminFeatures = new JTextField();

  private final JTextField coordinatorName = new JTextField();
  private final JTextField coordinatorEmail = new JTextField();
  private final JTextField coordinatorPermission = new JTextField(
    "Room Manager"
  );

  private final JLabel statusLabel = new JLabel(
    "Welcome. Please register or log in."
  );
  private final CardLayout cardLayout = new CardLayout();
  private final JPanel cards = new JPanel(cardLayout);

  private String roomsPath;
  private String bookingsPath;

  public RoomSchedulerGUI() {
    super("YorkU Conference Room Scheduler");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(1280, 760);
    setLocationRelativeTo(null);
    setLayout(new BorderLayout(10, 10));

    roomsPath = findDataPath("rooms.csv");
    bookingsPath = findDataPath("bookings.csv");
    ensureDataDirectory();
    loadData();
    initializeGui();
  }

  private void initializeGui() {
    JLabel header = new JLabel(
      "YorkU Conference Room Scheduler",
      SwingConstants.CENTER
    );
    header.setFont(new Font("SansSerif", Font.BOLD, 22));
    add(header, BorderLayout.NORTH);

    cards.add(createAuthenticationPanel(), AUTH_CARD);
    cards.add(createUserPanel(), USER_CARD);
    cards.add(createAdministratorPanel(), ADMIN_CARD);
    cards.add(createCoordinatorPanel(), COORDINATOR_CARD);
    add(cards, BorderLayout.CENTER);

    JPanel footer = new JPanel(new FlowLayout(FlowLayout.CENTER));
    footer.add(statusLabel);
    JButton save = new JButton("Save Data");
    save.addActionListener(this::onSave);
    footer.add(save);
    add(footer, BorderLayout.SOUTH);

    showCard(AUTH_CARD);
  }

  private JPanel createAuthenticationPanel() {
    JPanel panel = new JPanel(new BorderLayout(10, 10));
    panel.setBorder(BorderFactory.createTitledBorder("Login and Registration"));

    JPanel form = new JPanel(new GridLayout(5, 2, 8, 8));
    addField(form, "Name", authName);
    addField(form, "YorkU email", authEmail);
    addField(form, "Password", authPassword);
    addField(form, "Account type", authAccountType);
    addField(form, "Student / organization ID", authOrgId);

    JPanel actions = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JButton register = new JButton("Register");
    register.addActionListener(this::onRegister);
    JButton verify = new JButton("Verify University Account");
    verify.addActionListener(this::onVerify);
    JButton login = new JButton("Log In");
    login.addActionListener(this::onLogin);
    actions.add(register);
    actions.add(verify);
    actions.add(login);

    JPanel tips = new JPanel(new GridLayout(3, 1));
    tips.add(new JLabel("User: alice@yorku.ca / password123"));
    tips.add(new JLabel("Administrator: admin@yorku.ca / admin123"));
    tips.add(new JLabel("Coordinator: coordinator@yorku.ca / coordinator123"));

    panel.add(tips, BorderLayout.NORTH);
    panel.add(form, BorderLayout.CENTER);
    panel.add(actions, BorderLayout.SOUTH);
    return panel;
  }

  private JPanel createUserPanel() {
    JPanel panel = new JPanel(new BorderLayout(8, 8));
    panel.setBorder(
      BorderFactory.createTitledBorder("Registered User Dashboard")
    );

    JPanel searchPanel = new JPanel(new BorderLayout(6, 6));
    searchPanel.setBorder(
      BorderFactory.createTitledBorder("Search Available Rooms")
    );
    JPanel searchForm = new JPanel(new GridLayout(5, 2, 5, 5));
    addField(searchForm, "Date (yyyy-MM-dd)", searchDate);
    addField(searchForm, "Start time (HH:mm)", searchStart);
    addField(searchForm, "End time (HH:mm)", searchEnd);
    addField(searchForm, "Minimum capacity", searchCapacity);
    addField(searchForm, "Required feature", searchFeatures);
    JButton search = new JButton("Search Rooms");
    search.addActionListener(this::onSearchRooms);
    searchPanel.add(searchForm, BorderLayout.NORTH);
    searchPanel.add(new JScrollPane(userRoomList), BorderLayout.CENTER);
    searchPanel.add(search, BorderLayout.SOUTH);

    JPanel bookingsPanel = new JPanel(new BorderLayout(6, 6));
    bookingsPanel.setBorder(BorderFactory.createTitledBorder("My Bookings"));
    bookingsPanel.add(new JScrollPane(userBookingList), BorderLayout.CENTER);
    JPanel bookingButtons = new JPanel(new GridLayout(5, 1, 4, 4));
    JButton book = new JButton("Book Selected Room");
    book.addActionListener(this::onBookRoom);
    JButton cancel = new JButton("Cancel Selected Booking");
    cancel.addActionListener(this::onCancelBooking);
    JButton edit = new JButton("Edit Selected Booking");
    edit.addActionListener(this::onEditBooking);
    JButton extend = new JButton("Extend Selected Booking");
    extend.addActionListener(this::onExtendBooking);
    JButton refresh = new JButton("Refresh");
    refresh.addActionListener(e -> refreshLists());
    bookingButtons.add(book);
    bookingButtons.add(cancel);
    bookingButtons.add(edit);
    bookingButtons.add(extend);
    bookingButtons.add(refresh);
    bookingsPanel.add(bookingButtons, BorderLayout.SOUTH);

    JPanel management = new JPanel(new BorderLayout(6, 6));
    management.setBorder(BorderFactory.createTitledBorder("Edit / Extend"));
    JPanel editForm = new JPanel(new GridLayout(4, 2, 5, 5));
    addField(editForm, "New date", editDate);
    addField(editForm, "New start time", editStart);
    addField(editForm, "New end time", editEnd);
    addField(editForm, "Extension hours", extendHours);
    management.add(editForm, BorderLayout.NORTH);
    management.add(createPaymentPanel(), BorderLayout.CENTER);
    management.add(createCheckInPanel(), BorderLayout.SOUTH);

    JPanel body = new JPanel(new GridLayout(1, 3, 8, 8));
    body.add(searchPanel);
    body.add(bookingsPanel);
    body.add(management);
    panel.add(body, BorderLayout.CENTER);
    panel.add(createLogoutPanel(), BorderLayout.SOUTH);

    userRoomList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    userBookingList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    userBookingList.addListSelectionListener(e -> {
      if (!e.getValueIsAdjusting()) {
        updateSelectedBookingLabels();
      }
    });
    return panel;
  }

  private JPanel createPaymentPanel() {
    JPanel panel = new JPanel(new BorderLayout(5, 5));
    panel.setBorder(BorderFactory.createTitledBorder("Payment"));
    JPanel form = new JPanel(new GridLayout(6, 2, 4, 4));
    addField(form, "Method", paymentMethod);
    addField(form, "Card number", paymentCard);
    addField(form, "Expiry (MM/YY)", paymentExpiry);
    addField(form, "CVV", paymentCvv);
    addField(
      form,
      "Institution / account",
      joinedPanel(paymentInstitution, paymentAccount)
    );
    addField(form, "Billing email", paymentEmail);
    JButton pay = new JButton("Pay Required Deposit");
    pay.addActionListener(this::onPayment);
    panel.add(paymentStatus, BorderLayout.NORTH);
    panel.add(form, BorderLayout.CENTER);
    panel.add(pay, BorderLayout.SOUTH);
    return panel;
  }

  private JPanel createCheckInPanel() {
    JPanel panel = new JPanel(new BorderLayout(5, 5));
    panel.setBorder(
      BorderFactory.createTitledBorder("ID Badge and Occupancy Check-in")
    );
    JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JButton badge = new JButton("Scan Badge");
    badge.addActionListener(this::onScanBadge);
    JButton occupancy = new JButton("Check Occupancy");
    occupancy.addActionListener(this::onOccupancy);
    JButton checkIn = new JButton("Complete Check-in");
    checkIn.addActionListener(this::onCheckIn);
    buttons.add(badge);
    buttons.add(occupancy);
    buttons.add(checkIn);
    panel.add(checkInStatus, BorderLayout.NORTH);
    panel.add(buttons, BorderLayout.CENTER);
    return panel;
  }

  private JPanel createAdministratorPanel() {
    JPanel panel = new JPanel(new BorderLayout(8, 8));
    panel.setBorder(
      BorderFactory.createTitledBorder("Administrator Dashboard")
    );

    JPanel roomPanel = new JPanel(new BorderLayout(6, 6));
    roomPanel.setBorder(BorderFactory.createTitledBorder("Room Management"));
    roomPanel.add(new JScrollPane(adminRoomList), BorderLayout.CENTER);
    JPanel roomForm = new JPanel(new GridLayout(3, 2, 5, 5));
    addField(roomForm, "Room ID", adminRoomId);
    addField(roomForm, "Capacity", adminCapacity);
    addField(roomForm, "Features", adminFeatures);
    roomPanel.add(roomForm, BorderLayout.NORTH);

    JPanel buttons = new JPanel(new GridLayout(2, 3, 5, 5));
    JButton add = new JButton("Add Room");
    add.addActionListener(this::onAddRoom);
    JButton update = new JButton("Update Details");
    update.addActionListener(this::onUpdateRoom);
    JButton enable = new JButton("Enable");
    enable.addActionListener(e -> changeRoomStatus(RoomStatus.AVAILABLE));
    JButton disable = new JButton("Disable");
    disable.addActionListener(e -> changeRoomStatus(RoomStatus.DISABLED));
    JButton maintenance = new JButton("Maintenance");
    maintenance.addActionListener(e -> changeRoomStatus(RoomStatus.MAINTENANCE)
    );
    JButton status = new JButton("View Status");
    status.addActionListener(this::onViewRoomStatus);
    buttons.add(add);
    buttons.add(update);
    buttons.add(enable);
    buttons.add(disable);
    buttons.add(maintenance);
    buttons.add(status);
    roomPanel.add(buttons, BorderLayout.SOUTH);

    JPanel bookingPanel = new JPanel(new BorderLayout(6, 6));
    bookingPanel.setBorder(BorderFactory.createTitledBorder("All Bookings"));
    bookingPanel.add(new JScrollPane(adminBookingList), BorderLayout.CENTER);

    JPanel body = new JPanel(new GridLayout(1, 2, 8, 8));
    body.add(roomPanel);
    body.add(bookingPanel);
    panel.add(body, BorderLayout.CENTER);
    panel.add(createLogoutPanel(), BorderLayout.SOUTH);
    adminRoomList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    return panel;
  }

  private JPanel createCoordinatorPanel() {
    JPanel panel = new JPanel(new BorderLayout(8, 8));
    panel.setBorder(
      BorderFactory.createTitledBorder("Chief Event Coordinator Dashboard")
    );
    JPanel form = new JPanel(new GridLayout(3, 2, 5, 5));
    addField(form, "Administrator name", coordinatorName);
    addField(form, "Administrator email", coordinatorEmail);
    addField(form, "Permission", coordinatorPermission);
    JButton create = new JButton("Create Administrator Account");
    create.addActionListener(this::onCreateAdministrator);
    panel.add(form, BorderLayout.NORTH);
    panel.add(new JScrollPane(coordinatorAdminList), BorderLayout.CENTER);
    JPanel bottom = createLogoutPanel();
    bottom.add(create);
    panel.add(bottom, BorderLayout.SOUTH);
    return panel;
  }

  private JPanel createLogoutPanel() {
    JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JButton logout = new JButton("Log Out");
    logout.addActionListener(e -> {
      registeredUser = null;
      statusLabel.setText("Logged out.");
      showCard(AUTH_CARD);
    });
    panel.add(logout);
    return panel;
  }

  private void onRegister(ActionEvent event) {
    String name = authName.getText().trim();
    String email = normalizeEmail(authEmail.getText());
    String password = new String(authPassword.getPassword()).trim();
    String typeName = String.valueOf(authAccountType.getSelectedItem());

    if (
      name.isEmpty() ||
      email.isEmpty() ||
      password.isEmpty() ||
      authOrgId.getText().trim().isEmpty()
    ) {
      showWarning("Enter the name, email, password, account type, and ID.");
      return;
    }
    if (!email.endsWith("@yorku.ca")) {
      showWarning("Registration requires a YorkU email ending in @yorku.ca.");
      return;
    }
    if (usersByEmail.containsKey(email)) {
      showWarning("An account already exists for that email.");
      return;
    }

    try {
      int orgId = Integer.parseInt(authOrgId.getText().trim());
      if (orgId <= 0) {
        throw new NumberFormatException();
      }
      AccountType type = new AccountType(
        typeName,
        hourlyRateFor(typeName),
        true
      );
      RegisteredUser user = new RegisteredUser(
        name,
        email,
        password,
        type,
        orgId
      );
      usersByEmail.put(email, user);
      registeredUser = user;
      saveData(false);
      statusLabel.setText(
        "Account created. Click Verify University Account, then log in."
      );
      showCard(AUTH_CARD);
      refreshLists();
    } catch (NumberFormatException ex) {
      showWarning("Student / organization ID must be a positive number.");
    }
  }

  private void onVerify(ActionEvent event) {
    String email = normalizeEmail(authEmail.getText());
    RegisteredUser user = usersByEmail.get(email);
    if (user == null || !email.endsWith("@yorku.ca") || !user.verify()) {
      showWarning("Register a valid YorkU account before verification.");
      return;
    }
    verifiedEmails.add(email);
    saveData(false);
    statusLabel.setText("University account verified for " + email + ".");
    JOptionPane.showMessageDialog(this, "University affiliation verified.");
  }

  private void onLogin(ActionEvent event) {
    String email = normalizeEmail(authEmail.getText());
    String password = new String(authPassword.getPassword()).trim();

    if (email.equals("admin@yorku.ca") && password.equals("admin123")) {
      statusLabel.setText("Signed in as administrator.");
      refreshLists();
      showCard(ADMIN_CARD);
      return;
    }
    if (
      email.equals("coordinator@yorku.ca") && password.equals("coordinator123")
    ) {
      statusLabel.setText("Signed in as chief event coordinator.");
      refreshLists();
      showCard(COORDINATOR_CARD);
      return;
    }
    for (Administrator created : createdAdmins) {
      if (
        normalizeEmail(created.getEmail()).equals(email) &&
        password.equals("admin123")
      ) {
        statusLabel.setText(
          "Signed in as administrator " + created.getName() + "."
        );
        refreshLists();
        showCard(ADMIN_CARD);
        return;
      }
    }

    RegisteredUser user = usersByEmail.get(email);
    if (user != null && user.getPassword().equals(password)) {
      registeredUser = user;
      statusLabel.setText("Signed in as " + user.getName() + ".");
      refreshLists();
      showCard(USER_CARD);
    } else {
      showWarning("Incorrect email or password.");
    }
  }

  private void onSearchRooms(ActionEvent event) {
    try {
      LocalDate date = LocalDate.parse(searchDate.getText().trim());
      LocalTime start = LocalTime.parse(searchStart.getText().trim());
      LocalTime end = LocalTime.parse(searchEnd.getText().trim());
      if (!start.isBefore(end)) {
        showWarning("The start time must be before the end time.");
        return;
      }
      int capacity = searchCapacity.getText().trim().isEmpty()
        ? 0
        : Integer.parseInt(searchCapacity.getText().trim());
      String feature = searchFeatures.getText().trim().toLowerCase();

      userRoomModel.clear();
      for (Room room : rooms) {
        RoomProfile profile = profileFor(room);
        boolean matches =
          room.getStatus() == RoomStatus.AVAILABLE &&
          profile.capacity >= capacity &&
          profile.features.toLowerCase().contains(feature) &&
          isTimeAvailable(room, date, start, end, null);
        if (matches) {
          userRoomModel.addElement(formatRoom(room));
        }
      }
      statusLabel.setText(userRoomModel.size() + " available room(s) found.");
    } catch (Exception ex) {
      showWarning("Use yyyy-MM-dd, HH:mm, and a numeric capacity.");
    }
  }

  private void onBookRoom(ActionEvent event) {
    if (registeredUser == null) {
      showWarning("Log in as a registered user first.");
      return;
    }
    String email = normalizeEmail(registeredUser.getEmail());
    if (!verifiedEmails.contains(email)) {
      showWarning("Verify your university account before booking.");
      return;
    }

    Room room = selectedRoom(userRoomList);
    if (room == null) {
      showWarning("Select an available room.");
      return;
    }
    try {
      LocalDate date = LocalDate.parse(searchDate.getText().trim());
      LocalTime start = LocalTime.parse(searchStart.getText().trim());
      LocalTime end = LocalTime.parse(searchEnd.getText().trim());
      if (
        !start.isBefore(end) || !isTimeAvailable(room, date, start, end, null)
      ) {
        showWarning("That room is not available for the selected time.");
        return;
      }

      String bookingId = nextBookingId();
      Booking booking = new Booking(bookingId, registeredUser, room);
      registeredUser.addBooking(booking);
      bookings.add(booking);
      bookingDetails.put(
        bookingId,
        new BookingDetails(email, date, start, end)
      );
      refreshLists();
      saveData(false);
      JOptionPane.showMessageDialog(
        this,
        "Booking " + bookingId + " created successfully."
      );
    } catch (Exception ex) {
      showWarning("Search using a valid date and time before booking.");
    }
  }

  private void onEditBooking(ActionEvent event) {
    Booking booking = selectedUserBooking();
    Room replacement = selectedRoom(userRoomList);
    if (booking == null || replacement == null) {
      showWarning("Select your booking and an available replacement room.");
      return;
    }
    BookingDetails details = bookingDetails.get(booking.getBookingid());
    if (!ownsBooking(details) || isCancelled(booking)) {
      showWarning("Only your active bookings can be edited.");
      return;
    }
    try {
      LocalDate date = LocalDate.parse(editDate.getText().trim());
      LocalTime start = LocalTime.parse(editStart.getText().trim());
      LocalTime end = LocalTime.parse(editEnd.getText().trim());
      if (
        !start.isBefore(end) ||
        !isTimeAvailable(replacement, date, start, end, booking.getBookingid())
      ) {
        showWarning("The replacement room or time is unavailable.");
        return;
      }
      if (!booking.edit(replacement)) {
        showWarning("The booking could not be edited.");
        return;
      }
      details.date = date;
      details.start = start;
      details.end = end;
      details.duration = minutesBetween(start, end) / 60.0f;
      details.paymentStatus = "PENDING";
      details.paymentMethod = "NONE";
      refreshLists();
      saveData(false);
      JOptionPane.showMessageDialog(
        this,
        "Booking updated. Payment must be confirmed again."
      );
    } catch (Exception ex) {
      showWarning("Enter the new date as yyyy-MM-dd and times as HH:mm.");
    }
  }

  private void onCancelBooking(ActionEvent event) {
    Booking booking = selectedUserBooking();
    if (booking == null) {
      showWarning("Select one of your bookings.");
      return;
    }
    BookingDetails details = bookingDetails.get(booking.getBookingid());
    if (!ownsBooking(details) || details.checkedIn || !booking.cancel()) {
      showWarning("The booking cannot be cancelled.");
      return;
    }
    if ("PAID".equals(details.paymentStatus)) {
      details.paymentStatus = "REFUNDED";
      paymentStatus.setText("Payment status: refunded");
    }
    refreshLists();
    saveData(false);
    JOptionPane.showMessageDialog(this, "Booking cancelled successfully.");
  }

  private void onExtendBooking(ActionEvent event) {
    Booking booking = selectedUserBooking();
    if (booking == null) {
      showWarning("Select one of your bookings.");
      return;
    }
    BookingDetails details = bookingDetails.get(booking.getBookingid());
    try {
      float hours = Float.parseFloat(extendHours.getText().trim());
      if (hours <= 0 || !ownsBooking(details) || isCancelled(booking)) {
        throw new IllegalArgumentException();
      }
      LocalTime newEnd = details.end.plusMinutes(Math.round(hours * 60));
      if (!details.end.isBefore(newEnd)) {
        showWarning("A booking cannot be extended past midnight.");
        return;
      }
      if (
        !isTimeAvailable(
          booking.getRoomName(),
          details.date,
          details.start,
          newEnd,
          booking.getBookingid()
        )
      ) {
        showWarning("Another booking conflicts with that extension.");
        return;
      }
      if (!booking.extend(hours)) {
        showWarning("The booking cannot be extended.");
        return;
      }
      details.end = newEnd;
      details.duration += hours;
      details.paymentStatus = "PENDING";
      details.paymentMethod = "NONE";
      extendHours.setText("");
      refreshLists();
      saveData(false);
      JOptionPane.showMessageDialog(
        this,
        "Booking extended. Payment must be confirmed again."
      );
    } catch (Exception ex) {
      showWarning("Extension hours must be a positive number.");
    }
  }

  private void onPayment(ActionEvent event) {
    Booking booking = selectedUserBooking();
    if (booking == null || isCancelled(booking)) {
      showWarning("Select an active booking to pay for.");
      return;
    }
    BookingDetails details = bookingDetails.get(booking.getBookingid());
    if (!ownsBooking(details)) {
      showWarning("You can only pay for your own booking.");
      return;
    }

    String method = String.valueOf(paymentMethod.getSelectedItem());
    if (method.contains("Card")) {
      if (
        !paymentCard.getText().trim().matches("\\d{8,19}") ||
        !paymentExpiry.getText().trim().matches("\\d{2}/\\d{2}") ||
        !paymentCvv.getText().trim().matches("\\d{3,4}")
      ) {
        showWarning("Enter a valid card number, MM/YY expiry, and CVV.");
        return;
      }
    } else if (
      paymentInstitution.getText().trim().isEmpty() ||
      paymentAccount.getText().trim().isEmpty() ||
      !paymentEmail.getText().trim().contains("@")
    ) {
      showWarning("Enter the institution, account number, and billing email.");
      return;
    }

    float rate = registeredUser.getType().getHourlyRate();
    float total = rate * details.duration;
    float deposit = Math.min(rate, total);
    details.paymentStatus = "PAID";
    details.paymentMethod = method;
    paymentStatus.setText(
      String.format(
        "Payment status: PAID | total $%.2f | deposit $%.2f",
        total,
        deposit
      )
    );
    saveData(false);
    JOptionPane.showMessageDialog(
      this,
      String.format("Deposit of $%.2f processed through %s.", deposit, method)
    );
  }

  private void onScanBadge(ActionEvent event) {
    Booking booking = selectedUserBooking();
    BookingDetails details = booking == null
      ? null
      : bookingDetails.get(booking.getBookingid());
    if (
      booking == null || !ownsBooking(details) || registeredUser.getOrgID() <= 0
    ) {
      showWarning("Select your booking and use a valid registered ID.");
      return;
    }
    badgeScannedBookings.add(booking.getBookingid());
    checkInStatus.setText(
      "Check-in status: badge verified; occupancy still required"
    );
  }

  private void onOccupancy(ActionEvent event) {
    Booking booking = selectedUserBooking();
    if (booking == null || isCancelled(booking)) {
      showWarning("Select an active booking.");
      return;
    }
    RoomStatus status = booking.getRoomName().getStatus();
    if (status == RoomStatus.DISABLED || status == RoomStatus.MAINTENANCE) {
      showWarning("The room is unavailable, so occupancy cannot be confirmed.");
      return;
    }
    occupancyConfirmedBookings.add(booking.getBookingid());
    checkInStatus.setText(
      "Check-in status: occupancy confirmed; badge still required if not scanned"
    );
  }

  private void onCheckIn(ActionEvent event) {
    Booking booking = selectedUserBooking();
    if (booking == null) {
      showWarning("Select your booking.");
      return;
    }
    BookingDetails details = bookingDetails.get(booking.getBookingid());
    boolean ready =
      ownsBooking(details) &&
      !isCancelled(booking) &&
      "PAID".equals(details.paymentStatus) &&
      badgeScannedBookings.contains(booking.getBookingid()) &&
      occupancyConfirmedBookings.contains(booking.getBookingid());
    if (!ready) {
      checkInStatus.setText(
        "Check-in failed: payment, badge, and occupancy confirmation are required"
      );
      return;
    }
    details.checkedIn = true;
    booking.getRoomName().setStatus(RoomStatus.OCCUPIED);
    checkInStatus.setText("Check-in status: CONFIRMED");
    refreshLists();
    saveData(false);
  }

  private void onAddRoom(ActionEvent event) {
    try {
      int id = Integer.parseInt(adminRoomId.getText().trim());
      int capacity = Integer.parseInt(adminCapacity.getText().trim());
      String features = adminFeatures.getText().trim();
      if (id <= 0 || capacity <= 0 || roomById(id) != null) {
        showWarning("Use positive values and a unique room ID.");
        return;
      }
      Room room = new Room(id);
      admin.addRoom(room);
      rooms.add(room);
      roomProfiles.put(id, new RoomProfile(capacity, features));
      refreshLists();
      saveData(false);
    } catch (NumberFormatException ex) {
      showWarning("Room ID and capacity must be positive numbers.");
    }
  }

  private void onUpdateRoom(ActionEvent event) {
    Room room = selectedRoom(adminRoomList);
    if (room == null) {
      showWarning("Select a room to update.");
      return;
    }
    try {
      int capacity = Integer.parseInt(adminCapacity.getText().trim());
      if (capacity <= 0) {
        throw new NumberFormatException();
      }
      RoomProfile profile = profileFor(room);
      profile.capacity = capacity;
      profile.features = adminFeatures.getText().trim();
      refreshLists();
      saveData(false);
    } catch (NumberFormatException ex) {
      showWarning("Capacity must be a positive number.");
    }
  }

  private void changeRoomStatus(RoomStatus newStatus) {
    Room room = selectedRoom(adminRoomList);
    if (room == null) {
      showWarning("Select a room.");
      return;
    }
    if (newStatus == RoomStatus.AVAILABLE) {
      admin.enableRoom(room);
    } else if (newStatus == RoomStatus.DISABLED) {
      admin.disableRoom(room);
    } else {
      admin.closeRoom(room);
    }
    refreshLists();
    saveData(false);
  }

  private void onViewRoomStatus(ActionEvent event) {
    Room room = selectedRoom(adminRoomList);
    if (room == null) {
      showWarning("Select a room.");
      return;
    }
    JOptionPane.showMessageDialog(this, formatRoom(room));
  }

  private void onCreateAdministrator(ActionEvent event) {
    String name = coordinatorName.getText().trim();
    String email = normalizeEmail(coordinatorEmail.getText());
    String permission = coordinatorPermission.getText().trim();
    if (
      name.isEmpty() || !email.endsWith("@yorku.ca") || permission.isEmpty()
    ) {
      showWarning("Enter a name, YorkU email, and permission.");
      return;
    }
    for (Administrator existing : createdAdmins) {
      if (normalizeEmail(existing.getEmail()).equals(email)) {
        showWarning("An administrator with that email already exists.");
        return;
      }
    }
    Administrator created = chiefEventCoordinator.generateAdminAccount(
      name,
      email
    );
    createdAdmins.add(created);
    adminPermissions.put(email, permission);
    refreshLists();
    saveData(false);
    JOptionPane.showMessageDialog(
      this,
      "Administrator created. Temporary demo password: admin123"
    );
  }

  private void refreshLists() {
    userRoomModel.clear();
    adminRoomModel.clear();
    for (Room room : rooms) {
      String text = formatRoom(room);
      userRoomModel.addElement(text);
      adminRoomModel.addElement(text);
    }

    userBookingModel.clear();
    adminBookingModel.clear();
    for (Booking booking : bookings) {
      BookingDetails details = bookingDetails.get(booking.getBookingid());
      String text = formatBooking(booking, details);
      adminBookingModel.addElement(text);
      if (registeredUser != null && ownsBooking(details)) {
        userBookingModel.addElement(text);
      }
    }

    coordinatorAdminModel.clear();
    for (Administrator created : createdAdmins) {
      String email = normalizeEmail(created.getEmail());
      coordinatorAdminModel.addElement(
        created.getName() + " | " + email + " | " + adminPermissions.get(email)
      );
    }
  }

  private void updateSelectedBookingLabels() {
    Booking booking = selectedUserBooking();
    if (booking == null) {
      paymentStatus.setText("Payment status: select a booking");
      checkInStatus.setText("Check-in status: select a booking");
      return;
    }
    BookingDetails details = bookingDetails.get(booking.getBookingid());
    paymentStatus.setText(
      "Payment status: " +
      details.paymentStatus +
      " via " +
      details.paymentMethod
    );
    checkInStatus.setText(
      details.checkedIn
        ? "Check-in status: CONFIRMED"
        : "Check-in status: not completed"
    );
  }

  private boolean isTimeAvailable(
    Room room,
    LocalDate date,
    LocalTime start,
    LocalTime end,
    String ignoredBookingId
  ) {
    for (Booking existing : bookings) {
      if (
        existing.getRoomName() == null ||
        existing.getRoomName().getRoomid() != room.getRoomid() ||
        isCancelled(existing) ||
        existing.getBookingid().equals(ignoredBookingId)
      ) {
        continue;
      }
      BookingDetails details = bookingDetails.get(existing.getBookingid());
      if (
        details != null &&
        date.equals(details.date) &&
        start.isBefore(details.end) &&
        end.isAfter(details.start)
      ) {
        return false;
      }
    }
    return true;
  }

  private boolean ownsBooking(BookingDetails details) {
    return (
      registeredUser != null &&
      details != null &&
      normalizeEmail(registeredUser.getEmail())
        .equals(normalizeEmail(details.ownerEmail))
    );
  }

  private boolean isCancelled(Booking booking) {
    return booking.getStatus().name().equals("CANCELLED");
  }

  private Room selectedRoom(JList<String> list) {
    String value = list.getSelectedValue();
    if (value == null) {
      return null;
    }
    Matcher matcher = Pattern.compile("Room\\s+(\\d+)").matcher(value);
    return matcher.find() ? roomById(Integer.parseInt(matcher.group(1))) : null;
  }

  private Booking selectedUserBooking() {
    return bookingFromList(userBookingList);
  }

  private Booking bookingFromList(JList<String> list) {
    String value = list.getSelectedValue();
    if (value == null) {
      return null;
    }
    String id = value.split(" \\|")[0].trim();
    for (Booking booking : bookings) {
      if (booking.getBookingid().equals(id)) {
        return booking;
      }
    }
    return null;
  }

  private Room roomById(int id) {
    for (Room room : rooms) {
      if (room.getRoomid() == id) {
        return room;
      }
    }
    return null;
  }

  private RoomProfile profileFor(Room room) {
    RoomProfile profile = roomProfiles.get(room.getRoomid());
    if (profile == null) {
      profile = new RoomProfile(10, "Projector, Whiteboard");
      roomProfiles.put(room.getRoomid(), profile);
    }
    return profile;
  }

  private String formatRoom(Room room) {
    RoomProfile profile = profileFor(room);
    return String.format(
      "Room %d | %s | capacity %d | %s",
      room.getRoomid(),
      room.getStatus(),
      profile.capacity,
      profile.features
    );
  }

  private String formatBooking(Booking booking, BookingDetails details) {
    if (details == null) {
      return (
        booking.getBookingid() +
        " | Room " +
        booking.getRoomName().getRoomid() +
        " | " +
        booking.getStatus() +
        " | legacy booking"
      );
    }
    return String.format(
      "%s | Room %d | %s %s-%s | %s | payment %s | check-in %s",
      booking.getBookingid(),
      booking.getRoomName().getRoomid(),
      details.date,
      details.start,
      details.end,
      booking.getStatus(),
      details.paymentStatus,
      details.checkedIn ? "YES" : "NO"
    );
  }

  private String nextBookingId() {
    int greatest = 0;
    for (Booking booking : bookings) {
      Matcher matcher = Pattern
        .compile("(\\d+)$")
        .matcher(booking.getBookingid());
      if (matcher.find()) {
        greatest = Math.max(greatest, Integer.parseInt(matcher.group(1)));
      }
    }
    return "B" + (greatest + 1);
  }

  private void loadData() {
    AccountType student = new AccountType("Student", 25.0f, true);
    RegisteredUser alice = new RegisteredUser(
      "Alice",
      "alice@yorku.ca",
      "password123",
      student,
      1001
    );
    usersByEmail.put(normalizeEmail(alice.getEmail()), alice);
    verifiedEmails.add(normalizeEmail(alice.getEmail()));
    loadUsers();

    try {
      File roomFile = new File(roomsPath);
      if (roomFile.exists()) {
        rooms.addAll(roomCSVManager.load(roomsPath));
      }
      if (rooms.isEmpty()) {
        rooms.add(new Room(101));
        rooms.add(new Room(102));
        rooms.add(new Room(103));
      }
      Map<Integer, Room> roomsById = new HashMap<Integer, Room>();
      for (Room room : rooms) {
        roomsById.put(room.getRoomid(), room);
      }
      File bookingFile = new File(bookingsPath);
      if (bookingFile.exists()) {
        bookings.addAll(bookingCSVManager.load(bookingsPath, roomsById));
      }
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(
        this,
        "Unable to load the main CSV data: " + ex.getMessage(),
        "Load Error",
        JOptionPane.ERROR_MESSAGE
      );
    }

    loadRoomProfiles();
    loadBookingDetails();
    for (Booking booking : bookings) {
      BookingDetails details = bookingDetails.get(booking.getBookingid());
      if (details == null) {
        details =
          new BookingDetails(
            "alice@yorku.ca",
            LocalDate.now(),
            LocalTime.of(9, 0),
            LocalTime.of(10, 0)
          );
        bookingDetails.put(booking.getBookingid(), details);
      }
      RegisteredUser owner = usersByEmail.get(
        normalizeEmail(details.ownerEmail)
      );
      if (owner != null) {
        booking.setRegisteredUser(owner);
        if (!owner.viewBookings().contains(booking)) {
          owner.addBooking(booking);
        }
      }
    }

    admin = new Administrator("Admin", "admin@yorku.ca");
    for (Room room : rooms) {
      admin.addRoom(room);
    }
    chiefEventCoordinator = new ChiefEventCoordinator(new RoomAdminFactory());
    loadAdministrators();
    refreshLists();
  }

  private void onSave(ActionEvent event) {
    saveData(true);
  }

  private void saveData(boolean confirmation) {
    try {
      roomCSVManager.save(roomsPath, rooms);
      bookingCSVManager.save(bookingsPath, bookings);
      saveRoomProfiles();
      saveBookingDetails();
      saveUsers();
      saveAdministrators();
      if (confirmation) {
        JOptionPane.showMessageDialog(
          this,
          "All room, booking, user, payment, and check-in data was saved."
        );
      }
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(
        this,
        "Unable to save data: " + ex.getMessage(),
        "Save Error",
        JOptionPane.ERROR_MESSAGE
      );
    }
  }

  private void loadRoomProfiles() {
    File file = metadataFile("room-details.csv");
    if (!file.exists()) {
      return;
    }
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] p = line.split("\\|", -1);
        if (p.length >= 3) {
          roomProfiles.put(
            Integer.parseInt(p[0]),
            new RoomProfile(Integer.parseInt(p[1]), p[2])
          );
        }
      }
    } catch (Exception ex) {
      statusLabel.setText("Some room details could not be loaded.");
    }
  }

  private void saveRoomProfiles() throws Exception {
    try (
      BufferedWriter writer = new BufferedWriter(
        new FileWriter(metadataFile("room-details.csv"))
      )
    ) {
      for (Room room : rooms) {
        RoomProfile profile = profileFor(room);
        writer.write(
          room.getRoomid() +
          "|" +
          profile.capacity +
          "|" +
          safe(profile.features)
        );
        writer.newLine();
      }
    }
  }

  private void loadBookingDetails() {
    File file = metadataFile("booking-details.csv");
    if (!file.exists()) {
      return;
    }
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] p = line.split("\\|", -1);
        if (p.length >= 10) {
          BookingDetails d = new BookingDetails(
            p[1],
            LocalDate.parse(p[2]),
            LocalTime.parse(p[3]),
            LocalTime.parse(p[4])
          );
          d.duration = Float.parseFloat(p[5]);
          d.paymentStatus = p[6];
          d.paymentMethod = p[7];
          d.checkedIn = Boolean.parseBoolean(p[8]);
          bookingDetails.put(p[0], d);
        }
      }
    } catch (Exception ex) {
      statusLabel.setText("Some booking details could not be loaded.");
    }
  }

  private void saveBookingDetails() throws Exception {
    try (
      BufferedWriter writer = new BufferedWriter(
        new FileWriter(metadataFile("booking-details.csv"))
      )
    ) {
      for (Booking booking : bookings) {
        BookingDetails d = bookingDetails.get(booking.getBookingid());
        if (d != null) {
          writer.write(
            safe(booking.getBookingid()) +
            "|" +
            safe(d.ownerEmail) +
            "|" +
            d.date +
            "|" +
            d.start +
            "|" +
            d.end +
            "|" +
            d.duration +
            "|" +
            safe(d.paymentStatus) +
            "|" +
            safe(d.paymentMethod) +
            "|" +
            d.checkedIn +
            "|"
          );
          writer.newLine();
        }
      }
    }
  }

  private void loadUsers() {
    File file = metadataFile("users.csv");
    if (!file.exists()) {
      return;
    }
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] p = line.split("\\|", -1);
        if (p.length >= 8) {
          AccountType type = new AccountType(
            p[3],
            Float.parseFloat(p[4]),
            Boolean.parseBoolean(p[5])
          );
          RegisteredUser user = new RegisteredUser(
            p[0],
            p[1],
            p[2],
            type,
            Integer.parseInt(p[6])
          );
          usersByEmail.put(normalizeEmail(p[1]), user);
          if (Boolean.parseBoolean(p[7])) {
            verifiedEmails.add(normalizeEmail(p[1]));
          }
        }
      }
    } catch (Exception ex) {
      statusLabel.setText("Some user accounts could not be loaded.");
    }
  }

  private void saveUsers() throws Exception {
    try (
      BufferedWriter writer = new BufferedWriter(
        new FileWriter(metadataFile("users.csv"))
      )
    ) {
      for (RegisteredUser user : usersByEmail.values()) {
        AccountType type = user.getType();
        writer.write(
          safe(user.getName()) +
          "|" +
          safe(normalizeEmail(user.getEmail())) +
          "|" +
          safe(user.getPassword()) +
          "|" +
          safe(type.getName()) +
          "|" +
          type.getHourlyRate() +
          "|" +
          type.isRequiresVerification() +
          "|" +
          user.getOrgID() +
          "|" +
          verifiedEmails.contains(normalizeEmail(user.getEmail()))
        );
        writer.newLine();
      }
    }
  }

  private void loadAdministrators() {
    File file = metadataFile("administrators.csv");
    if (!file.exists()) {
      return;
    }
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] p = line.split("\\|", -1);
        if (p.length >= 3) {
          Administrator created = new Administrator(p[0], p[1]);
          createdAdmins.add(created);
          adminPermissions.put(normalizeEmail(p[1]), p[2]);
        }
      }
    } catch (Exception ex) {
      statusLabel.setText("Some administrator accounts could not be loaded.");
    }
  }

  private void saveAdministrators() throws Exception {
    try (
      BufferedWriter writer = new BufferedWriter(
        new FileWriter(metadataFile("administrators.csv"))
      )
    ) {
      for (Administrator created : createdAdmins) {
        String email = normalizeEmail(created.getEmail());
        writer.write(
          safe(created.getName()) +
          "|" +
          safe(email) +
          "|" +
          safe(adminPermissions.get(email))
        );
        writer.newLine();
      }
    }
  }

  private File metadataFile(String name) {
    File base = new File(roomsPath).getAbsoluteFile().getParentFile();
    return new File(base, name);
  }

  private void ensureDataDirectory() {
    File parent = new File(roomsPath).getAbsoluteFile().getParentFile();
    if (parent != null && !parent.exists()) {
      parent.mkdirs();
    }
  }

  private String findDataPath(String name) {
    File chiefData = new File("Chief_event_coordinator/data");
    if (chiefData.exists()) {
      return new File(chiefData, name).getPath();
    }
    return new File("data", name).getPath();
  }

  private void showCard(String name) {
    cardLayout.show(cards, name);
  }

  private void showWarning(String message) {
    JOptionPane.showMessageDialog(
      this,
      message,
      "Action Required",
      JOptionPane.WARNING_MESSAGE
    );
  }

  private static void addField(
    JPanel panel,
    String label,
    JComponent component
  ) {
    panel.add(new JLabel(label));
    panel.add(component);
  }

  private static JPanel joinedPanel(JComponent first, JComponent second) {
    JPanel panel = new JPanel(new GridLayout(1, 2, 4, 4));
    panel.add(first);
    panel.add(second);
    return panel;
  }

  private static int minutesBetween(LocalTime start, LocalTime end) {
    return (
      (end.getHour() * 60 + end.getMinute()) -
      (start.getHour() * 60 + start.getMinute())
    );
  }

  private static String normalizeEmail(String email) {
    return email == null ? "" : email.trim().toLowerCase();
  }

  private static String safe(String value) {
    return value == null
      ? ""
      : value.replace('|', '/').replace('\n', ' ').replace('\r', ' ');
  }

  private static float hourlyRateFor(String typeName) {
    if ("Faculty".equalsIgnoreCase(typeName)) {
      return 20.0f;
    }
    if ("Staff".equalsIgnoreCase(typeName)) {
      return 15.0f;
    }
    if ("Partner".equalsIgnoreCase(typeName)) {
      return 35.0f;
    }
    return 25.0f;
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> new RoomSchedulerGUI().setVisible(true));
  }
}
