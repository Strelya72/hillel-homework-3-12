package main.java.lesson5;

public class StudentJsonConverter implements IStudentStringConverter {
    /**
     * @param student
     * @return converted value to json
     */
    @Override
    public String convert(Student student) {
        StringBuilder strB = new StringBuilder();
        strB.append("{\n");
        strB.append("\t \"name\":\"" + student.getName() + "\",");
        strB.append("\n");
        strB.append("\t \"age\":" + student.getAge());
        strB.append("\n}");
        return strB.toString();
    }
}
