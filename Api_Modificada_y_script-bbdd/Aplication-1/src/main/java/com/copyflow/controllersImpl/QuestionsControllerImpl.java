package com.copyflow.controllersImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.copyflow.controllers.QuestionsController;
import com.copyflow.entities.Question;
import com.copyflow.service.QuestionsService;
@CrossOrigin("*")
@RestController
public class QuestionsControllerImpl implements QuestionsController {
	@Autowired
	QuestionsService questionService;

	
	@GetMapping("/questions")
	@Override
	public List<Question> getQuestions() {
		return questionService.findAllQuestions();
	}

	@Override
	@GetMapping("/questions/{id}")
	
	public Optional<Question> getQuestionById(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return questionService.findQuestionById(id);
	}

	@Override
	@PostMapping("/questions/add")
	public Question addQuestion(@RequestBody Question question) {
		// TODO Auto-generated method stub
		return questionService.saveQuestion(question);
	}

	@Override
	@RequestMapping(value = "/questions/delete/{id}", method = RequestMethod.GET, produces = "application/json")
	public String deleteQuestion(Long id) {
		// TODO Auto-generated method stub
		return questionService.deleteQuestion(id);
	}

	@Override
	@RequestMapping(value = "/questions/update", method = RequestMethod.PATCH, produces = "application/json")
	public String updateQuestion(Question questionNew) {
		// TODO Auto-generated method stub
		return questionService.updateQuestion(questionNew);
	}

	@Override
	@GetMapping("/questions/category/{category}")
	public List<Question> findByCategory(@PathVariable String category) {
		// TODO Auto-generated method stub
		return questionService.findByCategory(category);
	}


	

}
