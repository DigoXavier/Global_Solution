package br.com.fiap.beans;

public class MapeamentoGenetico {
	private String tipoSanguineo;
	private HistoricoClinico historicoClinico;
	private SituacaoAtual situacaoAtual;
	private Agravantes agravantes;
	
	
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public HistoricoClinico getHistoricoClinico() {
		return historicoClinico;
	}
	public void setHistoricoClinico(HistoricoClinico historicoClinico) {
		this.historicoClinico = historicoClinico;
	}
	public SituacaoAtual getSituacaoAtual() {
		return situacaoAtual;
	}
	public void setSituacaoAtual(SituacaoAtual situacaoAtual) {
		this.situacaoAtual = situacaoAtual;
	}
	public Agravantes getAgravantes() {
		return agravantes;
	}
	public void setAgravantes(Agravantes agravantes) {
		this.agravantes = agravantes;
	}
	
	
}
