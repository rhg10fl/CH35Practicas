package org.generation.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCollections {

	public static void main(String[] args) {
		/* ******************Array**************** */
		String[] names = {"Chiio", "Eunice", "Marco", "Diana", "Jonathan", "Rúben", "Braulio", "Lucero" };
		
		System.out.println(Arrays.toString(names));
		int [] edades = { 23, 33, 25, 55, 69, 41, 29, 37,18};
		System.out.println(Arrays.toString(edades));
		
		//Acceder a cada elemento del Array
		String name1 = names[0];
		System.out.println("El primer nombre de la lista es " + name1);
		int edad1 = edades[6];
		System.out.println("La edad de  " + name1 + " es de  "+  edad1 + " años"); // la edad de Chiio es de 29 años
		
		//Obtener la longitud del Array
		int longitudNames = names.length;
		
		System.out.println("El Array 'names' tiene "+ longitudNames + " elementos");
		
		//Obtener el último elemento
		
		//String ultimoElemento = names[longitudNames - 1];  //La longitud ya vive en la variables 'longitudNames'
		
		String ultimoElemento = names[names.length - 1]; //La longitud NO vive en una variable
		System.out.println("El último elemento del Array es  "+ ultimoElemento);
		
		//Mostrar cada elemento utilizando forEach
		
		for (String name : names) { // se trabaja en lista con for each
			System.out.println(name);
		}
		
		/* ******************ArrayList****************
		 * Es un array que puede cambair de tamaño. Es la clase de Java que representa la estructura de datos de Arrays. Permite elementos  y recibe varios  métodos para su manipulación.
		*/
		ArrayList<String> films = new ArrayList<String>();
//		ArrayList<Integer> matricula = new ArrayList<>(); //Wapper class
//		ArrayList<Character> characters = new ArrayList<>();
		
		//Agregar elementos
		films.add("Kill Bill");
		films.add("Suzume");
		films.add("Constantine");
		films.add("La Princes Mononoke");
		films.add("World War Z");
		films.add("John Wick");

		System.out.println(films); 
		/* System.out.println("La primer película es "+ films.get(0)); */
		
		//Obtener un elemento: name.get(index);
		String film1 = films.get(0);
		System.out.println("La primer película es " + film1);
		
		//Modificar  un elemento: name.set(index, newValue);
		//String film3 = films.set(3, "Point Break");
		String film3Get = films.get(3);
		System.out.println(film3Get);
		
		//Conocer el tamaño del ArrayList: name.size();
		int sizeFilms = films.size();
		System.out.println("El tamaño del ArrayList es de " + sizeFilms + " elementos");
		
		//Agregar un elemento y después eliminarlo: name.remove(index);
		films.add("The fountain");
		System.out.println(films);
		
		films.remove(6);
		System.out.println(films);
		
		//Mostrando los elementos del ArrayList en lista
		System.out.println("**** Films en la lista ****");
		for (String film : films) { // utilizando el for echa para listar 
			System.out.println(film);
		}


		/* Podría decirse que como JAVA está orientado a objetos y un Array trabaja sobre datos primitivos, es necesario también especificar en los Arrays no sólo el tipo de dato, si no también el tipo de clase a la que pertenecen, */
	} //

}//
