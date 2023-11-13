package com.upe.atividades.conta;

public class ContaTeste {

	public static void main(String[] args) {
		
		Conta c1 = null, c2 = null;
		
		try {
			c1 = new Conta(1000.0);
			c2 = new Conta(-1000.0);
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(c1.getSaldo());
		c1.creditar(100.0);
		System.out.println(c1.getSaldo());
		c1.debitar(200.0);
		System.out.println(c1.getSaldo());
		
	}

}
