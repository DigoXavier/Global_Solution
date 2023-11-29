package br.com.fiap.beans;

public class AntecedentesPessoais {
	private String cirurgias;
	private String doencas;
	
	
	public AntecedentesPessoais(String cirurgias, String doencas) {
		this.cirurgias = cirurgias;
		this.doencas = doencas;
	}
	
	public AntecedentesPessoais() {
		
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
