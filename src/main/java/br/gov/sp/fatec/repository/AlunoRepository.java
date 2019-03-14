package br.gov.sp.fatec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.gov.sp.fatec.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {

	public Aluno findByNome(String nome);
	
	public List<Aluno> findByIdGreaterThan(Long id);
	
	@Query("select a from Aluno a where a.nome like %?1%")
	public List<Aluno> buscaAluno(String nome);
	
}
