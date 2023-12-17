console.log("Receta para preparar Hotcakes");

let harina = "2";
let mlDeLeche = 250;
let huevos = 2;
let cucharadasMantequilla = 2;
let nutella = true;

// De número a cadena
let cantidadHarina = 200;
let cantidadHarinaStr = String(cantidadHarina);
console.log("Cantidad de harina: " + cantidadHarinaStr + " gramos" );

// De cadena a número
let cantidadAzucarStr = "50";
let cantidadAzucar = Number(cantidadAzucarStr);
console.log("Cantidad de azúcar: " + cantidadAzucar + " gramos" );

// De boolean a string
let tieneHuevos = true;
let tieneHuevosStr = String(tieneHuevos);
console.log("¿Tiene huevos? " + tieneHuevosStr);

// De string a boolean
let tieneLecheStr = "true";
let tieneLeche = Boolean(tieneLecheStr);
console.log("¿Tiene leche? " + tieneLeche );

// De número a boolean
let temperaturaSarten = 180;
let temperaturaSartenBool = Boolean(temperaturaSarten);
console.log("¿La sartén está caliente? " + temperaturaSartenBool);

// De boolean a number
let requiereAceite = false;
let requiereAceiteNum = Number(requiereAceite);
console.log("¿Requiere aceite? " + requiereAceiteNum );

var instrucciones = [
    "1. En un tazón grande, mezcla la harina, el azúcar, el polvo de hornear",
    "2. Agrega el huevo, la leche y la mantequilla.",
    "3. Mezcla bien hasta obtener una masa suave.",
    "4. Calienta un sartén a fuego medio.",
    "5. Vierte un poco de masa en la sartén caliente para formar cada hotcake",
    "6. Cocina hasta que aparezcan burbujas en la superficie, luego voltea",
    "7. Repite este proceso hasta que cocines todos los hotcakes.",
    "8. Sirve caliente con tu jarabe o frutas favoritas.",
];

console.log("***Instrucciones***");
for (var j = 0; j < instrucciones.length; j++) {
    console.log(instrucciones[j]);
}
