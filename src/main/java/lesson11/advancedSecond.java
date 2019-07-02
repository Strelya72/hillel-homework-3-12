package main.java.lesson11;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class advancedSecond {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("src/main/java/lesson11/Lesson11_advanced.txt")))) {

            String line;
            while ( (line = reader.readLine()) != null ) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
