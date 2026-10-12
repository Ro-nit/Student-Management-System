# Student Management System

A console based Student Management System developed using Java, JDBC, and MySQL.

## Features
- Add a student
- Delete a student
- Update student details
- Display all students

## Technologies Used
- Java
- JDBC
- MySQL
- MySQL Connector/J

## Database Setup

Create a database named sms and a table named student.

```sql
CREATE DATABASE sms;
USE sms;

CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    subject VARCHAR(100),
    marks INT
);
```

## How to Run
1. Install Java and MySQL.
2. Add MySQL Connector/J to the project classpath.
3. Configure the database connection.
4. Compile and run the Java program.
