package Aula010_Heranca_Polimorfismo.Biblioteca.model;

public class Ebook extends Midia {
    private String formato;

    public Ebook(String titulo, int anoPublicacao, String formato) {
        super(titulo, anoPublicacao);
        this.formato = formato;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | E-book: \"" + getTitulo() + "\" - Formato: " + this.formato);
    }
}