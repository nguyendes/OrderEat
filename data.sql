CREATE DATABASE order_eat_db;
USE order_eat_db;

CREATE TABLE User (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

CREATE TABLE Store (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL
);

CREATE TABLE Driver (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    licenseNumber VARCHAR(255) NOT NULL
);

CREATE TABLE Menu (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    store_id BIGINT,
    FOREIGN KEY (store_id) REFERENCES Store(id)
);

CREATE TABLE `Order` (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    status VARCHAR(255) NOT NULL,
    user_id BIGINT,
    driver_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES User(id),
    FOREIGN KEY (driver_id) REFERENCES Driver(id)
);

CREATE TABLE OrderDetail (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    quantity INT NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    order_id BIGINT,
    menu_id BIGINT,
    FOREIGN KEY (order_id) REFERENCES `Order`(id),
    FOREIGN KEY (menu_id) REFERENCES Menu(id)
);
-- Insert data into User
INSERT INTO User (username, password, email) VALUES
('user1', 'password1', 'user1@example.com'),
('user2', 'password2', 'user2@example.com'),
('user3', 'password3', 'user3@example.com');

-- Insert data into Store
INSERT INTO Store (name, address) VALUES
('Store 1', '123 Main St'),
('Store 2', '456 Market St'),
('Store 3', '789 Broadway');

-- Insert data into Driver
INSERT INTO Driver (name, licenseNumber) VALUES
('Driver 1', 'LIC12345'),
('Driver 2', 'LIC67890'),
('Driver 3', 'LIC11223');

-- Insert data into Menu
INSERT INTO Menu (name, price, store_id) VALUES
('Burger', 5.99, 1),
('Pizza', 7.99, 1),
('Sushi', 12.99, 2),
('Pasta', 8.99, 2),
('Tacos', 3.99, 3),
('Salad', 4.99, 3);

-- Insert data into Order
INSERT INTO `Order` (status, user_id, driver_id) VALUES
('Pending', 1, 1),
('Delivered', 2, 2),
('Cancelled', 3, 3);

-- Insert data into OrderDetail
INSERT INTO OrderDetail (quantity, price, order_id, menu_id) VALUES
(2, 11.98, 1, 1),
(1, 7.99, 1, 2),
(3, 38.97, 2, 3),
(2, 17.98, 2, 4),
(4, 15.96, 3, 5),
(1, 4.99, 3, 6);
