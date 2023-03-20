package org.example;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
    private final static String token = "cb4eb0d99cdd43e78736a0f5d8c916d1";

    public static void main(String[] args) {

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.football-data.org/v4/persons/329"))
                    .header("X-Auth-Token", token)
                    .build();

            HttpResponse<String> response;

            response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();

            Jugador jugador = gson.fromJson(response.body(), Jugador.class);
            System.out.println(jugador);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}

