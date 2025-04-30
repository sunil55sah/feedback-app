-- feedback_db_setup.sql

CREATE DATABASE feedback_db;
USE feedback_db;

CREATE TABLE feedback (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    message TEXT
);
