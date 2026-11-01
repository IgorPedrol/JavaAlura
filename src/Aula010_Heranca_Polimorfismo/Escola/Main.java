package Aula010_Heranca_Polimorfismo.Escola;

import Aula010_Heranca_Polimorfismo.Escola.model.Aluno;
import Aula010_Heranca_Polimorfismo.Escola.model.Docente;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Edgar", 26, 7.8);
        Aluno aluno2 = new Aluno("Gilene", 71, 8.9);

        Docente docente1 = new Docente("Samir", 49, "História");
        Docente docente2 = new Docente("Fabião", 45, "Matemática");

        aluno1.exibirDados();
        aluno2.exibirDados();

        docente1.exibirDados();
        docente2.exibirDados();
    }
}
