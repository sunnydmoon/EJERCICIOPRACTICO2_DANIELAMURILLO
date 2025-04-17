-- Crear usuario de conexión
CREATE USER 'Melanie'@'%' IDENTIFIED BY 'Melanie.';

-- Crear base de datos
CREATE DATABASE cine_teatro_db;

-- Otorgar permisos
GRANT ALL PRIVILEGES ON cine_teatro_db.* TO 'Melanie'@'%';
FLUSH PRIVILEGES;

-- Seleccionar la base de datos
USE cine_teatro_db;

-- Tabla de usuarios
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    correo VARCHAR(100) UNIQUE,
    contrasena VARCHAR(255),
    rol VARCHAR(20)
);

-- Tabla de películas u obras
CREATE TABLE peliculas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150),
    tipo VARCHAR(20) -- 'PELICULA' o 'OBRA'
);

-- Tabla de funciones
CREATE TABLE funciones (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_pelicula INT,
    fecha DATE,
    hora TIME,
    sala VARCHAR(50),
    FOREIGN KEY (id_pelicula) REFERENCES peliculas(id)
);

-- Tabla de reservas
CREATE TABLE reservas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    id_funcion INT,
    cantidad INT,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
    FOREIGN KEY (id_funcion) REFERENCES funciones(id)
);