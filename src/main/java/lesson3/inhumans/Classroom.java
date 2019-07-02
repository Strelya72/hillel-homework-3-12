package main.java.lesson3.inhumans;

/**
 * Used to create classroom information
 *
 * @author Strelchenya Danil
 * @version 1.0
 */
public class Classroom {

    String title;
    int numberOfRoom;
    String type;

    /**
     * @param title
     * @param numberOfRoom
     */
    public Classroom(String title, int numberOfRoom, String type) {
        this.title = title;
        this.numberOfRoom = numberOfRoom;
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public String getType() {
        return type;
    }
}
