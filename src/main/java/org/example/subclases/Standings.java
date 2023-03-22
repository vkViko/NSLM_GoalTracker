package org.example.subclases;

import java.util.ArrayList;

public class Standings extends Table {

    ArrayList<Table> table;

    public Standings() {
    }

    public Standings(ArrayList<Table> table) {
        this.table = table;
    }

    public ArrayList<Table> getTable() {
        return table;
    }

    public void setTable(ArrayList<Table> table) {
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

        for (Table elemento: table) {
            datosArray += elemento + ", ";
        }

        return "\t" + limpia(datosArray) + "\n";
    }
}
