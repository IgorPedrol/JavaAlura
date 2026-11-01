package Aula004.Desafio;

public class Compra implements Comparable<Compra>{

    private String name;
    private Double value;

    public Compra(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return """
                %s - R$%.2f
                """.formatted(this.name, this.value);
    }

    @Override
    public int compareTo(Compra o) {
        return this.value.compareTo(o.getValue());
    }
}
