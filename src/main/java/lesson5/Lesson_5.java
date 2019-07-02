package main.java.lesson5;

public class Lesson_5 {
    public static void main(String[] args) {

        Student s1 = new Student("Danil", 21);

        StudentJsonConverter sJsonConverter = new StudentJsonConverter();
        StudentXmlConverter sXmlConverter = new StudentXmlConverter();
        StudentStringConverter sStringConverter = new StudentStringConverter();

        StudentPrinter sPrinter = new StudentPrinter(sJsonConverter);
        //sPrinter.print(s1);

        sPrinter = new StudentPrinter(sXmlConverter);
        //sPrinter.print(s1);

        sPrinter = new StudentPrinter(sStringConverter);
        //sPrinter.print(s1);

        StudentFictitiousPrinter sFictitPrinter = new StudentFictitiousPrinter(sJsonConverter);
        //sFictitPrinter.print(s1);

        StudentTransferPrinter sTransferPrinter = new StudentTransferPrinter(new IStudentStringPrinter[]{sPrinter, sFictitPrinter});
        sTransferPrinter.print(s1);

    }
}
