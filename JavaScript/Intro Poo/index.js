/**
 * Paradigmas de Programación
Programación imperativa
    Se basa en instrucciones detalladas ejecutando un flujo o una secuencia determinada
Programación basada en eventos
    Se basa en la gestión y respuesta de eventos
Programación declarativa
    Explicar lo que queremos obtener
Programación orientada a objetos
    Toma cierta información o estructura del mundo real (objetos) para poder explicar ciertas cosas, como sus características (propiedades y aributos) y sus comportamientos  o acciones (métodos).
        **Perrito.
        Atributos: Color de pelaje, número de patas, tamaño.
        Métodos: Correr, olfatear, saltar.**

 */

//Clases: Plantillas  para crear objetos. Nos ayudan a definir un tipo de objeto y crear instancias  de este tipo de objeto.

class person {
    name = "";
    surname = "";
    age = "";
    email = "";
    phone = "";

    //Objetos
    // para inicializar un objeto es necesario definir un constructor que tomará los atributos
    /*Clases = molde
    Objeto = gomita 
    Constructor = chefsito 
    Atributo = ingredientes
    Método = Comportamientos
    */
    constructor(name, surname, age, email, phone) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    eat() {
        console.log("Bon apetit");
    }//metodo comer

    dance() {
        console.log("Mueve el coxis jeje");
    }//metodo bailar 

    draw() {
        console.log("No hay que matar la imaginación")
    }

    mostrarInfo() {
        console.log("Nombre: ", this.name);
        console.log("Apellido: "), this.surname;
        console.log("Edad: ", this.age);
        console.log("Email: ", this.email);
        console.log("Telefono: ", this.phone);
    }
}

let usuario1 = new person("Rocio", "Hernández", 29, "rogtz@gmail.com", "5626894572");
let usuario2 = new person("Adrian", "Ortega", 28, "adrian.ort@gmail.com", "56551463465");
let usuario3 = new person("Ivan", "Amaro", 31, "iv.amaro@gmail.com", "5589643256");
let usuario4 = new person("Nicole", "Barraza", 32, "nic.brza@gmail.com", "5584128322");
let usuario5 = new person("Arturo", "Pedroni", 32, "artpedroni@gmail.com", "5641697380");

console.log(usuario1); // imprimir objeto completo
console.log(usuario4.email);//imprimir un atributo especifico
console.log(usuario1.email, usuario2.email);

usuario4.eat();//invocando el método 
usuario5.dance();
usuario4.draw();

//Pilares de la programación orientada a objetos
/*Herencia
Polimorfismo
Encapsulamiento
Abstracción*/

//Herencia (heritage) nos permite heredar clases inferiores para poder optimizar el programa

//lessor=arrendador
class lessor extends person {//subclase
    capacity = 0;
    cost = 0;
    placeName = "";

    constructor(name, surname, age, email, phone, capacity, cost, placeName) {
        super(name, surname, age, email, phone);
        this.capacity = capacity;
        this.cost = cost;
        this.placeName = placeName;
    }

    mostrarInfo() {
        console.log("Capacidad", this.capacity);
        console.log("Costo", this.cost);
        console.log("Nombre del lugar", this.placeName);
    }
}

let lessor1 = new lessor("Rocio", "Hernández", 29, "rogtz@gmail.com", 5626898156, 100, 50000, "MichisRoom")

console.log(lessor1);

console.log(lessor1.cost);

lessor1.mostrarInfo();

//class lessorGuadalajara extends lessor

//ejemplo
class Animal {
    sonido() {
        console.log('Hace un sonido genérico');
    }
}

class Perro extends Animal {
    sonido() {
        console.log('Guau guau');
    }
}

class Gato extends Animal {
    sonido() {
        console.log('Meow');
    }
}

const perro = new Perro();
const gato = new Gato();

perro.sonido();
gato.sonido();

/* POLIMORFISMO
Proviene de Poli = muchas, morfismo = formas. Se utiliza para crear métodos con el mismo nombre pero con diferente comportamiento.

  Tener objetos de difentes tipos que pueden ser manipulados en común.
  Nota: La posibilidad de realizar cambios en distintos objetos que comparten 
*/
class product {
    brand = "";//marca de ropa
    price = 0;

    constructor(brand, price) {
        this.brand = brand;
        this.price = price;
    }
    mostrarDescripción() {
        console.log("Marca ");
        console.log("Precio ");
    }
}

