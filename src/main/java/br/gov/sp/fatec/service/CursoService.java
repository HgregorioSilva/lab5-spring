package br.gov.sp.fatec.service;

import br.gov.sp.fatec.model.Curso;

public interface CursoService {

	public void incluirCurso(String nome);
	
	public Curso excluirCurso(String nome);
	
}
