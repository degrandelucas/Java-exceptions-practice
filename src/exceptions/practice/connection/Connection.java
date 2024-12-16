package exceptions.practice.connection;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Connection {

    public String fetchUserProfile(String username) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder().build();
        String url = "https://api.github.com/users/" + username;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Accept", "application/vnd.github+json") //cabecalho
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();// Retorna o JSON puro

    }
}
