package org.example.subclases;

public class AwayTeam {
    String name;
    String crest;

    public AwayTeam(String name, String crest) {
        this.name = name;
        this.crest = crest;
    }

    public AwayTeam() {
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
        return name;
    }
}
