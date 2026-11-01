package Aula004.Desafio;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {

    private double limit;
    private double balance;
    private List<Compra> compras;


    public CartaoDeCredito(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.compras = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public boolean lancarCompra(Compra compra){
        if (this.balance > compra.getValue()) {
            this.balance -= compra.getValue();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public void reduzirLimite(double limit) {
        this.limit -= limit;
    }

}
