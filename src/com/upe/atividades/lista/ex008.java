package com.upe.atividades.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex008 {

	public static void main(String[] args) {

		List<String> compras = new ArrayList<String>(Arrays.asList("Arroz", "Feijão", "Carne", "Batata"));
		compras.add("Cenoura");
		compras.remove("Batata");
		compras.forEach(System.out::println);

	}

}
