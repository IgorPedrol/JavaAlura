package Aula003;

import java.util.Locale;
import java.util.Scanner;

public class DesafioLoopsCondicionais {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int opcao = 0;
        String nome = "Igor Pedrol";
        String tipoConta = "Corrente";
        double saldo = 3250.89;

        System.out.printf("""
                ****************************************
                Dados do cliente:
                
                Nome:          %s
                Tipo da conta: %s
                Saldo atual:   R$%.2f
                ****************************************
                %n""", nome, tipoConta, saldo);

        while(opcao != -1) {
            System.out.println("""
                    ********************
                    Operações Possíveis: 
                    
                    0 - Consultar Saldo
                    1 - Depositar Valor
                    2 - Sacar Valor
                    Aperte -1 para Sair
                    ********************
                    """);

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 0:
                    System.out.printf("""
                            ********************
                            Saldo Atual: R$%.2f
                            ********************
                            %n""", saldo);
                    break;
                case 1:
                    System.out.println("Qual o valor do depósito? ");
                    saldo += scanner.nextDouble();
                    System.out.println("Valor depositado com sucesso!");
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Qual o valor do saque? ");
                    saldo -= scanner.nextDouble();
                    System.out.println("Valor sacado com sucesso!");
                    scanner.nextLine();
                    break;
                case -1:
                    System.out.println("Desligando o Programa...");
                    break;
            }
        }
        scanner.close();
    }
}
