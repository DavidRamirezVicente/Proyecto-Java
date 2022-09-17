package com.copyflow.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.copyflow.entities.Answers;
import com.copyflow.entities.Question;
import com.copyflow.repository.AnswerRepository;
import com.copyflow.service.AnswersService;

@Service
public class AnswersServiceImpl implements AnswersService{
@Autowired
AnswerRepository answerRepository;
	@Override
	public List<Answers> findAllAnswers() {
		// TODO Auto-generated method stub
		return answerRepository.findAll();
	}

	@Override
	public Optional<Answers> findAnswerById(Long id) {
		Optional<Answers> answer = answerRepository.findById(id);
		return answer;
	}

	@Override
	public Answers saveAnswer(Answers AnswerNew) {
		if(AnswerNew != null) {
			return answerRepository.save(AnswerNew);
		}
		return new Answers();
	}

	@Override
	public String deleteAnswer(Long id) {
		if(answerRepository.findById(id).isPresent()) {
			answerRepository.deleteById(id);
			return "Respuesta eliminada";
		}
		return "Error!";
	}

	@Override
	public String updateAnswer(Answers answerUpdated) {
		Long num = answerUpdated.getIdquestion();
		if(answerRepository.findById(num).isPresent()) {
			Answers answerToUpdated = new Answers();
			answerToUpdated.setIdanswer(answerUpdated.getIdanswer());
			answerToUpdated.setIdquestion(answerUpdated.getIdquestion());
			answerToUpdated.setAnswer(answerUpdated.getAnswer());
			answerToUpdated.setIduser(answerUpdated.getIduser());
			return "Respuesta Modificada";
			
		}
		return "Error al modificar la respuesta";
	}

	@Override
	public List<Answers> findByIdquestion(Long idquestion) {
		List<Answers> pregunta = answerRepository.findByIdquestion(idquestion);
		return pregunta;
	}

	

}
