package Aula008_DataHora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {

        // Métodos para atribuir datas
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2026, 6, 10);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        // Métodos de comparação, como: isBefore(), isEqual() e isAfter()
        if (dataPrimeiraParcela.isEqual(LocalDate.now())) {
            System.out.println("Hoje é o dia do vencimento!");
        } else if (dataPrimeiraParcela.isBefore(LocalDate.now())) {
            System.out.println("Ainda não está no dia do vencimento...");
        } else {
            System.out.println("A parcela está atrasada!");
        }

        System.out.println("Data da Compra: " + dataCompra);
        System.out.println("Data da Primeira Parcela: " + dataPrimeiraParcela);
        System.out.println("Data da Segunda Parcela: " + dataSegundaParcela);

        // Formatador de Data e hora, para personalizar o padrão de formatação
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data da compra formatada: " + dataCompra.format(formato));


        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data da compra com ZonedDateTime: " + dataConclusaoCompra);
        ZonedDateTime dataCompraNY = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data da compra NY: " + dataCompraNY);


        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);

        Duration duracao = Duration.between(inicio, fim);
        System.out.println("A duração do expediente foi: " + duracao.toHours() +
                " horas e " + duracao.toMinutesPart() + " minutos.");

        LocalDate dataPagamento = LocalDate.parse("2026-07-30");
        Period periodo = Period.between(dataCompra, dataPagamento);
        System.out.println("Período entre a compra, até o dia do pagamento: " + periodo.getMonths() +
                " meses e " + periodo.getDays() + " dias");
    }
}
