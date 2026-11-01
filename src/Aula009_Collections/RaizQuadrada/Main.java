package Aula009_Collections.RaizQuadrada;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>(
				List.of(
						4,
						16,
						9,
						64,
						13));
				
		
		List<Integer> quadrados = numeros.stream()
				.map(n -> n * n)
				.collect(Collectors.toList());
		
		System.out.println(numeros);
		System.out.println(quadrados);
	}

}
