# Wishlist Management System

This repository contains the source code for a Wishlist Management System application. The application allows users to manage their wishlists, add products, and authenticate themselves. It provides various endpoints for handling different functionalities.

## Frameworks and Language Used

- Java
- Maven
- Spring Boot
- MySQL

## Prerequisites
Before running the application, ensure you have the following installed on your system:

- Java Development Kit (JDK) 17 or higher: Required for running the Java application.

- MySQL Database Server: Needed for storing application data.
- Maven Build Tool: Used for managing dependencies and building the application.

## Required Dependencies

To run this project, you will need to add the following dependencies to your `pom.xml` file:

- Spring Web
- Spring Data JPA
- Spring Security
- Lombok
- Spring Boot Starter Validation
- JUnit
- JWT Token

## Setup
Follow these steps to set up and run the application locally:

1. Clone the Repository:
```properties
git clone https://github.com/your-username/Wishlist-Management.git
```

2. Configure Database:

```properties
Open src/main/resources/application.properties.
```

3. Modify the database connection details (URL, username, password) to match your MySQL setup.

## Run the Application:

```bash
mvn spring-boot:run
```


## Running Unit Tests
The application includes unit tests to ensure its correctness. To run the tests, use the following command:
```properties
mvn test
```

## Entities
The following entities are used in the application:

- User: Represents a user of the application.
- Product: Represents a product added to a user's wishlist.

## Database Configuration

To connect to a MySQL database, update the `application.properties` file with the appropriate database URL, username, and password. The following properties need to be updated:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/wishlist?autoReconnect=true&useSSL=false&createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.show-sql=true
```
## Controllers
The application contains several controllers to handle different operations and manage the flow of data. The controllers and their associated methods are as follows:

- addProduct: Adds a product to a user's wishlist.
- getUserWishlist: Retrieves a user's wishlist based on email and password.
- deleteWishList: Deletes a product from the wishlist based on its ID.
- addUser: Adds a new user to the system.

## Data Flow
- The user sends a request to the application through the API endpoints.
- The API receives the request and sends it to the appropriate controller method.
- The controller method makes a call to the method in the service class.
- The method in the service class builds logic and retrieves or modifies data from the database, which is in turn given to the controller class.
- The controller method returns a response to the API.
- The API sends the response back to the user.

## Project Summary
The Wishlist Management System is an application that allows users to manage their wishlists. Users can add products to their wishlist, view their wishlist, and delete products from their wishlist. The application provides authentication for users and includes controllers for wishlist management and user management.
