package main.java.lesson11;

import main.java.lesson10.Contact;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static main.java.lesson10.Lesson10.newContact;

public class Lesson11 {
    public static void main(String[] args) {

        // Task 1
        task1();
        // Task 2
        task2();

        // Task 3
        System.out.println("Average: " + task3());


        // Task 4 Writer
        List<Contact> listContacts = new ArrayList<Contact>();
        for (int i = 0; i < 10; i++) {
            listContacts.add(newContact());
        }

        task4Writer(listContacts);

        // Task 4 Reader
        System.out.println("Task 4:");

        listContacts = task4Reader();
        for (Contact item : listContacts) {
            System.out.println(item.getFirstName() + " " + item.getLastName() + " " + item.getNumber() + " " + item.getAge());
        }

        // Task 5
        System.out.println("Task 5:");
        List<Contact> sortListContacts = listContacts;
        sortListContacts.sort(Contact.compareByAge());

        for (int i = 0; i < 5; i++) {
            System.out.println(sortListContacts.get(i).getFirstName() + " " + sortListContacts.get(i).getLastName()
                    + " " + sortListContacts.get(i).getNumber() + " " + sortListContacts.get(i).getAge());
        }
    }

    /**
     *
     */
    public static void task1() {

        try (PrintWriter writer = new PrintWriter(
                new FileOutputStream("src/main/java/lesson11/Lesson11_Task1.txt"))) {
            writer.println("Hello, world!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    /**
     *
     */
    public static void task2() {

        try (PrintWriter writer = new PrintWriter(
                new FileOutputStream("src/main/java/lesson11/Lesson11_Task2.txt"))) {
            for (int i = 0; i < 1000; i++) {
                writer.print((-500 + (int) (Math.random() * 1151)) + ", ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    /**
     * @return
     */
    public static double task3() {

        int count = 0;
        double sum = 0;

        try (Scanner scanner = new Scanner(
                new FileInputStream("src/main/java/lesson11/Lesson11_Task2.txt"), StandardCharsets.UTF_8.name())) {

            scanner.useDelimiter(", ");

            int i = 0;

            while (i < 100 && scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int readValue = scanner.nextInt();
                    if (readValue >= 0) {
                        count++;
                        sum += readValue;
                    }
                    i++;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return (sum / count);

    }


    /**
     * @param listContacts
     */
    public static void task4Writer(Collection<Contact> listContacts) {

        try (PrintWriter writer = new PrintWriter(
                new FileOutputStream("src/main/java/lesson11/Lesson11_Task4.txt"))) {

            writer.println(listContacts.size() + "/");

            for (Contact item : listContacts) {
                writer.println(item.getFirstName() + "/" + item.getLastName() + "/"
                        + item.getNumber() + "/" + item.getAge() + "/");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    /**
     * @return
     */
    public static List<Contact> task4Reader() {

        List<Contact> listContacts = new ArrayList<Contact>();

        try (Scanner scanner = new Scanner(
                new FileInputStream("src/main/java/lesson11/Lesson11_Task4.txt"))) {

            scanner.useDelimiter("/");
            int count = scanner.nextInt();

            for (int i = 0; i < count; i++) {
                String firstName = scanner.next().replaceAll("\\s", "");
                String lastName = scanner.next();
                String numberPhone = scanner.next();
                int age = scanner.nextInt();

                listContacts.add(new Contact(numberPhone, firstName, lastName, age));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return listContacts;
    }
}
