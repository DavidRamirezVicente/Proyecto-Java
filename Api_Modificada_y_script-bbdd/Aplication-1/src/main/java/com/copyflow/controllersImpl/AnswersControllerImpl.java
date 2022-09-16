package com.copyflow.controllersImpl;

import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.copyflow.controllers.AnswersController;
import com.copyflow.entities.Answers;
import com.copyflow.entities.Question;

@CrossOrigin("*")
@RestController
public class AnswersControllerImpl implements AnswersController{

	@Override
	public Optional<Answers> findAnswerById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Question saveAnswer(Answers AnswerNew) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAnswer(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateAnswer(Answers answerNew) {
		// TODO Auto-generated method stub
		return null;
	}

}
