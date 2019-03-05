package com.fatec.lab5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab5Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Lab5Application.class, args);
		Aluno aluno01 = applicationContext.getBean(Aluno.class);
		aluno01.setNome("Carlos");
		System.out.println(aluno01.getNome());
		
	}

}
