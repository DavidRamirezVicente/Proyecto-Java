package com.copyflow.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "QUESTION")
@Getter
@Setter
public class Question {
	
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			@Column(name="IDQUESTION")
			Long idquestion;
			@Column(name="QUESTION")
			String question;
			@Column(name="CATEGORY")
			String category;
			@Column(name="IDUSER")
			Long iduser;
			
	
}