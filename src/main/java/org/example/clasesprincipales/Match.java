package org.example.clasesprincipales;

import org.example.subclases.Matches;
import org.example.subclases.Table;

import java.util.ArrayList;

public class Match extends Matches{
    ArrayList<Matches> matches;

    public Match(ArrayList<Matches> matches) {
        this.matches = matches;
    }

    public Match() {
    }

    public ArrayList<Matches> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Matches> matches) {
        this.matches = matches;
    }

    private static String limpia(String datosArray){
        datosArray = datosArray.trim();
        if (datosArray != null && datosArray.length() > 0 && datosArray.charAt(datosArray.length() - 1) == ',') {
            datosArray = datosArray.substring(0, datosArray.length() - 1);
        }
        return datosArray;
    }

    public String toString() {
        String datosArray = "";

        for (Matches elemento: matches) {
            datosArray += elemento + ", ";
        }

        return "JORNADA " + matches.get(0).getMatchday() + "\n" + limpia(datosArray) + "\n";
    }
}
