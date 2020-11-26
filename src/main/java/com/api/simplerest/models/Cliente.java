/**
 * Essa classe está inacabada, eu irei mudar todos os atributos para DadosCliente
 *  E vou colocar um map, talvez no controller, para poder restringir o acesso aos dados pessoais
 *  somente com a confirmação do cpf
 */

package com.api.simplerest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@javax.validation.constraints.NotBlank
	@Size(max = 60)
	private DadosCliente nome;
	
	@javax.validation.constraints.NotBlank
	@javax.validation.constraints.Email
	@Size(max = 255)
	private String email;

	@javax.validation.constraints.NotBlank
	@Column(name = "fone")
	@Size(max = 20)
	private String telefone;
	
	private DadosCliente dadosPessoais;
	
}
