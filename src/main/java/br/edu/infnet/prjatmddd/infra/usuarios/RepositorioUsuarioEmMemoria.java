package br.edu.infnet.prjatmddd.infra.usuarios;

import br.edu.infnet.prjatmddd.dominio.usuarios.IRepositorioUsuario;
import br.edu.infnet.prjatmddd.dominio.usuarios.Usuario;

public class RepositorioUsuarioEmMemoria implements IRepositorioUsuario {

	@Override
	public Usuario autenticarCom(String numeroConta, int pin) {
		if (numeroConta.equals("123") && pin == 456) {
			Usuario usuario = new Usuario(numeroConta, pin);
			return usuario;
		}
		return null;
	}

	
	
}
