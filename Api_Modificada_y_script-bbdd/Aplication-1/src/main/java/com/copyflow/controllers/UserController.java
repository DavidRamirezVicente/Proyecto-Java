<<<<<<< HEAD
package com.copyflow.controllers;

import java.util.List;
import java.util.Optional;

import com.copyflow.entities.User;

public interface UserController {
	public List<User> getUsers();

	public Optional<User> getUserById(Long id);

	public User addUser(User user);

	public String deleteUser(Long id);

	public String updateUser(User userNew);

	

}
=======
package com.copyflow.controllers;

import java.util.List;
import java.util.Optional;

import com.copyflow.entities.User;

public interface UserController {
	public List<User> getUsers();

	public Optional<User> getUserById(Long id);

	public User addUser(User user);

	public String deleteUser(Long id);

	public String updateUser(User userNew);

	public String test();
	public boolean getLogin(String email, String pass);
}
>>>>>>> 925f4c70726023cb696e53329c9b6c8ad9eac77d
