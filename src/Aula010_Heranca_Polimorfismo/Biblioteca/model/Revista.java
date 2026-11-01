package Aula010_Heranca_Polimorfismo.Biblioteca.model;

public class Revista extends Midia {
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Revista: \"" + getTitulo() + "\" - Edição: " + this.edicao);
    }
}