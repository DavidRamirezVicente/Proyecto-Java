DROP DATABASE IF EXISTS java_project;
CREATE DATABASE IF NOT EXISTS java_project;

USE java_project;

CREATE TABLE IF NOT EXISTS username(
	iduser INT AUTO_INCREMENT PRIMARY KEY,
	email VARCHAR(50) NOT NULL,
	username VARCHAR(20) NOT NULL,
	pass VARCHAR(20) NOT NULL
);


CREATE TABLE IF NOT EXISTS question(
	idquestion INT AUTO_INCREMENT PRIMARY KEY,
	question VARCHAR(255) NOT NULL,
	iduser INT,
	FOREIGN KEY (iduser) REFERENCES username(iduser)
);

CREATE TABLE IF NOT EXISTS Answers(
	answer longtext not null,
	idquestion INT,
	iduser INT,
    primary key(idQuestion,idUser),
	FOREIGN KEY (iduser) REFERENCES username(iduser),
	FOREIGN KEY (idquestion) REFERENCES question(idquestion)
);