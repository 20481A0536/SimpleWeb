# SimpleWeb Application

## Overview

The **SimpleWeb** application is a Spring Boot RESTful web service that manages a collection of products. It allows users to perform CRUD (Create, Read, Update, Delete) operations on products through a RESTful API. The application is designed to be simple yet functional, showcasing the integration of Spring Boot, JPA, and a relational database.

## Technologies Used

- Spring Boot
- Spring Data JPA
- Hibernate
- Jakarta Persistence
- RESTful Web Services
- Java

## Project Structure

The project consists of the following main packages:

1. **`model`**: Contains the entity class representing a Product.
2. **`repository`**: Contains the interface for accessing product data from the database.
3. **`service`**: Contains the service layer that holds the business logic for product management.
4. **`controller`**: Contains the REST controller for handling HTTP requests related to products.
5. **`SimpleWebApplication`**: The main application class to run the Spring Boot application.

### Class Descriptions

- **`Product`** (in `model` package):
  - Represents a product entity with fields for product ID, name, and price.
  - Uses JPA annotations for ORM (Object-Relational Mapping).

- **`ProductRepository`** (in `repository` package):
  - An interface that extends `JpaRepository` to provide CRUD operations for the `Product` entity.

- **`ProductService`** (in `service` package):
  - Contains the business logic for managing products.
  - Interacts with `ProductRepository` to perform operations like adding, updating, and deleting products.

- **`ProductController`** (in `controller` package):
  - A REST controller that handles HTTP requests for product management.
  - Defines endpoints for retrieving all products, retrieving a product by ID, adding a new product, updating a product, and deleting a product.

## API Endpoints

| HTTP Method | Endpoint                | Description                                  |
|-------------|-------------------------|----------------------------------------------|
| GET         | `/products`            | Retrieve all products                        |
| GET         | `/products/{prodId}`   | Retrieve a product by its ID                |
| POST        | `/products/additem`    | Add a new product                            |
| PUT         | `/products`            | Update an existing product                   |
| DELETE      | `/products/{prodId}`   | Delete a product by its ID                   |

## Getting Started

### Prerequisites

- JDK 11 or higher
- Maven or Gradle
- A relational database (e.g., MySQL, H2)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/20481A0536/SimpleWeb.git
   cd SimpleWeb

2.Build the application: If using Maven:
mvn clean install


3.Configure the application properties: Update application.properties (or application.yml) for your database connection details.

4.Run the application:
mvn spring-boot:run  or run the simplewebApplication.java 

5.Access the application: The application will be available at http://localhost:8080.

Example Usage
Adding a Product
bash
curl -X POST http://localhost:8080/products/additem -H "Content-Type: application/json" -d '{"prodId":1,"prodName":"Product A","price":100}'


Retrieving All Products
```bash
curl http://localhost:8080/products

Updating a Product
```bash
curl -X PUT http://localhost:8080/products -H "Content-Type: application/json" -d '{"prodId":1,"prodName":"Updated Product A","price":150}'

Deleting a Product
```bash
curl -X DELETE http://localhost:8080/products/1

License
This project is licensed under the MIT License - see the LICENSE file for details.

Acknowledgments
Spring Boot Documentation
Spring Data JPA
Jakarta Persistence


### Notes:
- **Endpoints**: Make sure the endpoints and request bodies match your actual implementation.
- **License**: You can modify the license section according to your project's licensing.
- **Database Configuration**: Ensure to provide instructions for configuring the database if needed.
- **Further Enhancements**: You might want to add sections for testing, deployment, or additional features if applicable.

Feel free to customize this template to suit your project's specifics!






