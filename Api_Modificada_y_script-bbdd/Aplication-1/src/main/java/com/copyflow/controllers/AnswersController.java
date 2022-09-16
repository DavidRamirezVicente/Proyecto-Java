package com.copyflow.controllers;

import java.util.Optional;

import com.copyflow.entities.Answers;
import com.copyflow.entities.Question;

public interface AnswersController {
public Optional<Answers> findAnswerById(Long id);
	

	public Question saveAnswer(Answers AnswerNew);

	public String deleteAnswer(Long id);

	public String updateAnswer(Answers answerNew);
}
