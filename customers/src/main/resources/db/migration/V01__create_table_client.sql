CREATE TABLE client (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL,
	identificationdocument VARCHAR(50),
	birthdate VARCHAR(50),
	gender VARCHAR(50),
	alias VARCHAR(50),
	street VARCHAR(50),
	number BIGINT(50),
	complement VARCHAR(50),
	neighborhood VARCHAR(50),
	city VARCHAR(50),
	state VARCHAR(50),
	type VARCHAR(50),
	numberphone BIGINT(15)
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO client (name, identificationdocument, birthdate, gender, alias, street, number, complement, neighborhood, city, state, type, numberphone) values ("name","identificationdocument","birthdate","gender","alias","street",123,"complement","neighborhood","city","state","type",123);

