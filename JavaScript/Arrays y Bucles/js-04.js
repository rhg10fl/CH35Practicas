/*
ARRAYS
-Es una collección de elementos en una misma variable, cada uno de ellos ubicado por la posición que ocupa el array.
-Los arrays se utilizan para almacenar y organizar datos de manera más eficiente
*/
//CREAR UN ARRAY
const numeros = [1, 2, 3, 4, 5];
//ARRAY DE CADENA DE TEXTO
const comida = ["tacos", "sopita", "pan", "jugo"];
console.log(comida);

//ARRAY MIXTO
const mixto = [
    "Pluma",
    8,
    true,
    { nombre:"mar"}
];
console.log(mixto);

// ARRAY VACIO
const lista = [];
console.log(lista);
//* Agregar elementos a mi array vacio
lista[0] = "Leche";
lista[1] = "Carne de Pollo";
lista[2] = "Espinaca";
lista[3] = "Huevo";
console.log(lista);

//OTRA MANERA DE CREAR ARRAYS
const frutas = new Array("manzana", "uva", "mango", "mandarina", "pera");

/*
-Esta sintaxis se puede emplear en arrays  porque son Objects, es una manera de mandar a llamar un nuevo objeto de tipo Array
*/
console.log(frutas);

//LONGITUD DE UN ARRAY
console.log(frutas.length);
//ACCEDER A LOS ELEMENTOS DEL ARRAY, ACORDE A SU INDICE
console.log(frutas[2]);
console.log(frutas[4]);

//MODIFICAR UN ELEMENTO DL ARRAY POR EL INDICE
const cremeria = ["Jamón", "Salchicha", "Queso adobado", "Queso Cotija", "Yogurth"];
console.log(cremeria);
//*cambiamos un elemento de queso o quesillo
cremeria[2] = "Trenzado";
cremeria[4] = "Mango";
console.log(cremeria);

//Arreglo de arreglos o multidimensional
console.log("Arreglo de arreglos");

//Estados : EdoMex. Jalisco, Yucatán, Sonora, Oaxaca, CDMX

// Platillos: Carnitas, Torta ahogada, Panucha, Dogos, Tlayuda, Guajolocombo.

const estados = ["Estado de México", "Jalisco", "Yucatan", "Sonora", "Oaxaca", "CDMX"];

const platillos = ["Carnitas", "Torta ahogada", "Panucha", "Dogos", "Tlayuda", "Guajolocombo"];

const menu = [estados, platillos];

// console.log(menu[0][0],menu[1][0]);
console.log(`En ${menu[0][1]} también se come ${menu[1][2]}`);
// console.log(menu[0][2]);

/*
METODO DE ARRAYS
Metodo de cola (queue). Los métodos de cola implican agregar elementos al inicio del arrayy eliminar elementos al inicio de array. Sigue el principio de FIFO (firts-in-first-out) lo que significa que el primer elemento añadido es el primer elemento eliminado

-push
-shift
-unshift

-Método de pila (stack). Implica agregar elementos al final de array y eliminar elementos del final del array. Sigue el principio LIFO (last-in-first-out) que significa el último elemento añadido es el primero en ser eliminado

-push
-pop

*/
console.log("Métodos de Arrays")

const ch35 = ["Daniel", "Fer", "Maara", "Gaby", "Mariana", "Paola", "Enrique"];
console.log(ch35);
// pop() Eliminar el último elemento del array
let popch35 = ch35.pop();
console.log(popch35); //devuelve el dato eliminado
console.log(ch35) // elimina el dato de la lista

//push () agregar al final del array
let pushch35 = ch35.push("Mony");
console.log(ch35);

//shift () quitar primero del array
let shiftch35 = ch35.shift();
console.log(ch35);

//unshift () agregar al principio del array
let unshiftch35 = ch35.unshift("Daniel");
console.log(ch35);

//reverse () cambia el sentido del ordenamiemto del array
let reversech35 = ch35.reverse();
console.log(ch35);

/* Investigar
//sort
//foreach
//slice
//splice
//indexof

El método sort() ni reverse() parecen no reconocer la "Ñ".
*/