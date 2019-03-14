package br.gov.sp.fatec.service;

import br.gov.sp.fatec.model.Aluno;

public interface AlunoService {
	
	public Aluno incluirAluno(String nome, int idade, String nomeCurso);
	
	public void incluirDoisAlunos(String nomeAluno1, int idadeAluno1, String nomeAluno2, int idadeAluno2);

}
