package br.com.fiap.beans;

public class SituacaoAtual extends MapeamentoGenetico{
	private boolean dores;
	private boolean hemorragia;
	private boolean febre;
	private boolean enxaqueca;
	private boolean corrimentos;
	private boolean sudorese;
	private boolean infeccoes;
	private boolean caimbra;
	
	
	public boolean isDores() {
		return dores;
	}
	public void setDores(boolean dores) {
		this.dores = dores;
	}
	public boolean isHemorragia() {
		return hemorragia;
	}
	public void setHemorragia(boolean hemorragia) {
		this.hemorragia = hemorragia;
	}
	public boolean isFebre() {
		return febre;
	}
	public void setFebre(boolean febre) {
		this.febre = febre;
	}
	public boolean isEnxaqueca() {
		return enxaqueca;
	}
	public void setEnxaqueca(boolean enxaqueca) {
		this.enxaqueca = enxaqueca;
	}
	public boolean isCorrimentos() {
		return corrimentos;
	}
	public void setCorrimentos(boolean corrimentos) {
		this.corrimentos = corrimentos;
	}
	public boolean isSudorese() {
		return sudorese;
	}
	public void setSudorese(boolean sudorese) {
		this.sudorese = sudorese;
	}
	public boolean isInfeccoes() {
		return infeccoes;
	}
	public void setInfeccoes(boolean infeccoes) {
		this.infeccoes = infeccoes;
	}
	public boolean isCaimbra() {
		return caimbra;
	}
	public void setCaimbra(boolean caimbra) {
		this.caimbra = caimbra;
	}
	
	
}
