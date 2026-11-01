package Aula010_Heranca_Polimorfismo.Escola.model;

public abstract class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void exibirDados();

}
