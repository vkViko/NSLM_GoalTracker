package org.example.subclases;

import org.example.subclases.AwayTeam;
import org.example.subclases.HomeTeam;
import org.example.subclases.Referees;
import org.example.subclases.Score;

import java.util.ArrayList;
import java.util.Locale;

public class Matches {
    String status;
    int matchday;
    HomeTeam homeTeam;
    AwayTeam awayTeam;
    Score score;
    ArrayList<Referees> referees;

    public Matches() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMatchday() {
        return matchday;
    }

    public void setMatchday(int matchday) {
        this.matchday = matchday;
    }

    public HomeTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HomeTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public AwayTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(AwayTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public ArrayList<Referees> getReferees() {
        return referees;
    }

    public void setReferees(ArrayList<Referees> referees) {
        this.referees = referees;
    }

    @Override
    public String toString() {
        if (referees.size()==0){
            return "\n\n" + status.toUpperCase() + "\n"
                    + homeTeam + " - " + awayTeam;
        } else {
            return "\n\n" + status.toUpperCase() + "\n"
                    + homeTeam + " " + score + " " + awayTeam + "\n"
                    + "Arbitro: " + referees;
        }
    }
}
