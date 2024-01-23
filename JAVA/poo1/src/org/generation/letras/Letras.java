package org.generation.letras;
import java.util.Scanner;

/*
 * Crear un progra,a que le solicite al un mensaje al usuario y cuente cuántas vocales, consonantes, números y caracteres posee dicho mensaje
 * 	Letras: métodos para interactuar con el usuario
 * 	LetrasMain: instanciar los objetos
 * 	Contador: métodos para contar vocales, consonantes, número y caracteres
 */

public class Letras {
	//Para que nuestro usuario interactúe, definimos un scanner
	Scanner scanner = new Scanner(System.in);
	
	//Métemos el scanner dentro de un método
	public String leerEntrada() {
		return scanner.nextLine();
	}
	
	//Método apra proporcionar contexto al usuario
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

}//Class
