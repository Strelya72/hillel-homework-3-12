package main.java.lesson11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class advancedFirst {
    public static void main(String[] args) {

        try (PrintWriter writer = new PrintWriter(
                new FileOutputStream("src/main/java/lesson11/Lesson11_advanced.txt"))) {
            writer.print("Hello, world!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
