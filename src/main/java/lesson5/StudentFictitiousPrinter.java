package main.java.lesson5;

public class StudentFictitiousPrinter implements IStudentStringPrinter {
    private IStudentStringConverter iStudTypeConverter;

    public StudentFictitiousPrinter(IStudentStringConverter iStudStrConverter) {
        this.iStudTypeConverter = iStudStrConverter;
    }

    @Override
    public void print(Student student) {
        // Doing nothing
    }
}
