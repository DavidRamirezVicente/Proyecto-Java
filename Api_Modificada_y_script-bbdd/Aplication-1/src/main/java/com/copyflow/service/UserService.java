<<<<<<< HEAD
package com.copyflow.service;

import java.util.List;
import java.util.Optional;

import com.copyflow.entities.User;

public interface UserService {
	public List<User> findAllUsers();

	public Optional<User> findUserById(Long id);

	public User saveUser(User userNew);

	public String deleteUser(Long id);

	public String updateUser(User userNew);
	
	
}
=======
package com.copyflow.service;

import java.util.List;
import java.util.Optional;

import com.copyflow.entities.User;

public interface UserService {
	public List<User> findAllUsers();

	public Optional<User> findUserById(Long id);

	public User saveUser(User userNew);

	public String deleteUser(Long id);

	public String updateUser(User userNew);
	public boolean getLogin(String email, String pass);
}
>>>>>>> 925f4c70726023cb696e53329c9b6c8ad9eac77d
