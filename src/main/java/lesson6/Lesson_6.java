package main.java.lesson6;

public class Lesson_6 {
    public static void main(String[] args) {

//        try {
//            func1();
//        } catch (MyValidateException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("In finally block");
//        }

        try {
            func2();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("In finally block");
        }
    }

    public static void func1() throws MyValidateException {
        try {
            Student stud = Student.deserialize(null);
        } catch (MyValidateException | NullPointerException e) {
            System.out.println("Exp: " + e.getMessage());
            throw e;
        }
    }

    public static void func2() {
        try {
            Student stud = Student.deserialize(null);
        } catch (MyValidateException | NullPointerException e) {
            System.out.println("Exp: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}