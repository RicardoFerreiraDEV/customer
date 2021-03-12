CREATE TABLE phone (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	type VARCHAR(50) NOT NULL,
	number VARCHAR(30)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO phone (type,number) values ('teste', 123);
