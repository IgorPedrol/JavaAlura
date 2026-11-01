package Aula010_Heranca_Polimorfismo.Dispositivos_Interfaces.model;

public class Luz implements Controlavel {

    private boolean ligado = false;

    public Luz() {}

    public boolean isLigado() {
        return ligado;
    }

    @Override
    public void ligar() {
        if (this.ligado)
            System.out.println("Luz já está ligada!");
        else {
            this.ligado = true;
            System.out.println("Luz ligada.");
        }
    }

    @Override
    public void desligar() {
        if (!this.ligado){
            System.out.println("Luz já está desligada!");
        } else {
            this.ligado = false;
            System.out.println("Luz desligada.");
        }
    }
}
