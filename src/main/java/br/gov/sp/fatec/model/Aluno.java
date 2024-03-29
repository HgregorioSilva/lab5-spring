
package br.gov.sp.fatec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ALU_ALUNO")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ALU_ID")
	private long id;
	
	@Column(name="ALU_NOME", unique=true, length=60, nullable=false)
	String nome;
	
	@Column(name="ALU_IDADE", unique=true, length=50, nullable=false)
	int idade;
	
	@Column(name="ALU_SEMESTRE", unique=true, length=50, nullable=false)
	int semestre;
	
	@Column(name="ALU_RA", unique=true, length=50, nullable=false)
	String ra;
	
	@Column(name="ALU_SEXO", unique=true, length=1, nullable=false)
	char sexo;
	
	@ManyToOne
	@JoinColumn(name="CUR_ID")
	private Curso curso;
	
//	public Aluno() {
//		super();
//	}
//	
//	public Aluno(int id, String nome, int idade, int semestre, String ra, char sexo) {
//		this.id = id;
//		this.nome = nome;
//		this.idade = idade;
//		this.semestre = semestre;
//		this.ra = ra;
//		this.sexo = sexo;
//	}
	
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
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
