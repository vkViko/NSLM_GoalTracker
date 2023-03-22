package org.example.subclases;

public class FullTime {
    int home;
    int away;

    public FullTime() {
    }

    public FullTime(int home, int away) {
        this.home = home;
        this.away = away;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public int getAway() {
        return away;
    }

    public void setAway(int away) {
        this.away = away;
    }

    @Override
    public String toString() {
        return home + " - " + away;
    }
}
