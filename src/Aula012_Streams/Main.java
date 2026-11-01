package Aula012_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println("------Even numbers filter------");
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("------To Upper Case------");
        List<String> palavras = Arrays.asList("java", "stream", "lambda");
        palavras.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("------Odd Numbers * 2------");
        numeros.stream()
                .filter(n -> n % 2 == 1)
                .map(n -> n * 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("------Distinct Fruits------");
        List<String> frutas = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        frutas.stream()
                .distinct()
                .forEach(System.out::println);


        System.out.println("------Prime Numbers Ordered------");
        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12, 13)
        );
        listaDeNumeros.stream()
                .flatMap(List::stream)
                .filter(n -> n > 1 &&
                        IntStream.rangeClosed(2, (int) Math.sqrt(n))
                                .noneMatch(i -> n % i == 0))
                .sorted()
                .forEach(System.out::println);

        System.out.println("------Over Age------");
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Alice", 22),
                new Pessoa("Bob", 17),
                new Pessoa("Charlie", 19)
        );
        pessoas.stream()
                .filter(p -> p.getIdade() >= 18)
                .map(Pessoa::getNome)
                .toList()
                .forEach(System.out::println);

    }
}
