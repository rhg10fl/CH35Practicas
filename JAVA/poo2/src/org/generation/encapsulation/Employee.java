package org.generation.encapsulation;

/* La estructura básica para crear objetos es la siguiente
 * 1. Atributos o propiedades
 * 2. Método cosntructor (1 - n métodos)
 * 3. Métodos del objeto (comportamiento)
 * 4. Métodos Getters y Setters
 * 5. Método toString
 */

public class Employee {
	//1. Encapsular Atributos o propiedades utilizando un modificador private
	private String nombre;
	private String apellido;
	private int id;
	private double salario;
	private String puesto;
	
	//2. Encapsular  el Método constructo de tipo public
	public Employee(String nombre, String apellido, int id, double salario, String puesto){
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.salario = salario;
		this.puesto = puesto;
	}
	
	//3. Encapsular métodos de comportamiento de tipo public
	
	//getters
	public void trabajar () {
		System.out.println("Estoy trabajando");
	}
	public void calcularSalario () {
		System.out.println("El salario del empleado " + this.nombre + " " + this.apellido + " es de $  " + this.salario + " pesos");
	}
	public void capacitarse () {
		System.out.println("El trabajador del puesto " + this.puesto + " se capacita");
	}
	public void infoGeneral () {
		System.out.println("Id: " + this.id  + ", Nombre: " + this.nombre  +  ", Apellido: " + this.apellido);
	}
	
	//Strings

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	/* Método toString
	 * Es un "Override" que se refiere a la capacidad de proporcionar información específica de una clase en forma de cadena de caracteres. Nos permite imprimir nuestros objetos  en formato String.
	 */
	// Para  incializar toString :  click derecho > Source > Generate toString > Fields > Generate
	
	@Override
	public String toString() {
		return "Employee ["
				+ "nombre=" + nombre + 
				", apellido=" + apellido + 
				", id=" + id +
				", salario=" + salario
				+ 
				", puesto=" + puesto + "]";
	}
	
	//La anotación @Override simplemente se utiliza, para forzar al compilador a comprobar en tiempo de compilación que estás sobrescribiendo correctamente un método, y de este modo evitar errores en tiempo de ejecución, los cuales serían mucho más difíciles de detectar.
	
	
	
	
	

}//class
