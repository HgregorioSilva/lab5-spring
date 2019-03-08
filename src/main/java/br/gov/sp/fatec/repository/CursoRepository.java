package br.gov.sp.fatec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.gov.sp.fatec.model.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {

	public Curso findByNome(String nome);
	
	@Query("select u from Usuario u where u.nome like %?1%")
	public List<Curso> buscaCurso(String nome);
	
}
