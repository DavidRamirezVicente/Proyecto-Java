package com.copyflow.controllersImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.copyflow.controllers.UserController;
import com.copyflow.entities.User;
import com.copyflow.service.UserService;

@CrossOrigin("*")
@RestController
public class UserControllerImpl implements UserController{
	@Autowired
	UserService userService;

	// http://localhost:8888/customers (GET)
	//@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
	@GetMapping("/users")
	@Override
	public List<User> getUsers() {
		return userService.findAllUsers();
	}

	// http://localhost:8888/customers/1 (GET)
	@Override
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<User> getUserById(@PathVariable Long id) {
		return userService.findUserById(id);
	}

	// http://localhost:8080/users/add (ADD)
	@Override
	//@RequestMapping(value = "/users/add", method = RequestMethod.POST, produces = "application/json")
	@PostMapping("/users/add")
	public User addUser(@RequestBody User usuario) {
		return userService.saveUser(usuario);
	}

	// http://localhost:8888/customers/delete/1 (GET)
	@Override
	@RequestMapping(value = "/users/delete/{id}", method = RequestMethod.GET, produces = "application/json")
	public String deleteUser(@PathVariable Long id) {
		return userService.deleteUser(id);
	}

	// http://localhost:8888/customers/update (PATCH)
	@Override
	@RequestMapping(value = "/users/update", method = RequestMethod.PATCH, produces = "application/json")
	public String updateUser(User usuarioNew) {
		return userService.updateUser(usuarioNew);
	}

	


	@Override
	@GetMapping("/users/login")
	public List<User> findByEmailAndPass(@RequestParam String email,@RequestParam String pass) {
		// TODO Auto-generated method stub
		return userService.findByEmailAndPass(email, pass);
	}

	

	

	
}
