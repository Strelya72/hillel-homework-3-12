package main.java.lesson4.inhumans.buildings;

public class School extends Buildings {
    int countStudents;
    int countTeachers;

    public School(String name, int floors, int countStudents, int countTeachers) {
        super(name, floors, "School", false);
        this.countStudents = countStudents;
        this.countTeachers = countTeachers;
    }

    @Override
    public String toString() {
        String str = "Title: " + super.title + ",\n" +
                "Type: " + super.type + ",\n" +
                "Residential: " + (super.residential == true ? "Yes" : "No") + ",\n" +
                "Floors: " + super.floors + ",\n" +
                "Count Students: " + this.countStudents + ",\n" +
                "Count Teachers: " + this.countTeachers + ".";
        return str;
    }
}
