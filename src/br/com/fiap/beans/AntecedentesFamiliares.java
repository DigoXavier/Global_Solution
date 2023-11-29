package br.com.fiap.beans;

public class AntecedentesFamiliares {
	private String cirurgias;
	private String doencas;
	
	
	public AntecedentesFamiliares(String cirurgias, String doencas) {
		this.cirurgias = cirurgias;
		this.doencas = doencas;
	}
	
	public AntecedentesFamiliares() {
		
	}
	public String getCirurgias() {
		return cirurgias;
	}
	public void setCirurgias(String cirurgias) {
		this.cirurgias = cirurgias;
	}
	public String getDoencas() {
		return doencas;
	}
	public void setDoencas(String doencas) {
		this.doencas = doencas;
	}
	
	
}
