package br.edu.infnet.prjatmddd.dominio.usuarios;

public class Usuario {

	private String numeroConta;
	private int pin;

	public Usuario(String numeroConta, int pin) {
		this.numeroConta = numeroConta;
		this.pin = pin;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	@Override
	public String toString() {
		return "Usuario [numeroConta=" + numeroConta + ", pin=" + pin + "]";
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
}
