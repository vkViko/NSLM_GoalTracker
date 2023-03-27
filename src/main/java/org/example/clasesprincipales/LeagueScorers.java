package org.example.clasesprincipales;

import org.example.subclases.Matches;
import org.example.subclases.Scorers;

import java.util.ArrayList;

public class LeagueScorers {
    ArrayList <Scorers> scorers;

    public LeagueScorers(ArrayList<Scorers> scorers) {
        this.scorers = scorers;
    }

    public ArrayList<Scorers> getScorers() {
        return scorers;
    }

    public void setScorers(ArrayList<Scorers> scorers) {
        this.scorers = scorers;
    }

    private static String limpia(String datosArray){
        datosArray = datosArray.trim();
        if (datosArray != null && datosArray.length() > 0 && datosArray.charAt(datosArray.length() - 1) == ',') {
            datosArray = datosArray.substring(0, datosArray.length() - 1);
        }
        return datosArray;
    }

    @Override
    public String toString() {
        String datosArray = "";

        for (Scorers elemento: scorers) {
            datosArray += elemento + ", ";
        }

        return limpia(datosArray);
    }
}
