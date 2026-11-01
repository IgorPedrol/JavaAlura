package Aula006_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainJsonConverter {
    public static void main(String[] args) {

        String json1 = """
                {
                    "nome" : "Igor",
                    "idade" : 21,
                    "cidade" : "Itapeva"
                }
              """;


        Gson gson1 = new Gson();
        PessoaDto pessoaDto = gson1.fromJson(json1, PessoaDto.class);
        System.out.println("\n" + pessoaDto + "\n");

        Pessoa pessoa1 = new Pessoa(pessoaDto);
        System.out.println(pessoa1);


        String json2 = """
                {
                    "nome" : "Igor",
                    "cidade" : "Itapeva"
                }
              """;

        Gson gson2 = new GsonBuilder().setLenient().create();
        PessoaDto pessoaDto2 = gson2.fromJson(json2, PessoaDto.class);

        System.out.println("Objeto Pessoa: " + pessoaDto2);
    }
}
