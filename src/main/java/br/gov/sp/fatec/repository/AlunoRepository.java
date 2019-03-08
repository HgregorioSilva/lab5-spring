package br.gov.sp.fatec.repository;

import org.springframework.data.repository.CrudRepository;

import br.gov.sp.fatec.model.Curso;

public interface AlunoRepository extends CrudRepository<Curso, Long> {

	public Curso findByNome(String nome);
	
}
