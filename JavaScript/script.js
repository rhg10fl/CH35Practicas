//cometario de una sola linea

/* comentario
multilínea*/


//alert ("Hola Mundo");


// console.log ("Este mensaje es para la consola");


/*var nombre = prompt("Ingresa tu nombre");
alert ("Hola, "+nombre + "Bienvenido a la CH35")*/


/* var numero1 = parseInt (prompt("Ingresa el primer número:"));
var numero2 = parseInt (prompt("Ingresa el segundo número:"))

console.log("suma:" + (numero1 + numero2));
console.log("resta:" + (numero1 - numero2));
console.log("multiplicación:" + (numero1 * numero2));
console.log("division:" + (numero1 / numero2));
*/

/*
var edad = prompt("Bienvenido al bar. Ingresa tu edad");

if (edad <18)  {
    alert("Bebecito, No puedes pasar");
}
if (edad >= 18 && edad <=65)  {
    alert("Eres mayor de 18 años y lo suficientemente cool para pasar, Adelante");
}
if (edad >65)  {
    alert("Demasiado viejo hermano, No puedes pasar");
}
*/

/*var edad = prompt("Bienvenido al bar. Ingresa tu edad");

if (edad <18)  {
    alert("Bebecito, No puedes pasar");
}
if (edad >= 18 && edad <=65)  {
    alert("Eres mayor de 18 años y lo suficientemente cool para pasar, Adelante");
}
if (edad >65)  {
    alert("Demasiado viejo hermano, No puedes pasar");
} */

    /*var nombre = prompt("Ingresa tu nombre");
var edad = parseInt(prompt("Cual es tu edad"));

if (edad>40) {
    alert("HOLA, " + nombre + " Ya tas viejo");
    } else if(edad>30) {
    alert("HOLA, " + nombre + " Eres un chavo ruco >.<");
  } else if(edad>=18) {
    alert("HOLA, " + nombre + " ya eres adulto 3:)");
  }else if(edad<18){
    alert("HOLA, " + nombre + " eres un chavo");
  }*/

  //Clase 08 de diciembre con Fer

  //TIPOS DE DATOS Y VARIABLES

  //scope es el alcance de nuestras variables

  /*var, let, const la diferencia es el alcance
  var tiene un alcance global
  let tiene un alcance local
  const se mantiene sin ningun cambio*/

  /*string:cadena de texto(lleva comillas)
  number: número
  noolena: true/false
  nulll:nulo
  undefined: no esta asignado o definido*/

  /* Todas nuestras variables deben de ser declaradas con nombres especificos y claros, sin espacios, no deben indicar iniciar con números */
 
  /*
  let nombre = "Daniel";
  let invitadosExtras = 2;
  let esMayorEdad = true;
  let edad = 24;
  let InvitadoEspecial = null;
  let horaDeSalida = undefined;

  console.log (nombre);
  document.write (nombre);

  */

/*   Encasillamiento o tipado
Nos es útil para el mantenimiento del código ya que lo hace más legible y fácil de entender. Además, nos ayuda a la prevención de errores para reducir la pobabilidad de los mismos.
Mejora el rendimiento de nuestro programa*/

/*let numero = 15;
let texto ="hola";

//con encasillamiento

let numeroEncasillado= number = 15;
let textoEncasillado= string = "hola";*/

/*type of palabra reservada para saber qué tipo de dato tenemos

console.log (typeof(nombre));

let functionNumer = console.log (typeof Number(nombre));
metodoParseInt = console.log(typeof parseInt (nombre));
metodoParseFloat = console.log(typeof parseInt (nombre));

parseInt y parseFloat son funciones que se utilizan para convertir cadenas de texto en números, ambas nos ayudan en este cambio*/

/*conversion de number a string

console.log(typeof String(edad));
console.log(typeof edad.toString()); */

/* conversion de boolean a number

let numero = Number (esMayorEdad);

console.log(typeof (numero)); */

/* conversión de boolean a string */

/* let texto = String (esMayorEdad)
// console.log(texto); **preguntar a la consola si es correcto
console.log(typeof(texto))
console.log(typeof esMayorEdad.toString()) /*cambia a string*/ 

/* let negacion = !esMayorEdad;

console.log (negacion); */

//concatenar basicamente es unir strings

/* let saludo = "Hola  humano";
let frase = "el futuro es hoy";

texto = " " + saludo + " " + frase;

document.write(texto); */

/* Tipos de datos
> - String (cadenas de texto)
> - Number (numérico)
> - Booleans (booleanos true or false)
> - Null (nulos)
> - Undefined (Indefinición)
> - Objects (Objects)
> - Objects (Arrays)
*/

/* 
console.log(): nos permite visualizar en consola del navegador el código de jS
 console.warn(): Muestra un mensaje de advertencia.
 console.error(): Muestra un mensaje de error.
 console.table():

 todas la variables deben iniciarse con const o let */

 let firstName;
 firstName = "Daniel";
 let lastName = "Maldonado";

console.log(firstName + " " + lastName);
console.log("Mi nombre es " + firstName + " y mi apellido es " + lastName);

/*ECMAscript 6 (ES6). Interpolación de cadenas
> - backtics ``
> - Para variables  las invocamos ${variable}
> - Texto para string*/

let age = 37;
console.log(`Mi nombre es ${firstName},
mi apellido es ${lastName}
y tengo ${age} años`);

//console.warn();
console.warn(`Precaución, no es buena practica dejar sin punto y coma`);
//console.error();
console.error(`Status 404: Failed`);

/*Array. Se traduce como matriz o arreglo. Es un tipo de dato que pertenece a JS, en el cual se almacena una colección de elementos de manera ordenada.
- Los arrays se pueden manipular mediante métodos específicos.
- Los elementos de una array se contabilizan como índices empezando por índice 0, por lo cual, el primer elemento del array posee el índice 0.
- Un array posee n cantidad de elementos.
- Se declaran como variables, seguido del signo igual y corchetes. Dentro de cada corchete vive un elemento con un tipo de dato.
*/

/* let arreglo1 = []; //Array vacío
console.log(arreglo1); */

let arreglo1 = [];
console.log(`Array vacío ${arreglo1}`);
//los elementos de un array se separan mediante comas
let cars = ["Volkswagen", "BMW", "Mazda", "KIA"];
console.log(cars);
//longitud e indice son diferentes. La longitud (length) es el número de elementos y el índice corresponde a cad elemento a partir del 0.

console.log(typeof(cars));

//array de Numbers
let salariesMxn = [15000, 12000, 18000, 25000, 28000, 10000, 18500, 10200, 20500, 15300, 17000,17200]

console.log(salariesMxn.length); //Output 12
console.log(salariesMxn);

/*
Onjetos. Los objetos son tipos de datos en JS, con una estructura definida que nos permite almacenar informacion mediante llaves (claves) y valores.
Su sintaxis es la siguiente:
const object {
    clave1:valor2 (dato),
    clave2: valor2 (dato2)
    }  
Los objetos pueden almacenar diferentes tipos de valores.
}
*/

const employee = {
    fisrtName: "Rocio",
    lastName: "Hernández",
    age: 29,
    country: "México",
}

console.log(employee);

//Mostrando mi array como table
console.table(cars);
//Mostrando mi objeto como tabla
console.table(employee)