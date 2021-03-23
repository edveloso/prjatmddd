package br.edu.infnet.prjatmddd.aplicacao;

import br.edu.infnet.prjatmddd.dominio.usuarios.IRepositorioUsuario;
import br.edu.infnet.prjatmddd.dominio.usuarios.Usuario;

public class AutenticarUsuario {
	
	private IRepositorioUsuario repositorioUsuario;

	public AutenticarUsuario(IRepositorioUsuario repositorioUsuario) {
		this.repositorioUsuario = repositorioUsuario;
	}

	public void autentica(String numeroConta, int pin) {
		Usuario usuario = repositorioUsuario.autenticarCom(numeroConta, pin);
		if(usuario == null) throw new RuntimeException("Conta ou senha inválidos");
		
		//retorna para a pagina de menu
		
	}
	
	
}
