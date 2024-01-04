/*
Manipulación del DOM
-Leer y traer nodos del árbol del DOM
document.getElementsByID (trae elementos por ID)
document.getElementsByClassNAme (trae elementos por Class)
document.getElementByTagName (trae elementos por Etiquetas)
*/

//getElementByID
const titulo = document.getElementById("title1");
console.log(titulo);
console.log(titulo.innerText); // Traer un string (texto que vie en mi ID)

//getElementsByCLassName
const titulos = document.getElementsByClassName("title");
console.log(titulos);
console.log(titulos.length); //Devuelve la longitud de elementos de la clase
console.log(typeof titulos); //Muestra que es un objeto  porque es una colección de arrays

//getElementsByTagName
const tituloH3 = document.getElementsByTagName("h3");
console.log(tituloH3);
console.log(tituloH3[0].innerText);

/*Métodos para llamar elementos mediante selectores de css.
Se usa para procesos más especificos y la sintáxis querySelector
    -document.querySelector("selector"); // #, ., <>
    -document.querySelectorAll(). Selecciona los elementos que se especifiquen.
    Siempre van a traer el primer elemento  con el selector indiado
*/

//querySelector
const query = document.querySelector("#title4");
console.log(query.innerText);

const queryClass = document.querySelector(".title");
console.log(queryClass);

const queryClassAll = document.querySelectorAll(".title");
console.log(queryClassAll);

//Manipular elementos del DOM (styles) con JS
titulo.style.textAlign = "center";
titulo.style.color = "#4F7302";

//Manipular el texto de un elemento
const titulo2 = document.querySelector("#title2")
titulo2.innerText = "Sesión de Manipulación del DOM - CH35.";
titulo2.style.color = "#D94350";

/* Métodos para crear y agregar elementos en el DOM. este proceso se divide en dos: "crear el nodo y agregar el nodo".
    -Crear nodos
    * document.creatElement("element") --> crear elementos a partir de etiquetas.
    * document.creatTextNode("text") --> crea texto dentro de las etiquetas.
*/
//crear nodos
const nodo1 =document.createElement("h3");
const imgNodo = document.createElement("img");

/**
    -Agregar nodos, mandamos a llamar el elemento padre y le pasamos la propiedad con la constante que guarda el nodo creado
        * parentElement.appendChild(const);
        * parentElement.append(const);
        * parentElement.insertBefore(const);
        * parentElement.insertAdjacentElement(const);
    Utilizaremos mayormente appendChild
*/

//onbtengo el elemento padre por tag,class o id
const parentElement = document.getElementById("dif");
//Crear el tecto que vivirá en el nodo1
const textNodo1 = document.createTextNode("Imagen agregada desde el DOM");
//Insertar el texto en el nodo1
nodo1.appendChild(textNodo1);
//insertar nodo1 en el elemento padre
parentElement.appendChild(nodo1);
parentElement.style.fontFamily = "'Karla', sans-serif";
parentElement.style.color = "#566D8C";

/* Agregando imagen */
//Inserto el imgNodo en el elemento padre para definirla posteriormente
parentElement.appendChild(imgNodo); 
// accedo a las propiedades de la imagen
imgNodo.src = "./src/assets/octocat-github.jpg";
// imgNodo.src = "https://octodex.github.com/images/femalecodertocat.png";
imgNodo.alt = "Octocat-GitHub";
imgNodo.width = "300";

/* Otra firma de leer y modificar nodo
    document.outerHTML (leer)
    node.innetHTML (escrbiri sobre el nodo)
*/
const elementOuter = titulo2.outerHTML;
console.log (elementOuter);
titulo2.innerHTML = "Manipulación del DOM - CH35";
