package main.java.lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson10 {
    public static void main(String[] args) {

        List<Contact> listContacts = new ArrayList<Contact>();
        listContacts.add(newContact());
        listContacts.add(newContact());
        listContacts.add(newContact());

        // Task 1.A
        for (Contact item : listContacts) {
            System.out.println(item.getFirstName());
        }
        Collections.sort(listContacts, Contact.compareByName());

        System.out.println("Sort by name");
        for (Contact item : listContacts) {
            System.out.println(item.getFirstName());
        }

        // Task 1.B
        for (Contact item : listContacts) {
            System.out.println(item.getNumber());
        }
        Collections.sort(listContacts, Contact.compareByPhoneNumber());

        System.out.println("Sort by phone number");
        for (Contact item : listContacts) {
            System.out.println(item.getNumber());
        }

        // Task 1.C
        for (Contact item : listContacts) {
            System.out.println(item.getAge());
        }
        Collections.sort(listContacts, Contact.compareByAge());

        System.out.println("Sort by age");
        for (Contact item : listContacts) {
            System.out.println(item.getAge());
        }

        Contact vanya = new Contact("+380997186857", "Ваня", "Петр", 20);
        Contact petya = new Contact("+380997186857", "Петр", "Ваня", 20);

        System.out.println("Hash:");
        System.out.println(vanya.hashCode());
        System.out.println(petya.hashCode());

    }

    /**
     * '
     *
     * @return new contact
     */
    public static Contact newContact() {
        Contact contact;

        String numberPhone = "+" + (380000000000L + (long) (Math.random() * 999999999));
        String RandomFirstName[] = {"Алиса", "Николай", "Владимир", "Надежда", "Марина", "Стас", "Данил",
                "Диана", "Виталий", "Алина", "Андрей", "Иван", "Александр"};
        String RandomLastName[] = {"Петров", "Иванов", "Сидоров"};
        String firstName = RandomFirstName[(int) (Math.random() * RandomFirstName.length)];
        String lastName = RandomLastName[(int) (Math.random() * RandomLastName.length)];
        int age = (int) (10 + Math.random() * 30);
        contact = new Contact(numberPhone, firstName, lastName, age);
        return contact;
    }
}
