# Spring Boot REST API Demo

This is a simple Spring Boot application demonstrating the implementation of a RESTful API for managing employees and departments.

## Features

- CRUD operations for managing employees
- CRUD operations for managing departments
- Custom query to update employee status
- Logging of REST endpoints using Aspect-Oriented Programming (AOP)
- Custom exception handling

## Technologies Used

- Spring Boot
- Spring Data JPA
- H2 Database (in-memory)
- Lombok (org.projectlombok)
- Aspect-Oriented Programming (AOP)
- Maven


## Getting Started

To run this application locally, follow these steps:

#1. Clone the repository:
- ```bash
   git clone https://github.com/acealbastoni/EtisalatUAEProject.git

#2. Navigate to the project directory:
 -   cd EtisalatUAEProject

#3.Build the project using Maven:
 -  mvn clean install

#4.Run the application:
 -   mvn spring-boot:run
#5.Access the API endpoints at:
 -       - http://localhost:8081/employees
 -       - http://localhost:8081/departments

## Configuration
Database configurations can be adjusted in the application.properties file.
Logging configurations can be adjusted in the logback.xml file.