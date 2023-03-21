package org.example;

import com.google.gson.Gson;
import org.example.clasesprincipales.Clasificacion;
import org.example.clasesprincipales.Jugador;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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

        System.out.println();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://api.football-data.org/v4/competitions/PD/standings"))
                    .header("X-Auth-Token", token)
                    .build();

            HttpResponse<String> response;

            response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();

            Clasificacion clasificacion = gson.fromJson(response.body(), Clasificacion.class);

            System.out.println(clasificacion.getStandings().get(0));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

    }

}
