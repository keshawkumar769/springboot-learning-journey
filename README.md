# springboot-learning-journey
A collection of Spring Boot projects built while learning Spring Boot from basics to advanced.
# Student CRUD REST API

A simple Spring Boot REST API to perform CRUD operations on student records. This project is part of my Spring Boot learning journey.

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Lombok
- Postman

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/students` | Get all students |
| GET | `/api/students/{id}` | Get a student by ID |
| POST | `/api/students` | Create a new student |
| PUT | `/api/students/{id}` | Update all student details |
| PATCH | `/api/students/{id}` | Update selected student details |

## How to Run

1. Clone the repository.
2. Configure the MySQL database.
3. Run the Spring Boot application.
4. Test the APIs using Postman.

## Future Improvements

- Bean Validation
- DTO (Request & Response)
- Global Exception Handling
- Delete API
- Spring Security & JWT
