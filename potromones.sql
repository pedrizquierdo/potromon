create database potromones;
use potromones;

CREATE TABLE Entrenadores (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    apodo VARCHAR(50)
);

CREATE TABLE Potromones (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    descripcion TEXT,
    imagen VARCHAR(255),
    entrenador_id INT,
    puntaje INT,
    FOREIGN KEY (entrenador_id) REFERENCES Entrenadores(id)
);

CREATE TABLE Habilidades (
    id INT PRIMARY KEY AUTO_INCREMENT,
    potromon_id INT,
    habilidad TEXT,
    FOREIGN KEY (potromon_id) REFERENCES Potromones(id)
);
