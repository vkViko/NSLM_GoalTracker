package org.example;

import com.google.gson.Gson;
import org.example.clasesprincipales.LeagueScorers;
import org.example.clasesprincipales.MainTable;
import org.example.clasesprincipales.Match;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {
    private final static String token = "cb4eb0d99cdd43e78736a0f5d8c916d1";

    public static void main(String[] args) {

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.football-data.org/v4/competitions/SA/scorers"))
                    .header("X-Auth-Token", token)
                    .build();

            HttpResponse<String> response;

            response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();

            LeagueScorers leagueScorers = gson.fromJson(response.body(), LeagueScorers.class);

            System.out.println(leagueScorers);

            //Player jugador = gson.fromJson(response.body(), Player.class);
            //System.out.println(jugador);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://api.football-data.org/v4/competitions/BSA/standings"))
                    .header("X-Auth-Token", token)
                    .build();

            HttpResponse<String> response;

            response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();

            MainTable clasificacion = gson.fromJson(response.body(), MainTable.class);

            System.out.println(clasificacion.getStandings().get(0).getTable().get(19)); //SACA LA PRIMERA POSICION DE LA CLASIFICACION (0-19)
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        System.out.println();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://api.football-data.org/v4/competitions/PL/matches?matchday=1")) //JORNADA 2 DE LA PREMIER LEAGUE
                    .header("X-Auth-Token", token)
                    .header("X-Unfold-Goals", "true")
                    .build();

            HttpResponse<String> response;

            response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            Match match = gson.fromJson(response.body(), Match.class);

            System.out.println(match);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.football-data.org/v4/teams/86/matches?status=SCHEDULED")) //CHAMPIONS LEAGUE
                    .header("X-Auth-Token", token)
                    .header("X-Unfold-Goals", "true")
                    .build();

            HttpResponse<String> response;

            response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            Match match = gson.fromJson(response.body(), Match.class);
            
            System.out.println(match);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

    }

}
