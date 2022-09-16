package com.copyflow.controllers;

import java.util.List;
import java.util.Optional;

import com.copyflow.entities.Question;
import com.copyflow.entities.User;

public interface QuestionsController {
	public List<Question> getQuestions();

	public Optional<Question> getQuestionById(Long id);

	public List<Question>findByCategory(String category);
	
	public Question addQuestion(Question question);

	public String deleteQuestion(Long id);

	public String updateQuestion(Question questionNew);
}
