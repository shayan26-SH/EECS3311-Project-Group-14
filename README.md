# YorkU Conference Room Scheduler

## Overview

The **YorkU Conference Room Scheduler** is a software system designed to simplify the process of reserving and managing conference rooms across York University. The system supports students, faculty, staff, partners, administrators, and chief event coordinators while integrating with external services such as authentication, payment processing, ID badge scanning, and occupancy sensors.

The goal of the project is to provide a secure, efficient, and automated room booking experience while enforcing university policies regarding room reservations, payments, and check-in verification.

---

## Features

### Registered User

- Create a new account
- Verify university affiliation
- Log into the system
- Search available conference rooms
- Book conference rooms
- Pay required booking fees
- Edit existing bookings
- Cancel bookings
- Extend bookings before expiration
- Check in using an ID badge

### Administrator

- Add new rooms
- Update room information
- Enable rooms
- Disable rooms
- Close rooms for maintenance
- View room availability

### Chief Event Coordinator

- Create administrator accounts
- Manage administrator accounts
- Verify administrator privileges

### External Services

- User authentication
- Payment processing
- ID badge scanning
- Occupancy detection

---

## System Actors

| Actor | Responsibilities |
| --- | --- |
| Registered User | Books and manages conference rooms |
| Administrator | Maintains room information and availability |
| Chief Event Coordinator | Creates and manages administrator accounts |
| Authentication Service | Verifies user credentials and university accounts |
| Payment Processor | Handles booking payments |
| ID Badge Scanner | Verifies user check-in |
| Occupancy Sensor | Detects room occupancy |

---

## UML Models Included

This project contains the following UML diagrams:

### Use Case Diagrams

- Registered User
- Administrator
- Chief Event Coordinator
- Payment Processor
- External/System Actors

### Sequence Diagrams

- User Registration and Verification
- Room Booking and Payment
- Booking Edit / Cancel / Extend
- ID Badge Check-in
- Administrator Room Management

### Activity Diagrams

- Registered User Workflow
- Administrator Room Management
- Payment Processing
- ID Badge Check-in

### Class Diagram

The class diagram models the relationships between users, bookings, payments, rooms, administrators, authentication services, ID scanners, occupancy sensors, and scheduling components.

---

## Functional Requirements

The scheduler supports:

- Secure account creation
- University account verification
- Room availability search
- Conference room booking
- Booking modification
- Booking cancellation
- Booking extension
- Online payment processing
- Administrator room management
- ID badge check-in
- Occupancy verification
- Automatic administrator account generation

---

## Strategy Pattern

The Strategy Pattern fits well when several algorithms can handle one object or situation. Payment fits this pattern because a user can pay in three different ways: credit card, debit card, or institutional billing.

This project uses a payment strategy model to handle those options. The `Payment` class is the context class and has a one-to-one composition relationship with the `PaymentStrategy` interface. An interface is used instead of an abstract class because there is no shared code among the three concrete strategy classes. `CreditCardStrategy`, `DebitCardStrategy`, and `InstitutionalBillingStrategy` each implement `PaymentStrategy`, allowing the user interface to dynamically select the payment strategy and pass the required information to its constructor.

---

## Facade Pattern

The Facade Pattern is implemented by `BookingFacade`. It provides one system entry point for adding uniquely identified rooms, enabling/disabling rooms, temporary maintenance closures, bookings, occupancy reports, and ID badge verification. Callers use the facade instead of coordinating `Administrator`, `Room`, `OccupancySensor`, `IdBadgeScanner`, and `BadgeVerificationSystem` directly.

Each `Room` stores its capacity, building, room location, current status, maintenance reason, occupancy sensor, and ID badge scanner. Sensor and badge data is sent through the facade using `receiveOccupancyData` and `receiveBadgeScanData`.

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- UML
- Use Case Diagrams
- Sequence Diagrams
- Activity Diagrams
- Class Diagrams
- Git & GitHub

---

## External Components

The system communicates with several external systems:

- Authentication Service
- Payment Gateway
- ID Badge Scanner
- Occupancy Sensor

These components provide services outside the application's control while supporting authentication, payment validation, and room occupancy verification.

---

## Project Structure

```text
YorkUConferenceRoomScheduler
|
|-- AccountType
|-- Chief_event_coordinator
|-- StrategyPattern
|-- SystemUser
|-- PaymentStrategyPattern.png
|-- PaymentStrategyPattern.uxf
`-- README.md
```

---

## GitHub Branches

This repository is organized into multiple branches that contain different parts of the project.

**Please visit each of the branches to view the commits, implementation files, and project progress associated with that component.**

Each branch represents a separate stage or feature developed during the project.

---

## How to Run

This repository contains the UML analysis, design artifacts, and documentation for the **YorkU Conference Room Scheduler**.

### 1. Clone the repository

```bash
git clone <repository-url>
```

### 2. Open the project

Open the project using your preferred IDE, such as:

- Eclipse
- IntelliJ IDEA
- Visual Studio Code

### 3. Compile the Java source files

From the project root, compile all Java source files:

```bash
javac AccountType/AccountType.java SystemUser/SystemUser.java Chief_event_coordinator/ChiefEventCoordinator.java Chief_event_coordinator/Classes/*.java Chief_event_coordinator/Abstract_Factory/*.java StrategyPattern/src/model/*.java
```

### 4. View the development history

To see all available branches:

```bash
git branch -a
```

Switch to a specific branch:

```bash
git checkout <branch-name>
```

Each branch contains its own commits, implementation files, and project progress.

> **Note:** This deliverable primarily focuses on software analysis and UML design. Executable Java source files may be located in individual branches rather than the main branch.

---

## Authors

**Group 14**

**Course:** EECS 3311 - Software Design  
**Institution:** York University
