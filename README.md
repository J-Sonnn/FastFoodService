# FastFoodService

FastFoodService is a comprehensive application for managing a fast-food network, providing various functionalities for administrators, users, and fast-food employees.

## Project Structure

The project consists of three main applications:

1. **admin-application**: An application for administrators, providing the ability to manage restaurants, categories, and menus.

2. **user-application**: An application for users, offering an interface to view the menu, place orders, and track order status.

3. **employee-application**: An application for fast-food employees, providing functionality for order processing and inventory management.

## Technologies and Dependencies

The project is built using the following technologies and dependencies:

- [Spring Boot](https://spring.io/projects/spring-boot): Core framework for building Java applications.
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa): Simplifies database access using Java Persistence API (JPA).
- [Spring REST](https://spring.io/guides/gs/rest-service/): Building RESTful web services with Spring.
- [Spring MVC](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html): Model-View-Controller framework for building web applications.
- [Lombok](https://projectlombok.org/): Library to reduce boilerplate code in Java.
- [MySQL](https://www.mysql.com/): Database management system for data storage.
- [Google Maps API](https://developers.google.com/maps/documentation): Integration for location-based services.

## Running the Project

Each application can be run independently. To run the admin-application, follow these steps:

```bash
cd admin-application
./mvnw spring-boot:run
