package Aula010_Heranca_Polimorfismo.Banco_Interfaces.model;


public class Saque extends OperacaoBancaria{

    public Saque(Double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.println("Saque de R$" + getValor() + " realizado");
    }

}
