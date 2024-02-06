package org.generation.iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableMain {
	public static void main(String[] args) {
		//Podemos iterar sobre una colección de tres maneras:
		
		//1. Iteración mediante un ciclo for-each.
		System.out.println("******* For-each *********");
		List<String> nombres = new ArrayList<String>();
		
		nombres.addAll(Arrays.asList("Braulio", "Fernanda", "Rodrigo", "Rubén", "Marco", "Rey")); //Método addAll para agregar elementos
		
		for (String nombre : nombres) { 
			System.out.println(nombre);
		}//for-each
		
		//2. Iterar mediante Iterator.
		System.out.println("******** Iterator *********");
		List<String> apellidos = new ArrayList<String>();
		
		apellidos.addAll(Arrays.asList("Aleman", "García", "Martinez", "Cardoso", "Razo", "Ceja"));
		
		//Utilizar un nuevo iterador y le vamos a pasar el método .iterator() a nuestro ArrayList
		Iterator<String> iterador = apellidos.iterator();
		
		//Utilizando while, devuelve verdadero si la iteración tiene más elementos, sino se termina el ciclo
		while(iterador.hasNext()) { //hasNext da un punto de entrada, si encuentra un elemento entra al ciclo y lo manda llamar, lo guarda y lo imprime, regresa al ciclo
			String elemento = iterador.next(); //guarda elemento en el siguiente iterador
			System.out.println(elemento);
		} //while
		
		//3. Mediante forEach que toma una expresión Java Lambda como parámetero. 
		System.out.println("******** Lambda **********");
		List<String> animales = new ArrayList<String>();
		
		animales.addAll(Arrays.asList("Cuyo", "Nahual", "Tlacuache", "Ajolote", "Tepezcuintle", "Vaquita marina"));
		
		animales.forEach((animal) -> {
			System.out.println(animal);
		});
		
	}//main
}//class
