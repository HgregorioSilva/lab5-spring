package br.gov.sp.fatec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.sp.fatec.model.Aluno;
import br.gov.sp.fatec.model.Curso;
import br.gov.sp.fatec.repository.AlunoRepository;
import br.gov.sp.fatec.repository.CursoRepository;

@Service("alunoService")
public class AlunoServiceImpl implements AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepo;
	
	@Autowired
	private CursoRepository cursoRepo;

	/**
	 * @param alunoRepo the alunoRepo to set
	 */
	public void setAlunoRepo(AlunoRepository alunoRepo) {
		this.alunoRepo = alunoRepo;
	}
	
	/**
	 * @param cursoRepo the cursoRepo to set
	 */
	public void setcursoRepo(CursoRepository cursoRepo) {
		this.cursoRepo = cursoRepo;
	}

	@Override
	@Transactional
	public Aluno incluirAluno(String nome, int idade, String nomeCurso) {
		Curso curso = cursoRepo.findByNome(nomeCurso);
		// Se nao existe
		if(curso == null) {
			// Cria nova
			curso = new Curso();
			curso.setNome(nomeCurso);
			cursoRepo.save(curso);
		}
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setIdade(idade);
		aluno.setCurso(new Curso());
		//aluno.getCurso().add(curso);
		alunoRepo.save(aluno);
		return aluno;
	}

	@Override
	@Transactional
	public void incluirDoisAlunos(String nomeAluno1, int idadeAluno1, String nomeAluno2, int idadeAluno2) {
		Aluno aluno = new Aluno();
		aluno.setNome(nomeAluno1);
		aluno.setIdade(idadeAluno1);
		alunoRepo.save(aluno);
		aluno = new Aluno();
		aluno.setNome(nomeAluno2);
		aluno.setIdade(idadeAluno2);
		alunoRepo.save(aluno);		
	}

}
