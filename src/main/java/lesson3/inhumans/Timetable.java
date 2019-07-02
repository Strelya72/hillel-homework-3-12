package main.java.lesson3.inhumans;

public class Timetable {
    Couple couples[];

    public Timetable(Couple[] couples) {
        this.couples = couples;
    }

    public Couple[] getCouples() {
        return couples;
    }

    public void setCouples(Couple[] couples) {
        this.couples = couples;
    }
}
