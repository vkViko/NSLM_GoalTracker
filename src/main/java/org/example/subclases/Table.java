package org.example.subclases;

public class Table {
    int position;
    Teams team;
    String form;
    int won, draw, lost;
    int points;
    int goalsFor;
    int goalsAgainst;
    int goalDifference;

    public Table() {
    }

    public Table(int position, Teams team, String form, int won, int draw, int lost, int points, int goalsFor, int goalsAgainst, int goalDifference) {
        this.position = position;
        this.team = team;
        this.form = form;
        this.won = won;
        this.draw = draw;
        this.lost = lost;
        this.points = points;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.goalDifference = goalDifference;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Teams getTeam() {
        return team;
    }

    public void setTeam(Teams team) {
        this.team = team;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(int goalsFor) {
        this.goalsFor = goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }

    @Override
    public String toString() {

        return "\t" + position + "- "
                + team.getName() + " - "
                + won + " - "
                + draw + " - "
                + lost + " - "
                + goalsFor + " - "
                + goalsAgainst + " - "
                + goalDifference + " - "
                + form + " --> "
                + points + "\n";





    }
}
