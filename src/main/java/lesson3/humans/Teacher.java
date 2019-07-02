package main.java.lesson3.humans;

/**
 * Used to create teacher information
 *
 * @author Strelchenya Danil
 * @version 1.0
 */

public class Teacher {
    /**
     * First Name Example: "Danil"
     */
    String firsName;
    /**
     * Last Name Example: "Strelchenya"
     */
    String lastName;
    /**
     * Teacher's age
     */
    int age;


    public Teacher() {
        this.firsName = "Андрей";
        this.lastName = "Николаенко";
        this.age = 35;
    }

    /**
     * @param firsName
     * @param lastName
     * @param age
     */
    public Teacher(String firsName, String lastName, int age) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
