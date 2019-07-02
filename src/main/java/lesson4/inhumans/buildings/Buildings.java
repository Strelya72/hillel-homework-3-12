package main.java.lesson4.inhumans.buildings;

public class Buildings {
    String title;
    /**
     * floors - Count of floors like 2
     */
    int floors;
    /**
     * type like "School"
     */
    String type;

    boolean residential;


    public Buildings(String name, int floors, String type, boolean residential) {
        this.title = name;
        this.floors = floors;
        this.type = type;
        this.residential = residential;
    }

    @Override
    public String toString() {
        String str = "Title: " + this.title + ",\n" +
                "Type: " + this.type + ",\n" +
                "Residential: " + (this.residential == true ? "Yes" : "No") + ",\n" +
                "Floors: " + this.floors + ".";
        return str;
    }
}
