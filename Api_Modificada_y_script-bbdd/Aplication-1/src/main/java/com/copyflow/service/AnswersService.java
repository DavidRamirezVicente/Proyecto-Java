package com.copyflow.service;

import java.util.List;
import java.util.Optional;

import com.copyflow.entities.Answers;
import com.copyflow.entities.Question;

public interface AnswersService {
public List<Answers> findAllAnswers();
	

	public Optional<Answers> findAnswerById(Long id);
	

	public Answers saveAnswer(Answers AnswerNew);

	public String deleteAnswer(Long id);

	public String updateAnswer(Answers answerUpdated);
	public List<Answers>findByIdquestion(Long idquestion);
}
