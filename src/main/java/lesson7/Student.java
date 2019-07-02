package main.java.lesson7;

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
}



