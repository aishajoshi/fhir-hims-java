 Project Description:

This project is a simplified FHIR R4 based Hospital Information Management System (HIMS) module developed in Java.
It focuses on implementing the Patient resource following FHIR R4 concepts.
The application follows a layered architecture:
Controller layer (REST APIs)
Service layer (business logic)
Repository layer (JDBC + MySQL)
FHIR Mapper layer (internal model → FHIR format)

 Database:
MySQL
JDBC used for persistence
patient table stores core patient data

Technologies Used:
Java
Spring Boot (without JPA)
JDBC
MySQL
REST APIs

API Endpoints
base url:
http://localhost:8181
Get Patient by ID:
.GET /patients/{id}(Returns patient details from the database.)
Create Patient(Creates a new patient record in the database.)
Testing Approach:
(com.pascal.ptm.examples.PatientServiceExample)




