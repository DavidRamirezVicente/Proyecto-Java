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
	public List<User> findByEmailAndPass(String email, String pass) {
		List<User> userlogin = userRepository.findByEmailAndPass(email, pass);
		return userlogin;
	}

}
	



	





	



