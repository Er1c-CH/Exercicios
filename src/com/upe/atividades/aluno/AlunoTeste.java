package com.upe.atividades.aluno;

import com.upe.atividades.pessoa.Nota;

public class AlunoTeste {

	public static void main(String[] args) {

		Nota[] notas = new Nota[3];
		Double nota;
		Double peso;
		
		for(int i = 0; i < 3; i++) { 
			nota = Math.random() * 9 + 1;
			peso = Math.random() * 9 + 1;
			notas[i] = new Nota(nota, peso);
		}
		
		Aluno a1 = new Aluno(111111, "Eric", notas);
		
		System.out.println(a1.calcularMedia());
		System.out.println(a1.calcularFinal());

	}

}
