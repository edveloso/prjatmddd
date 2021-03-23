package br.edu.infnet.prjatmddd.infra.transacaofinanceira;

import br.edu.infnet.prjatmddd.dominio.transacaofinanceira.Conta;
import br.edu.infnet.prjatmddd.dominio.transacaofinanceira.IRepositorioConta;

public class RepositorioContaEmMemoria implements IRepositorioConta<Conta> {

	@Override
	public void salvar(Conta conta) {
		System.out.println("guardando no banco");
	}

	@Override
	public Conta obterConta(String numeroConta) {
		//SIMULANDO UMA CONTA
		return new Conta();
	}

	@Override
	public void atualizarConta(Conta conta) {
		// update da conta
		System.out.println("atualizando a conta");
	}

}
