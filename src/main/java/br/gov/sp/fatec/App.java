package br.gov.sp.fatec;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.gov.sp.fatec.model.Aluno;
import br.gov.sp.fatec.model.Curso;
import br.gov.sp.fatec.repository.AlunoRepository;
import br.gov.sp.fatec.repository.CursoRepository;

public class App 
{

	public static void main( String[] args )
    { 
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DIConfig.class);
		
		CursoRepository cursoRepo = (CursoRepository) context.getBean("cursoRepository");
		AlunoRepository alunoRepo = (AlunoRepository) context.getBean("alunoRepository");
		
		Curso curso1 = new Curso();
		curso1.setNome("Banco de dados");
		cursoRepo.save(curso1);
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.setNome("Everton");
		aluno2.setNome("Augusto");
		
		aluno1.setCurso(curso1);
		aluno2.setCurso(curso1);
		
		alunoRepo.save(aluno1);
		alunoRepo.save(aluno2);
		
		context.close();
		
		/*
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DIConfig.class);
 
		// Recupera os repositorios
		AutorizacaoRepository autorizacaoRepo = (AutorizacaoRepository) context.getBean("autorizacaoRepository");
		UsuarioRepository usuarioRepo = (UsuarioRepository) context.getBean("usuarioRepository");
		
		// Cria autorizacoes
		Autorizacao autorizacao1 = new Autorizacao();
		autorizacao1.setNome("Usu�rio");
		
		autorizacaoRepo.save(autorizacao1);
		
		Autorizacao autorizacao2 = new Autorizacao();
		autorizacao2.setNome("Administrador");
		
		autorizacaoRepo.save(autorizacao2);
		
		// Cria um usuario
		Usuario usuario = new Usuario();
		usuario.setNome("Paulo");
		usuario.setSenha("senha");
		usuario.setAutorizacoes(new ArrayList<Autorizacao>());
		usuario.getAutorizacoes().add(autorizacao1);
		usuario.getAutorizacoes().add(autorizacao2);
		
		usuarioRepo.save(usuario);
		
		System.out.println("Id: " + usuario.getId());
		
		// Cria usuario usando servico (FORMA CORRETA DE FAZER!)
		UsuarioService usuarioService = (UsuarioService)context.getBean("usuarioService");
		
		usuario = usuarioService.incluirUsuario("Ana", "123456", "Administrador");
		
		System.out.println("Id: " + usuario.getId());
		
		// Realiza varias consultas
		System.out.println("Resultado da busca 1: " + usuarioRepo.findByNome("Paulo").getNome());
		
		System.out.println("Resultado da busca 2: " + usuarioRepo.findTop1ByNomeContains("au").getNome());

		for(Usuario us: usuarioRepo.findByIdGreaterThan(0l)) {
			System.out.println("Usuario encontrado: " + us.getNome());
		}
		
		for(Usuario us: usuarioRepo.findByNomeContainsIgnoreCaseOrAutorizacoesNomeContainsIgnoreCase("n", "m")) {
			System.out.println("Usuario encontrado 2 (or): " + us.getNome());
		}
		
		for(Usuario us: usuarioRepo.findByAutorizacoesNomeContainsIgnoreCase("Usuario")) {
			System.out.println("Usuario encontrado 3: " + us.getNome());
		}
		
		for(Usuario us: usuarioRepo.buscaUsuario("a")) {
			System.out.println("Usuario encontrado 4: " + us.getNome());
		}
		
		// Gerando erro de proposito ao tentar criar dois usuarios com mesmo nome
		try {
			usuarioService.incluirDoisUsuarios("Luis", "Luis");
		}
		catch(Exception e) {
			System.out.println("Erro esperado! Rollback realizado!");
			e.printStackTrace();
		}
		
		// Mesmo o erro ocorrendo somente no segundo insert, nada se grava por conta da transacao
		usuario = usuarioRepo.findByNome("Luis");
		if(usuario == null) {
			System.out.println("Usuario Luis nao foi encontrado!");
		}
		
		// Exclui usuario
		usuarioRepo.delete(usuarioRepo.findByNome("Paulo"));
		usuarioRepo.delete(usuarioRepo.findByNome("Ana"));
		// Exclui autorizacoes
		autorizacaoRepo.delete(autorizacao1);
		autorizacaoRepo.delete(autorizacao2);
		
		context.close();
		 */
    }
    
}
