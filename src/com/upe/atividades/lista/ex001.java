package com.upe.atividades.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex001 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		nums.removeIf(num -> num >= 3 && num <= 8);
		nums.forEach(System.out::println);

	}

}
