package Aula010_Heranca_Polimorfismo.Banco_Interfaces.model;

public abstract class OperacaoBancaria implements AcaoBancaria {

    private Double valor;

    public OperacaoBancaria(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
}
