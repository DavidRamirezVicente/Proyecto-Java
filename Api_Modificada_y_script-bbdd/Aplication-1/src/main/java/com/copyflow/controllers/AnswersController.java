package com.copyflow.controllers;

import java.util.List;
import java.util.Optional;

import com.copyflow.entities.Answers;
import com.copyflow.entities.Question;

public interface AnswersController {
	public List<Answers> getAnswers();

	public Optional<Answers> findAnswerById(Long id);

	public Answers addAnswer(Answers answer);

	public String deleteAnswer(Long id);

	public String updateAnswer(Answers answerNew);
	public List<Answers>findByIdquestion(Long idquestion);
}
