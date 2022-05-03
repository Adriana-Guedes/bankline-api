package com.dio.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tab_correntista")
public class Correntista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(length = 20)//TAMANHO DA COLUNA
	private String cpf;
	
	@Column(length = 60)//TAMANHO DA COLUNA
	private String nome;
	
	
	//ESSE CORRENTISTA TEM APENAS UMA CONTA
	
	@Embedded // AS INFORMAÇÕES QUE ESTIVERES NESTA CLASSE ESTARAM NA MESMA TABELA, QUE É A TABELA PRINCIPAL 
	private  Conta conta ;
	public Conta getConta() {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
	
	//GETTERS E SETTERS
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

