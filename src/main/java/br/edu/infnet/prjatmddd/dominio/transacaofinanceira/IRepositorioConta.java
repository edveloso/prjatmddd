package br.edu.infnet.prjatmddd.dominio.transacaofinanceira;

public interface IRepositorioConta<Conta> {
	
	void salvar(Conta conta);
	Conta obterConta(String numeroConta);
	void atualizarConta(Conta conta);

}
