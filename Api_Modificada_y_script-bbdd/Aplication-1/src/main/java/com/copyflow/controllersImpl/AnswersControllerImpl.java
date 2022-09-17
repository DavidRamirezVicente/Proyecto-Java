package com.copyflow.controllersImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.copyflow.controllers.AnswersController;
import com.copyflow.entities.Answers;
import com.copyflow.service.AnswersService;

@CrossOrigin("*")
@RestController
public class AnswersControllerImpl implements AnswersController {
	@Autowired
	AnswersService answerService;

	@Override
	@GetMapping("/answers")
	public List<Answers> getAnswers() {
		return answerService.findAllAnswers();
	}

	@Override
	@GetMapping("answers/{id}")
	public Optional<Answers> findAnswerById(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return answerService.findAnswerById(id);
	}

	@Override
	@PostMapping("answers/add")
	public Answers addAnswer(@RequestBody Answers answer) {
		// TODO Auto-generated method stub
		return answerService.saveAnswer(answer);
	}

	@Override
	@GetMapping("/answers/delete/{id}")
	public String deleteAnswer(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return answerService.deleteAnswer(id);
	}

	@Override
	@PatchMapping("answers/update")
	public String updateAnswer(Answers answerNew) {
		// TODO Auto-generated method stub
		return answerService.updateAnswer(answerNew);
	}

	@Override
	@GetMapping("/answers/question/{idquestion}")
	public List<Answers> findByIdquestion(@PathVariable Long idquestion) {
		// TODO Auto-generated method stub
		return answerService.findByIdquestion(idquestion);
	}

	

}
