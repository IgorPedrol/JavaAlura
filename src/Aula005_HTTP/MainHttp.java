package Aula005_HTTP;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainHttp {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        var bookName = scanner.nextLine();
        scanner.close();

        bookName = URLEncoder.encode(bookName, StandardCharsets.UTF_8);

        System.out.println(bookName);
        var endereco = "https://www.googleapis.com/books/v1/volumes?q="+ bookName + "&key=AIzaSyCfqmPVqPQsikkVR_2UbHxM1OKBEoHSVZ0";


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
