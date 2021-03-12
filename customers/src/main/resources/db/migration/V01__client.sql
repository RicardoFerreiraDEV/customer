CREATE TABLE client (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL,
	identificationdocument VARCHAR(50),
	birthdate VARCHAR(50),
	gender VARCHAR(50)
	codigo_anddress BIGINT(20) NOT NULL,
	codigo_phone BIGINT(20) NOT NULL,
	FOREIGN KEY (codigo_anddress) REFERENCES andress(codigo),
	FOREIGN KEY (codigo_phone) REFERENCES phone(codigo),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO client (name) values ('teste');