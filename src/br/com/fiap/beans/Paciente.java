package br.com.fiap.beans;

public class Paciente {
	private String nome;
	private String sexo;
	private int idade;
	private String enderešo;
	private int telefone;
	private String status;
	private MapeamentoGenetico mapeamentoGenetico;
	
	
	public Paciente(String nome, String sexo, int idade, String enderešo, int telefone, String status,
			MapeamentoGenetico mapeamentoGenetico) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.enderešo = enderešo;
		this.telefone = telefone;
		this.status = status;
		this.mapeamentoGenetico = mapeamentoGenetico;
	}
	
	public Paciente() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public MapeamentoGenetico getMapeamentoGenetico() {
		return mapeamentoGenetico;
	}
	public void setMapeamentoGenetico(MapeamentoGenetico mapeamentoGenetico) {
		this.mapeamentoGenetico = mapeamentoGenetico;
	}
	
}
