/*
Ejercicios
Ejercicio de Arrays:
Descripción:
Supongamos que tienes una lista de temperaturas diarias en grados Celsius para una semana. Tienes que convertir estas temperaturas a grados Fahrenheit y mostrar los resultados.

Temperaturas diarias en grados Celsius para una semana
const temperaturasCelsius = [22, 25, 19, 30, 27, 21, 18];
*Instrucciones:

Crea una función llamada celsiusToFahrenheit que tome una temperatura en grados Celsius y la convierta a grados Fahrenheit usando la fórmula: F = C * (9/5) + 32.
Utiliza un bucle para recorrer el array temperaturasCelsius, llama a la función celsiusToFahrenheit para cada temperatura y almacena los resultados en un nuevo array llamado temperaturasFahrenheit.
Muestra ambos arrays (temperaturasCelsius y temperaturasFahrenheit) en la consola.
*/
/*
const temperaturasCelsius = [22, 25, 19, 30, 27, 21, 18];

function celsiusToFahrenheit (temperaturasCelsius) {
    const fahrenheit * ((9/5)+32);
}

const temperaturasFahrenheit = (celsiusToFahrenheit);
console.log(`${temperaturasCelsius} son ${temperaturasFahrenheit}`)
*/
/*
Ejercicios de Bucles:

Descripción:

Escribe un programa que sume los primeros 10 números naturales (1 al 10) e imprima el resultado.

Instrucciones:

Utiliza un bucle (for o while) para sumar los números del 1 al 10.
Imprime el resultado de la suma en la consola.
Sugerencia:
Puedes usar una variable llamada suma para acumular la suma mientras recorres los números.
*/
/*
let suma = 0;
for (let i = 1; i <=10; i++){
    suma += i;
}
console.log(suma);
*/

/*
Ejercicio : Números Primos

Escribe un programa que determine si un número ingresado por el usuario es primo o no. Un número primo es aquel que solo es divisible por 1 y por sí mismo. Puedes utilizar un bucle for para verificar si el número tiene algún divisor además de 1 y él mismo.
*/

/*
let numIngresado = parseInt(prompt("Ingresa un número para saber si es primo"));
for (let i = 2; i < numIngresado; i++){
    if (numIngresado % i === 0){
        console.log(`El número ${numIngresado} no es primo`);
        break;
    } else {
    console.log(`El número ${numIngresado} es primo`);
    }
}
 
*/

/*
Ejercicio : Secuencia de Fibonacci

Escribe un programa que genere los primeros 10 términos de la secuencia de Fibonacci. La secuencia de Fibonacci comienza con 0 y 1, y cada término subsiguiente es la suma de los dos anteriores (0, 1, 1, 2, 3, 5, 8, 13, 21, ...).

Estos ejercicios implican un poco más de lógica y son ideales para practicar conceptos más avanzados. ¡Espero que disfrutes resolviéndolos!*/
/*
function secFibonacci(n) {
    let arrayFibonacci = [0, 1];
    for(let i = 2; i < n; i++){
        arrayFibonacci.push(arrayFibonacci[i - 1] + arrayFibonacci[i - 2]);
    }
    return arrayFibonacci;
}
let sumaNumeros = secFibonacci(10);
console.log(`La suma de los primeros 10 términos de la secuencia de Fibonacci es: ${sumaNumeros}`);
*/