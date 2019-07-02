package main.java.lesson6;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("Invalid name value!");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0 || age >= 150) {
            throw new IllegalArgumentException("Inalid age value!");
        }
        this.age = age;
    }

    public static Student deserialize(String str) throws MyValidateException {
        if (str == null) {
            throw new NullPointerException("Value cannot be Null!");
        } else if (str.length() == 0) {
            throw new MyValidateException("Ivalid value in deserialize!");
        }

        Student stud = new Student("Danil", 20);
        return stud;
    }
}

