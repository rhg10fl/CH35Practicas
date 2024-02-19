package org.generation.user.service;

import java.util.ArrayList;
import java.util.List;

import org.generation.user.model.User;
import org.springframework.stereotype.Service;

/*
 * En service definimos los servicios de la base de datos.
 * Se estará emulando una base de datos utilizando un ArrayList, con el fin de realizar las operaciones del CRUD, aunque solo vamos a realizar READ mediante in protocolo HTTP GET.
 * Para definir nuestra clase de Java como un servicio, utilizamos la anotación @Service (se agrega fuera de la clase apra que englobe a todo ésta)
 * 
 */

@Service
public class UserService {
	//Crear el ArrayList dónde viven los usuarios que se agreguen
	public final List<User> usuario = new ArrayList<User>();
	
	//instanciar objetos User en un método llamado  USerService
	public UserService() {
		usuario.add(new User(1L, "Rocio", "Hernández", "rocio@gmail.com", "patito123"));
		usuario.add(new User(2L, "Braulio", "Santiago", "braulio@gmail.com", "brauliito"));
		usuario.add(new User(3L, "Rey David", "Martinez", "elrey@gmail.com", "lasmañanitas"));
		usuario.add(new User(4L, "Eveida", "Palos", "eve.p@gmail.com", "candycrush3000"));
		usuario.add(new User(5L, "Rodrigo", "Macedo", "rodri@gmail.com", "contraseña"));
		usuario.add(new User(6L, "Lizbeth", "Cerón", "lizbeth.c@gmail.com", "generationmx"));
		usuario.add(new User(7L, "Fernanda", "Carmona", "fer.car@gmail.com", "zorritonaranja"));
		usuario.add(new User(8L, "Ruben", "Aleman", "r.aleman@gmail.com", "patito555555"));
		usuario.add(new User (9L, "Gonzalo", "Piña", "gon.pinha@gmail.com", "mentasboutique"));
		usuario.add(new User (10L, "Eunice", "Ceja", "eun.ceja@gmail.com", "4_perritos"));
	}
	
	//Crear método de tipo Get para traer a todos los usuarios
	public List<User> allUsers() {
		return usuario;
	}
	
}//
