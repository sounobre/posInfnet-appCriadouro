package br.edu.infnet.appcriadouro.model.domain;

public class Coleiro extends Ave {

	private boolean cantTuiTui;
	private String regiao;
	private int cantPorMin;

	public Coleiro() {
		super();
	}

	public Coleiro(boolean cantTuiTui, String regiao, int cantPorMin) {
		super();
		this.cantTuiTui = cantTuiTui;
		this.regiao = regiao;
		this.cantPorMin = cantPorMin;
	}

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
}
