package br.edu.infnet.appcriadouro.model.domain;

import br.edu.infnet.appcriadouro.interfaces.IPrinter;
import br.edu.infnet.appcriadouro.model.domain.exceptions.CantoPorMinutoZeradoException;
import br.edu.infnet.appcriadouro.model.domain.exceptions.CategoriaInvalidaException;
import br.edu.infnet.appcriadouro.model.domain.exceptions.TamanhoNomeInvalidoException;

public abstract class Ave implements IPrinter {

	private Integer id;
	private String nome;
	private int anilha;
	private String dtNascimento;

	public abstract String mostrarNome() throws TamanhoNomeInvalidoException, CantoPorMinutoZeradoException, CategoriaInvalidaException;

	
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


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return nome + ";" + anilha + ";" + dtNascimento;
	}
}
