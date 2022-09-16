package com.copyflow.service;

import java.util.List;
import java.util.Optional;

import com.copyflow.entities.Question;
import com.copyflow.entities.User;

public interface QuestionsService {
public List<Question> findAllQuestions();
	

	public Optional<Question> findQuestionById(Long id);

	public List<Question>findByCategory(String category);

	public Question saveQuestion(Question questionNew);

	public String deleteQuestion(Long id);

	public String updateQuestion(Question questionNew);
}
