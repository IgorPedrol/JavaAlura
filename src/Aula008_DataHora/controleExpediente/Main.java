package Aula008_DataHora.controleExpediente;


import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o horário de entrada (HH:mm): ");
        LocalTime horarioEntrada = RelogioDePonto.formatar(scanner.nextLine());

        System.out.println("Digite a carga horária diária (em horas): ");
        int cargaHoraria = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o horário real de saída (HH:mm): ");
        LocalTime horarioSaida = RelogioDePonto.formatar(scanner.nextLine());
        scanner.close();

        RelogioDePonto.calcularSaldoHoras(horarioEntrada, cargaHoraria, horarioSaida);
    }
}
