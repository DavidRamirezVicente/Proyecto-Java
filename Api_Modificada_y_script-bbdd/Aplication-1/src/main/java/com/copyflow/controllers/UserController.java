package com.copyflow.controllers;

import java.util.List;
import java.util.Optional;

import com.copyflow.entities.User;

public interface UserController {
	public List<User> getUsers();

	public Optional<User> getUserById(Long id);
	public Optional<User> getUserByUsername(String username);

	public List<User>findByUsernameAndPass(String username, String pass);
	
	public User addUser(User user);

	public String deleteUser(Long id);

	public String updateUser(User userNew);

	


}
