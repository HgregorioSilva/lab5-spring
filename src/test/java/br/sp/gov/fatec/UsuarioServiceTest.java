/**
 * 
 */
package br.sp.gov.fatec;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import br.gov.sp.fatec.DIConfig;
import br.gov.sp.fatec.repository.UsuarioRepository;
import br.gov.sp.fatec.service.UsuarioService;

/**
 * @author Emanuel
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DIConfig.class})
@Transactional
public class UsuarioServiceTest {
	
	private static final String NOME = "Usuário X";
	private static final String SENHA = "X";
	private static final String AUTORIZACAO = "Autorização Y";
	
	@Autowired
	private UsuarioRepository usuarioRepo;
	
	@Autowired
	private UsuarioService usuarioService;
	
	public void setUsuarioRepo(UsuarioRepository usuarioRepo) {
		this.usuarioRepo = usuarioRepo;
	}
	
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@Test
	public void testeIncluirUsuarioOk() {
		usuarioService.incluirUsuario(NOME, SENHA, AUTORIZACAO);
		assertFalse(usuarioRepo.findByAutorizacoesNomeContainsIgnoreCase(AUTORIZACAO).isEmpty());
		
	}

}
