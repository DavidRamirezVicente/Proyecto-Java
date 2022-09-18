package com.copyflow.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.copyflow.entities.Question;
import com.copyflow.entities.User;

public interface QuestionRepository extends JpaRepository<Question, Long>{
	void save (Optional<Question> questionToUpdate);
	List<Question>findByCategory(String category);
	
}
