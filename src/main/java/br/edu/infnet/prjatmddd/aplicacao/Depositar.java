package br.edu.infnet.prjatmddd.aplicacao;

import br.edu.infnet.prjatmddd.dominio.evento.EventoContaAtualizada;
import br.edu.infnet.prjatmddd.dominio.evento.PublicadorEventos;
import br.edu.infnet.prjatmddd.dominio.transacaofinanceira.Conta;
import br.edu.infnet.prjatmddd.dominio.transacaofinanceira.IRepositorioConta;

public class Depositar {
	
	private IRepositorioConta<Conta> repositorio;
	private PublicadorEventos publicadorEventos;

	public Depositar(IRepositorioConta<Conta> repositorio, PublicadorEventos publicadorEventos) {
		this.repositorio = repositorio;
		this.publicadorEventos = publicadorEventos;
	}

	public void depositaEm(String numeroConta, double valorDepositado) {
		Conta conta = repositorio.obterConta(numeroConta);
		conta.depositar(valorDepositado);
		repositorio.atualizarConta(conta);
		
		EventoContaAtualizada contaAtualizada = new EventoContaAtualizada(numeroConta);
		publicadorEventos.publicar(contaAtualizada);
		
	}
	
}
