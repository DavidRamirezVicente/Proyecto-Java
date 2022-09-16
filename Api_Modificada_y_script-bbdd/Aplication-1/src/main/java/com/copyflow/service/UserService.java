package com.copyflow.service;

import java.util.List;
import java.util.Optional;

import com.copyflow.entities.User;

public interface UserService {
	public List<User> findAllUsers();
	

	public Optional<User> findUserById(Long id);
	public List<User>findByEmailAndPass(String email, String pass);
	

	public User saveUser(User userNew);

	public String deleteUser(Long id);

	public String updateUser(User userNew);
	

}
