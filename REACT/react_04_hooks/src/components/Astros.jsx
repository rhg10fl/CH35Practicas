import './Astros.css'
import { useEffect, useState } from 'react';
import Astro from './Astro';

//Mandar a llamar la API utilizando Hooks (useState u useEffect)
//Función apra agregar la información de la API AStros dentro de lar cards
const Astros = () => {
    //Definir la URL de la API
    const ASTROS_URL = "http://api.open-notify.org/astros.json";

    //Implementando useState
    const [astros, setAstros] = useState([]);

    //Implementando useEffect
    useEffect(() => {
        fetchAstros(); //Hoisting de una función que voy a definir
    }, []);

    //Crear función fetch para conectarse a la API
    const fetchAstros = () => {
        fetch(ASTROS_URL)
            .then(response => response.json())
            .then(data => setAstros(data.people)) //para que la información viva dentro del componenete actualizado, traigo setAstros y le pasa los datos de 'people' de la API
            .catch(error => console.error(error))
    }

    console.log(astros);//Vive en consola de navegador

    //Enviar la información de la API a las cards utilizando .map sobre el array 'astros'

    return (
        <>
            {
                //'astro' funciona como los elementos que se recorren en el arrays 'astros' y .map recibe dichos elementos
                astros.map((astro, index) => (
                    //Exporto el componente Astro
                    //Crear una llave única para cada elemento del array (key)
                    //Desestructurar el array para que cada elemento reciba los props definidos dentro de Astro ({name, craft})
                    <Astro key={index} {...astro} />

                ))
            }
        </>
    )
}

export default Astros