# 🎓 Student Management System

A full-stack web application built using **Spring Boot**, **Thymeleaf**, and **Java**, designed to manage student data. The system allows users to perform CRUD operations like adding, editing, viewing, and deleting student records.

---

## ✨ Features

- Add, edit, view, and delete student details
- User-friendly UI built with Thymeleaf
- Clean layered architecture with DTOs and services
- Lightweight, runs with embedded Tomcat and H2/MySQL

---

## 📁 Project Structure

```
student-management-system/
├── src/
│   ├── main/
│   │   ├── java/com/anish/sms/
│   │   │   ├── controller/       # Handles HTTP requests
│   │   │   ├── dto/              # Data Transfer Object for students
│   │   │   ├── entity/           # Student JPA entity
│   │   │   ├── mapper/           # Maps DTOs to entities
│   │   │   ├── repository/       # Spring Data JPA repository
│   │   │   ├── service/          # Service interface
│   │   │   └── service/impl/     # Service implementation
│   │   └── resources/
│   │       ├── application.properties
│   │       └── templates/        # Thymeleaf templates (HTML)
│   └── test/
├── pom.xml                      # Maven build file
└── mvnw / mvnw.cmd              # Maven wrapper scripts
```

---

## 🚀 Getting Started

### 1. Clone the Repository

```
git clone https://github.com/Anish-3-12/student-management-system.git
cd student-management-system
```

### 2. Build and Run

```
./mvnw clean install
./mvnw spring-boot:run
```

### 3. Access the App

Navigate to:  
```
http://localhost:8080/students
```

---

## 💻 Technologies Used

- Java 17+
- Spring Boot
- Spring MVC
- Thymeleaf
- Spring Data JPA
- Maven

---

## 👨‍💻 Author

**Anish Sabale** – [@Anish-3-12](https://github.com/Anish-3-12)

---


## 🙋 Final Note

Built with simplicity and clarity in mind, this project is ideal for learning Spring Boot and MVC design. Contributions are welcome!
