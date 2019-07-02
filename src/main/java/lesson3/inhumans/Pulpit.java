package main.java.lesson3.inhumans;

import main.java.lesson3.humans.Teacher;

/**
 * Used to create pulpit information
 *
 * @author Strelchenya Danil
 * @version 1.0
 */
public class Pulpit {

    String title;
    Classroom rooms[];
    Teacher teachers[];
    Group groups[];

    /**
     * @param title    name like "KN"
     * @param rooms    array Classroms
     * @param teachers array Teachers
     * @param groups   array Groups
     */
    public Pulpit(String title, Classroom[] rooms, Teacher[] teachers, Group[] groups) {
        this.title = title;
        this.rooms = rooms;
        this.teachers = teachers;
        this.groups = groups;
    }

    public String getTitle() {
        return title;
    }

    public Classroom[] getRooms() {
        return rooms;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRooms(Classroom[] rooms) {
        this.rooms = rooms;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }
}
