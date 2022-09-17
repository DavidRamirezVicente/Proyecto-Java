package com.copyflow.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ANSWERS")
@Getter
@Setter
public class Answers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDANSWER")
	Long idanswer;
	@Column(name = "ANSWER")
	String answer;

	@Column(name = "IDQUESTION")
	Long idquestion;
	@Column(name = "IDUSER")
	Long iduser;

}
