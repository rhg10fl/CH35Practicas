package org.generation.user.controller;

import java.util.List;

import org.generation.user.model.User;
import org.generation.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Controla las peticiones de tipo HTTP (Get, Post, Put, Delete, Patch)
 * Para definir una clase como Controller, se utiliza la anotación @RestController
 * Aquí definimos la endpoint de nuestra URI, así como los endpoint de cada peticióm
 * 	- Para definir la ruta (endpoint) de nuestra API, utilizamos la anotación @RequestMapping
 * 	- Para definir la ruta (endpoint) de cada petición utilizamos path o paréntesis
 * Aqui se lleva a cabo la inyección de dependencias en el constructor, utilizando anotación @Autowired
 * Definimos el método correspondiente a la petición HTTP con las anotaciones @GetMapping @PostMapping@PuMapping @DeleteMapping
 */
@RestController //Indica que esta clase es una API de tipo Rest (Trabaja con métodos HTTP)
@RequestMapping ("admin/users") // Cosntruimos la ruta de nuestra API, definiendo endpoints (localhost:8080/admin/users)
public class UserController {
	//Instanciar desde UerService mediante un nuevo objeto de tipo UserService userService
	private UserService userService;
	
	//Generar el constructor y asignar anotación @Autowired que indica que aquí se lleva a cabo al inyección de dependencias
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	//Necesitamos decirle al controller que tiene que trae la información de UserService usando el método definido. Para traer la información (READ) necesitamos indicar el tipo de petición (get) medainte la anotación @GetMApping
	@GetMapping
	public List<User> getUsers() {
		return userService.allUsers();
	}

}
