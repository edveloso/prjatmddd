package br.edu.infnet.prjatmddd;

import br.edu.infnet.prjatmddd.aplicacao.AutenticarUsuario;
import br.edu.infnet.prjatmddd.dominio.evento.PublicadorEventos;
import br.edu.infnet.prjatmddd.dominio.usuarios.IRepositorioUsuario;
import br.edu.infnet.prjatmddd.infra.usuarios.RepositorioUsuarioEmMemoria;
import br.edu.infnet.prjatmddd.ui.TelaHome;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IRepositorioUsuario repositorioUsuario = new RepositorioUsuarioEmMemoria();
		PublicadorEventos publicadorEnventos = new PublicadorEventos();
		publicadorEnventos.adicionar(new TelaHome());
		
		AutenticarUsuario autenticarUsuario = new AutenticarUsuario(repositorioUsuario, publicadorEnventos);
		autenticarUsuario.autentica("1234", 456);
    	
    	
    }
}
