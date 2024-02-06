package org.generation.persona;

public class Persona {
	//Crear un objeto Persona con los atributos: nombre, apellido, email, edad
	    private String nombre;
	    private String apellido;
	    private String email;
	    private int edad;

	    // Constructor
	    public Persona(String nombre, String apellido, String email, int edad) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.email = email;
	        this.edad = edad;
	    }

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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		//Validación
		public boolean validarEmail() {
	        String regex = ".*@gmail\\.com";
	        return email.matches(regex);
		}
	    
	    
	
}
