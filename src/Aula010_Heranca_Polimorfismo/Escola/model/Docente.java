package Aula010_Heranca_Polimorfismo.Escola.model;

public class Docente extends Pessoa {

    private String disciplina;

    public Docente(String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Docente: %s - Idade: %d - Disciplina: %s\n", getNome(), getIdade(), disciplina);
    }
}
