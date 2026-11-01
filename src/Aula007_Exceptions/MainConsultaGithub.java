package Aula007_Exceptions;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainConsultaGithub {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o usuário do Github: ");
        String username = input.nextLine();
        username = URLEncoder.encode(username, StandardCharsets.UTF_8);

        String endereco = "https://api.github.com/users/"+ username;

        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404){
                throw new ErroConsultaGithubException("Nome de Usuário não encontrado!");
            }
            if (response.statusCode() == 200) {
                System.out.println(response.body());
            }

        } catch (ErroConsultaGithubException e) {
            System.out.println(e.getMessage());
        }




    }
}
