<<<<<<< HEAD
package com.copyflow.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.copyflow.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{
void save (Optional<User> userToUpdate);

}
=======
package com.copyflow.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.copyflow.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{
void save (Optional<User> userToUpdate);
}
>>>>>>> 925f4c70726023cb696e53329c9b6c8ad9eac77d
