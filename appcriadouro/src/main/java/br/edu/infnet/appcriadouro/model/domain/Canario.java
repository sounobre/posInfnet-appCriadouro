package br.edu.infnet.appcriadouro.model.domain;

import br.edu.infnet.appcriadouro.model.domain.exceptions.TamanhoNomeInvalidoException;

public class Canario extends Ave {

	private String tipo;
	private String raca;
	private String classificacao;

	
	
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
	public String mostrarNome() throws TamanhoNomeInvalidoException {
		
		if(getNome().length() < 4) {
			
			throw new TamanhoNomeInvalidoException("Tamanho invalido para o campo nome {" + getNome() + "}, no mínimo 4 caracteres.");
			
		}

		String cantaBonito = tipo == "Timbre" ? " e ele canta muito bem" : "";

		return getNome() + cantaBonito;
	}

	@Override
	public String toString() {
		return "Canario:" + tipo + ";" + raca + ";" + classificacao + ";" + super.toString();
	}

	@Override
	public void impressao() {
		System.out.println("#Canário");
		System.out.println(this);

	}
}
