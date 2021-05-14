CREATE TABLE users (
  id int PRIMARY KEY AUTO_INCREMENT,
  displayName varchar(255) UNIQUE KEY,
  firstName varchar(255),
  lastName varchar(255),
  emailAddress varchar(255),
  createdAt timestamp
);

CREATE TABLE vendor (
  id int PRIMARY KEY AUTO_INCREMENT,
  firstName varchar(255),
  lastName varchar(255),
  vendorTypeId int
);

CREATE TABLE vendor_type (
  id int PRIMARY KEY,
  type varchar(255)
);

CREATE TABLE reviews (
  id int PRIMARY KEY AUTO_INCREMENT,
  userId int,
  vendorId int,
  description varchar(255),
  reviewTime timestamp
);

ALTER TABLE reviews ADD FOREIGN KEY (userId) REFERENCES users (id);

ALTER TABLE reviews ADD FOREIGN KEY (vendorId) REFERENCES vendor (id);

ALTER TABLE vendor ADD FOREIGN KEY (vendorTypeId) REFERENCES vendor_type (id);

/****************************************************************************
       =========== INSERT DATA ================
****************************************************************************/
INSERT INTO users(displayName, firstName, lastName, emailAddress, createdAt)
VALUES ('Harshad', 'Harshad', 'Tambekar', 'htambekar@email.com', now()),
       ('Ovee', 'Ovee', 'Tambekar', 'otambekar@email.com', now()),
       ('Rucha', 'Rucha', 'Sule', 'rsule@email.com', now());


