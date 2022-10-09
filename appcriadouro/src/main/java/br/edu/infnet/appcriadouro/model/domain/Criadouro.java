package br.edu.infnet.appcriadouro.model.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import br.edu.infnet.appcriadouro.interfaces.IPrinter;
import br.edu.infnet.appcriadouro.model.domain.exceptions.CriadouroSemAvesException;
import br.edu.infnet.appcriadouro.model.domain.exceptions.ResponsavelNuloException;

@Entity
@Table(name = "TCriadouro")
public class Criadouro implements IPrinter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String endereco;
	private String tpAve;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dtCriaddouro;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idResponsavel")
	private Responsavel responsavel;
	
	@ManyToMany(cascade = CascadeType.DETACH)
	private Set<Ave> aves;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	public Criadouro() {
		this.dtCriaddouro = new Date();
	}

	public Criadouro(Responsavel responsavel, Set<Ave> aves) throws ResponsavelNuloException, CriadouroSemAvesException {
		
		if(responsavel == null) {
			throw new ResponsavelNuloException("Impossível criar um criadouro sem um responsável");
		}
		
		if(aves.size() < 1) {
			throw new CriadouroSemAvesException("Impossível criar um criadouro sem aves");
		}
		
		this.dtCriaddouro = new Date();
		this.responsavel = responsavel;
		this.aves = aves;
	}

	public Date getDtCriaddouro() {
		return dtCriaddouro;
	}

	public void setDtCriaddouro(Date dtCriaddouro) {
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Criadouro: " + nome + ";" + endereco + ";" + tpAve + ";" + dtCriaddouro + ";" + responsavel;
	}

}
