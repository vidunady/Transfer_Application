# Transfer Application

This is a simple Spring Boot application for transferring money between accounts. It provides a RESTful API for handling money transfers, simulating an in-memory database for account management.

## Features

- **Account Management**: In-memory data structure to store account details (account number and balance).
- **Money Transfer**: Handles transferring money between source and destination accounts.
- **API Endpoints**: Provides a REST API for transferring money.
- **Error Handling**: Returns appropriate error messages for invalid transactions.

## Technologies Used

- **Java**: Programming language for backend.
- **Spring Boot**: Framework for creating the REST API.
- **Lombok**: Library for reducing boilerplate code (getters, setters, constructors).

## Setup Instructions

### Prerequisites

Make sure you have the following installed on your machine:
- **Java 17** or later
- **Maven** (or Gradle)
- **IDE**: IntelliJ IDEA, Eclipse, or any Java-compatible IDE

### Steps to Run the Application

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <project-directory>
   
2. Build the project using Maven: 

   mvn clean install

3. Run the application:

   mvn spring-boot:run

4. The application will start on http://localhost:8080.

API Endpoints

1. Transfer Money

    URL: /api/transfers

    Method: POST

    Request Body:

        {
        "sourceAccountNo": "12345",
        "destinationAccountNo": "67890",
        "amount": 100.0
        }
    Response (success):
        
        "Transfer successful"
    Response (error - account not found):

        "Account not found"
    Response (error - insufficient balance):

        "Insufficient balance"

   2. Example Request Using curl

         To make a transfer via curl:

           curl -X POST http://localhost:8080/api/transfers -H "Content-Type: application/json" -d '{
           "sourceAccountNo": "12345",
           "destinationAccountNo": "67890",
           "amount": 100.0
           }'
   
Testing
   The project includes unit tests using JUnit to ensure core functionality is working correctly. You can run the tests using:

            mvn test

Error Handling
    The application currently handles the following errors:

            Account not found: If either the source or destination account does not exist.
            Insufficient balance: If the source account has less balance than the transfer amount.
            Invalid transaction data: Invalid or negative amounts.
