package br.edu.infnet.appcriadouro.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.edu.infnet.appcriadouro.interfaces.IPrinter;
import br.edu.infnet.appcriadouro.model.domain.exceptions.CantoPorMinutoZeradoException;
import br.edu.infnet.appcriadouro.model.domain.exceptions.CategoriaInvalidaException;
import br.edu.infnet.appcriadouro.model.domain.exceptions.TamanhoNomeInvalidoException;

@Entity
@Table(name = "TAve")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Ave implements IPrinter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private int anilha;
	private String dtNascimento;
	@ManyToMany(mappedBy = "aves")
	private List<Criadouro> criadouro;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

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


	public List<Criadouro> getCriadouro() {
		return criadouro;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setCriadouro(List<Criadouro> criadouro) {
		this.criadouro = criadouro;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	@Override
	public String toString() {
		return nome + ";" + anilha + ";" + dtNascimento;
	}
}
