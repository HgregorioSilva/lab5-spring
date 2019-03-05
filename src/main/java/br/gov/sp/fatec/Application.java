package br.gov.sp.fatec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import br.gov.sp.fatec.model.Aluno;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		Aluno aluno01 = applicationContext.getBean(Aluno.class);
		aluno01.setNome("Carlos");
		System.out.println(aluno01.getNome());
		
	}

}
