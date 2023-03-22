package org.example.clasesprincipales;

import org.example.subclases.Standings;

import java.util.ArrayList;

public class MainTable extends Standings {
    ArrayList<Standings> standings;


    public MainTable() {}

    public MainTable(ArrayList<Standings> standings) {
        this.standings = standings;
    }

    public ArrayList<Standings> getStandings() {
        return standings;
    }

    public void setStandings(ArrayList<Standings> standings) {
        this.standings = standings;
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

        for (Standings elemento: standings) {
            datosArray += elemento + ", ";
        }

        return limpia(datosArray);
    }
}
