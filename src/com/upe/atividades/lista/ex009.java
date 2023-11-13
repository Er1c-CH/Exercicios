package com.upe.atividades.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.upe.atividades.lista.entidades.Item;

public class ex009 {

	public static void main(String[] args) {

		List<Item> carrinho = new ArrayList<Item>(Arrays.asList(new Item("Feijão", 3),
																new Item("Arroz", 2),
																new Item("Carne", 4),
																new Item("Batata", 8)));
		carrinho.add(new Item("Cenoura", 4));
		carrinho.remove(2);
		carrinho.add(new Item("Laranja", 10));
		carrinho.remove(new Item("Arroz", 2));
		
		carrinho.forEach(System.out::println);

	}

}
