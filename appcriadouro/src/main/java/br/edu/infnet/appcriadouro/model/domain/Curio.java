package br.edu.infnet.appcriadouro.model.domain;

import br.edu.infnet.appcriadouro.model.domain.exceptions.CategoriaInvalidaException;

public class Curio extends Ave {

	private boolean cantPraia;
	private String categoria;
	private int tempCantMin;

	
	
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
	public String mostrarNome() throws CategoriaInvalidaException {
		
		if(!categoria.equalsIgnoreCase("fibra") && !categoria.equalsIgnoreCase("canto")) {
			throw new CategoriaInvalidaException("Categoria invalida {" + categoria + "}, as categorias existentes são Fibra ou Canto.");
		}
		
		return getNome() + " " + (tempCantMin > 5 ? "Esse camarada vale uma casa" : "Vale um dinheiro, mas não tanto quanto você quer :)");
	}
	
	
	@Override
	public String toString() {
		return "Curió:" + cantPraia + ";" + categoria + ";" + tempCantMin + ";" + super.toString();
	}


	@Override
	public void impressao() {
		System.out.println("#Curió");
		System.out.println(this);
		
	}
}
