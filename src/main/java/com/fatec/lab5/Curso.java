package com.fatec.lab5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUR_CURSO")
public class Curso {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CUR_ID")
	private long id;
	
	@Column(name="CUR_NOME", unique=true, length=50, nullable=false)
	private String nome;
	
	@Column(name="CUR_PERIODO", unique=true, length=50, nullable=false)
	private String periodo;
	
	@Column(name="CUR_MATERIAS", unique=true, length=500, nullable=false)
	private String materias;
	
	@Column(name="CUR_NOME", unique=true, length=50, nullable=false)
	private String duracao;
	
	public Curso() {
		super();
	}
	
	public Curso(int id, String nome, String periodo, String materias, String duracao) {
		super();
		this.id = id;
		this.nome = nome;
		this.periodo = periodo;
		this.materias = materias;
		this.duracao = duracao;
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

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getMaterias() {
		return materias;
	}

	public void setMaterias(String materias) {
		this.materias = materias;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nome=" + nome + ", periodo=" + periodo + ", materias = " + materias + ", duracao = "+ duracao + "]";
	}

}