package br.edu.infnet.appcriadouro.model.domain;

import java.time.LocalDateTime;
import java.util.Set;

import br.edu.infnet.appcriadouro.interfaces.IPrinter;
import br.edu.infnet.appcriadouro.model.domain.exceptions.CriadouroSemAvesException;
import br.edu.infnet.appcriadouro.model.domain.exceptions.ResponsavelNuloException;

public class Criadouro implements IPrinter {

	private Integer id;
	private String nome;
	private String endereco;
	private String tpAve;
	private LocalDateTime dtCriaddouro;
	private Responsavel responsavel;
	private Set<Ave> aves;

	public Criadouro(Responsavel responsavel, Set<Ave> aves) throws ResponsavelNuloException, CriadouroSemAvesException {
		
		if(responsavel == null) {
			throw new ResponsavelNuloException("Impossível criar um criadouro sem um responsável");
		}
		
		if(aves.size() < 1) {
			throw new CriadouroSemAvesException("Impossível criar um criadouro sem aves");
		}
		
		this.dtCriaddouro = LocalDateTime.now().minusYears(1);
		this.responsavel = responsavel;
		this.aves = aves;
	}

	public LocalDateTime getDtCriaddouro() {
		return dtCriaddouro;
	}

	public void setDtCriaddouro(LocalDateTime dtCriaddouro) {
		this.dtCriaddouro = dtCriaddouro;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	public Set<Ave> getAves() {
		return aves;
	}

	public void setAves(Set<Ave> aves) {
		this.aves = aves;
	}

	@Override
	public void impressao() {
		System.out.println("######Criadouro######");
		System.out.println(this);

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Criadouro: " + nome + ";" + endereco + ";" + tpAve + ";" + dtCriaddouro + ";" + responsavel;
	}

}
