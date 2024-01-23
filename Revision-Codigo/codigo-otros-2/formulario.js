var formulario = document.querySelector("#form");

formulario.onsubmit = function(e) {

  e.preventDefault(); /*se agrega Default */
  
  var nombreInput = formulario.elements[0]; /* cambia de n a nombreInput */
  var edadInput = formulario.elements[1]; /* cambia de e a edadInput */
  var nacionalidadSelect = formulario.elements[2]; /* cambia de na a nacionalidadSelect*/

  var nombre = nombreInput.value;
  var edad = edadInput.value;

  var i = nacionalidadSelect.selectedIndex; /* Se actualiza na */
  var nacionalidad = nacionalidadSelect.options[i].value; /* Se actualiza na */

  console.log(nombre, edad);
  console.log(nacionalidad);

  /* Se cierran sentencias */
  if (nombre.length === 0) {
    nombreInput.classList.add("error"); /* Se actualiza n */
  }
  if (edad < 18 || edad > 120) {
    edadInput.classList.add("error"); /* Se actualiza e */
  }

if (nombre.length > 0 && 
  (edad > 18 && edad < 120) 
  ) {
  agregarInvitado(nombre, edad, nacionalidad);
  }
};

function agregarInvitado(nombre, edad, nacionalidad) { /*Se sube*/
  // Mapear códigos de nacionalidad a nombres de países
  var nacionalidadMap = {
    ar: "Argentina",
    mx: "Mexicana",
    vnzl: "Venezolana",
    per: "Peruana"
  };
  
var lista = document.getElementById("lista-de-invitados"); /*Lsita de invitados */
//  /*Anexar el elementoLista al contenedor lista-de-invitados*/
//   var listaDeInvitadosContainer = document.getElementById("lista-de-invitados");
//   listaDeInvitadosContainer.appendChild(elementoLista); 


var elementoLista = document.createElement("div"); /* Se cierra la sentencia*/elementoLista.classList.add("elemento-lista"); /* Se cierra la sentencia*/
lista.appendChild(elementoLista); /* Se cierra la sentencia*/

function crearElemento(descripcion, valor) {
var spanNombre = document.createElement("span"); /*cierra la sentencia*/
var inputNombre = document.createElement("input"); /*cierra la sentencia*/
var espacio = document.createElement("br"); /*Se cierra sentencia*/
spanNombre.textContent = descripcion + ": "; /*Se cierra sentencia*/
inputNombre.value = valor; /*Se cierra sentencia*/
elementoLista.appendChild(spanNombre); /*cierra la sentencia*/
elementoLista.appendChild(inputNombre); /*cierra la sentencia*/
elementoLista.appendChild(espacio); /*Se cierra sentencia*/
}
 /*Se agrea ; al final*/
crearElemento("Nombre", nombre);
crearElemento("Edad", edad);
crearElemento("Nacionalidad", nacionalidadMap[nacionalidad]);

 /*Se agrea ; al final*/
var botonBorrar = document.createElement("button");
botonBorrar.textContent = "Eliminar invitado";
botonBorrar.id = "boton-borrar";
var corteLinea = document.createElement("br");
elementoLista.appendChild(corteLinea);
elementoLista.appendChild(botonBorrar);

 botonBorrar.onclick = function() {
elementoLista.remove(); /*Se borra línea anterior y se agrega */
  };
}