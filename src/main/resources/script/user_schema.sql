create table account  (
                   id  INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
                   email VARCHAR(256),
                   password VARCHAR(256),
                   firstName VARCHAR(80),
                   lastName VARCHAR(80),

);

insert into account
(id, email, password, first_name, last_name)
values
('1','test','1234','firstname','lastname');