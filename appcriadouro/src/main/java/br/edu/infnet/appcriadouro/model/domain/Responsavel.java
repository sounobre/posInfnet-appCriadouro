package br.edu.infnet.appcriadouro.model.domain;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.edu.infnet.appcriadouro.interfaces.IPrinter;
import br.edu.infnet.appcriadouro.model.domain.exceptions.CpfInvalidoException;

@Entity
@Table(name = "TResponsavel")
public class Responsavel implements IPrinter {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String cpf;
	
	
	
	public Responsavel() {

	}

	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	public Responsavel(String nome, String email, String cpf) throws CpfInvalidoException {
		
		if(cpf == null) {
			throw new CpfInvalidoException("Não é possível aceitar CPF nulo.");
		}
		
		if(cpf.isEmpty()) {
			throw new CpfInvalidoException("Não é possível aceitar CPF sem preenchimento.");
		}
		
		
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}

	@Override
	public void impressao() {
		System.out.println("#Responsavel");
		System.out.println(this);

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Responsavel: " + nome + ";" + email + ";" + cpf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Responsavel other = (Responsavel) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	

}
