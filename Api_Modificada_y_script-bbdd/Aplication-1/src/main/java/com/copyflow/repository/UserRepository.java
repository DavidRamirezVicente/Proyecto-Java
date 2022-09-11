package com.copyflow.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.copyflow.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{
void save (Optional<User> userToUpdate);
}
