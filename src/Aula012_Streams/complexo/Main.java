package Aula012_Streams.complexo;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Problema 1
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> max = numeros.stream()
                .max(Integer::compareTo);
        max.ifPresent(System.out::println);

        //Problema 2
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        Map<Integer, List<String>> agrupadoPorTamanho = palavras.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(agrupadoPorTamanho);


        //Problema 3
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");

        String concatenada = nomes.stream()
                .collect(Collectors.joining(", "));
        System.out.println(concatenada);


        //Problema 4
        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6);

        Integer somaQuadradosPares = numeros2.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();
        System.out.println(somaQuadradosPares);


        //Problema 5
        Map<Boolean, List<Integer>> pares_Impares = numeros2.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        // Extraindo as listas particionadas
        List<Integer> pares = pares_Impares.get(true);
        List<Integer> impares = pares_Impares.get(false);

        System.out.println(pares);
        System.out.println(impares);

    }
}
