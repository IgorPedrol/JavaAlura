package Aula011_Lambda;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1 - Multiplicação
        Multiplicacao mult = (a, b) -> a * b;
        System.out.println("Multiplicação: " + mult.multiplicar(7, 3));

        // 2 - Número primo
        java.util.function.Predicate<Integer> ehPrimo = n -> {
            if (n <= 1) return false;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        System.out.println("É primo? " + ehPrimo.test(13));

        // 3 - String para maiúscula
        java.util.function.Function<String, String> maiuscula =
                str -> str.toUpperCase();
        System.out.println("Maiúscula: " + maiuscula.apply("disciplina"));

        // 4 - Palíndromo
        VerificadorPalindromo palindromo = str -> {
            String invertida = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(invertida);
        };
        System.out.println("É palíndromo? " + palindromo.verificarPalindromo("arara"));

        // 5 - Multiplicar lista por 3
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        numeros.replaceAll(n -> n * 3);
        System.out.println("Lista x3: " + numeros);

        // 6 - Ordenar strings
        List<String> nomes = new ArrayList<>(Arrays.asList("Carlos", "Ana", "Bruno"));
        nomes.sort((a, b) -> a.compareTo(b));
        System.out.println("Ordenado: " + nomes);

        // 7 - Divisão com exceção
        Divisao divisao = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Divisão por zero não permitida!");
            }
            return a / b;
        };

        try {
            System.out.println("Divisão: " + divisao.dividir(10, 2));
            System.out.println("Divisão: " + divisao.dividir(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}