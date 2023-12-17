/*
// Ejercicios para esta sesion

/** Ejercicio 1
 * 
 * Elabora un programa que determine si una persona tiene edad
 * suficiente para votar
 * 
 * Debe recibir como parametro la edad
 * 
 * Consideraciones: utilizar la estructura if-else
 */
/*
let edad = 18;
if (edad < 18) {
    console.log("Eres menor de edad, no puedes votar");
} else {
    console.log("Eres mayor de edad, puedes votar")
}
*/

/** Ejercicio 2
 * 
 * Desarrolla un programa que evalue si un numero es divisible
 * entre 7 y 8
 * 
 * Debe recibir como parametro un numero, cual sea
 * 
 * Si se cumple, imprimir verdadero
 * Si no, imprimir falso
 * 
 * 
 * Consideracion - Utilizar la estructura if-else
 * Casos de prueba: 56, 7, 8, 0, 224, 73
 */
/*
let num = "73";
    if (num % 7 === 0 && num % 8 === 0) {
        console.log (true);
    } else {
        console.log(false);
    }
*/
/** Ejercicio 3
 * 
 * Desarrolla un programa que evalue si un numero es divisible
 * entre 4 o 9
 * 
 * Debe recibir como parametro un numero aleatorio
 * 
 * Si se cumple, imprimir verdadero
 * Si no, imprimir falso
 * 
 * Consideracion - Utilizar la estructura if-else
 */

/*
let numAleatorio = "15";
    if (numAleatorio % 4 === 0 || numAleatorio % 9 === 0) {
        console.log(true);
    }  else {
        console.log(false);
    }

*/

/** Ejercicio 4
 * 
 * Realizar un programa que reciba como parametro una categoria de peliculas
 * 
 * -accion
 * -drama
 * -comedia
 * -romance
 * -suspenso
 * -terror
 * 
 * Segun sea la categoria que se reciba, imprimir una recomendacion de pelicula
 * de acuerdo al parametro recibido
 * 
 * Consideraciones: utilizar la estructura switch
 */
/*
let catPeli = "terror";
    switch (catPeli) {
        case "acción" :
            console.log ("Los indestructibles");
            break;
        case "drama" : 
            console.log ("Green Book");
            break;
        case "comedia" : 
            console.log ("¿Y dónde estan las rubias?");
            break;
        case "romance" : 
            console.log ("Yo antes de ti");
            break;
         case "suspenso" : 
            console.log ("Un lugar en silencio");
            break;
        case "terror" : 
            console.log ("La noche del demonio");
            break;
    }

*/
/** Ejercicio 5
 * 
 * Crear una interfaz de un cajero ATM
 * 
 * Debe recibirse como parametro alguna de las siguientes opciones
 * 
 * 1. Retirar dinero
 * 2. Transferencia
 * 3. Deposito
 * 4. Pago de servicios
 * 
 * Segun sea la opcion indicada, imprimir en pantalla la accion a realizar
 * Utilizar if/else
 */
/*
let opciones = "3";
switch(opciones) {
    case "1":
        console.log("Retirar Dinero");
        break;
    case "2":
        console.log("Transferencia");
        break;
    case "3":
        console.log("Depósito");
        break;
    case "4":
        console.log("Pago de Servicios");
        break;
    default:
        console.log("Ingrese una opción válida");
        break;
}
*/


/** Ejercicio 6
 * 
 * Escribir en codigo un programa conversor de divisas
 * 
 * Debe recibir como parametro una cantidad en pesos mexicanos y
 * Segun sea la opcion que se indique, realizar la conversion correspondiente
 * 
 * 1. A dolares estadounidenses
 * 2. A euros 
 * 3. A yenes japoneses
 * 4. A libra esterlina
 * 5. A franco suizo
 * 
 * Consideracion: estructura switch
 * 
 */


let pMxn = "100";
let opcConv = "Yen"
switch(opcConv) {
    case "Dolar":
        let dolares = pMxn * 0.0578;
        console.log(`${pMxn} pesos mexicanos son ${dolares} dolares`);
        break;
    case "Euros":
        let euros = pMxn * 0.058;
        console.log(`${pMxn} pesos mexicanos son ${euros} euros`);
        break;
    case "Yen":
        let yenJap = pMxn * 8.40;
        console.log(`${pMxn} pesos mexicanos son ${yenJap} yenes japoneses`);
        break;
    case "Libra":
        let libraEst = pMxn * 0.046;
        console.log(`${pMxn} pesos mexicanos son ${libraEst} libras esterlinas`);
        break;
    case "Franco":
        let francoSu = pMxn * 0.051;
        console.log(`${pMxn} pesos mexicanos son ${francoSu} francos suizos`);
        break;
}
*/

