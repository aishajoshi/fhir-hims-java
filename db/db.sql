CREATE DATABASE fhir_hims;
USE fhir_hims;
CREATE TABLE patient (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,

                         fhir_id VARCHAR(64) UNIQUE NOT NULL,

                         first_name VARCHAR(100),
                         last_name VARCHAR(100),

                         gender VARCHAR(20),
                         birth_date DATE,

                         phone VARCHAR(20),
                         email VARCHAR(100),

                         active BOOLEAN DEFAULT TRUE,

                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
