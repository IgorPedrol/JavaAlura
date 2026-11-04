package Aula013_Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        //Desafio 1
        List<String> input = Arrays.asList("10", "abc", "20", "30x");

        List<Integer> numeros = input.stream()
                .map(Main::tentarConverter)
                .flatMap(Optional::stream)
                .toList();
        System.out.println(numeros + "\n");


        //Desafio 2
        System.out.println(processaNumero(Optional.of(5))); // Saída: Optional[25]
        System.out.println(processaNumero(Optional.of(-3))); // Saída: Optional.empty
        System.out.println(processaNumero(Optional.empty())); // Saída: Optional.empty
        System.out.println("\n");


        //Desafio 3
        System.out.println(obterPrimeiroEUltimoNome("  João Carlos Silva   ")); // Saída: "João Silva"
        System.out.println(obterPrimeiroEUltimoNome("Maria   ")); // Saída: "Maria"
        System.out.println(obterPrimeiroEUltimoNome("   Ana  Paula  de  Oliveira  ")); // Saída: Ana Oliveira
        System.out.println("\n");

        //Desafio 4

        System.out.println(ehPalindromo("socorram me subi no onibus em marrocos")); // Saída: true
        System.out.println(ehPalindromo("Java")); // Saída: false
        System.out.println("\n");


        //Desafio 5
        List<String> emails = Arrays.asList("TESTE@EXEMPLO.COM", "exemplo@Java.com ", "Usuario@teste.Com");
        System.out.println(converterEmails(emails));
        // Saída: ["teste@exemplo.com", "exemplo@java.com", "usuario@teste.com"]


        //Desafio 6
        System.out.println(Moeda.DOLAR.converterPara(10000));
        System.out.println(Moeda.EURO.converterPara(10000));


        //Desafio 7
        CodigoErro erro = CodigoErro.NOT_FOUND;

        System.out.println("Erro: " + erro.name());
        System.out.println("Status: " + erro.getCodigo());
        System.out.println("Detalhes: " + erro.getDescricao());

        erro = CodigoErro.BAD_REQUEST;
        System.out.println("Erro: " + erro.name());
        System.out.println("Status: " + erro.getCodigo());
        System.out.println("Detalhes: " + erro.getDescricao());
    }


    private static List<String> converterEmails(List<String> emails) {
        if (emails == null) {
            return List.of(); // Retorna lista vazia se a entrada for nula, prevenindo erros
        }

        return emails.stream()
                .map(email -> email.trim().toLowerCase()) // Encadeia sanitização e conversão
                .toList(); // Padrão Java 16+ para encerrar streams
    }


    private static boolean ehPalindromo(String palavra) {
        if (palavra == null) return false;

        String limpa = palavra.replaceAll("\\s+", "").toLowerCase();

        int inicio = 0;
        int fim = limpa.length() - 1;

        // Compara as pontas caminhando para o centro
        while (inicio < fim) {
            if (limpa.charAt(inicio) != limpa.charAt(fim)) {
                return false; // Quebrou a regra, aborta imediatamente
            }
            inicio++;
            fim--;
        }
        return true;
    }

    private static String obterPrimeiroEUltimoNome(String nomeCompleto) {
        if (nomeCompleto == null || nomeCompleto.trim().isEmpty()){
            return "";
        }

        // Etapa 1: Limpeza e Divisão
        String[] partes = nomeCompleto.trim().split("\\s+");

        // Etapa 2: Verificação do tamanho
        if (partes.length == 1) {
            return partes[0];
        }

        // Etapa 3: Concatenação do primeiro com o último
        return partes[0] + " " + partes[partes.length - 1];
    }


    private static Optional<Integer> processaNumero(Optional<Integer> numero) {
        return numero.filter(n -> n > 0)
                .map(n -> n * n);
    }


    private static Optional<Integer> tentarConverter(String str) {
        try {
            return Optional.of(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
