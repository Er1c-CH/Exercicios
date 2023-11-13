package com.upe.atividades.restaurante;

public class Pedido {
	
	private Produto produto;
	private Integer quantidade;
	
	public Pedido(Produto produto, Integer quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double totalPedido() {
		return produto.getPreco() * quantidade;
	}

	@Override
	public String toString() {
		return "Pedido [produto=" + produto + ", quantidade=" + quantidade + "]";
	}
	
}
