package com.upe.atividades.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ex007 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>(Arrays.asList("Lorem", "Ipsum", "Dolor", "Amed", "Ipsum"));
		new HashSet<>(names).forEach(System.out::println);

	}

}
