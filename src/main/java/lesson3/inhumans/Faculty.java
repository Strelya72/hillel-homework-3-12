package main.java.lesson3.inhumans;

/**
 * Used to create faculty information
 *
 * @author Strelchenya Danil
 * @version 1.0
 */
public class Faculty {

    String title;
    Pulpit pulpits[];

    public Faculty(String title, Pulpit[] pulpits) {
        this.title = title;
        this.pulpits = pulpits;
    }

    public String getTitle() {
        return title;
    }

    public Pulpit[] getPulpits() {
        return pulpits;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPulpits(Pulpit[] pulpits) {
        this.pulpits = pulpits;
    }
}
