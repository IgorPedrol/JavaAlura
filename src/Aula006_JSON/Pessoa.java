package Aula006_JSON;

public class Pessoa {

    private String name;
    private int age;
    private String city;

    public Pessoa(PessoaDto pessoaDto){
        this.name = pessoaDto.nome();
        this.age = pessoaDto.idade();
        this.city = pessoaDto.cidade();
    }

    @Override
    public String toString() {
        return """
                Name: %s
                Age: %d
                City: %s
                """.formatted(this.name, this.age, this.city);
    }
}
