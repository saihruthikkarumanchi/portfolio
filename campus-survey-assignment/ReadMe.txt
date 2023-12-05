Campus Survey Web Application - Project Documentation
Introduction
The Campus Survey Web Application is a full-stack project aiming to provide a seamless experience for prospective students to submit survey feedback about their campus visit. Developed using Angular 12 for the frontend, Spring Boot for the backend, JDBC/JPA for database management, and MariaDB as the relational database, the application covers various technologies to create a complete web solution.
Functionalities
Survey Form
* Prospective students can fill out a comprehensive survey form, covering personal information, feedback on the campus visit, and more.
* Frontend developed using Angular 12 invokes a RESTful call to store survey data in the MariaDB database using JDBC or JPA.
Surveys List
* Users can view all surveys recorded to date through a "Surveys List" link.
* The backend, powered by Spring Boot, handles API requests for retrieving survey data.
Technologies Used
1. Angular 12
2. Spring Boot
3. JDBC/JPA
4. MariaDB
5. DBeaver
APIs
1. POST API - Submit Survey
* Endpoint: http://localhost:8080/api/surveys (POST)
* Allows prospective students to submit survey data.
* Request Body: Student's personal information, feedback on the campus visit, and relevant data.
* Response: JSON object with submitted survey data and a unique identifier.
* Status Code: 201 (Survey created successfully)
2. GET API - Retrieve Surveys
* Endpoint: http://localhost:8080/api/surveys (GET)
* Allows users to retrieve all survey data collected so far.
* Response: JSON object with an array of all submitted surveys, each represented as a JSON object with a unique identifier.
* Status Code: 200 (Request processed successfully)
Database Information
* Database Name: campus_survey
* Table Name: survey
* Columns:
o id (Primary Key)
o first_name, last_name, street_address, city, state, zip, telephone_number, email
o date_of_survey, liked_most_about_campus, how_became_interested, likelihood_of_recommending, additional_comments
DDL for Survey Table
CREATE TABLE `survey` (
 `id` bigint(20) NOT NULL AUTO_INCREMENT,
 `first_name` varchar(255) NOT NULL,
 `last_name` varchar(255) NOT NULL,
 `street_address` varchar(255) NOT NULL,
 `city` varchar(255) NOT NULL,
 `state` varchar(255) NOT NULL,
 `zip` varchar(255) NOT NULL,
 `telephone_number` varchar(255) NOT NULL,
 `email` varchar(255) NOT NULL,
 `date_of_survey` timestamp NOT NULL,
 `liked_most_about_campus` varchar(255) NOT NULL,
 `how_became_interested` varchar(255) NOT NULL,
 `likelihood_of_recommending` varchar(255) NOT NULL,
 `additional_comments` varchar(1000) DEFAULT NULL,
 PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

Instructions to Start the Application
Frontend (Angular - campus-survey-app)
1. Open the root folder of the project.
2. Run the following commands in sequence:
a. npm i
b. ng serve
3. The application will start on port 4200.
Backend (Spring Boot - Campus-survey-server)
1. Install IntelliJ IDE and open the project root folder.
2. Install dependencies.
3. Run the main file to start the server.
4. The server will start on port 8080.


