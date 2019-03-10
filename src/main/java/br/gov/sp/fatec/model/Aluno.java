package br.gov.sp.fatec.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
public class Aluno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ALU_ID")
	private long id;
	
	@Column(name="ALU_NOME", unique=true, length=50, nullable=false)
	String nome;
	
	@Column(name="ALU_IDADE", unique=true, length=50, nullable=false)
	int idade;
	
	@Column(name="ALU_SEMESTRE", unique=true, length=50, nullable=false)
	int semestre;
	
	@Column(name="ALU_RA", unique=true, length=50, nullable=false)
	String ra;
	
	@Column(name="ALU_SEXO", unique=true, length=1, nullable=false)
	char sexo;
	
	public Aluno() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getSemestre() {
		return semestre;
	}
	
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public String getRa() {
		return ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
}
