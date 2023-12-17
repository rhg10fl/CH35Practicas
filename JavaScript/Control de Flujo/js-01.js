console.log("Hola CH35")

/* CONTROL DE FLUJO Y ESTRUCTURAS DE CONTROL

*Las estructuras de control son un componente fundamental dentro de la programación, entre algunas de las facilidades y ventajas que nos proporcionan para escribir y depurar código, podemos mencionar las siguientes:

- Tomar decisiones basadas en condiciones especificas, esto produce un codigo
 * tanto dinamico como adaptable
 * 
 * - Repetir acciones (estructuras de bucle) para iterar operaciones o procesar datos
 * de una forma eficiente sin caer en la redaccion de codigo innecesario y repetitivo
 * 
 * - Facilitar el control de flujo de una operacion, brindandonos la oportunidad de ser
 * especificos en indicar qe instrucciones ejecutar y en que orden
 * 
 * - Optimizan el rendimiento de nuestro codigo, ya que evita oportunamente ejecutar instrucciones
 * en caso de que no se necesite
 * 
 * - Facilitar tanto la escritura de codigo como la claridad de este
 * 
 * Las estructuras de control que vamos a ver durante las sesiones de JS son las siguientes
 * 
 *      - Estructura if-else
 *      - Estructura switch
 *      - Estructuras de bucles (for, do, do while)
 * 
 * Para esta sesion, nos centraremos solo en las primeras 2 señaladas en la lista
*/

/* DECLARACIÓN DE SENTENCIA if-else

*Palabra reservada if para comenzar la declaración, se coloca uin parentesis () donde se debe colocar una expresión lógica (true false), se abren y cierran llaves {} para indicar que sentencias va a ejecutar si la condición se cumple (true), 
*después de la llave {} declarada para el bloque de ejecución if, colocamos la palabra reservada else, para este ejemplo no es necesario colocar más expresiones dentro de un () 
*simplemente colocamos otras llaves {} para indicar el bloque de código que tiene que se ejecutado en caso de la condición no se cumpla (false)
*/
let n = 15;
if (n>10) {
    console.log(true);
} else {
    console.log(false);
}

/*
if-else-if
 * 
 * Se trata de la misma sentencia if-else declarada anteriormente
 * Lo que vamos a hacer diferente es, en este caso, anidar varias veces
 * esta misma sentencia, lo que nos permitira tomar decisiones
 * mas complejas
 * 
 * Usaremos la contatenación.
 * Concatenar es una elegante palabra de la programación que significa: "unir". Para unir cadenas en JavaScript el símbolo de más (+), el mismo operador que usamos para sumar números, pero en este contexto hace algo diferente.
 * 
 * Hay que tener cuidado y no realizar demasiadas anidaciones, ya que va a resultar
 * en codigo poco legible y confuso
*/

//if anidados

let edad = 29;
if (edad < 18) {
    console.log("Eres menor de edad, retirate");
} else if (edad >= 18 && edad < 65) {
    console.log("Eres un adulto Joven")
} else {
    console.log("Eres un adulto mayor")
}

/*
*Sentencia switch
*La sentencia switch es otro tipo de estructura de control de flujo, que, nuevamente se encuentra en diversos lenguajes de programación.
*Es bastante parecida al de la sentencia if-else, pero diferente en cuanto a pomportamiento, ya que no se basa en una bifurcación  (partición de caminos), sino que se secciona en múltiples casos (case) que, dependiendo de la expresión que cumpla con un caso especifico, será la secuencia que se va  aejecutar, dentro de la declaración.

* Declaración
* se empieza por colocar la palabra reservada switch, seguido de esto, colocamos parentesis () dónde se debe colocar el valor que va indicar que sentencia/caso a ejecutar.
*Falta indicar el bloque de código que se limita a esta sentencia como lo hacemos en la sentencia if o con las funciones.
*Dentro de este bloque de código, falta colocar los casos ppara cada valor que se desee, establecer segun sea el valor indicado dentro del aprentesis ()
*cada uno de estos casos se separa de la siguiente manera:
- case valor : instrucción a ejecutar si el valor empara con este caso.
Despues para indicar que la ejecución de las sentenciuas debe cortarse cuando se cumpla, se coloca la instruccióin break.
*Cuando terminemos de establecer los caps qie mecesitemos declara, dentro de nuestra sentencia, debemos colocar un valor por defecto, default.
*Esta última sentencia nos permite establecer un valor por defecto, si es que este valor colocado no empata con ningun otro dentro de la sentencia o en ninguno de los casos.
*default : mensaje no disponible
*/

let dia = "domingo";
    switch (dia){
        case "lunes" :
        console.log ("Por ti baby, sería batman");
        break;
        case "martes" :
        console.log ("Es día de la Virgen");
        break;
        case "miercoles" :
        console.log ("Nos toca presentar proyecto");
        break;
        case "jueves" :
        console.log ("Un día apra todo");
        break;
        case "viernes" :
        console.log ("Viernes de disfraces");
        break;
        case "sabado" :
        console.log ("Día de lavado");
        break;
        case "domingo" :
        console.log ("Descasaditto");
        break;
        default :
        console.log ("DDía desconocido");
        break;
    }

    //termina switch

    /*
OPERADOR TERNARIO
-Expresión condicional if-else mas simpole y legible 
-Principamente se usa para simplificar condiciones de una sola expresión
-También puede anidar sentencoas if-else-if, sin embargo, no es recomendado porque el código se puede volver confuso y poco legible.
-Su declaración es la siguiente
-Palabra reservada var, ley o const:
-Se le asigna un nombre como si se tratara de una variable, operador de asignación "=", seguido de este operador, hay que colocar una expresion lógica, esta va dentro de un parentesis (), después hay que colcoar un caracter ? que indica el camino a seguir, dependiendo de si se cumple (o no) la expresión.
-Para separar el resultado true de false debemos agregar un caracter :, de lado izquierdo se coloca la sentencia a ejecutar.
-Si se cumple la condición, de lado derecho se coloca la sentencia a ejecutar 
    */

//Ejemplo de operador ternario
let verificacion = n > 5 ? "si es mayor" : "no es mayor"
console.log(verification);

/*
CUANDO USAR EL if-else Y CUANDO USAR switch
- if else
Cuando necesitemos tomar decisiones bajo condiciones más mfelcibles.
- switch
Cuando tengamos un conjunto fijo de valoires para comparar un expresión.
*/