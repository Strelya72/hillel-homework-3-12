package main.java.lesson3.inhumans;

public class Event {
    Group groups[];
    Classroom room;

    public Event(Group[] groups, Classroom room) {
        this.groups = groups;
        this.room = room;
    }

    public Group[] getGroups() {
        return groups;
    }

    public Classroom getRoom() {
        return room;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public void setRoom(Classroom room) {
        this.room = room;
    }
}
