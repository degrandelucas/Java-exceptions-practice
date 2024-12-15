package exceptions.practice.connection;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Connection {
    HttpClient client = HttpClient.newBuilder().build();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://foo.com/"))
            .header("Content-Type", "application/json")
            .GET()
            .build();
    HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());


    public Connection() throws IOException, InterruptedException {
    }
}
