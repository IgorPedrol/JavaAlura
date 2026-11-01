package Aula010_Heranca_Polimorfismo.Dispositivos_Interfaces.model;

public class ArCondicionado implements Controlavel {

    private boolean ligado = false;

    public ArCondicionado() {}

    public boolean isLigado() {
        return ligado;
    }

    @Override
    public void ligar() {
        if (this.ligado)
            System.out.println("Ar-Condicionado já está ligado!");
        else {
            this.ligado = true;
            System.out.println("Ar-Condicionado ligado.");
        }
    }

    @Override
    public void desligar() {
        if (!this.ligado){
            System.out.println("Ar-Condicionado já está desligado!");
        } else {
            this.ligado = false;
            System.out.println("Ar-Condicionado desligado.");
        }
    }
}
