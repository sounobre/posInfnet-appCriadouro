package br.edu.infnet.appcriadouro.model.domain;

public class Curio extends Ave {

	private boolean cantPraia;
	private String categoria;
	private int tempCantMin;

	public Curio() {
		super();
	}

	public Curio(boolean cantPraia, String categoria, int tempCantMin) {
		super();
		this.cantPraia = cantPraia;
		this.categoria = categoria;
		this.tempCantMin = tempCantMin;
	}

	public boolean isCantPraia() {
		return cantPraia;
	}

	public void setCantPraia(boolean cantPraia) {
		this.cantPraia = cantPraia;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getTempCantMin() {
		return tempCantMin;
	}

	public void setTempCantMin(int tempCantMin) {
		this.tempCantMin = tempCantMin;
	}

	@Override
	public String toString() {
		return "Curio:" + cantPraia + ";" + categoria + ";" + tempCantMin + ";" + super.toString();
	}
}
