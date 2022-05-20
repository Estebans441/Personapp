CREATE DATABASE persona_22_db;
CREATE USER 'persona_app'@'%' IDENTIFIED BY '123';
GRANT INSERT, UPDATE, DELETE, SELECT ON persona_22_db.* TO 'persona_app'@'%';
USE persona_22_db;



CREATE TABLE persona(
cedula INT(12) NOT NULL,
nombre VARCHAR(60) NOT NULL,
apellido VARCHAR(60) NOT NULL,
edad INT(2) NULL,
genero ENUM('M','F','O') NOT NULL,
CONSTRAINT persona_pk PRIMARY KEY(cedula)
);



CREATE TABLE telefono(
numero VARCHAR(60) NOT NULL,
operador VARCHAR(60) NOT NULL,
duenio INT(12) NOT NULL,
CONSTRAINT telefono_pk PRIMARY KEY(numero),
CONSTRAINT telefono_persona_fk FOREIGN KEY(duenio) REFERENCES persona(cedula)
);

SELECT * FROM persona_22_db.persona;
SELECT * FROM persona_22_db.telefono;

UPDATE persona SET nombre = 'Pepe', apellido = 'Perez', edad = 11, genero = 'M' WHERE cedula = 5;

DELETE FROM persona_22_db.persona WHERE cedula = 1000763462;