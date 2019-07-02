package main.java.lesson3.inhumans;

import main.java.lesson3.humans.Student;

/**
 * Used to create group information
 *
 * @author Strelchenya Danil
 * @version 1.0
 */
public class Group {
    /**
     * Field title of Group
     */
    String title;
    /**
     * Array Students
     */
    Student studs[];

    public Group(String title, Student[] studs) {
        this.title = title;
        this.studs = studs;
    }

    public String getTitle() {
        return title;
    }

    public Student[] getStuds() {
        return studs;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStuds(Student[] studs) {
        this.studs = studs;
    }
}
