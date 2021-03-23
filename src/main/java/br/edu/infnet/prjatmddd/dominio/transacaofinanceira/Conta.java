package br.edu.infnet.prjatmddd.dominio.transacaofinanceira;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	
	private Cliente cliente;
	
	private double saldo;
	
	private List<Transacao> transacoes;

	public Conta() {
		transacoes = new ArrayList<Transacao>();
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valorDepositado) {
	    Transacao transacao = new Transacao(TipoTransacao.CREDITO, valorDepositado, this);
		transacoes.add(transacao );
		setSaldo(saldo + valorDepositado);
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	

}
