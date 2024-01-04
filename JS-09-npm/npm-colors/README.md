# Pasos para iniciar el proyecto colors
1. Crear una carpeta llamada colors
2.Crear un archivo main.js

## npm desde CLI 
3. Iniciamos un proyecto desde npm con el comando
```sh
npm init -y 
```
(-y no permite una configuración inicial por lo que instala todo)

4. Buscamos el package colors y los intalamos con el comando
```sh
npm i colors
```

5. Dentro del archivo `main.js` vamos a importar el paquete colors con la línea de código
```javascript
const colors = require("colors");
```
6. Implementar las funciones de colors (estilos para el texto de la terminal) en el `main.js`. Para ello, hay que consultar la documentación oficial de colors en [https://npmjs.com]

7. Para ejecutar el package, utilizamos el comando
```sh
node archivo.js
```
//npm install -g tetris * para instalalr tetris

8. eliminar () desinstalar) módulos de npm
```sh
npm uninstall colors
```