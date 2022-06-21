DROP TABLE Sample10;
CREATE TABLE Sample10 (
	no			INT(11)			DEFAULT NULL,
	name		VARCHAR(20) 	DEFAULT NULL,
	birthday	DATE			DEFAULT NULL,
	address		VARCHAR(40) 	DEFAULT NULL
);

SELECT * FROM Sample10;

INSERT INTO Sample10 VALUES (1, '유비', '1996-10-25', '대구 중구 반월당');
INSERT INTO Sample10 VALUES (2, '관우', '1999-08-12', '서울 태해''''안로291');
INSERT INTO Sample10 VALUES (3, '장비', '1996-03-07', '대구 달성군 대실');

CREATE TABLE Customer (
	cid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	name		VARCHAR(20)		NOT NULL,
	ssn			VARCHAR(14)		NOT NULL,
	phone		VARCHAR(14)		NOT NULL,
	customerID	VARCHAR(16)		NOT NULL,
	passwd		VARCHAR(60)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
) AUTO_INCREMENT = 1001;

SELECT * FROM Customer;

INSERT INTO Customer (name, ssn, phone, customerID, passwd) VALUES ('유비', '901213-1234567', '010-2323-2323', 'java', '1111');
INSERT INTO Customer (name, ssn, phone, customerID, passwd) VALUES ('관우', '902314-2345678', '010-4545-4545', 'mysql', '2222');
INSERT INTO Customer (name, ssn, phone, customerID, passwd) VALUES ('장비', '961578-1523267', '010-9988-9988', 'maven', '3233');

UPDATE Customer SET ssn='901212-1234567', phone='010-3434-4444' WHERE cid=1001;

DELETE FROM Customer WHERE cid=1005;