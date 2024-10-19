# eCommerce System 🛒
A comprehensive eCommerce application that enables users to register, manage their profiles, and place orders, 
while providing administrators with the ability to manage users, view orders, and change order statuses. This project emphasizes security through authentication and authorization.

## Features ✨
- User Registration: Users can create accounts to shop securely.
- Password Recovery: Users can recover forgotten passwords easily.
- Profile Management: Users can view and update their profile information.
- Admin Panel: Admins can add new admin users and manage user accounts.
- Order Management: Admins can view all orders and update order statuses.
- Shopping Cart: Users can add items to their cart and proceed to checkout.
- Authentication & Authorization: Implemented secure login and role-based access control.

## Demo 🎥
- Screenshot of the application in action (replace with actual screenshot)

## Installation and Setup 🔧

### Prerequisites
- Java Development Kit (JDK) 11 or higher
- Apache Maven
- MySQL or any relational database
- IDE (e.g., IntelliJ IDEA, Eclipse)

### Steps to Run the Application
1. Clone the Repository:
   ```bash
   git clone https://github.com/SaifMulla15/ecommerce-project.git

   Navigate to Project Directory:
cd ecommerce-system.

Database Setup:
Create a new MySQL database for the application.
Update the application.properties file with your database credentials.

Build the Application:
mvn clean install

Run the Application:
mvn spring-boot:run

Access the Application:
Open your browser and go to http://localhost:8080.

Project Structure 📂
src/main/java - Java source files for backend logic and controllers.
src/main/resources - Configuration files, including application.properties.
src/main/resources/templates - Thymeleaf templates for the frontend.
src/main/resources/static - Static resources like CSS, JavaScript, and images.
pom.xml - Maven configuration file for dependencies.


Technologies Used 💻
Frontend:
Thymeleaf - For rendering dynamic web pages.
HTML5, CSS3 - For structuring and styling.
Bootstrap - For responsive design.
JavaScript - For client-side interactivity.

Backend:
Spring Boot - For building the RESTful API.
Spring MVC - For handling web requests.
Spring Security - For implementing authentication and authorization.
Java - Core programming language used.

How to Customize 🛠️
You can modify the styles by editing the CSS files in the static directory.
Update or add new features in the backend by editing the controllers and services in the java directory.

Contributors ✨
Saif Mulla
