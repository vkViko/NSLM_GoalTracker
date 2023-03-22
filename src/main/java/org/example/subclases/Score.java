package org.example.subclases;

public class Score {
    FullTime fullTime;
    HomeTeam homeTeam;
    AwayTeam awayTeam;

    public Score(FullTime fullTime) {
        this.fullTime = fullTime;
    }

    public FullTime getFullTime() {
        return fullTime;
    }

    public void setFullTime(FullTime fullTime) {
        this.fullTime = fullTime;
    }

    @Override
    public String toString() {
        return fullTime.toString();
    }
}
