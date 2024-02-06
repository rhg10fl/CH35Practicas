package org.generation.figuras;

/*
 * Figura será una superclase abstracta  que contiene un método abstracto, el cuál será implementado por sus subclases
 * Rectangulo y circulo son subclases que recibem el método de Figura
 */

public abstract class Figura { //Con abstract le digo a Jaca que mi clase es abstracta

	//Método abstracto para calcular el área
	public abstract double calcularArea();
	
	//Método "concreto" para imprimir información sobre la figura
	public void infoFigura() {
		System.out.println("Esta es una figura");
	}
		
}
