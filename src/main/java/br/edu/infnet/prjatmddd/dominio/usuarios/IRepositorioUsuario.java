package br.edu.infnet.prjatmddd.dominio.usuarios;

public interface IRepositorioUsuario {

	Usuario autenticarCom(String numeroConta, int pin);
	
}
