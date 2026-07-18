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
|--------|------------------|
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
│
├── Use Case Diagrams
├── Sequence Diagrams
├── Activity Diagrams
├── Class Diagram
├── Requirements Analysis
└── AI Assistant Adaptation Report
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

### 3. Explore the project

Browse the UML diagrams, documentation, and source files included in the repository.

### 4. View the development history

To see all available branches:

```bash
git branch -a
```

Switch to a specific branch:

```bash
git checkout <branch-name>
```

To run the GUI, please go to the Demo folder after downloading everything:
```bash

javac -d . -cp ".;Chief_event_coordinator\lib\javacsv.jar" Demo\RoomSchedulerGUI.java
```

```bash
java -cp ".;Chief_event_coordinator\lib\javacsv.jar" Chief_event_coordinator.Demo.RoomSchedulerGUI
Picked up JAVA_TOOL_OPTIONS: -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8
```

Each branch contains its own commits, implementation files, and project progress.

> **Note:** This deliverable primarily focuses on software analysis and UML design. Executable Java source files may be located in individual branches rather than the main branch.

---



## Authors

**Group 14**

**Course:** EECS 3311 – Software Design  
**Institution:** York University
