package Aula010_Heranca_Polimorfismo.Biblioteca.model;

public abstract class Midia {

    private String titulo;
    private int anoPublicacao;

    public Midia(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    // Regra de Negócio: Geração do Código
    public String gerarCodigo() {
        // Validação de segurança (Clean Code): evita erro se o título tiver menos de 3 letras (ex: livro "It")
        String prefixo = this.titulo.length() >= 3 ? this.titulo.substring(0, 3) : this.titulo;
        return "LIB-" + prefixo.toUpperCase() + this.anoPublicacao;
    }

    // O Contrato: Obriga os filhos a implementarem a exibição correta
    public abstract void exibirInfo();
}