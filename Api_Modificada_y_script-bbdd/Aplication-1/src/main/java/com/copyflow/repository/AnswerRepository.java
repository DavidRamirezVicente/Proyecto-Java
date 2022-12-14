package com.copyflow.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.copyflow.entities.Answers;

public interface AnswerRepository extends JpaRepository<Answers, Long> {
	void save (Optional<Answers> answerToUpdate);
	List<Answers>findByIdquestion(Long idquestion);
	
	

}
