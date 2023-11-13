package com.upe.atividades.lista;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex002 {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>(Arrays.asList("Lorem", "Ipsum", "Dolor", "Amed"));
		System.out.println("Eric" + (names.indexOf("Eric") != -1 ? " " : " não ") + "está presente na lista.");
		System.out.println(names.stream().reduce("", (a, b) -> a + ", " + b).replaceFirst(", ", ""));
		
	}
	
}
