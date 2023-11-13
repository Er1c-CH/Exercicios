package com.upe.atividades.restaurante;

public class RestauranteApp {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Feijão", 6.0);
		Produto p2 = new Produto("Arroz", 7.0);
		Produto p3 = new Produto("Carne", 25.0);

		Pedido pedido1 = new Pedido(p1, 3);
		Pedido pedido2 = new Pedido(p1, 4);
		Pedido pedido3 = new Pedido(p1, 2);

		System.out.println("Total: R$" + (pedido1.totalPedido() + pedido2.totalPedido() + pedido3.totalPedido()));
		
	}

}
