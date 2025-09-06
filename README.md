Got it — we’ll remove **Gitpod** references and make it a **clean Selenium + TestNG project README** for **manual/local execution only**.

---

# Janitri Task 2 – Automation Testing

This repository contains the **Selenium + TestNG Automation Framework** for **Task 2 of the Janitri project**.
It follows the **Page Object Model (POM)** and includes automated test scripts for the login functionality and related scenarios.

---

##  Features

* **Automation Framework:** Built using Selenium WebDriver, Java, TestNG, and Maven.
* **POM Architecture:** Clean and maintainable code structure.
* **Data-Driven Testing:** Supports parameterized inputs using TestNG DataProviders.

---

##  Project Structure

```
Janitri_Task2_Automation/
│-- src/
│   ├── main/java/...   # Page classes and utilities
│   └── test/java/...   # TestNG test cases
│-- pom.xml             # Maven dependencies
│-- README.md           # This file
```

---

##  Prerequisites

* **Java 17 or above**
* **Maven 3+**
* **TestNG plugin for IntelliJ IDEA or Eclipse**
* **Chrome browser & ChromeDriver (ensure version compatibility)**

---

##  Quick Start (Local Setup)

1. Clone the repository:

   ```bash
   git clone https://github.com/Rashmi0607/Janitri_Task2_Automation.git
   cd Janitri_Task2_Automation
   ```
2. Install dependencies:

   ```bash
   mvn clean install
   ```
3. Execute tests:

   ```bash
   mvn clean test
   ```

---

## 🧪 Test Scenarios

* **Functional Tests:** Valid login, invalid credentials, blank fields.
* **Negative Tests:** Wrong password, SQL injection attempt, empty submissions.
* **UI Tests:** Placeholder text, button alignment, password visibility toggle.
* **Boundary Tests:** Min/max character limits, leading/trailing space handling.

---

##  Reporting

* TestNG generates reports automatically in:

  ```
  target/surefire-reports
  ```

---

##  Author

**Rashmi**
Automation Testing Assignment – Janitri

---

