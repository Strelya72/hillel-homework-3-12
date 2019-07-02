package main.java.lesson5;

public class StudentPrinter implements IStudentStringPrinter {

    private IStudentStringConverter iStudTypeConverter;

    public StudentPrinter(IStudentStringConverter iStudStrConverter) {
        this.iStudTypeConverter = iStudStrConverter;
    }

    @Override
    public void print(Student student) {
        System.out.println(iStudTypeConverter.convert(student));
    }
}
