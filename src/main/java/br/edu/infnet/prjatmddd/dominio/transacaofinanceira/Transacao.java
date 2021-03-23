
package br.edu.infnet.prjatmddd.dominio.transacaofinanceira;

public class Transacao {

	private TipoTransacao credito;
	private double valorDepositado;
	private Conta conta;

	public Transacao() {
	}
	
	public Transacao(TipoTransacao credito, double valorDepositado, Conta conta) {
		this.credito = credito;
		this.valorDepositado = valorDepositado;
		this.conta = conta;
	}

	public TipoTransacao getCredito() {
		return credito;
	}

	public void setCredito(TipoTransacao credito) {
		this.credito = credito;
	}

	public double getValorDepositado() {
		return valorDepositado;
	}

	public void setValorDepositado(double valorDepositado) {
		this.valorDepositado = valorDepositado;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
