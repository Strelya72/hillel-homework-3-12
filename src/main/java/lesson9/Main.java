package main.java.lesson9;

import main.java.lesson8.CallLog;
import main.java.lesson8.Contact;

import java.util.*;

import static main.java.lesson8.Lesson8.getMapContactCalllogs;
import static main.java.lesson8.Lesson8.newContact;

public class Main {
    public static void main(String[] args) {


        List<Contact> listContacts = new ArrayList<>();
        listContacts.add(new Contact("+380997186857", "Danil", "Strelchenya"));
        listContacts.add(new Contact("+380508090156", "Diana", "Yesman"));
        listContacts.add(newContact());
        listContacts.add(newContact());
        listContacts.add(newContact());


        // Task 1
        System.out.println("\nTask1\n");
        Map<String, Contact> mapNumberContacts = new HashMap<>();

        for (Contact item : listContacts) {
            mapNumberContacts.put(item.getNumber(), item);
        }

        for (String key : mapNumberContacts.keySet()) {
            System.out.print(key + " - ");
            System.out.println(mapNumberContacts.get(key).getFirstName() + " " + mapNumberContacts.get(key).getLastName());
        }


        // Task 2
        System.out.println("\nTask2\n");
        Contact c1 = new Contact("+380997186857", "Danil", "Strelchenya");
        Contact c2 = new Contact("+380997186857", "Danil", "Strelchenya");
        Set<Contact> setContacts = new HashSet<>();
        setContacts.add(c1);
        setContacts.add(newContact());
        setContacts.add(newContact());
        setContacts.add(newContact());
        setContacts.add(c2);

        for (Contact item : setContacts) {
            System.out.print(item.getFirstName() + " ");
            System.out.println(item.getLastName());
        }

        // Task 3
        System.out.println("\nTask2\n");
        List<CallLog> listCallLogs = new ArrayList<>();
        listCallLogs.add(new CallLog("+380997186857", "+380508090156", 90, System.currentTimeMillis()));
        listCallLogs.add(new CallLog("+380999621425", "+380997186857", 35, System.currentTimeMillis()));
        listCallLogs.add(new CallLog("+380508090156", "+380506672153", 35, System.currentTimeMillis()));

        Map<Contact, Collection<CallLog>> mapContactCalllogs = getMapContactCalllogs(listContacts, listCallLogs);

        for (Contact key : mapContactCalllogs.keySet()) {
            System.out.println(key.getNumber());
            System.out.println(mapContactCalllogs.get(key).size());
            System.out.println();
        }
    }
}
