package Aula008_DataHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RelatorioFormatado {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = date.format(dateFormatter);
        String formattedTime = time.format(timeFormatter);

        System.out.println("""
                Data formatada: %s
                Hora formatada: %s
                """.formatted(formattedDate, formattedTime));
    }
}
