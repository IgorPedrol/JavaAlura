package Aula013_Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        //Desafio 1
        List<String> input = Arrays.asList("10", "abc", "20", "30x");

        List<Integer> numeros = input.stream()
                .map(Main::tentarConverter)
                .flatMap(Optional::stream)
                .toList();

        System.out.println(numeros + "\n");


        //Desafio 2
        System.out.println(processaNumero(Optional.of(5))); // Saída: Optional[25]
        System.out.println(processaNumero(Optional.of(-3))); // Saída: Optional.empty
        System.out.println(processaNumero(Optional.empty())); // Saída: Optional.empty














    }


    private static Optional<Integer> processaNumero(Optional<Integer> numero) {
        return numero.filter(n -> n > 0)
                .map(n -> n * n);
    }


    private static Optional<Integer> tentarConverter(String str) {
        try {
            return Optional.of(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
