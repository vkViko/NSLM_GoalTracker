package org.example.subclases;

import java.util.ArrayList;

public class Standings extends Tabla {

    ArrayList<Tabla> table;

    public Standings() {
    }

    public Standings(ArrayList<Tabla> table) {
        this.table = table;
    }

    public ArrayList<Tabla> getTable() {
        return table;
    }

    public void setTable(ArrayList<Tabla> table) {
        this.table = table;
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

        for (Tabla elemento: table) {
            datosArray += elemento + ", ";
        }

        return limpia(datosArray) + "\n";
    }
}
