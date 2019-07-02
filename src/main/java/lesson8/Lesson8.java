package main.java.lesson8;

import java.util.*;

public class Lesson8 {
    public static void main(String[] args) {

        // Task 2
        List<Contact> listContacts = new ArrayList<>();
        listContacts.add(new Contact("+380997186857", "Danil", "Strelchenya"));
        listContacts.add(new Contact("+380508090156", "Diana", "Yesman"));
        listContacts.add(newContact());
        listContacts.add(newContact());
        listContacts.add(newContact());

        // Task 2
        List<CallLog> listCallLogs = new ArrayList<>();
        listCallLogs.add(new CallLog("+380997186857", "+380508090156", 90, System.currentTimeMillis()));
        listCallLogs.add(new CallLog("+380999621425", "+380997186857", 35, System.currentTimeMillis()));
        listCallLogs.add(new CallLog("+380508090156", "+380506672153", 35, System.currentTimeMillis()));

        // Task 2
        List<Message> listMessages = new ArrayList<>();
        listMessages.add(new Message("+380997186857", "+380508090156", "Hi, how are you?", System.currentTimeMillis()));
        listMessages.add(new Message("+380997186857", "+380999621425", "Ok, in 5 minutes.", System.currentTimeMillis()));

        // Task 3
        Collection<Contact> listFoundContacts = searchContact(listContacts, "971868");
        for (Contact item : listFoundContacts) {
            System.out.println(item.getFirstName() + " " + item.getLastName());
        }

        // Task 4
        Map<Contact, Collection<CallLog>> mapContactCalllogs = getMapContactCalllogs(listContacts, listCallLogs);
        System.out.println();
        for (Contact key : mapContactCalllogs.keySet()) {
            System.out.println("CallLog For: " + key.getNumber());
            System.out.println();
            for (CallLog item : mapContactCalllogs.get(key)) {
                System.out.println("\tDate: " + item.getiTimestamp());
                System.out.println("\tSender: " + item.getiSenderPhoneNumber());
                System.out.println("\tRecipient: " + item.getiRecipientPhoneNummer());
                System.out.println("\tDuration: " + item.getiСallDuration());
                System.out.println();
            }
        }

        // Task 5
        for (Contact key : mapContactCalllogs.keySet()) {
            System.out.println(key.getNumber());
            System.out.println(mapContactCalllogs.get(key).size());
            System.out.println();
        }

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

        contact = new Contact(numberPhone, firstName, lastName);
        return contact;
    }

    /**
     * @param listContacts
     * @param searchedText
     * @return Collection of found contacts
     */
    public static Collection<Contact> searchContact(Collection<Contact> listContacts, String searchedText) {
        Collection<Contact> listFoundContacts = new ArrayList<Contact>();

        for (Contact item : listContacts) {
            if (item.getNumber().contains(searchedText) || item.getFirstName().contains(searchedText) || item.getLastName().contains(searchedText))
                listFoundContacts.add(item);
        }
        return listFoundContacts;
    }

    /**
     * @param listCallLog
     * @param searchedText
     * @return Collection of found call logs
     */
    public static Collection<CallLog> searchCallLog(Collection<CallLog> listCallLog, String searchedText) {
        Collection<CallLog> listFoundCallLogs = new ArrayList<CallLog>();

        for (CallLog item : listCallLog) {
            if (item.getiSenderPhoneNumber().contains(searchedText) || item.getiRecipientPhoneNummer().contains(searchedText)) {
                listFoundCallLogs.add(item);
            }
        }
        return listFoundCallLogs;
    }

    /**
     * @param listContacts
     * @param listCallLogs
     * @return Grouped collection by contacts and calls
     */
    public static Map<Contact, Collection<CallLog>> getMapContactCalllogs(Collection<Contact> listContacts, Collection<CallLog> listCallLogs) {
        Map<Contact, Collection<CallLog>> mapContactCalllogs = new HashMap<Contact, Collection<CallLog>>();

        for (Contact item : listContacts) {
            mapContactCalllogs.put(item, searchCallLog(listCallLogs, item.getNumber()));
        }
        return mapContactCalllogs;
    }

    /**
     * @param contact
     * @param listCallLogs
     * @return Number of call logs
     */
    public static int getCountCallLog(Contact contact, Collection<CallLog> listCallLogs) {
        int count = 0;
        for (CallLog item : listCallLogs) {
            if (item.getiRecipientPhoneNummer().equals(contact.getNumber()) || item.getiSenderPhoneNumber().equals(contact.getNumber())) {
                count++;
            }
        }
        return count;
    }

    public static Map<Contact, Integer> getMapContactCountCallLogs(Collection<Contact> listContacts, Collection<CallLog> listCallLogs) {
        Map<Contact, Integer> mapContactCountCallLogs = new HashMap<Contact, Integer>();
        for (Contact item : listContacts) {
            mapContactCountCallLogs.put(item, getCountCallLog(item, listCallLogs));
        }
        return mapContactCountCallLogs;
    }
}
