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
@Table(name = "USERNAME")
@Getter
@Setter
public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="IDUSER")
		Long iduser;
		@Column(name="EMAIL")
		String email;
		@Column(name="USERNAME")
		String username;
		@Column(name="PASS")
		String pass;
		
}