let product1 = new product("Owly", "35");

console.log(product1);

/*ENCAPCSULAMIENTO
Ocultar ka implementación sw un objwto y solo mostrar los datos necesarios
*/

class user {
    #password;

    constructor(userName, correo, password) {
        this.userName = userName;
        this.correo = correo;
        this.#password = password;
    }

    varificarPassword(password) {
        return this.#password == password;
    }

}

//Abstracción no es nada más que tratar objetos del mundo real y poder aplicarlos a la programación mediante clases, métodos, constructores y objetos

//Los objetos de tipo Json son un formato de intercambio de datos ligero, accesible,estructurado, manipulable (DOM) y que nos brindan una mejor comunicación entre el cliente y el servidor. Esto gracias a que son más flexibles y generalmente se ejecutan con fetch


let objetoJson = {
    "nombre": "Juanin",
    "apellido": "Juan Harry",
    "edad": 31,
    "email": "juanin@gnail.com",
    "telefono": "5574980693",

}


console.log(objetoJson);

let objetoLiteral = {
    nombre: "Juanin",
    apellido: "Juan Harry",
    edad: 31,
    email: "juanin@gnail.com",
    telefono: "5574980693",

}


console.log(objetoLiteral);

//Principios Solid
/*
Principio de responsabilidad única (Single Responsability Principle)
   Una clase debe tener asignada una yarea o responsabilidad específica y esta no debería cambiar.

Principio abierto/cerrado (open/closed principle OCP)
   Una clase puede estar abierta a extensiones y agregar nuevas funcionalidades, pero sin generar cambios en la misma.

Principio de sustitución de Liskov (Liskov Sbstitution Principle)
   Una clase hijo puede sustituir objetos de una clase padre

Principio de segregación de interfaces (Interface Segregation Principle)
   Delimitar los métodos que necesito y dejar fuera los innecesarios

Principio de inversión de dependencias (Dependency Inversion Principle)
*/

/*
Programa que conste de una clase llamada alumno que tenga como atributos: nombre y calificación. 
Definir los métodos para inicilizar sus atributos (constructor), imprimirlos y mostrar un mensaje con el resultado de si la calificación es aprobatoria o no.

Atributos
nombre
calificación

metodos
imprimir calificación 
Evaluación

calificacion aprobatoria es de 6
if para evaluar calificación 
*/

class alumno {
    namea = "";
    calificacion = 0;

    constructor(namea, calificacion) {
        this.namea = namea;
        this.calificacion = calificacion;
    }

    aprobar() {
        console.log("Aprobaste");
    }

    reprobar() {
        console.log("Estudia más");
    }

    mostrarInfAlumno() {
        console.log("Nombre: ", this.namea);
        console.log("Apellido: "), this.calificacion;

    }

}

/*
class Alumno {
    nombre = "";
    calificacion = 0;

    constructor(nombre, calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    imprimirCalificacion() {

        console.log(`${this.nombre} tiene una calificación de ${this.calificacion}`);

    }

    evaluacion() {
        if (this.calificacion >= 6) {
            console.log(`${this.nombre} ha aprobado.`);
        } else {
            console.log(`${this.nombre} no ha aprobado.`);
        }
    }
}

const alumno1 = new Alumno("Ximena", 5);
const alumno2 = new Alumno("Diego", 10);

alumno1.imprimirCalificacion();
alumno1.evaluacion();

alumno2.imprimirCalificacion();
alumno2.evaluacion();
*/
/*
class alumno{
    name2 = "";
    lastname2 = "";
    cal = 0;

    constructor (name2, lastname2, cal){
        this.name2 = name2;
        this.lastname2 = lastname2;
        this.cal = cal;
    }
    
    mostrarInfoAlum(){
        if(this.cal >= 6){
            console.log(`Nombre ${this.name2}`);
            console.log(`Apellido: ${this.lastname2}`);
            console.log(`Aprobaste con calificacion de: ${this.cal}`);
        }else{
            console.log(`Nombre ${this.name2}`);
            console.log(`Apellido: ${this.lastname2}`);
            console.log(`Roprobaste con calificacion de: ${this.cal}`);
        }
    }

}
let aluumno1 = new alumno ("Ximena", "Muñoz", 10 );
let aluumno2 = new alumno ("Diego", "Gonzales", 5 );
aluumno1.mostrarInfoAlum(); //Invocar el método.
aluumno2.mostrarInfoAlum(); //Invocar el método.*/

