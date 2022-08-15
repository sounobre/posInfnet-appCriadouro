package br.edu.infnet.appcriadouro.model.domain;

import br.edu.infnet.appcriadouro.interfaces.IPrinter;

public class Responsavel implements IPrinter {

	private String nome;
	private String email;
	private String cpf;

	public Responsavel(String nome, String email, String cpf) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}

	@Override
	public void impressao() {
		System.out.println("#Responsavel");
		System.out.println(this);

	}

	@Override
	public String toString() {
		return "Responsavel: " + nome + ";" + email + ";" + cpf;
	}

}
