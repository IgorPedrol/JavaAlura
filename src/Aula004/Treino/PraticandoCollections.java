package Aula004.Treino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PraticandoCollections {
    public static void main(String[] args) {

        //Exercício 1 -> **********************************
        List<Integer> inteiros = new ArrayList<>();
        inteiros.add(7);
        inteiros.add(3);
        inteiros.add(4);
        inteiros.add(6);
        inteiros.add(1);
        inteiros.add(8);

        Collections.sort(inteiros);
        System.out.println(inteiros);


        //Exercício 2 e 3 -> ************************************
        var titulo1 = new Titulo("Igor");
        var titulo2 = new Titulo("Pedro");
        var titulo3 = new Titulo("Eduardo");
        var titulo4 = new Titulo("Joao");

        List<Titulo> titulos = new ArrayList<>();
        titulos.add(titulo1);
        titulos.add(titulo2);
        titulos.add(titulo3);
        titulos.add(titulo4);

        Collections.sort(titulos);
        System.out.println("Lista Ordenada");
        titulos.forEach(System.out::println);

        //Exercício 4 -> ***********************************
        List<Titulo> titulosArray = new ArrayList<>();

        titulosArray.add(titulo1);
        titulosArray.add(titulo2);
        titulosArray.add(titulo3);
        titulosArray.add(titulo4);

        List<Titulo> titulosLinkados = new LinkedList<>();

        titulosLinkados.add(titulo1);
        titulosLinkados.add(titulo2);
        titulosLinkados.add(titulo3);
        titulosLinkados.add(titulo4);


        System.out.println("Lista de títulos com ArrayList:");
        titulosArray.forEach(System.out::println);

        System.out.println("Lista de títulos com LinkedList:");
        titulosLinkados.forEach(System.out::println);
    }
}
