package com.upe.atividades.pessoa;

public class Pessoa {
	
	private String nome;
	private Integer idade;
	private String profissao;
	
	public Pessoa(String nome, Integer idade, String profissao) {
		this.nome = nome;
		this.idade = idade;
		this.profissao = profissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", profissao=" + profissao + "]";
	}

}
