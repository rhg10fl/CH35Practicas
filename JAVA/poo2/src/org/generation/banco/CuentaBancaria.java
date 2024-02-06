package org.generation.banco;

/*
 * En esta clase se definen los métodos para disparar las excepciones, es decir, el try-catch. Sin embargo, aquí no se ejecuta el try-catch.
 * Se definen otro métodos: depositar dinero, retirar dinero.
 * Requerimientos:
 * 	- Trabajar bajo POO
 * 	-  Encapsular (modificadores, getters y setetrs)
 * 	-  Crear variables y métodos para instanciar objetos
 */

public class CuentaBancaria {
	//Atributos (podemos agregar también rfc y otros datos)
	private double saldo;
	private int idCuenta;
	
	//Cosntructor que recibe solamente el atributo numero
	public CuentaBancaria(int idCuenta) {  // se retira el super(); porque no está trabajando con atributos de otra clase
		this.idCuenta = idCuenta;
	}
	
	//Método para depositar dineros
	public void depositar (double monto) {
		saldo += monto; //Esto es lo mismo que saldo = saldo+monto
	}
	
	//Método para retirar deineritos
	/* 
	 * Verificar si el monto a retirar es menor o igual  al saldo actual.
	 * 	- true: Se puede retirar el monto solicitado.
	 * 	- false: No se puede retirar y calculamos cuánto dinero falta para completar la operación
	 */
	public void retirar(double monto)  throws FondosInsuficientesException{
		if (monto <= saldo) {
			saldo -= monto; //Esto es lo mismo que saldo = saldo - monto
		}else {
			double faltante = monto -saldo;
			//Crear la instacia de la clase FondosInsuficientesException con las palabras reservadas throw new e y le pasamos el parámetro correspondiente a la variable que dispara la excepcion.
			throw new FondosInsuficientesException(faltante); //Este error se marca porque queremos instanciar de manera local y no lo encuentra, se necesita "heredarlo" como parte del método con la palabra reservada throws y el nombre de la excepción.
		}
		
	}
	
//Getters & Setters
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	
	
	
	

}//Class
