## Axios API
1. REvisar el sitio oficial de axios [https://axios-http.com/es/]
2. Instalar axios desde npm con el comando
```sh
npm install axios
```
3. Ejecutar el proyecto de Reaxt en el navegador con el comando 
```sh
npm run dev
```

## Manejando axios
1. En el archivo  App.js, importar axios
```javascript
import axios from 'axios'
```
2. Crear la función `getUsers` de tipo async-await para consumir una API
3. Indicamos el evento en línea para el primer botón, con el tipo de evento y la función a ejecutar 
```javascript
<button onClick={getUsers}>
```
4 .crear la función `postUser` de tipo async-await
