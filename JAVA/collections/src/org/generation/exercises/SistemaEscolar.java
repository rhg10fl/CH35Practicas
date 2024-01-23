package org.generation.exercises;

import java.util.ArrayList;
import java.util.Scanner;

/* 
 * Programa que permite que un usuario agregue nombre completo de estudiantes matriculados en una universidad. Posteriormente, muestra la lista de los estudiantes agregados. 
 *  --- Requerimientos:
 *  		> Utilizar ArrayList para gaurdar a los estudiante  (ArrayList<String>)
 * 		 >Scanner para interactuar con el usuario --Permitir que un usuario agregue nombres--
 *  		>Loop para parmitir que se agreguen varios estudiantes (do-while)
 *  		>Opción para salir del logo con la palabra 'Salir' (if-else, try catch, !=, switch son posibles opciones)
 *  		> Mostrar lista de estudiantes (for each)
 *  		
 */
public class SistemaEscolar {
	public static void main (String [] args) {
		 //Inicializar un ArrayList para guardar a los estudiantes
		ArrayList<String> estudiantes = new ArrayList<String>();
		
		//Scanner para el usuario
		Scanner scanner = new Scanner(System.in);
		
		//Loop para permitir agregar usuario
		String nombreEstudiante; // Inicializando de manera global
		
		do {
			System.out.println("Ingresa el nombre del estudiante. Escribe 'Salir' para finalizar");
			nombreEstudiante = scanner.nextLine(); //invocando de maneral local
			estudiantes.add(nombreEstudiante);
			
		}while (!nombreEstudiante.equals("Salir"));//Siempre que NO se escriba 'Salir', el loop se sigue ejecutando
	
		
		//Mostrar lista de estudiantes (for each)
		System.out.println("**Lista de estudiantes");
		for (String estudiante : estudiantes) {
			//Si no quiero que se muestre la palabra "salir" voy a agregar una condicional
			if(!estudiante.equals("Salir") || !estudiante.equals("salir")) {
			System.out.println(estudiante);
		}
		}
		
		//----------
				  System.out.println("La lista está vacía. No puedes borrar más elementos.");
		//---------
		
		
		
		
		
		 /*
		  * System.out.println("Ingresa el nombre del estudiante. Escribe 'Salir' para finalizar");
			nombreEstudiante = scanner.nextLine(); // Invocado de manera local dentro del do
			if(!nombreEstudiante.equals("Salir")) {
			estudiantes.add(nombreEstudiante);
			
si se pone antes del estudiantes.add si queda
		  */
		
		/*
		 * Modificar nuestro programa para permitir "salir" con las palabras 'Salir' o 'salir'.
		 *  Agreguar la opción que permite que el usuario elimine un estudiante después de haberlo agregado y muestre la lista actualizada después de la eliminación. (.remove();)
		 */
		
	}// 
}//class
