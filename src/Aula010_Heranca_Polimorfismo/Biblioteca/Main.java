package Aula010_Heranca_Polimorfismo.Biblioteca;

import Aula010_Heranca_Polimorfismo.Biblioteca.model.Ebook;
import Aula010_Heranca_Polimorfismo.Biblioteca.model.Livro;
import Aula010_Heranca_Polimorfismo.Biblioteca.model.Midia;
import Aula010_Heranca_Polimorfismo.Biblioteca.model.Revista;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Programando para a superclasse (Midia)
        Midia livro = new Livro("O Hobbit", 1937, "J.R.R. Tolkien");
        Midia revista = new Revista("Superinteressante", 2023, 450);
        Midia ebook = new Ebook("Clean Code", 2008, "PDF");

        // 2. Uso da lista imutável moderna (Java 9+)
        List<Midia> acervo = List.of(livro, revista, ebook);

        System.out.println("--- Catálogo da Biblioteca ---");

        // 3. O Polimorfismo em ação com Method Reference
        acervo.forEach(Midia::exibirInfo);
    }
}