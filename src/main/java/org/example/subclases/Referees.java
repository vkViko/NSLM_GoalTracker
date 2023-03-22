package org.example.subclases;

public class Referees {
    String name;

    public Referees(String name) {
        this.name = name;
    }

    public Referees() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
