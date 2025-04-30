# Feedback App

A simple Java web application to collect and manage user feedback using Servlets, JSP, JDBC, and MySQL.

## 🚀 Tech Stack

- **Frontend:** HTML, CSS, Bootstrap
- **Backend:** Java (Servlets), JSP
- **Database:** MySQL
- **Build Tool:** Maven
- **IDE:** Eclipse
- **Servlet API:** `jakarta.servlet`

## 💡 Features

- Submit user feedback
- View all feedback entries
- Stores data in MySQL
- Clean and responsive UI

## 🛠️ Setup Instructions

Follow these steps to run the project locally:

1. **Clone the repository**
   ```bash
   git clone https://github.com/sunil55sah/feedback-app.git
   
2. Import into Eclipse as a Maven project.

3. Configure your database:

  Create a MySQL database named feedbackdb

  Update DB credentials in your DAO/config files.

4. Run the project on a server like Tomcat.

📁 Project Structure
feedback-app/
├── src/main/java/
│   └── com.feedback.servlet/
├── src/main/webapp/
│   ├── index.jsp
│   ├── feedback.jsp
├── WEB-INF/
│   └── web.xml
├── pom.xml
## Feedback Database Setup

To set up the feedback database, run the following SQL commands:

```sql
CREATE DATABASE feedback_db;
USE feedback_db;

CREATE TABLE feedback (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    message TEXT
);

![Feedback Form](https://github.com/sunil55sah/feedback-app/blob/main/feedback_form.jsp.png?raw=true)
![Thank You Page](https://github.com/sunil55sah/feedback-app/blob/main/thank_you.jsp.png?raw=true)
![Feedback List](https://github.com/sunil55sah/feedback-app/blob/main/feedback_list.jsp.png?raw=true)

##
Feel free to check it out! Feedback is welcome 😊  
#Java #JSP #Servlets #FullStackDevelopment #Maven #MySQL #WebDevelopment #GitHub #LinkedIn
