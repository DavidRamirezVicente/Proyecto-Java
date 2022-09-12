<<<<<<< HEAD
package com.copyflow.aplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.copyflow.aplication.UserService.UserService;
import com.copyflow.aplication.model.User;
@CrossOrigin("*")
@RestController
public class UserController {
	@Autowired
	private UserService uService;

	@GetMapping("/all")
	public List<User> getUsuarios() {
		return uService.getAll();
	}
	@GetMapping("/preguntas")
	public List<User> getPreguntas() {
		return uService.getPreguntas();
	}
	@GetMapping("/all/{id}")
	public User getUsuariosById(@PathVariable int id) {
		return uService.getById(id);
	}
	@PostMapping("/all")
	public String addUser (@RequestBody User user){
		return uService.save(user) + "Creado correctamente";
	}
	@PutMapping("/all/{id}")
	public String renoveUser (@RequestBody User user, @PathVariable int id){
		return uService.update(user, id) + "Actualizado correctamente";
	}
	@DeleteMapping("/all/{id}")
	public String delUserById (@PathVariable int id){
		return uService.delete(id) + " Eliminado correctamente";
	}
}
=======
package com.copyflow.aplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.copyflow.aplication.UserService.UserService;
import com.copyflow.aplication.model.User;
@CrossOrigin("*")
@RestController
public class UserController {
	@Autowired
	private UserService uService;

	@GetMapping("/all")
	public List<User> getUsuarios() {
		return uService.getAll();
	}
	@GetMapping("/preguntas")
	public List<User> getPreguntas() {
		return uService.getPreguntas();
	}
	@GetMapping("/all/{id}")
	public User getUsuariosById(@PathVariable int id) {
		return uService.getById(id);
	}
	@PostMapping("/all")
	public String addUser (@RequestBody User user){
		return uService.save(user) + "Creado correctamente";
	}
	@PutMapping("/all/{id}")
	public String renoveUser (@RequestBody User user, @PathVariable int id){
		return uService.update(user, id) + "Actualizado correctamente";
	}
	@DeleteMapping("/all/{id}")
	public String delUserById (@PathVariable int id){
		return uService.delete(id) + " Eliminado correctamente";
	}
}
>>>>>>> 925f4c70726023cb696e53329c9b6c8ad9eac77d
