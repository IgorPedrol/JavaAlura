package Aula002;

public class FormatacaoStrings {
    public static void main(String[] args) {

        //Fazendo a média entre duas notas decimais
        double nota1 = 9.8;
        double nota2 = 7.4;
        double media = (nota1 + nota2) / 2.0;
        System.out.printf("Média: %.2f%n", media);

        //Dando desconto a um produto
        double precoOriginal = 1000;
        double descontoPercentual = 50;
        double precoFinal = (1 - descontoPercentual / 100.0) * precoOriginal;
        System.out.println("Novo preço com desconto aplicado: R$" + precoFinal);
    }
}
