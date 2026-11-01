package Aula012_Streams.desafio;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

        //Problema 6
        Map<String, List<Produto>> categoriasAgrupadas = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));

        System.out.println(categoriasAgrupadas);


        //Problema 7
        Map<String, Long> contagemPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(
                        Produto::getCategoria,
                        Collectors.counting()
                ));
        System.out.println(contagemPorCategoria);


        //Problema 8
        Map<String, Optional<Produto>> produtosMaisCaros = produtos.stream()
                .collect(Collectors.groupingBy(
                        Produto::getCategoria,
                        Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco))
                        ));
        System.out.println(produtosMaisCaros);


        //Problema 9
        Map<String, Double> precoTotalPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(
                        Produto::getCategoria,
                        Collectors.summingDouble(Produto::getPreco)
                ));
        System.out.println(precoTotalPorCategoria);
    }
}
