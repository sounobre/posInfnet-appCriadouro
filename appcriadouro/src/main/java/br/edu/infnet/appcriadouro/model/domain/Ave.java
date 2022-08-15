package br.edu.infnet.appcriadouro.model.domain;

import br.edu.infnet.appcriadouro.interfaces.IPrinter;

public abstract class Ave implements IPrinter {

	private String nome;
	private int anilha;
	private String dtNascimento;

	public abstract String mostrarNome();

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAnilha() {
		return anilha;
	}


	public void setAnilha(int anilha) {
		this.anilha = anilha;
	}


	public String getDtNascimento() {
		return dtNascimento;
	}


	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}


	@Override
	public String toString() {
		return nome + ";" + anilha + ";" + dtNascimento + ";" + mostrarNome();
	}
}
