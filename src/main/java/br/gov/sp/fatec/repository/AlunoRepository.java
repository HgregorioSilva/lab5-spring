package br.gov.sp.fatec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.model.Aluno;

public interface AlunoRepository {

	public Aluno findByNome(String nome);
	
	public List<Aluno> findByIdGreaterThan(Long id);
	
	@Query("select u from Aluno u where u.nome like %?1%")
	public List<Aluno> buscaAluno(String nome);
	
}
