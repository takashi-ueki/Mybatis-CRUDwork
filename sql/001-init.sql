DROP TABLE IF EXISTS accounts;

CREATE TABLE accounts
(
	id int unsigned AUTO_INCREMENT,
	ex_in VARCHAR(2) NOT NULL,
	category VARCHAR(20) NOT NULL,
	amount int,
	PRIMARY KEY(id)
);

INSERT INTO accounts (id, ex_in, category, amount) VALUES (1, "ex", "Travel", 780);
INSERT INTO accounts (id, ex_in, category, amount) VALUES (2, "ex", "Food", 1080);
INSERT INTO accounts (id, ex_in, category, amount) VALUES (3, "in", "Income", 2000);