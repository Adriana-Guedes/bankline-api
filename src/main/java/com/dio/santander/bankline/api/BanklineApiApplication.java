package com.dio.santander.bankline.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dio.santander.bankline.api.model.Correntista;

@SpringBootApplication
public class BanklineApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanklineApiApplication.class, args);
	}
	
	
	
	@PostMapping //RECEBE UM CORRENTISTA E COMO ELE FAZ PARTE DA REQUISIÇÃO ELE PRECISA DO REQUESTBODY
	public void save(@RequestBody Correntista correntista) {
		
	}

}
