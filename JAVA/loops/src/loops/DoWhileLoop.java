package loops;
import java.util.Scanner;
public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		 * Ciclo Do While
		 * Evalua la expresión en la parte inferior del ciclo.
		 * Por tanto, las declaraciones del blo "do" siempre se ejecutan al menos una vez.
		 */
		
		//Cuenta del 1 al 20
		int cuenta = 5;
		do {
			System.out.println("Cuenta "+ cuenta);
			cuenta++;
		} while (cuenta < 0); //Output 1 ya se ejecutó al menos 1 vez

		////////////////////////////////////////////////////////////////////////////////
		
		/*
		 * Crear un programa para un cajero bancario
		 * - El programa me mostrará 4 opciones:
		 * 1. Consultar saldo
		 * 2. Ingresar dineros
		 * 3. Retirar dineros
		 * 4. Salir
		 * - Mostrar mensaje de bienvenida al usuario, darle contexto y solicitar que elija una opción (número)
		 * - Mostrar al usuario la opción que eligió y permitir que elija otra opción
		 * - El usuario puede salir del programa escribiendo 4 (salir)
		 */
		
		System.out.println("Bienvenido al banco City Michi, elija algunos de nuestras opciones disponibles");
		
		System.out.println("1. Consultar saldo");
		System.out.println("2. Ingresar dinero");
		System.out.println("3. Retirar dinero");
		System.out.println("4. Donar a michis rescatados");
		System.out.println("5. Salir");
		
		Scanner scr = new Scanner (System.in);
		int opcion;
		
		do {
			opcion = scr.nextInt();
			
			switch(opcion) {
			case 1: 
				System.out.println("Consultar saldo");
				break;
			case 2: 
				System.out.println("Ingresar dinero");
				break;
			case 3: 
				System.out.println("Retirar dinero");
				break;
			case 4: 
				System.out.println("Apadrinar un michi");
				break;
			case 5: 
				System.out.println("Salir, no olvide retirar su tarjeta, recibo y/o efectivo");
				break;
			default: 
				System.out.println("Por favor elija una opción válida de nuestro menú");
				break;
			}
		} while (opcion != 3);
		
		scr.close();
		
		
	}//main

}//class
