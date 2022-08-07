package br.edu.infnet.appcriadouro.model.domain;

public class Criadouro {

	private String nome;
	private String endereco;

	public Criadouro() {
		super();
	}

	public Criadouro(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
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

	@Override
	public String toString() {
		return "Criadouro: " + nome + ";" + endereco;
	}
}
