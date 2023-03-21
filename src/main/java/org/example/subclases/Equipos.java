package org.example.subclases;

public class Equipos {
    private int id;
    private String name;
    private String crest;

    public Equipos(int id, String name, String crest) {
        this.id = id;
        this.name = name;
        this.crest = crest;
    }

    public Equipos() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrest() {
        return crest;
    }

    public void setCrest(String crest) {
        this.crest = crest;
    }

    @Override
    public String toString() {
        return "Nombre del equipo " + name;
    }
}
