package Aula009.ListaFuncionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> funcionarios = new ArrayList<>(
				List.of(
						"Ana",
						"Pedro",
						"Emanuel",
						"Marcelo",
						"Igor"));
		
		List<String> nomesPadronizados = funcionarios.stream()
				.filter(f -> f.length() <= 5)
				.collect(Collectors.toList());
		
		
		System.out.println(funcionarios);
		System.out.println(nomesPadronizados);
		
		
	}

}
