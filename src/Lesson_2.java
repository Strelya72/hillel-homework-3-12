public class Lesson_2 {

    public static void main(String[] args) {

        // Task 1,2
        System.out.println("Task 1-2");
        Student studs[] = {newStudent(), newStudent(), newStudent(), newStudent(), newStudent(), newStudent()};
        for (int i = 0; i < studs.length; i++) {
            studs[i].printName();
        }
        System.out.println();

        // Task 3
        System.out.println("Task 3");
        sortByName(studs);

        for (int i = 0; i < studs.length; i++) {
            studs[i].printName();
        }
        System.out.println();

        // Task 4
        System.out.println("Task 4");
        for (int i = 0; i < studs.length; i++) {
            studs[i].printAge();
        }
        System.out.println();

        sortByAge(studs);

        for (int i = 0; i < studs.length; i++) {
            studs[i].printAge();
        }
        System.out.println();

        // Task 5
        System.out.println("Task 5");
        Student temp = findByName(studs, "ан");
        if (temp != null) {
            temp.printName();
        } else {
            System.out.println("Task 5 - No match found");
        }
        System.out.println();

        // Task 6
        System.out.println("Task 6");
        Student findArray[] = findAllByName(studs, "ан");
        if (findArray != null) {
            for (int i = 0; i < findArray.length; i++) {
                findArray[i].printName();
            }
        } else {
            System.out.println("Task 5 - No match found");
        }
    }

    //Task 1
    public static class Student {

        String name;
        int age;

        void printName() {
            System.out.println(name);
        }

        void printAge() {
            System.out.println(age);
        }

    }

    //Task 2
    public static Student newStudent() {

        String tempRandomName[] = {"Алиса", "Николай", "Владимир", "Надежда", "Марина", "Стас", "Данил",
                "Диана", "Виталий", "Алина", "Андрей", "Иван", "Александр"};

        Student stud = new Student();
        stud.name = tempRandomName[(int) (Math.random() * tempRandomName.length)];
        stud.age = 10 + (int) (Math.random() * 16);

        return stud;
    }

    //Task 3
    public static void sortByName(Student studs[]) {

        for (int i = 0; i < studs.length; i++) {
            for (int j = 0; j < studs.length - 1; j++) {
                if (studs[j].name.compareTo(studs[j + 1].name) > 0) {
                    Student tmp = studs[j];
                    studs[j] = studs[j + 1];
                    studs[j + 1] = tmp;
                }
            }
        }
    }

    //Task 4
    public static void sortByAge(Student studs[]) {

        for (int i = 0; i < studs.length; i++) {
            for (int j = 0; j < studs.length - 1; j++) {
                if (studs[j].age > studs[j + 1].age) {
                    Student tmp = studs[j];
                    studs[j] = studs[j + 1];
                    studs[j + 1] = tmp;
                }
            }
        }

    }

    //Task 5
    public static Student findByName(Student studs[], String str) {
        for (int i = 0; i < studs.length; i++) {
            if (studs[i].name.indexOf(str) != -1) {
                return studs[i];
            }
        }
        return null;
    }

    //Task 6
    public static Student[] findAllByName(Student studs[], String str) {

        int tempInt = 0;

        // Number of occurrence
        for (int i = 0; i < studs.length; i++) {
            if (studs[i].name.indexOf(str) != -1) {
                tempInt++;
            }
        }

        // Exception
        if (tempInt == 0) {
            return null;
        } else {
            Student tempStud[] = new Student[tempInt];

            tempInt = 0;
            for (int i = 0; i < studs.length; i++) {
                if (studs[i].name.indexOf(str) != -1) {
                    tempStud[tempInt] = studs[i];
                    tempInt++;
                }
            }
            return tempStud;
        }
    }
}
