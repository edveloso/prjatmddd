package br.edu.infnet.prjatmddd;

import br.edu.infnet.prjatmddd.aplicacao.Depositar;
import br.edu.infnet.prjatmddd.dominio.evento.PublicadorEventos;
import br.edu.infnet.prjatmddd.dominio.transacaofinanceira.Conta;
import br.edu.infnet.prjatmddd.dominio.transacaofinanceira.IRepositorioConta;
import br.edu.infnet.prjatmddd.infra.usuarios.RepositorioContaEmMemoria;
import br.edu.infnet.prjatmddd.ui.TelaHome;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        IRepositorioUsuario repositorioUsuario = new RepositorioUsuarioEmMemoria();
        IRepositorioConta<Conta> repositorio = new RepositorioContaEmMemoria();
        
		PublicadorEventos publicadorEnventos = new PublicadorEventos();
		publicadorEnventos.adicionarOuvinte(new TelaHome());
		
//		AutenticarUsuario autenticarUsuario = new AutenticarUsuario(repositorioUsuario, publicadorEnventos);
//		autenticarUsuario.autentica("1234", 456);
    	Depositar depositar = new Depositar(repositorio, publicadorEnventos);
    	depositar.depositaEm("123", 20);
    	
    }
}
