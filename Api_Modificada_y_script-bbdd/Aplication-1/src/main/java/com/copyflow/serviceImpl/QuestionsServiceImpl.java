package com.copyflow.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.copyflow.entities.Question;
import com.copyflow.entities.User;
import com.copyflow.repository.QuestionRepository;
import com.copyflow.service.QuestionsService;

@Service
public class QuestionsServiceImpl implements QuestionsService {
	@Autowired
	QuestionRepository questionRepository;
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Question> findAllQuestions() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

	@Override
	public Optional<Question> findQuestionById(Long id) {
		Optional<Question> question = questionRepository.findById(id);
		return question;
	}

	@Override
	public Question saveQuestion(Question questionNew) {
		if (questionNew != null) {
			return questionRepository.save(questionNew);
		}
		return new Question();
	}

	@Override
	public String deleteQuestion(Long id) {
		if (questionRepository.findById(id).isPresent()) {
			questionRepository.deleteById(id);
			return "Pregunta eliminada correctamente.";
		}
		return "Error! La pregunta no existe";
	}

	@Override
	public String updateQuestion(Question questionUpdated) {
		Long num = questionUpdated.getIduser();
		if (questionRepository.findById(num).isPresent()) {
			Question questionToUpdate = new Question();
			questionToUpdate.setIdquestion(questionUpdated.getIdquestion());
			questionToUpdate.setQuestion(questionUpdated.getQuestion());
			questionToUpdate.setCategory(questionUpdated.getCategory());
			questionToUpdate.setIduser(questionUpdated.getIduser());
			return "Pregunta modificada";
		}
		return "Error al modificar el Customer";
	}

}
