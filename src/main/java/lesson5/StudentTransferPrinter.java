package main.java.lesson5;

public class StudentTransferPrinter implements IStudentStringPrinter {

    private IStudentStringPrinter[] iStudPrinter;

    public StudentTransferPrinter(IStudentStringPrinter[] iStudPrinter) {
        this.iStudPrinter = iStudPrinter;
    }

    @Override
    public void print(Student student) {
        for (int i = 0; i < iStudPrinter.length; i++) {
            this.iStudPrinter[i].print(student);
        }
    }

}
