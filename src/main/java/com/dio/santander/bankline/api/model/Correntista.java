package com.dio.santander.bankline.api.model;






public class Correntista {
	
	
	private Integer id;
	private String cpf;
	private String nome;
	
	
	//ESSE CORRENTISTA TEM APENAS UMA CONTA
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

