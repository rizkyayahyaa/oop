-- V1__create_book_table.sql
CREATE TABLE Book (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    price VARCHAR(255) NOT NULL
);
