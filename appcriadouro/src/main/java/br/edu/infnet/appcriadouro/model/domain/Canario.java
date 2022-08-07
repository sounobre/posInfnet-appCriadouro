package br.edu.infnet.appcriadouro.model.domain;

public class Canario extends Ave {

	private String tipo;
	private String raca;
	private String classificacao;

	public Canario() {
		super();
	}

	public Canario(String tipo, String raca, String classificacao) {
		super();
		this.tipo = tipo;
		this.raca = raca;
		this.classificacao = classificacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	@Override
	public String toString() {
		return "Canario:" + tipo + ";" + raca + ";" + classificacao + ";" + super.toString();
	}
}
