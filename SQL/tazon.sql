/*


*/
create database ch35;

USE ch35 ;

-

-- -----------------------------------------------------
-- Table ch35.perfil_Cliente
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS ch35.perfil_Cliente (
  idperfil_Cliente INT NOT NULL AUTO_INCREMENT,
  fecha_registro DATE NULL,
  preferencias MEDIUMTEXT NULL,
  PRIMARY KEY (idperfil_Cliente))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table ch35.Cliente
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS ch35.Cliente (
  id_Cliente INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NULL,
  apellido VARCHAR(45) NULL,
  correo VARCHAR(100) NULL,
  direccion VARCHAR(255) NULL,
  perfil_Cliente_idperfil_Cliente INT NOT NULL,
  PRIMARY KEY (id_Cliente, perfil_Cliente_idperfil_Cliente),
  INDEX fk_Cliente_perfil_Cliente1_idx (perfil_Cliente_idperfil_Cliente ASC) VISIBLE,
  CONSTRAINT fk_Cliente_perfil_Cliente1
    FOREIGN KEY (perfil_Cliente_idperfil_Cliente)
    REFERENCES ch35.perfil_Cliente (idperfil_Cliente)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table ch35.Productos
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS ch35.Productos (
  idProductos INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NULL,
  descripcion TEXT(300) NULL,
  precio DECIMAL(10,2) NULL,
  stock INT NULL,
  PRIMARY KEY (idProductos))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table ch35.Pedidos
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS ch35.Pedidos (
  id_Pedidos INT NOT NULL AUTO_INCREMENT,
  fecha DATE NULL,
  estado_pedido VARCHAR(45) NULL,
  total DECIMAL(10,2) NULL,
  Cliente_id_Cliente INT NOT NULL,
  PRIMARY KEY (id_Pedidos),
  INDEX fk_Pedidos_Cliente_idx (Cliente_id_Cliente ASC) VISIBLE,
  CONSTRAINT fk_Pedidos_Cliente
    FOREIGN KEY (Cliente_id_Cliente)
    REFERENCES ch35.Cliente (id_Cliente)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table ch35.detalles_Pedido
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS ch35.detalles_Pedido (
  id_detalles_Pedido INT NOT NULL AUTO_INCREMENT,
  cantidad INT NULL,
  precio_unitario DECIMAL(10,2) NULL,
  descuento DECIMAL(10,2) NULL,
  Pedidos_id_Pedidos INT NOT NULL,
  Productos_idProductos INT NOT NULL,
  PRIMARY KEY (id_detalles_Pedido),
  INDEX fk_detalles_Pedido_Pedidos1_idx (Pedidos_id_Pedidos ASC) VISIBLE,
  INDEX fk_detalles_Pedido_Productos1_idx (Productos_idProductos ASC) VISIBLE,
  CONSTRAINT fk_detalles_Pedido_Pedidos1
    FOREIGN KEY (Pedidos_id_Pedidos)
    REFERENCES ch35.Pedidos (id_Pedidos)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_detalles_Pedido_Productos1
    FOREIGN KEY (Productos_idProductos)
    REFERENCES ch35.Productos (idProductos)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table ch35.Producto_favoritos
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS ch35.Producto_favoritos (
  id_Producto_favoritos INT NOT NULL AUTO_INCREMENT,
  Productos_idProductos INT NOT NULL,
  PRIMARY KEY (id_Producto_favoritos, Productos_idProductos),
  INDEX fk_Producto_favoritos_Productos1_idx (Productos_idProductos ASC) VISIBLE,
  INDEX fk_Producto_favoritos_Cliente1_idx (id_Producto_favoritos ASC) VISIBLE,
  CONSTRAINT fk_Producto_favoritos_Productos1
    FOREIGN KEY (Productos_idProductos)
    REFERENCES ch35.Productos (idProductos)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_Producto_favoritos_Cliente1
    FOREIGN KEY (id_Producto_favoritos)
    REFERENCES ch35.Cliente (id_Cliente)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- Insertar
insert into perfil_Cliente (idperfil_Cliente, fecha_registro, preferencias)
values(1, '2024-01-28', 'Tazas starbucks');

insert into cliente (id_cliente, nombre, apellido, correo, direccion,perfil_Cliente_idperfil_Cliente)
values(1, 'Daniel', 'Maldonado', 'danim@ejemplo.com', 'p sherman 42, Sydney',10);

insert into cliente (id_cliente, nombre, apellido, correo, direccion,perfil_Cliente_idperfil_Cliente)
values(2, 'Gabriela', 'Cortes', 'gabyc@ejemplo.com', 'Jalisco',2);

insert into cliente (id_cliente, nombre, apellido, correo, direccion,perfil_Cliente_idperfil_Cliente)
values(3, 'Rocio', 'Hernandez', 'rhdz@ejemplo.com', 'CDMX', 3);

insert into cliente (id_cliente, nombre, apellido, correo, direccion,perfil_Cliente_idperfil_Cliente)
values(4, 'Cindy', 'Rejon', 'crejon@ejemplo.com', 'Yucatan', 4);

insert into cliente (id_cliente, nombre, apellido, correo, direccion,perfil_Cliente_idperfil_Cliente)
values(5, 'Rodrigo', 'Macedo', 'rmacedo@ejemplo.com', 'Quintana Roo', 5);

insert into cliente (id_cliente, nombre, apellido, correo, direccion,perfil_Cliente_idperfil_Cliente)
values(6, 'Martin', 'Cortez', 'martinc@ejemplo.com', 'Guanajuato', 6);

insert into cliente (id_cliente, nombre, apellido, correo, direccion,perfil_Cliente_idperfil_Cliente)
values(7, 'Rey', 'Martinez', 'rmartinez@ejemplo.com', 'Veracruz', 7);

insert into cliente (id_cliente, nombre, apellido, correo, direccion,perfil_Cliente_idperfil_Cliente)
values(8, 'Ximena', 'Munoz', 'xmunoz@ejemplo.com', 'Jalisco', 8);

insert into cliente (id_cliente, nombre, apellido, correo, direccion,perfil_Cliente_idperfil_Cliente)
values(9, 'Uriel', 'Cardoso', 'ucardoso@ejemplo.com', 'Estado de México', 9);

insert into cliente (id_cliente, nombre, apellido, correo, direccion,perfil_Cliente_idperfil_Cliente)
values(10, 'Diego', 'Gonzalez', 'diegog@ejemplo.com', 'CDMX', 10);

-- Insertar datos en la tabla cliente 
INSERT INTO productos (nombre, descripcion, precio, stock)
VALUES ('Taza Clásica Blanca', 'Taza de cerámica blanca con diseño clásico.', 9.99, 100);
INSERT INTO productos (nombre, descripcion, precio, stock)
VALUES('Taza de Viaje Acero Inoxidable', 'Taza térmica de acero inoxidable ideal para viajes.', 14.99, 50);
INSERT INTO ch35.porducto (nombre, descripcion, precio, stock)
VALUES('Taza con Asa de Corazón', 'Taza de cerámica con asa en forma de corazón.', 12.99, 75);
INSERT INTO ch35.porducto (nombre, descripcion, precio, stock)
VALUES('Taza Grande de Colores', 'Taza grande con colores vibrantes y diseño moderno.', 11.99, 80);
INSERT INTO ch35.porducto (nombre, descripcion, precio, stock)
VALUES('Taza de Porcelana Floral', 'Taza de porcelana con delicado diseño floral.', 15.99, 60);
INSERT INTO ch35.porducto (nombre, descripcion, precio, stock)
VALUES('Taza de Café Expreso', 'Taza pequeña ideal para café expreso.', 8.99, 120);
INSERT INTO ch35.porducto (nombre, descripcion, precio, stock)
VALUES('Set de Tazas de Té', 'Conjunto de tazas elegantes para té con platos a juego.', 19.99, 40);
INSERT INTO ch35.porducto (nombre, descripcion, precio, stock)
VALUES('Taza con Mensaje Motivacional', 'Taza con mensaje positivo para empezar el día.', 10.99, 90);
INSERT INTO ch35.porducto (nombre, descripcion, precio, stock)
VALUES('Taza de Cristal Doble Pared', 'Taza transparente de doble pared para bebidas calientes.', 17.99, 55);
INSERT INTO ch35.porducto (nombre, descripcion, precio, stock)
VALUES('Taza Personalizada con Foto', 'Taza personalizable con la imagen que desees.', 13.99, 70);