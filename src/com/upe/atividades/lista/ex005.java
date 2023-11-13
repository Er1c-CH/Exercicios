package com.upe.atividades.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex005 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println(nums.stream().map(num -> num + "").reduce("", (a, b) -> b + " " + a));

	}

}
