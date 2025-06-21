# README for Telecom Billing System (Java Project)

---

## 📝 Project Overview

**Telecom Billing System** is a simple object-oriented Java application that simulates a telecom billing process. The system allows customers to subscribe to different telecom plans (Prepaid and Postpaid), calculate bills based on usage, and generate billing reports.

---

## 🖥️ Technologies Used

- Java (Standard Edition)
- Object-Oriented Programming (OOP)
- Inheritance & Polymorphism
- Command-line Interface (CLI)

---

## 📂 Project Structure

```
TelecomBillingSystem.java   # Complete Java source code
```

---

## 🔧 Prerequisites

- Java Development Kit (JDK 8 or higher)
- Verify Java installation:

```bash
java -version
javac -version
```

---

## 🚀 How to Compile and Run

### 1️⃣ Extract the ZIP File

Unzip `TelecomBillingSystem_Project.zip` to your desired location.

### 2️⃣ Compile the Java code

Open terminal/command prompt, navigate to the project directory and run:

```bash
javac TelecomBillingSystem.java
```

### 3️⃣ Run the application

```bash
java TelecomBillingSystem
```

✅ The CLI will prompt for customer name, plan selection, usage units, and then generate the bill.

---

## 🔬 Features

- ✅ Create customer subscriptions
- ✅ Support for two plans:
  - **Prepaid Plan:** Charges based on usage units
  - **Postpaid Plan:** Includes fixed monthly fee plus usage charges
- ✅ Allows multiple subscriptions per customer
- ✅ Generates billing report with total charges
- ✅ Object-oriented design using inheritance and polymorphism

---

## 📊 Example Use Case Flow

1️⃣ Start program and enter customer name.

2️⃣ Choose subscription type: Prepaid (1) or Postpaid (2).

3️⃣ Enter usage units.

4️⃣ Add multiple subscriptions if needed.

5️⃣ Program generates total billing report for the customer.

---

## ⚠ Challenges and Limitations

- Only numeric input is accepted for plan selection; entering text causes input mismatch errors.
- No persistent storage (data is lost once the program terminates).
- Only one customer billing session is supported per program run.
- Limited error handling and input validation.
- No breakdown by service type (voice, data, SMS) — usage is combined into a single unit.
- CLI only; no graphical interface for better usability.

---

## 🔮 Possible Future Enhancements

- Support for multiple customers
- File-based storage or database integration (JDBC/MySQL)
- GUI interface using Java Swing or JavaFX
- Additional telecom services (SMS, Data, Roaming, etc.)
- Advanced billing features (discounts, taxes, plan upgrades)
- Improved input validation and user-friendly prompts

