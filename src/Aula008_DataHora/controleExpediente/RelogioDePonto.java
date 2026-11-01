package Aula008_DataHora.controleExpediente;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RelogioDePonto {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    public static LocalTime formatar(String horario){
        LocalTime horarioFormatado = LocalTime.parse(horario, formatter);
        return horarioFormatado;
    }

    public static void calcularSaldoHoras(LocalTime entrada, int horas, LocalTime saida){
        LocalTime saidaPrevista = entrada.plusHours(horas);

        System.out.println("\nHorário de entrada: " + entrada);
        System.out.println("Horário de saída previsto: " + saidaPrevista);
        System.out.println("Horário real de saída: " + saida);

        Duration duracao = Duration.between(saidaPrevista, saida);

        System.out.printf("Saldo de horas: %sh %smin\n", duracao.toHours(), duracao.toMinutesPart());
    }
}
