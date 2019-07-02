package main.java.lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        Student stud1 = new Student();
        MyOptional<Student> studentMyOptional = MyOptional.empty();
        MyOptional<Student> studentMyOptional2 = MyOptional.empty();

        System.out.println(studentMyOptional.equals(studentMyOptional2));
    }
}
