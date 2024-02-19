package org.generation.user.model;

import java.util.Objects;

public class User {
	//id, nombre, apellido, email, password
	private Long id; //por los rangos de valores se utilza long, además de generar compatibilidad con la base de datos, consistencia con jpa
	private String nombre;
	private String apellido;
	private String email;
	private String password;
	
	//Coinstructor
	public User(Long id, String nombre, String apellido, String email, String password) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
	}
	
//Getters y setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
//to string
	@Override
	public String toString() {
		return "User [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", password="
				+ password + "]";
	}

	
	/*
	 * Tenemos que generar dos métodos adicionales:: hashCode() y equals(). Se generan de la misma manera que generamos lso demás métodos: click derecho > source > generate
	 * Nos sirven para controlar los objetos de esta entidad
	 * Nos permite comparar si cumplen con la estructura hash map y comprobar si un objeto es igual a otro
	 */
	@Override
	public int hashCode() {
		return Objects.hash(apellido, email, id, nombre, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(password, other.password);
	}
	
}//
