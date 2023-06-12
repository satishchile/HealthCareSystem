# HealthCareSystem
# Spring Boot Application Structure

This is a typical structure for a Spring Boot application, organized into layers:

- **Presentation Layer (Controllers)**: Handles incoming HTTP requests and generates appropriate responses. In this layer, you define REST endpoints and map them to controller methods. The controllers validate incoming data, perform data transformation, and delegate business logic to the service layer. They also handle exception handling and error responses.

- **Business Layer (Service Layer)**: Implements the business logic of the application. The service layer orchestrates the flow of data between the presentation layer and the persistence layer. It performs business-specific operations and validations. Additionally, it may involve transaction management and coordination of multiple repositories or external services.

- **Persistence Layer (Repository)**: Interacts with the database or any other data storage system. The repository layer provides interfaces or classes for performing CRUD (Create, Read, Update, Delete) operations on entities. It executes queries and retrieves data from the database. This layer often includes data mapping or object-relational mapping (ORM) frameworks like Hibernate.

- **Entity Layer**: Represents the data structures or entities of the application. The entity layer defines the properties, relationships, and behaviors of the data objects. Typically, entities correspond to database tables or collections. This layer may include data validation annotations, serialization/deserialization logic, and utility methods.

## Model: User

Attributes:

- Name
- Blood Group
- Age
- Phone Number
- Address
- Pin Code
- Email
- Password

Explanation:

- **Name**: Accepts the user's name.
- **Blood Group**: Accepts the user's blood group, which can be useful during emergencies.
- **Age**: Accepts the user's age.
- **Phone Number**: Accepts the user's phone number for contact purposes.
- **Address**: Accepts the user's address, which can help locate the patient accurately when required.
- **Pin Code**: Accepts the pin code corresponding to the user's location.
- **Email**: Accepts the user's email, which will be used for login in the system.
- **Password**: Accepts the user's password, which is required for authentication.

## Starting SpringBoot App Successfully
![image](https://github.com/satishchile/HealthCareSystem/assets/124240024/4f99c6e5-85bf-4870-b551-bbf0f578bb30)

## Registration Process
![Screenshot (2939)](https://github.com/satishchile/HealthCareSystem/assets/124240024/071cc5e1-cff9-4411-860a-90977efb4c54)
--changes reflecting in dataBase
![Screenshot (2940)](https://github.com/satishchile/HealthCareSystem/assets/124240024/4131fef6-cdfb-403a-abae-ed7e4961013f)

while registering user with hhp post method having url of register  
    POST/register
    HTTP Method: POST
    Endpoint: /register
    
    
 ## Nowly added user login in your application
    ![Screenshot (2941)](https://github.com/satishchile/HealthCareSystem/assets/124240024/155c7bd1-5f26-45a2-b3c3-6bc10f2d5b35)

    
    



