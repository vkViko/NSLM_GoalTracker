package org.example.subclases;

import org.example.subclases.Teams;

public class Player {
    private long id;
    private String name;
    private String dateOfBirth;
    private String nationality;
    private String position;
    private int shirtNumber;
    private Teams currentTeam;

    public Player() {
    }

    public Player(String name, String dateOfBirth, String nationality, String position, int shirtNumber, Teams currentTeam) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.position = position;
        this.shirtNumber = shirtNumber;
        this.currentTeam = currentTeam;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public Teams getCurrentTeam() {
        return currentTeam;
    }

    public void setCurrentTeam(Teams currentTeam) {
        this.currentTeam = currentTeam;
    }

    @Override
    public String toString() {

        return "Nombre: " + name + id + "\n"
                + "Año de nacimiento: " + dateOfBirth + "\n"
                + "Nacionalidad: " + nationality + "\n"
                + "Posicion: " + position + "\n"
                + "Dorsal: " + shirtNumber + "\n"
                + "Equipo: " + currentTeam.getName();
    }
}
