package org.generation.letras;

public class LetrasMain {
	public static void main (String[] args) {
		//instanciar objetos (Letras y Contador)
		Letras letras = new Letras();
		letras.mostrarMensaje("Escribe un texto y te mostraré el número de vocales, consonantes, símbolos y números");
		String palabra = letras.leerEntrada(); // Guardamos el texto introducido por el usuario en una variable
		
		//Invocar los métodos que me permiten contar los caracteres
		Contador contador = new Contador();
		
		int totalVocales = contador.contarVocales(palabra);
		System.out.println(" Contiene " + totalVocales + " vocales.");
		
		int totalNumeros = contador.contarNumeros(palabra);
		System.out.println(" Contiene " + totalNumeros + " números.");
		
		int totalConsonantes = contador.contarConsonantes(palabra);
		System.out.println(" Contiene " + totalConsonantes+ "  consonantes.");
		
		int totalSimbolos = contador.contarSimbolos(palabra);
		System.out.println(" Contiene " + totalSimbolos+ " símbolos.");
		
	} //method
}//class
