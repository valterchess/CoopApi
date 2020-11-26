package com.api.simplerest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

@Entity
public class DadosCliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@javax.validation.constraints.NotBlank
	@Size(max = 60)
	private String nome;
	
	@javax.validation.constraints.NotBlank
	@javax.validation.constraints.Email
	@Size(max = 255)
	private String email;
	
	@javax.validation.constraints.NotBlank
	@Size(max = 20)

	private int telefone;
	
	@javax.validation.constraints.NotBlank
	@CPF
	private int cpf;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cpf;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DadosCliente other = (DadosCliente) obj;
		if (cpf != other.cpf)
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void retornaDados() {
		System.out.println("Dados pessoais");
		System.out.println("id: " + getId());
		System.out.println("nome: " + getNome());
		System.out.println("Email: " + getEmail());
		System.out.println("fone: " + getTelefone());
		System.out.println("CPF: " + getCpf());
		
	}
}

