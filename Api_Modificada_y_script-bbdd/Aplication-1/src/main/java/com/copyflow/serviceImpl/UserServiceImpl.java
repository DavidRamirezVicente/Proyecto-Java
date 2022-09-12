<<<<<<< HEAD
package com.copyflow.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.copyflow.entities.User;
import com.copyflow.repository.UserRepository;
import com.copyflow.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	JdbcTemplate jdbcTemplate;

	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> findUserById(Long id) {
		Optional<User> customer = userRepository.findById(id);
		return customer;
	}

	@Override
	public User saveUser(User userNew) {
		if (userNew != null) {
			return userRepository.save(userNew);
		}
		return new User();
	}

	@Override
	public String deleteUser(Long id) {
		if (userRepository.findById(id).isPresent()) {
			userRepository.deleteById(id);
			return "Customer eliminado correctamente.";
		}
		return "Error! El customer no existe";
	}

	@Override
	public String updateUser(User userUpdated) {
		Long num = userUpdated.getIduser();
		if (userRepository.findById(num).isPresent()) {
			User userToUpdate = new User();
			userToUpdate.setIduser(userUpdated.getIduser());
			userToUpdate.setEmail(userUpdated.getEmail());
			userToUpdate.setUsername(userUpdated.getUsername());
			userToUpdate.setPass(userUpdated.getPass());
			userRepository.save(userToUpdate);
			return "Customer modificado";
		}
		return "Error al modificar el Customer";
	}



	





	


}
=======
package com.copyflow.serviceImpl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.copyflow.entities.User;
import com.copyflow.repository.UserRepository;
import com.copyflow.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	JdbcTemplate jdbcTemplate;

	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> findUserById(Long id) {
		Optional<User> customer = userRepository.findById(id);
		return customer;
	}

	@Override
	public User saveUser(User userNew) {
		if (userNew != null) {
			return userRepository.save(userNew);
		}
		return new User();
	}

	@Override
	public String deleteUser(Long id) {
		if (userRepository.findById(id).isPresent()) {
			userRepository.deleteById(id);
			return "Customer eliminado correctamente.";
		}
		return "Error! El customer no existe";
	}

	@Override
	public String updateUser(User userUpdated) {
		Long num = userUpdated.getIduser();
		if (userRepository.findById(num).isPresent()) {
			User userToUpdate = new User();
			userToUpdate.setIduser(userUpdated.getIduser());
			userToUpdate.setEmail(userUpdated.getEmail());
			userToUpdate.setUsername(userUpdated.getUsername());
			userToUpdate.setPass(userUpdated.getPass());
			userRepository.save(userToUpdate);
			return "Customer modificado";
		}
		return "Error al modificar el Customer";
	}

	@Override
	public boolean getLogin(String email, String pass) {
		List<Map<String, Object>> userList = jdbcTemplate.queryForList("select * from username where email='" + email + "' AND pass='" + pass + "';");
		System.out.println(userList.size());
		for (Map<String, Object> user : userList) {
			return true;
		}
		return false;
	}

}
>>>>>>> 925f4c70726023cb696e53329c9b6c8ad9eac77d
