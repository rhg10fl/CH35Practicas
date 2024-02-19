package org.generation.umbrellaUser.model;

/*
 * En la clase donde se establece la lógica del negocio (model) voy a hacer que coincida con mi DB.
 * Es decir, la clase se convierte en una Entity, con la anotación @Entity 
 * Para establecer la tabla de la DB a la que corresponde esta entidad, utilizamos la anotación @Table(name="table") y el nombre de la tabla
 * Indicarle a JPA mi punto de entrada (PK), usando la anotación @Id
 * Como queremos que el Id sea autoincrementable usamos la anotación @GeneratedValue(strategy = GenerationType.IDENTITY
 * Y si queremos, podemos establecer la columna a la que corresponde cada atributo con la anotación @Column(name="name") pero si tenemos que definir el nombre de la primera columna sobre el atributo Id
 */

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user") //Nombre de la tabla de la DB
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_client")
	private Long id;
	@Column(name="first_name")
	private String nombre;
	@Column(name="last_name")
	private String apellido;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	
	//JPA necesita un método que le permita construir cualquier objto sin tomar en cuenta sus atributos. Este método se conoce como contructor vacío
	public User() {
	}
	
	//Constructor
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
