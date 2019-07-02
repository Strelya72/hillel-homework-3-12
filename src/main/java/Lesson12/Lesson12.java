package main.java.Lesson12;

import main.java.lesson10.Contact;

import static main.java.lesson10.Lesson10.newContact;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class Lesson12 {
    public static void main(String[] args) {

        task1Writer();

        System.out.println("\tTask 2:");
        task2Reader();

        // Task 3
        System.out.println("\tTask 3:");
        Collection<String> listStrings = new ArrayList<>();
        listStrings.add("Hello");
        listStrings.add(",");
        listStrings.add("world");
        listStrings.add("!");

        task3Writer(listStrings);
        listStrings = task3Reader();

        for (String item : listStrings) {
            System.out.println(item);
        }

        // Task 4
        System.out.println("\tTask4:");
        Collection<Contact> listContactsTask4 = new ArrayList<Contact>();
        listContactsTask4.add(newContact());
        listContactsTask4.add(newContact());
        listContactsTask4.add(newContact());

        task4Writer(listContactsTask4);
        for (Contact item : task4Reader()) {
            System.out.println(item.getFirstName());
        }

        // Task 5
        System.out.println("\tTask 5:");
        Collection<Contact> listContactsTask5 = new ArrayList<Contact>();
        listContactsTask5.add(newContact());
        listContactsTask5.add(newContact());
        listContactsTask5.add(newContact());

        task5Writer(listContactsTask5);

        for (Contact item : task5Reader()) {
            System.out.println(item.getFirstName());
        }

        // Task 6
        System.out.println("\tTask 6:");
        File folder = new File("src/main/java");
        System.out.println("Количество файлов в запрошенной директории: " + listFilesForFolder(folder, 0));
    }

    /**
     * Writes 3 parameters to the file
     */
    public static void task1Writer() {

        try (DataOutputStream writer = new DataOutputStream(
                new FileOutputStream("src/main/java/lesson12/data1.bin"))) {
            writer.writeInt(123);
            writer.writeFloat(27.0f);
            writer.writeUTF("hello и привет");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * Reads 3 parameters from file and displays
     */
    public static void task2Reader() {

        try (DataInputStream reader = new DataInputStream(
                new FileInputStream("src/main/java/lesson12/data1.bin"))) {
            int intValue = reader.readInt();
            float floatValue = reader.readFloat();
            String stringValue = reader.readUTF();

            System.out.println("Прочитанные значения: " + intValue + ", " + floatValue + ", " + stringValue);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * Writes a collection of strings to a file
     *
     * @param listStrings
     */
    public static void task3Writer(Collection<String> listStrings) {

        try (DataOutputStream writer = new DataOutputStream(
                new FileOutputStream("src/main/java/lesson12/data3.bin"))) {
            writer.writeInt(listStrings.size());
            for (String item : listStrings) {
                writer.writeUTF(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * Reads a collection of strings from a file
     *
     * @return Read collection string
     */
    public static Collection<String> task3Reader() {

        Collection<String> listStrings = new ArrayList<>();

        try (DataInputStream reader = new DataInputStream(
                new FileInputStream("src/main/java/lesson12/data3.bin"))) {
            int countListElements = reader.readInt();

            for (int i = 0; i < countListElements; i++) {
                listStrings.add(reader.readUTF());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listStrings;

    }


    /**
     * Writes a collection of contacts to a file
     *
     * @param listContacts
     */
    public static void task4Writer(Collection<Contact> listContacts) {

        try (DataOutputStream writer = new DataOutputStream(
                new FileOutputStream("src/main/java/lesson12/data4.bin"))) {
            writer.writeInt(listContacts.size());
            for (Contact item : listContacts) {
                writer.writeUTF(item.getNumber());
                writer.writeUTF(item.getFirstName());
                writer.writeUTF(item.getLastName());
                writer.writeInt(item.getAge());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * Reads a collection of contacts from a file
     *
     * @return Read collection contact
     */
    public static Collection<Contact> task4Reader() {
        Collection<Contact> listContacts = new ArrayList<Contact>();

        try (DataInputStream reader = new DataInputStream(
                new FileInputStream("src/main/java/lesson12/data4.bin"))) {
            int size = reader.readInt();

            for (int i = 0; i < size; i++) {
                listContacts.add(new Contact(reader.readUTF(), reader.readUTF(), reader.readUTF(), reader.readInt()));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listContacts;
    }


    /**
     * Writes a collection of contacts as an object to a file
     *
     * @param listContacts
     */
    public static void task5Writer(Collection<Contact> listContacts) {

        try (ObjectOutputStream writer = new ObjectOutputStream(
                new FileOutputStream("src/main/java/lesson12/data5.bin"))) {
            writer.writeObject(listContacts);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * Reads a collection of contacts as an object from a file
     *
     * @return Read collection contact
     */
    public static Collection<Contact> task5Reader() {

        Collection<Contact> listContacts = new ArrayList<Contact>();

        try (ObjectInputStream reader = new ObjectInputStream(
                new FileInputStream("src/main/java/lesson12/data5.bin"))) {
            listContacts = (ArrayList) reader.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return listContacts;

    }


    /**
     * Counts the number of files in folders
     *
     * @param folder
     */
    public static int listFilesForFolder(File folder, int index) {

        for (int i = 0; i < index; i++) {
            System.out.print("\t");
        }
        System.out.println(folder.getPath());

        int countFiles = 0;
        for (File item : folder.listFiles()) {
            if (item.isDirectory()) {
                countFiles += listFilesForFolder(item, index+1);
            } else {
                countFiles++;
            }
        }

        for (int i = 0; i <= index; i++) {
            System.out.print("\t");
        }
        System.out.println("Количество файлов: " + countFiles);

        return countFiles;
    }

}
