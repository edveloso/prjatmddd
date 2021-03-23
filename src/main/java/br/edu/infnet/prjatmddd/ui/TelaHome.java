package br.edu.infnet.prjatmddd.ui;

import java.util.Scanner;

import br.edu.infnet.prjatmddd.dominio.evento.Evento;
import br.edu.infnet.prjatmddd.dominio.evento.Ouvinte;
import br.edu.infnet.prjatmddd.dominio.evento.TipoDeEvento;

public class TelaHome extends Ouvinte {

	private int opcao;

	public void reageAo(Evento evento) {

		Scanner scanner = new Scanner(System.in);
		
		while (opcao <= 4) {
			System.out.println(" Menu ");
			System.out.println(" 1- ver o saldo ");
			System.out.println(" 2- Saque ");
			System.out.println(" 3 -Deposito ");
			System.out.println(" 4 - Extrato ");
			System.out.println(" 5 - Sair ");
			System.out.println(" Entre com a opcao: ");

			opcao = scanner.nextInt();
			
		}

	}

	@Override
	protected boolean deveProcessarEvento(Evento evento) {
		return evento.tipo().equals(TipoDeEvento.ALUNO_MATRICULADO)
				|| evento.tipo().equals(TipoDeEvento.CONTA_ATUALIZADA);
	}

}
