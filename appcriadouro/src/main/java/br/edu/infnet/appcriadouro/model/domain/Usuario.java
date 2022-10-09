package br.edu.infnet.appcriadouro.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.edu.infnet.appcriadouro.interfaces.IPrinter;

@Entity
@Table(name = "TUsuario")
public class Usuario implements IPrinter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String senha;

	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Responsavel> responsavel;

	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Ave> aves;

	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Criadouro> criadouros;

	@Override
	public void impressao() {
		System.out.println("#Usuario");
		System.out.println(this);

	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public List<Responsavel> getResponsavel() {
		return responsavel;
	}

	public List<Ave> getAves() {
		return aves;
	}

	public List<Criadouro> getCriadouros() {
		return criadouros;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setResponsavel(List<Responsavel> responsavel) {
		this.responsavel = responsavel;
	}

	public void setAves(List<Ave> aves) {
		this.aves = aves;
	}

	public void setCriadouros(List<Criadouro> criadouros) {
		this.criadouros = criadouros;
	}

	@Override
	public String toString() {
		return "Usuário: " + nome + ";" + email + ";" + senha;
	}

}
