package main.java.lesson4.humans;

/**
 * Used to create man
 */
public class Person {
    /**
     * @field name like "Danil"
     * @field age like 20
     */
    String name;
    int age;

    /**
     * @param name like "Danil"
     * @param age  lile 20
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        Person p = (Person) o;
        return p.name.equals(name) && p.age == age;
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + name.hashCode();
        result = prime * result + age;
        return result;
    }
}
