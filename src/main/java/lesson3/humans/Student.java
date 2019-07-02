package main.java.lesson3.humans;

/**
 * Used to create student information
 *
 * @author Strelchenya Danil
 * @version 1.0
 */
public class Student {
    /**
     * Field fistName
     */
    String firsName;
    /**
     * Field lastName
     */
    String lastName;
    /**
     * Field age
     */
    int age;

    public Student() {
        this.firsName = "Ivan";
        this.lastName = "Petrov";
        this.age = 20;
    }

    /**
     * @param firsName
     * @param lastName
     * @param age
     */
    public Student(String firsName, String lastName, int age) {
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

    /**
     * @param firsName
     */
    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
}


