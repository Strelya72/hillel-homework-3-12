package main.java.lesson5;

public class StudentStringConverter implements IStudentStringConverter {
    @Override
    public String convert(Student student) {
        StringBuilder strB = new StringBuilder();
        strB.append("Name: "+ student.getName());
        strB.append("\n");
        strB.append("Age: " + student.getAge());
        return strB.toString();
    }
}
