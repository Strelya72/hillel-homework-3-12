package main.java.lesson5;

public class StudentXmlConverter implements IStudentStringConverter {
    /**
     *
     * @param student
     * @return converted value to xml
     */
    @Override
    public String convert(Student student) {
        StringBuilder strB = new StringBuilder();
        strB.append("<student>\n");
        strB.append("\t <name>" + student.getName() + "</name>");
        strB.append("\n");
        strB.append("\t <age>" + student.getAge() + "</age>");
        strB.append("\n<student>");
        return strB.toString();
    }
}
