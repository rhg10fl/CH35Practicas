-- Consultas
SELECT * FROM Clientes;
-- 
SELECT * FROM Productos;
-- 
SELECT * FROM Pedidos;
-- 
SELECT * FROM DetallesPedido;
-- ------------------------------
-- JOINS 
-- ------------------------------

-- INNER JOIN para obtener detalles de los pedidos con información del cliente:
SELECT DetallesPedido.*, Clientes.Nombre, Clientes.Apellido
FROM DetallesPedido
INNER JOIN Pedidos ON DetallesPedido.ID_Pedido = Pedidos.ID_Pedido
INNER JOIN Clientes ON Pedidos.ID_Cliente = Clientes.ID_Cliente;

--  LEFT JOIN para obtener todos los clientes y sus pedidos (incluso si no tienen pedidos):
SELECT Clientes., Pedidos.
FROM Clientes
LEFT JOIN Pedidos ON Clientes.ID_Cliente = Pedidos.ID_Cliente;

-- INNER JOIN para obtener información completa de un pedido, incluidos productos y cliente:
SELECT Pedidos., DetallesPedido., Productos.*
FROM Pedidos
INNER JOIN DetallesPedido ON Pedidos.ID_Pedido = DetallesPedido.ID_Pedido
INNER JOIN Productos ON DetallesPedido.ID_Producto = Productos.ID_Producto;

-- INNER JOIN para obtener los productos y la cantidad comprada en cada pedido:
SELECT Pedidos.ID_Pedido, Productos.Nombre, DetallesPedido.Cantidad
FROM Pedidos
INNER JOIN DetallesPedido ON Pedidos.ID_Pedido = DetallesPedido.ID_Pedido
INNER JOIN Productos ON DetallesPedido.ID_Producto = Productos.ID_Producto;

SELECT MIN(precio) AS 'Precio Mínimo' FROM productos;

-- Sentencias/querys/comandos basicos de SQL

-- Mostrar las bases de datos almacenadas 

SHOW DATABASES; 



-- Para usar una base de datos en especifico es 
USE taza;


-- Mostrar las tablas 
SHOW TABLES;

/*
DML COMANDOS 
SELECT Nos va a mostrar la informacion que solicitemos 
SELECT nos permite recuperar datos de una base de datos. Es una de las operaciones mas comunes.
SELECT + datosABuscar + From dondeVoyABuscar + condicion o filtro especial
*/
-- Consulta de toda la informacion de una tabla (usando el asterisco)
SELECT * FROM productos;

-- Mostrar un atributo en especifico de mi tabla productos 

SELECT nombre FROM productos;

-- Consultar multiples datos de una tabla 

SELECT nombre, descripcion, stock FROM productos;

-- Filtrar informacion usando SELECT mas la clausula WHERE

SELECT * FROM productos

WHERE nombre = "Taza Clásica Blanca" AND stock= 100;

-- Funcion Min para calcular el minimo de una columna 
SELECT MIN(precio) AS Precio_Minimo FROM productos;

-- Funcion Max para calcular el maximo de una columna 
SELECT MAX(precio) AS Precio_Minimo FROM productos;

-- Funcion COUNT para calcular el total de productos 
SELECT count(*) AS Total_de_productos FROM productos;


-- Funcion para calcular el promedio del precio de los productos 
SELECT AVG(precio) AS Precio_promedio FROM productos;

-- Funcion para sumar el total de precios 
SELECT sum(precio) AS Ingresos_totales FROM productos;

-- JOINS clausulas que se utilizan para combinar dos o mas tablas en una columna relacionada 

-- Inner Join toma dos tablas y hace una o trabaja a partir de su co-relacion 

-- Consulta para obtener el nombre del cliente y los detalles del pedido

-- Consulta para clientes y pedidos 
-- (Left join)
SELECT Clientes.Nombre, Pedidos.ID_Pedido
FROM Clientes
LEFT JOIN Pedidos ON Clientes.ID_Cliente = Pedidos.ID_Cliente;

-- Consulta para productos y pedidos 
-- (Right join)
SELECT Productos.Nombre, DetallesPedido.Cantidad, DetallesPedido.PrecioUnitario
FROM DetallesPedido
RIGHT JOIN Productos ON DetallesPedido.ID_Producto = Productos.ID_Producto;