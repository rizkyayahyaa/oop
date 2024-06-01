CREATE TABLE transaction (
    id INT AUTO_INCREMENT PRIMARY KEY,
    buyerName VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL,
    phoneNumber VARCHAR(20) NOT NULL,
    quantity INT NOT NULL,
    total_price DECIMAL(10,2) NOT NULL,
    book_id INT,
    FOREIGN KEY (book_id) REFERENCES book(id)
);