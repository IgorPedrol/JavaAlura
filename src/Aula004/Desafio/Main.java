package Aula004.Desafio;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice = 1;

        System.out.println("Digite o limite do cartão: ");
        var meuCartao = new CartaoDeCredito(input.nextDouble());
        input.nextLine();

        do {
            System.out.println("Digite a descrição da compra: ");
            String descricao = input.nextLine();

            System.out.println("Digite o valor da compra: ");
            double valor = input.nextDouble();
            input.nextLine();

            // Crio uma compra com os dados inseridos
            var compra = new Compra(descricao, valor);
            // Adiciono essa compra na lista de compras realizadas
            boolean compraRealizada = meuCartao.lancarCompra(compra);
            // Deduzindo o valor da compra do limite do cartão
            meuCartao.reduzirLimite(valor);

            // Verificando se havia saldo suficiente para realizar a compra
            if (compraRealizada){
                System.out.println("""
                    Compra Realizada!
                    Digite 0 para sair ou 1 para continuar
                    """);
                choice = input.nextInt();
                input.nextLine();
            } else {
                System.out.println("Saldo Insuficiente!");
                choice = 0;
            }

        } while (choice == 1);
        input.close();

        // Ordenando a lista pela ordem crescente de valor
        meuCartao.getCompras().sort(Comparator.comparing(Compra::getValue));
        // Transformando a lista em um único texto grande, separando os itens por quebra de linha
        String listaFormatada = meuCartao.getCompras().stream()
                .map(Compra::toString)
                .collect(Collectors.joining("\n"));

        // Passamos essa String já pronta para o Text Block
        System.out.printf("""
                ****************************
                Compras Realizadas:
                
                %s
                ****************************
                
                Limite do Cartão Restante: R$%.2f
                %n""", listaFormatada, meuCartao.getBalance());
    }
}
