package Aula010_Heranca_Polimorfismo.Documento_Interface;

public class Main {
    public static void main(String[] args) {

        Relatorio relatorio = new Relatorio(
                "Relatório 2026",
                "Tudo funcionando conforme esperado."
        );
        relatorio.imprimir();
    }
}
