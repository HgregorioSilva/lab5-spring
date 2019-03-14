
package br.gov.sp.fatec.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CUR_CURSO")
public class Curso {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CUR_ID")
	private long id;
	
	@Column(name="CUR_NOME", unique=true, length=50, nullable=true)
	private String nome;
	
	@Column(name="CUR_PERIODO", unique=true, length=50, nullable=true)
	private String periodo;
	
	@Column(name="CUR_MATERIAS", unique=true, length=500, nullable=true)
	private String materias;
	
	@Column(name="CUR_DURACAO", unique=true, length=50, nullable=true)
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
	
	@OneToMany(
		mappedBy = "curso",
		targetEntity = Aluno.class,
		fetch = FetchType.LAZY,
		cascade = CascadeType.ALL
	)
	/*
    @JoinTable(name = "CAL_CURSO_ALUNO", 
    	joinColumns = { @JoinColumn(name = "CUR_ID") }, 
    	inverseJoinColumns = { @JoinColumn(name = "ALU_ID") })
    */
    private List<Aluno> alunos;


	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
