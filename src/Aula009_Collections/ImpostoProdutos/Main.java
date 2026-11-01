package Aula009_Collections.ImpostoProdutos;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Double> precos = new ArrayList<>(
				List.of(
						150.35,
						902.3,
						439.76,
						320.18));
		
		Double valorTotal = precos.stream()
				.reduce(0.0, Double::sum);
		
		Double impostoAplicado = valorTotal * 1.08;
		
		System.out.println(valorTotal);
		
		System.out.println(impostoAplicado);
	}
}
