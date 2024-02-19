-- Sentencias/querys/comandos basicos de SQL

-- Mostrar las bases de datos almacenadas 
SHOW DATABASES;

-- Para usar una base de datos en eespecífico es:
USE ch35;

-- Mostrar tablas:
SHOW TABLES;

/*
DML COMANDOS 
SELECT Nos va a mostrar la informacion que solicitemos 
*/
SELECT * FROM productos;

/*
SELECT nos permite recuperar datos de una base de datos. Es una de las operaciones mas comunes.
SELECT + datosABuscar + From dondeVoyABuscar + condicion o filtro especial
*/
-- Consulta de toda la información de mi tabla de productos (usando el asterisco)
SELECT nombre FROM productos;

-- Consultar múltiples datos de una tabla
SELECT nombre, descripcion, stock FROM productos;

-- Filtrar información usando SELECT más la clausula WHERE
SELECT * FROM productos
WHERE nombre = "Taza Clásica Blanca" AND stock = 100;

-- Consulta de el precio de un producto:
SELECT nombre, descripcion, stock, precio FROM productos
WHERE precio < 50;

-- Consulta de stock y precio
SELECT nombre, descripcion, stock, precio FROM productos
WHERE stock <= 100 AND precio > 10;

-- Función Min para calcualr el míunimo de una columna
SELECT MIN(stock) AS Stock_Minimo FROM productos;
SELECT MIN(precio) AS Precio_Minimo FROM productos;

-- Funcion Max para calcular el maximo de una columna 
SELECT MAX(precio) AS Precio_Maximo FROM productos;

-- Funcion COUNT para calcular el total de productos 
SELECT count(*) AS Total_de_productos FROM productos;

-- Funcion para calcular el promedio del precio de los productos 
SELECT AVG(precio) AS Precio_promedio FROM productos;

-- Funcion COUNT para calcular el total de productos 
SELECT count(*) AS Total_de_productos FROM productos;

-- Funcion para calcular el promedio del precio de los productos 
SELECT AVG(precio) AS Precio_promedio FROM productos;

-- Función para sumar el total de precios
SELECT sum(precio) AS Ingresos_totales FROM productos;

-- JOINS clausulas que se utilizan para combinar dos o más tablas en una columna relacionada

-- Inner Join toma dos tablas y hace una o trabaja a partir de su co-relacion

SELECT Pedidos.ID_Pedido, Clientes.Nombre, Pedidos.Fecha, Pedidos.EstadoPedido
FROM Pedidos
INNER JOIN Clientes ON Pedidos.ID_Cliente = Clientes.ID_Cliente
WHERE Pedidos.Fecha = '2022-01-20';


