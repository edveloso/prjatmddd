package br.edu.infnet.prjatmddd.dominio.transacaofinanceira;

import java.time.LocalDateTime;
import java.util.Map;

import br.edu.infnet.prjatmddd.dominio.evento.Evento;
import br.edu.infnet.prjatmddd.dominio.evento.TipoDeEvento;

public class EventoContaAtualizada implements Evento{

	private String numeroConta;

	public EventoContaAtualizada(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	@Override
	public LocalDateTime momento() {
		return LocalDateTime.now();
	}

	@Override
	public TipoDeEvento tipo() {
		return TipoDeEvento.CONTA_ATUALIZADA;
	}

	@Override
	public Map<String, Object> informacoes() {
		return Map.of("numeroConta", numeroConta);
	}

}
