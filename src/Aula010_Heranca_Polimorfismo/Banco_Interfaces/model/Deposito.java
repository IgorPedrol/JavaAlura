package Aula010_Heranca_Polimorfismo.Banco_Interfaces.model;


public class Deposito extends OperacaoBancaria{

    public Deposito(Double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.println("Depósito de R$" + getValor() + " realizado");
    }
}
