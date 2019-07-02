package main.java.lesson3;

import main.java.lesson3.humans.Student;
import main.java.lesson3.humans.Teacher;
import main.java.lesson3.inhumans.*;

public class Lesson_3 {
    public static void main(String[] args) {
        // Create students
        Student studs1[] = {newStudent(), newStudent(), newStudent(), newStudent(), newStudent()};
        Student studs2[] = {newStudent(), newStudent(), newStudent(), newStudent(), newStudent()};
        Student studs3[] = {newStudent(), newStudent(), newStudent(), newStudent(), newStudent()};

        // Create group
        Group grp1 = newGroup("ИТКН-16-7");
        Group grp2 = newGroup("ИТКН-16-8");
        Group grp3 = newGroup("ИТКН-16-9");

        // Create teachers
        Teacher teacher1 = newTeacher();
        Teacher teacher2 = newTeacher();
        Teacher teacher3 = newTeacher();
        Teacher teacher4 = newTeacher();
        Teacher teacher5 = newTeacher();

        // Create classroms
        Classroom room1 = new Classroom("Аудитория1", 1, "ЛК");
        Classroom room2 = new Classroom("Аудитория2", 2, "ПЗ");
        Classroom room3 = new Classroom("Аудитория3", 3, "ЛК");
        Classroom room4 = new Classroom("Аудитория4", 4, "ЛК");
        Classroom room5 = new Classroom("Аудитория5", 5, "ПЗ");

        // Create Pulpits
        Classroom tmpArrRooms[] = {room1, room2, room3};
        Teacher tmpArrTeachers[] = {teacher1, teacher2, teacher3};
        Group tmpArrGroups[] = {grp1, grp2};

        Classroom tmpArrRooms2[] = {room4, room5};
        Teacher tmpArrTeachers2[] = {teacher4, teacher5};
        Group tmpArrGroups2[] = {grp3};

        Pulpit pulpit1 = new Pulpit("ИИ", tmpArrRooms, tmpArrTeachers, tmpArrGroups);
        Pulpit pulpit2 = new Pulpit("СТ", tmpArrRooms2, tmpArrTeachers2, tmpArrGroups2);

        // Create Faculty
        Pulpit tmpArrPulpits[] = {pulpit1, pulpit2};
        Faculty faculty1 = new Faculty("КН", tmpArrPulpits);

        printStructure(faculty1);

        Group tmpArrGroupsEvent1[] = {grp1, grp2};
        Event event1 = new Event(tmpArrGroupsEvent1, room1);
        Group tmpAttGroupsEvent1_2[] = {grp3};
        Event event1_2 = new Event(tmpAttGroupsEvent1_2, room2);

        Event arrEvents1[] = {event1, event1_2};
        Couple couple1 = new Couple(arrEvents1);

        Group tmpArrGroupsEvent2[] = {grp1};
        Event event2 = new Event(tmpArrGroupsEvent2, room3);
        Group tmpAttGroupsEvent2_2[] = {grp2};
        Event event2_2 = new Event(tmpAttGroupsEvent2_2, room2);
        Group tmpAttGroupsEvent2_3[] = {grp3};
        Event event2_3 = new Event(tmpAttGroupsEvent2_3, room1);

        Event arrEvents2[] = {event2, event2_2, event2_3};
        Couple couple2 = new Couple(arrEvents2);

        Group tmpArrGroupsEvent3[] = {grp2};
        Event event3 = new Event(tmpArrGroupsEvent3, room4);
        Group tmpAttGroupsEvent3_2[] = {grp3};
        Event event3_2 = new Event(tmpAttGroupsEvent3_2, room5);

        Event arrEvents3[] = {event3, event3_2};
        Couple couple3 = new Couple(arrEvents3);

        Group tmpArrGroupsEvent4[] = {grp3};
        Event event4 = new Event(tmpArrGroupsEvent4, room2);

        Event arrEvents4[] = {event4};
        Couple couple4 = new Couple(arrEvents4);

        Couple couples[] = {couple1, couple2, couple3, couple4};
        Timetable timetable = new Timetable(couples);

        printTimetable(timetable);
        //printTimetableRoom(timetable, room1);
    }

