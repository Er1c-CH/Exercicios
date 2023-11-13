package com.upe.atividades.conta;

public class Conta {
	
	private Double saldo;

	public Conta(Double saldo) {
		if(saldo < 0)
			throw new RuntimeException("Não é possível criar uma conta com valor negativo.");
		this.saldo = saldo;
	}
	
	public void debitar(Double debito) {
		if(debito > saldo)
			throw new RuntimeException("Não é possível sacar valor maior que o saldo atual.");
		if(debito <= 0)
			throw new RuntimeException("Não é possível sacar um valor negativo.");
		saldo -= debito;
	}
	
	public void creditar(Double credito) {
		if(credito <= 0)
			throw new RuntimeException("Não é possível creditar um valor negativo.");
		saldo += credito;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	
	
}
