package br.edu.infnet.appcriadouro;

import br.edu.infnet.appcriadouro.interfaces.IPrinter;

public class AppAves {

	public static void relatorio(String mensagem, IPrinter printer) {
		System.out.println(mensagem);

		printer.impressao();
	}

}
