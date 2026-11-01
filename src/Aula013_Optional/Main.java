package Aula013_Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {

        List<String> input = Arrays.asList("10", "abc", "20", "30x");

        List<Integer> numeros = input.stream()
                .map(Main::tentarConverter)
                .flatMap(Optional::stream)
                .toList();

        System.out.println(numeros);
    }






    private static Optional<Integer> tentarConverter(String str) {
        try {
            return Optional.of(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
