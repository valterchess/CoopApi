package com.api.simplerest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@javax.validation.constraints.NotBlank
	@Size(max = 60)
	private String nome;
	
	@javax.validation.constraints.NotBlank
	@javax.validation.constraints.Email
	@Size(max = 255)
	private String email;
	
	//@javax.validation.constraints.NotBlank
	//private Setores setor;
	

}
