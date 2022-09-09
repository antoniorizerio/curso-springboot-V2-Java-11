package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.educandoweb.course.entities.User;

/**
 * Para indicarmos que essa classe é um recurso web que é implementado
 * por um controlador Rest, usa-se a anotação: @RestController 
 * @author Antonio Rizério JR
 *
 */
@RestController
@RequestMapping(value = "/users")
public class UserResource {

	// Criar um endpoint //
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
