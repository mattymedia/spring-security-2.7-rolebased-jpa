INSERT INTO roles(name_role) VALUES('ROLE_ADMIN');
INSERT INTO roles(name_role) VALUES('ROLE_USER');

INSERT INTO books(title, author, published_date, create_at) VALUES('La Maria', 'Jorge Isaacs', '1867-06-08', '2023-01-19');
INSERT INTO books(title, author, published_date, create_at) VALUES('Cien años de soledad', 'Gabriel García Márquez', '1967-03-05', '2023-01-19');

INSERT INTO users(username, password, email) VALUES('admin','$2a$10$LzVc.pMqiAtqIjUx9zYFWe/Gj4U5WQNTW6MQSLVHSrEujD4OFD3gi','admin@email.com');
INSERT INTO users(username, password, email) VALUES('user','$2a$10$qS83ksTarUhEkz.Uk8hNZu8fKkUWe6fxu3XvpC4CE/DqAUJD88chu','user@email.com');

INSERT INTO role_users(user_id, role_id) VALUES(1,1);
INSERT INTO role_users(user_id, role_id) VALUES(1,2);
INSERT INTO role_users(user_id, role_id) VALUES(2,2);