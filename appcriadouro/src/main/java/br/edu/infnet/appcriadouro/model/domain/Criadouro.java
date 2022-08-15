package br.edu.infnet.appcriadouro.model.domain;

import br.edu.infnet.appcriadouro.interfaces.IPrinter;

public class Criadouro implements IPrinter {

	private String nome;
	private String endereco;
	private String tpAve;

	@Override
	public void impressao() {
		System.out.println("#Criadouro");
		System.out.println(this);

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

	public String getTpAve() {
		return tpAve;
	}

	public void setTpAve(String tpAve) {
		this.tpAve = tpAve;
	}

	@Override
	public String toString() {
		return "Criadouro: " + nome + ";" + endereco + ";" + tpAve;
	}
}
