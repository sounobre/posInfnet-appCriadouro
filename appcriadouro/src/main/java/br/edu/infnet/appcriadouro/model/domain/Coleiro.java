package br.edu.infnet.appcriadouro.model.domain;

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
	public String toString() {
		return "Coleiro:" + cantTuiTui + ";" + regiao + ";" + cantPorMin + ";" + super.toString();
	}

	@Override
	public void impressao() {
		System.out.println("#Coleiro");
		System.out.println(this);

	}

	@Override
	public String mostrarNome() {
		return "Nome do pássaro é " + getNome();
	}
}
