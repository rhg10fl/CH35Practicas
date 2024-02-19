create database taza;

use taza;
-- -----------------------------
-- Crear la tabla de Clientes
CREATE TABLE IF NOT EXISTS Clientes (
    ID_Cliente INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(50),
    Apellido VARCHAR(50),
    CorreoElectronico VARCHAR(100),
    Direccion VARCHAR(255)
);

-- Crear la tabla de Productos
CREATE TABLE IF NOT EXISTS Productos (
    ID_Producto INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(100),
    Descripcion TEXT,
    Precio DECIMAL(10, 2)
);

-- Crear la tabla de Pedidos
CREATE TABLE IF NOT EXISTS Pedidos (
    ID_Pedido INT PRIMARY KEY AUTO_INCREMENT,
    ID_Cliente INT,
    Fecha DATE,
    EstadoPedido VARCHAR(50),
    Total DECIMAL(10, 2),
    FOREIGN KEY (ID_Cliente) REFERENCES Clientes(ID_Cliente)
);

-- Crear la tabla de Detalles de Pedido
CREATE TABLE IF NOT EXISTS DetallesPedido (
    ID_Detalle INT PRIMARY KEY AUTO_INCREMENT,
    ID_Pedido INT,
    ID_Producto INT,
    Cantidad INT,
    PrecioUnitario DECIMAL(10, 2),
    Subtotal DECIMAL(10, 2),
    FOREIGN KEY (ID_Pedido) REFERENCES Pedidos(ID_Pedido),
    FOREIGN KEY (ID_Producto) REFERENCES Productos(ID_Producto)
);

-- Insertar un cliente
INSERT INTO Clientes (Nombre, Apellido, CorreoElectronico, Direccion)
VALUES ('John', 'Doe', 'john.doe@example.com', '123 Main St');

-- Insertar un producto
INSERT INTO Productos (Nombre, Descripcion, Precio)
VALUES ('Taza tipo pixar', 'Taza de animacion tipo pixart 3D', 99.99);
INSERT INTO Productos (Nombre, Descripcion, Precio)
VALUES ('Taza tipo monstruo', 'Taza de animacion tipo monstruo 3D', 79.99);
INSERT INTO Productos (Nombre, Descripcion, Precio)
VALUES ('Thermo de monstruo', 'Thermo de animacion tipo monstruo 3D', 119.99);
INSERT INTO Productos (Nombre, Descripcion, Precio)
VALUES ('Vaso plegable de monstruo', 'Vaso de animacion tipo monstruo 3D', 29.99);
INSERT INTO Productos (Nombre, Descripcion, Precio)
VALUES ('Tazoon de monstruo', 'Tazoon de animacion tipo monstruo 3D', 49.99);
INSERT INTO Productos (Nombre, Descripcion, Precio)
VALUES ('Jarron de monstruo', 'Jarron de animacion tipo monstruo 3D', 19.99);


-- Insertar un pedido
INSERT INTO Pedidos (ID_Cliente, Fecha, EstadoPedido, Total)
VALUES (1, '2022-01-20', 'En Proceso', 99.99);


-- Insertar detalle de pedido
INSERT INTO DetallesPedido (ID_Pedido, ID_Producto, Cantidad, PrecioUnitario, Subtotal)
VALUES (1, 1, 2, 99.99, 199.98);



-- Insertar un nuevo producto
INSERT INTO Productos (Nombre, Descripcion, Precio)
VALUES ('Taza de personaje', 'TAZA DE ANIMACIÓN TIPO PIXAR EN 3D', 169.99);