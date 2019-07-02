package main.java.lesson4;

import main.java.lesson4.humans.Person;
import main.java.lesson4.inhumans.buildings.Buildings;
import main.java.lesson4.inhumans.buildings.School;
import main.java.lesson4.inhumans.furniture.Chair;
import main.java.lesson4.inhumans.furniture.Furniture;
import main.java.lesson4.inhumans.furniture.Table;

public class Lesson_4 {
    public static void main(String[] args) {
        Person p1 = new Person("Danil", 20);
        Person p2 = new Person("Danil", 20);
        Person p3 = new Person("Andrew", 20);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.toString());
        System.out.println(p1.hashCode());

        Furniture table1 = new Table(4,100, 50, "Coffee table");
        Chair chair1 = new Chair(4, 150, 80, "Tabouret", false);
        System.out.println(table1.getLegs());

        School school1 = new School("School_1", 2, 520, 16);
        System.out.println(school1.toString());
    }
}
