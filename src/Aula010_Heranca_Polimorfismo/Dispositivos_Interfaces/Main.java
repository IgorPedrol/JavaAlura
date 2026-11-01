package Aula010_Heranca_Polimorfismo.Dispositivos_Interfaces;

import Aula010_Heranca_Polimorfismo.Dispositivos_Interfaces.model.ArCondicionado;
import Aula010_Heranca_Polimorfismo.Dispositivos_Interfaces.model.Luz;

public class Main {
    public static void main(String[] args) {

        Luz luz = new Luz();
        ArCondicionado arCondicionado = new ArCondicionado();

        luz.ligar();
        luz.ligar();
        luz.desligar();

        arCondicionado.desligar();
    }
}
