package br.edu.infnet.prjatmddd.aplicacao;

import br.edu.infnet.prjatmddd.dominio.evento.PublicadorEventos;
import br.edu.infnet.prjatmddd.dominio.usuarios.EventoUsuarioAutenticado;
import br.edu.infnet.prjatmddd.dominio.usuarios.IRepositorioUsuario;
import br.edu.infnet.prjatmddd.dominio.usuarios.Usuario;

public class AutenticarUsuario {
	
	private IRepositorioUsuario repositorioUsuario;
	private final PublicadorEventos publicadorEnventos;

	public AutenticarUsuario(IRepositorioUsuario repositorioUsuario, PublicadorEventos publicadorEnventos) {
		this.publicadorEnventos = publicadorEnventos;
		this.repositorioUsuario = repositorioUsuario;
	}

	public void autentica(String numeroConta, int pin) {
		Usuario usuario = repositorioUsuario.autenticarCom(numeroConta, pin);
		if(usuario == null) throw new RuntimeException("Conta ou senha inválidos");
		
		EventoUsuarioAutenticado usuarioAutenticado = new EventoUsuarioAutenticado(usuario.getNumeroConta());
		publicadorEnventos.publicar(usuarioAutenticado);
	}
	
	
}
