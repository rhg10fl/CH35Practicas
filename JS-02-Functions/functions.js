/*
Fuynciones. Son bloques de código con instrucciones que se pueden reutilizar las veces que sean nacesarias.
Algunas de la funciones reciben parámetros y otras no reciben parámetros
Nota: las funciones "normales" se llaman funciones por declaración.
*/

//Función que eprmita saludar
function saludar () {
    console.log ("Hola desde una función")
}
//Ejecutar la funcion con el nombres de la función y los parámetros
saludar();

//Hoisting. Característica de una función que nos permite invocarla desde antes de su inicialización, es decir, se puede invocar antes del bloque de código o después.
//Se invoca en la linea 11 y en la línea 18.
function saludar() {
    console.log("Hola invocando la función con hoisting");
}
saludar ();

//funciones que retoman algo Para que una función retorne algo (un string, una operación,, una variable, etc), necesitamos indicarle al código de la función que vamos a retornar mediante la palabra return        /* function saludar() {    console.log("Hola");}saludar (); */
function greeting() {
        return "Hola desde una función que retorna";
}
console.log(greeting());

//function que retorna y recibe parámetros
function sumar(x, y) {
    return x + y;
}
let resultado = sumar (255, 245)
console.log(`El resultado de sumar x + y es ${resultado}`)

//calcular el cuadro de un número
function calCuadrado (numero) {
    return numero * numero;
}
let resultCuadrado = calCuadrado(5);
console.log(resultCuadrado)

//funciones flecha (Arrow Function) ---, Es uuna manera de declarar una función por declaración, sintetizando código y haciéndolo más legible.
//Función flecha para calcular el cubo de un número
const calcCubo = (number) => {
    return number **3
}
let resultCubo = calcCubo (3);
console.log(resultCubo);

//Funciones anónimas. Son un tipo de funciones que se declaran sin nombre de función y se alojan en el interior de una variable. Se hace referencia a ellas cada vez que la utilicemos.
//Las funciones anónimas no permiten el hoisting (no se puede invocar antes de inicializarlos)
const mensaje = function () {
    return "Este es un mensaje desde una función anónima"
}
console.log(mensaje());

//Callbacks. Es pasar una función B por parámetro a una función A, de modo que la función A pueda ejecutar esa función de forma genérica desde su código.
//Función B
const functionB = function () {
    console.log("Ejecutando función B");
}
//Función A que mandará a llamar a la función B
const functionA = function (callback) {
    callback("");
}
functionA(functionB);