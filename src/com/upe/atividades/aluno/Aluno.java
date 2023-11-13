package com.upe.atividades.aluno;

import com.upe.atividades.pessoa.Nota;

public class Aluno {
	
	private Integer matricula;
	private String nome;
	private Nota[] notas;
	
	public Aluno(Integer matricula, String nome, Nota[] notas) {
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}
	
	public Aluno(Integer matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Nota[] getNotas() {
		return notas;
	}

	public void setNotas(Nota[] notas) {
		this.notas = notas;
	}
	
	public Double calcularMedia() {
		
		Double numerador = 0.0;
		Double denominador = 0.0;
		
		for(Nota nota : notas) {
			numerador += nota.getPeso() * nota.getNota();
			denominador += nota.getPeso();
		}
		
		return numerador/denominador;
		
	}
	
	public Double calcularFinal() {
		
		Double media = this.calcularMedia();
		
		if(media >= 7)
			return 0.0;
		
		return 10 - media;
		
	}
	
}
