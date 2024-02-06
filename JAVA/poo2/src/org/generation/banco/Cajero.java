package org.generation.banco;

/*
 * En cajero se instancia el objeto de tipo CuentaBancaria y se invocan los métodos definidos
 * Aquí sí se pueden establecer los try-catch de la excepción que se definió en el método retirar.
 * Los resultados se muestran en consola 
 */

public class Cajero {
	public static void main(String[] args) {
		CuentaBancaria cuentaName = new CuentaBancaria(6989); //Id de la cuenta bancaria -idCuenta-
		
		//Simulamos que tenemos un Scanner y el  cliente introduce dinero
		System.out.println("Depositar $500");
		cuentaName.depositar(500);
		
		//Revisar si se actualiza el saldo (debe haber 500 pesitos)
		System.out.println("El nuevo saldo es de $" + cuentaName.getSaldo());
		
		//Retirando dineritos
		try { 
			//Simulamos nuevamente el Scanner para retirar
			System.out.println("Retirando $300");
			cuentaName.retirar(300);
			System.out.println("El nuevo saldo es de $" + cuentaName.getSaldo()); //Output $200
	
			System.out.println("Retirando $200");
			cuentaName.retirar(200);
			System.out.println("El nuevo saldo es de $" + cuentaName.getSaldo()); //Output $0
			
			System.out.println("Retirando $300");
			cuentaName.retirar(300);
			System.out.println("El nuevo saldo es de $" + cuentaName.getSaldo()); //Output exception
		} catch (FondosInsuficientesException e) {
			System.out.println("\u001B[31mLo siento, te faltan $\u001B[31m" + e.getMonto());
			e.printStackTrace(); //Método de excepciones que imprime el seguimiento del flujo de la excepción
		}
			
		
	}//main
}//class
			
			
