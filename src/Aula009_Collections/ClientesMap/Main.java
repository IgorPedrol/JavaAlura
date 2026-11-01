package Aula009_Collections.ClientesMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<Integer, String> clientes = new HashMap<>();
		clientes.put(1, "Ana");
		clientes.put(2, "Jorge");
		clientes.put(3, "Pedro");
		clientes.put(4, "Amanda");
		clientes.put(5, "Rafael");
		
		System.out.println(clientes);
		System.out.println("O cliente no ID 2" + " é: " + clientes.get(1));
		
		if (clientes.containsKey(4)) {
			System.out.println("O cliente no ID 4" + " é: " + clientes.get(4));
		} else System.out.println("Cliente não encontrado!");
	}
}
