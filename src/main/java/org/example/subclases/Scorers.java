package org.example.subclases;

public class Scorers {
    Player player;
    Teams team;
    int goals;
    int assists;

    public Scorers(Player player, Teams team, int goals, int assists) {
        this.player = player;
        this.team = team;
        this.goals = goals;
        this.assists = assists;
    }

    public Scorers() {

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Teams getTeam() {
        return team;
    }

    public void setTeam(Teams team) {
        this.team = team;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    @Override
    public String toString() {
        return "\n\n" + player.getName() + " - " + team.getName() + "\n"
                + "Goles: " + goals + "\n"
                + "Asistencias: " + assists;
    }
}
