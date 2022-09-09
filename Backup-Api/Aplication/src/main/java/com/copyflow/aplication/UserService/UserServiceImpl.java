package com.copyflow.aplication.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.copyflow.aplication.model.User;
@Repository
public class UserServiceImpl implements UserService{
@Autowired
JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(User users) {
		
		return jdbcTemplate.update("Insert into usuarios(email, nombre, password, preguntas) Values (?, ?, ?, ?)", new Object[] {users.getEmail(), users.getNombre(), users.getPassword(), users.getPreguntas()});
	}

	@Override
	public int update(User users, int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("UPDATE usuarios SET email=?, nombre=?, password=?, preguntas=? Where id=?", new Object[] {users.getEmail(), users.getNombre(), users.getPassword(), users.getPreguntas(), id});
		
	}

	@Override
	public int delete(int id) {
		
		return jdbcTemplate.update("DELETE FROM usuarios Where id=?", id);
	}

	@Override
	public List<User> getAll() {
		
		return jdbcTemplate.query("Select * from usuarios", new BeanPropertyRowMapper<User>(User.class));
	}

	@Override
	public User getById(int id) {
		
		return jdbcTemplate.queryForObject("Select * from usuarios where id=?", new BeanPropertyRowMapper<User>(User.class), id);
	}

	@Override
	public List<User> getPreguntas() {
		return jdbcTemplate.query("Select preguntas from usuarios", new BeanPropertyRowMapper<User>(User.class));
		
	}
	

}
