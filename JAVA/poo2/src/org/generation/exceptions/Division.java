package org.generation.exceptions;

public class Division {
	//Método para dividir
	public static int dividir(int num1, int num2) {
		return num1 / num2;
	}
	
	
	public static void main(String[] args) {
		/*
		 * La clase Exception nos permite manejar cualquier caso excepcional con nuestro código, es el equivalente a los erroes.
		 * Utiliza una estructura de control try-catch que permite manejar las excepciones.
		 *  - try : Envuelve el código que puede generar una excepción y lo evalúa.
		 *  - catch : Contiene el código que se ejecuta cuando se lanza la excepción.
		 *  	Sintaxis:
		 *  		try {
		 *  			//Código protegido
		 *  		} catch (ExceptionName e){
		 *  			//Bloque de excepción
		 *  		}
		 *  - finally : Siempre se ejecuta. Se utiliza para mostrar un mensaje en caso de ser invocado. Podemos prescindir de finally
		 */
		
		//Exception que se aroja si un número se divide entre 0
		try { //evalua antes de generar la excepción. Si no cumple, lo envía al catch
			int resultado = dividir(10, 0);//dentro de variable se manda llamar el método dividir
			System.out.println("El resultado de la división es " + resultado); //solo se imprime si está bien. 
		} catch (ArithmeticException e) { //recibe argumento
			System.out.println("\u001B[31mError: no puedes dividir entre 0\u001B[31m");
		} finally {
			System.out.println("\u001B[32mPrograma finalizado\u001B[0m");;
		}
		
		
	}//main
}//class