    /**
     * @return new Student
     */
    public static Student newStudent() {

        String tempRandomName[] = {"Алиса", "Николай", "Владимир", "Надежда", "Марина", "Стас", "Данил",
                "Диана", "Виталий", "Алина", "Андрей", "Иван", "Александр"};
        String tempRandomLastName[] = {"Петров", "Иванов", "Сидоров"};

        Student stud = new Student();
        stud.setFirsName(tempRandomName[(int) (Math.random() * tempRandomName.length)]);
        stud.setLastName(tempRandomLastName[(int) (Math.random() * tempRandomLastName.length)]);
        stud.setAge(10 + (int) (Math.random() * 16));

        return stud;
    }

    /**
     * @return new Teacher
     */
    public static Teacher newTeacher() {

        String tempRandomName[] = {"Алиса", "Николай", "Владимир", "Надежда", "Марина", "Стас", "Данил",
                "Диана", "Виталий", "Алина", "Андрей", "Иван", "Александр"};
        String tempRandomLastName[] = {"Николаенко", "Петренко", "Дорох", "Васильченко"};

        Teacher teacher = new Teacher();
        teacher.setFirsName(tempRandomName[(int) (Math.random() * tempRandomName.length)]);
        teacher.setLastName(tempRandomLastName[(int) (Math.random() * tempRandomLastName.length)]);
        teacher.setAge(30 + (int) (Math.random() * 40));

        return teacher;
    }

    /**
     * @param name
     * @return new Group
     */
    public static Group newGroup(String name) {
        Student tempStuds[] = {newStudent(), newStudent(), newStudent(), newStudent(), newStudent()};
        Group grp = new Group(name, tempStuds);

        return grp;
    }

    /**
     * Used it to Print University Structure
     *
     * @param faculty
     */
    public static void printStructure(Faculty faculty) {
        System.out.println("1. Факультет: " + faculty.getTitle());

        Pulpit pulpits[] = faculty.getPulpits();

        for (int i = 0; i < pulpits.length; i++) {
            System.out.println("\t2. Кафедра: " + pulpits[i].getTitle());
            Pulpit tmpPulpits = pulpits[i];

            Classroom tmpRooms[] = tmpPulpits.getRooms();
            System.out.print("\t\t3. Аудитории при кафедре: ");

            // Print Title Rooms
            for (int j = 0; j < tmpRooms.length; j++) {
                System.out.print(tmpRooms[j].getTitle() + ", ");
            }

            // Print Teachers Full Name
            Teacher tmpTeachers[] = tmpPulpits.getTeachers();
            System.out.println();
            System.out.print("\t\t3. Преподаватели при кафедре: ");
            for (int j = 0; j < tmpTeachers.length; j++) {
                System.out.print(tmpTeachers[j].getFirsName() + " " + tmpTeachers[j].getLastName() + ", ");
            }

            // Print Title Groups
            Group tmpGroups[] = tmpPulpits.getGroups();
            System.out.println();
            System.out.println("\t\t3. Группы при кафедре: ");
            for (int j = 0; j < tmpGroups.length; j++) {
                System.out.println("\t\t\t4. " + tmpGroups[j].getTitle() + ", студенты:");

                // Print Studs Full Name
                Student tmpStuds[] = tmpGroups[j].getStuds();
                for (int z = 0; z < tmpStuds.length; z++) {
                    System.out.print(tmpStuds[z].getFirsName() + " " + tmpStuds[z].getLastName() + ", ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void printTimetable(Timetable timetable) {
        Couple couples[] = timetable.getCouples();
        for (int i = 0; i < couples.length; i++) {

            System.out.println("Пара: " + (i + 1));
            Event events[] = couples[i].getEvents();

            for (int j = 0; j < events.length; j++) {
                Group groups[] = events[j].getGroups();

                for (int z = 0; z < groups.length; z++) {
                    System.out.println("\t" + groups[z].getTitle());
                }
                System.out.println("\t" + events[j].getRoom().getTitle());
                System.out.println();
            }
        }
    }
}
