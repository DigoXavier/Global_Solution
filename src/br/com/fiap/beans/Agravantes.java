package br.com.fiap.beans;

public class Agravantes extends MapeamentoGenetico {
	private boolean diabete;
	private boolean pressaoAlta;
	private boolean pressaoBaixa;
	private boolean colesterolAlto;
	
	
	public boolean isDiabete() {
		return diabete;
	}
	public void setDiabete(boolean diabete) {
		this.diabete = diabete;
	}
	public boolean isPressaoAlta() {
		return pressaoAlta;
	}
	public void setPressaoAlta(boolean pressaoAlta) {
		this.pressaoAlta = pressaoAlta;
	}
	public boolean isPressaoBaixa() {
		return pressaoBaixa;
	}
	public void setPressaoBaixa(boolean pressaoBaixa) {
		this.pressaoBaixa = pressaoBaixa;
	}
	public boolean isColesterolAlto() {
		return colesterolAlto;
	}
	public void setColesterolAlto(boolean colesterolAlto) {
		this.colesterolAlto = colesterolAlto;
	}
	
	
	
}
