package org.generation.banco;

//En esta clase se definen los métodos que arrojan Excepciones, siempre que en la clase Cajero se dispare dicha excepcion

/*
 * Requerimientos
 * 	1.Trabajar bajo el paradigma POO
 * 	2. Indicar que la clase es un Exception mediante herencia (extends)
 * 	3. Crear variable y métodos para instanciar objetos
 * 	4. Encapsular
 */
public class FondosInsuficientesException extends Exception {
	private static final long serialVersionUID = 1L; //No es necesario, epro es buena práctica asignarla
	//Atributos
	private double  monto;

	//Constructor
	public FondosInsuficientesException(double monto) {
		this.monto = monto;
	}

	//Getter y Setter -- para poder hacer uso debido a la clase private
	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	
	
	

}
