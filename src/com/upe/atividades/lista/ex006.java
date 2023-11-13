package com.upe.atividades.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex006 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>(Arrays.asList("Lorem", "Ipsum", "Dolor", "Amed", "Ipsum"));
		System.out.println(names.stream().filter(name -> name.equals("Ipsum")).toList().size());

	}

}
