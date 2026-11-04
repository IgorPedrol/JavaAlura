package Aula013_Optional;

public enum Moeda {
    DOLAR(5.43),
    EURO(6.13),
    REAL(1);

    private final double taxaEmReais;

    Moeda(double taxaEmReais) {
        this.taxaEmReais = taxaEmReais;
    }

    public double converterPara(double valorEmReais) {
        return valorEmReais / this.taxaEmReais;
    }
}
