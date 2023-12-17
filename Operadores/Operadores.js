/* Operador
Es un signo que especifica que debe efectuar una determinada operación
*/

/* Operadores aritmeticos (+, -, *, %, ++,--)
Operadores de asignación (=)
Operadores lógicos (&&, ||, !)
Operadores de comparación (==,===,!=,<,>,>=, <=>)
Operadores de  cadena (toLowerCase,toUperCase,trim,toString,concat, +)
*/

/*Operadores artimeticos

(+): suma, se utiliza para sumar dos números.
(-): resta, se utiliza para restar un número de otro.
(*): multiplicación, se utiliza para multiplicar dos números.
(/): división, se utiliza para dividir un número de otro.
(%): residuo, se utiliza para obtener el resto de una divisón.
(++): incremento, aumento de uno en uno la cantidad o el número
(--): decremento, disminuye de uno en uno la cantidad o el número
*/

let numero1= 10;
let numero2 = 8;

suma = numero1 + numero2;
resta = numero1 - numero2;
multiplicación = numero1 * numero2;
division = numero1 / numero2;
residuo = numero1 % numero2;
incremento = numero1;
incremento ++;
decremento = numero2;
decremento --;


 console.log(suma);
 console.log(resta);
 console.log(multiplicación);
 console.log(division);
 console.log(residuo);
 console.log(incremento);
 console.log(decremento);


 let precioReal = 1000;
 let porcentajeDescuento = 20;

 let cantidadDescuento = (precioReal * porcentajeDescuento)/100;
 let precioConDescuento = precioReal - cantidadDescuento;

console.log("Precio real: $" + precioReal);
console.log("Porcentaje de descuento " + porcentajeDescuento + "%");
console.log("Cantidad de descuento: $" + cantidadDescuento);
console.log("Precio con descuento: $" + precioConDescuento)


/* Operadores de asignación
(=): ESte operador no comapra, lo que hace es asignar */

//let frutas = manzanas

/*Operadores de comparación

(**) = Igualdad compara si nuestros valores son iguales
*/

let numero3 = 10;
let texto = "10";

console.log(numero3 == texto);

/* (===): igualdad estricta: comapra si los valores son iguales y el tipo de dato */

let numero4 = 10;
let texto1 = "10";

console.log(numero3 === texto);

/*(!=): Desigualdad o distinto este operador verifica si dos valores no son iguales y de ser necesario realiza la conversión*/

let precioCaja =1499
let precioMaximo = 1500;

if (precioCaja != precioMaximo) {
    console.log("El precio del producto no es igual al precio máximo ")
} else {
    console.log("El precio del producto es igual al precio máximo ")
}
 // example

let num5 = 10;
let num6 = "15";

if(num5 != num6){
    console.log("Son diferentes")
} else {
    console.log("Los valores son iguales")
}

/* (!==)Desigualdad estricta: este operador verifica si dos vaolres no son iguales, pero a diferencia de (!=) en este caso ambos valores deben de tener el mismo tipo y valor*/

let num7 = 41;
let num8 = "50";

if(num7 !== num8){
    console.log("Los valores son diferentes")
} else {
    console.log("Los valores son iguales")
}

//(>): Mayor que basicamente nos indica si un valor es mayor que otro

let puntuacionfinal =85;
let puntuaciónRequerida = 102;

console.log(puntuacionfinal > puntuaciónRequerida)

//(<): Menor que nos indica si un valor es menor que otro

let anios = 20;
let edadLimite = 30;

console.log(anios < edadLimite)

//(>=) Mayor o igual que: nos dice si un valor es mayor o igual a otro

let edad = 48;
let edadNecesaria = 18;

console.log(edad >= edadNecesaria)

//(<=) Menor o igual que: nos indica si un valor es menor o igaul a otro

let temperatura = 14;
let temperaturaMaxima = 21;

console.log(temperatura <= temperaturaMaxima)
    
    /*
    Ejercicio 1
    Un programa que solicite al usuario dos números y la consola mos tiene que decir si esos números son iguales o hay alguno que sea mayor que otro



    let numer1 = prompt("Ingrese un numero");
    let numer2 =prompt("Ingrese otro numero");

    if (numer1 === numer2) {
        console.log("Son los mismos números")
  } else if (numer1 > numer2){
    console.log("Son mayor uno del otro")
  } else {
    console.log("Son diferentes")
  }

  */

/*
    Ejercicio 2
    Un programa que solicite al usuario dos palabras y determine si son iguales
*/
/*
let word1 = prompt("Ingrese una palabra");
let word2 = prompt("Ingrese otra palabra");

if (word1 === word2) {
    console.log("Palabras iguales")
} else {
console.log("Palabras diferentes")
}
*/

// Operadores Lógicos
/*
(&&) AND se utiliza cuando las dos condicionmes deben cumplirse 
*/

let mayoriaEdad= 18;
let tieneIdentificacion = true;

if (mayoriaEdad >= 18 && tieneIdentificacion) {
    console.log("Puedes rentar el salón");
} else {
    console.log("No lo puedes rentar");
}
// (||) Or se utiliza cuando se debe cumplir con una condición o la otra

let esPrime = false;
let decuento = true;

if ( esPrime || decuento){
    console.log("Califica para descuento");
} else {
    console.log("No califica para descuento");
}

// (!) NOT se utiliza para negar el valor de una condición

let esDiaLibre = false;

if ( !esDiaLibre){
    console.log("Se trabaja");
} else {
    console.log("Descansito");
}

//Operadores de cadena

//toLowerCase hace el camino de nuestro string a minusculas

let msjUsuario = "Bienvenido a la Tierra";
let cmbMinuscula = msjUsuario.toLowerCase ();

console.log(cmbMinuscula);

//toUpperCase hace el camino de nuestro string a mayuscula

let greeting = "Casi viernes, casi Navidad";
let cmbMayuscula = greeting.toUpperCase ();

console.log(cmbMayuscula);

//trim quita los espacios

let aviso = "     CH35    Rifa    "
let sinEspacios = aviso.trim();

console.log(sinEspacios);

//toString convierte un tipo de dato number en string
let numero10 = 31;
let cadenas = numero10.toString();

console.log(cadenas);

//concat

let name = "Rocio";
let surname = "Hernández";
let fulName = name.concat (" ",surname);

console.group(fulName);
 
/*Expresiones
Expresión Aritmética
let operacion = 14 + 25 * 12; combina la suma con la multiplicación

Expresión de Cadena
let notificacion = "Casi", + "Año Nuevo"; expresión concatenando

Expresión Lógica
let esMayorDeEdad = (23 > 28) && (23 < 65);  tiene operadores lógicos y de comparación

Expresión de Asignación
let frasco = chocolates; asigna el valor a la variable
*/

//-**EJERCICIO
//ingredientes
let harinaTaza = 2 ;
let lecheEntera = true;
let mantequilla;
let vainilla;
let huevo = 2;
//Topings
let lechera = true;
let nutella = false;

if ( lechera || nutella){
    console.log("Lechera será");
} else {
    console.log("Un poco de Nutella, por favor");
}


if ( !lecheEntera){
    console.log("No se agrega a la mezcla");
} else {
    console.log("Se puede agregar");
}



if (huevo >= 2 && harinaTaza >= 2) {
    console.log("Se puede Mezclar");
} else {
    console.log("No se puede mezclar");
}


