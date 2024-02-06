package org.generation.calculadora;

public class CalculadoraMain {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		System.out.println("El resultado de la suma es: " + calculadora.sumar(14,10));
		System.out.println("El resultado de la resta es: " + calculadora.restar(9,4));
		System.out.println("El resultado de la multiplicación es: " + calculadora.multiplicar(7,2));
		System.out.println("El resultado de la división es: " + calculadora.dividir(20,2));
		
	}//

}//
