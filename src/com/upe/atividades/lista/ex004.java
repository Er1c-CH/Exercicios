package com.upe.atividades.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex004 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>(Arrays.asList("Lorem", "Ipsum", "Dolor", "Amed", "Ipsum"));
		names.replaceAll(name -> name.equals("Ipsum") ? "TODO" : name);
		System.out.println(names.stream().reduce("", (a, b) -> a + ", " + b).replaceFirst(", ", ""));

	}

}
