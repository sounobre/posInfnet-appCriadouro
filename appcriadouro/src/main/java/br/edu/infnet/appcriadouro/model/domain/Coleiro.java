package br.edu.infnet.appcriadouro.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.appcriadouro.model.domain.exceptions.CantoPorMinutoZeradoException;

@Entity
@Table(name = "TColeiro")
public class Coleiro extends Ave {

	private boolean cantTuiTui;
	private String regiao;
	private int cantPorMin;

	
	
	public boolean isCantTuiTui() {
		return cantTuiTui;
	}

	public void setCantTuiTui(boolean cantTuiTui) {
		this.cantTuiTui = cantTuiTui;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public int getCantPorMin() {
		return cantPorMin;
	}

	public void setCantPorMin(int cantPorMin) {
		this.cantPorMin = cantPorMin;
	}
	
	@Override
	public String mostrarNome() throws CantoPorMinutoZeradoException {
		
		if(cantPorMin <= 0) {
			
			throw new CantoPorMinutoZeradoException("Tamanho invalido para o campo canto por minuto {" + cantPorMin + "}, no mínimo 1, ou o pássaro está desclassificado.");
			
		}
		
		return "Nome do pássaro é " + getNome();
	}

	@Override
	public String toString() {
		return "Coleiro:" + cantTuiTui + ";" + regiao + ";" + cantPorMin + ";" + super.toString();
	}

	@Override
	public void impressao() {
		System.out.println("#Coleiro");
		System.out.println(this);

	}

	
}
