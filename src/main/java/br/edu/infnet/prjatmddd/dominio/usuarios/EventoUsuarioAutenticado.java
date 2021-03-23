package br.edu.infnet.prjatmddd.dominio.usuarios;

import java.time.LocalDateTime;
import java.util.Map;

import br.edu.infnet.prjatmddd.dominio.evento.Evento;
import br.edu.infnet.prjatmddd.dominio.evento.TipoDeEvento;

public class EventoUsuarioAutenticado implements Evento{
	
	private String numeroConta;

	public EventoUsuarioAutenticado(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	@Override
	public LocalDateTime momento() {
		return LocalDateTime.now();
	}

	@Override
	public TipoDeEvento tipo() {
		return TipoDeEvento.ALUNO_MATRICULADO;
	}

	@Override
	public Map<String, Object> informacoes() {
		return Map.of("numeroConta", numeroConta);
	}

}
