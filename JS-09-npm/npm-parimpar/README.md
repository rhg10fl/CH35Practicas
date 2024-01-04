# Crear y publicar un nuevo paquete de npm

## Creación del package
1. Inicializar npm desde CLI con el comando
```sh
npm init
```

Me guiará a tráves de una serie de pasos donde me solicite información relacionada con mi package, como el nombre, la versión, la descripción, el punto de entrada (index.js), comando de prueba, repositorio de git en donde vive, palabras clave para coincidir con búsquedas, autor, licencia.

2. Presionar enter para aceptar que la información es correcta y generar el archivo `package.json`
> - package.json
    - Contiene informacion sobre el proyecto-modulo que vamos a crear. Son un estandar de node.js para facilitar la estructura y ejecucion de los proyectos dentro del entorno de ejecucion y de esta manera poder compartirlo a traves del sitio de [http://npmjs.com].
    - La informacion se estructura como objeto de js con notacion JSON
3. Crear una carpeta llamada `modules` en dónde vivirá nuestro script
4. DEntro de `modules` crear el script (.js) con el nombre de parimpar.js
5. Crear la función del script y exportarlo con `export default`
6. Importar el script desde el archivo `index.js` con `import + function + from + ruta con extensión` e invocamos la función con parámetros.
    ```javascript
    import determinarParImpar from "./modules/parimpar.js";
    ```
7. Configurar el `"type": module` en el archivo `package.json`
8. Ejecutamos el programa desde el entorno de nodejs con el comando
```sh
node index.js
```

##Publicar package en nom
1. Iniciar sesión de npm pero ahora desde CLI con el comando
```sh
nm login
```

2. Esperamos que cargue y presionamos enter para abrir el navegador
3. Recibiremos un correo con un password de una sola vez, lo agregamos y presionamos Login
4. Regresamos a la terminal y nos mostrará el mensaje `logged in on npmjs.org`