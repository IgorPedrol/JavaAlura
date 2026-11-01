package Aula010_Heranca_Polimorfismo.Banco_Interfaces;

import Aula010_Heranca_Polimorfismo.Banco_Interfaces.model.Deposito;
import Aula010_Heranca_Polimorfismo.Banco_Interfaces.model.OperacaoBancaria;
import Aula010_Heranca_Polimorfismo.Banco_Interfaces.model.Saque;

public class Main {
    public static void main(String[] args) {

        OperacaoBancaria deposito = new Deposito(285.09);
        OperacaoBancaria saque = new Saque(123.22);

        deposito.executar();
        saque.executar();

    }
}
