package main.java.lesson10;

import java.io.Serializable;
import java.util.Comparator;

public class Contact implements Serializable {
    /**
     * String Contact Number like '+380997186857'
     */
    private String iNumberPhone;
    /**
     * String Contact First Name like 'Ivan'
     */
    private String iFirstName;
    /**
     * String Contact Last Name like 'Petrov'
     */
    private String iLastName;

    private int iAge;



    /**
     * @param numberPhone
     * @param firstName
     * @param lastName
     */
    public Contact(String numberPhone, String firstName, String lastName, int age) {
        iNumberPhone = numberPhone;
        iFirstName = firstName;
        iLastName = lastName;
        iAge = age;
    }


    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + (iNumberPhone == null ? 0 : iNumberPhone.hashCode());
        result = 31 * result + (iFirstName == null ? 0 : iFirstName.hashCode());
        result = 31 * result + (iLastName == null ? 0 : iLastName.hashCode());
        result = 31 * result + Integer.hashCode(iAge);

        return result;
    }

    /**
     * @param o
     * @return True or False if all fields of objects are equal.
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Contact)) {
            return false;
        }
        Contact cont = (Contact) o;
        return cont.iFirstName.equals(this.iFirstName) && cont.iLastName.equals(this.iLastName)
                && cont.iNumberPhone.equals(this.iNumberPhone) && cont.iAge == this.iAge;
    }

    public String getNumber() {
        return iNumberPhone;
    }

    public String getFirstName() {
        return iFirstName;
    }

    public String getLastName() {
        return iLastName;
    }

    public int getAge() {
        return iAge;
    }

    public static Comparator<Contact> compareByName() {
        ComparatorAge comparator = new ComparatorAge();
        return comparator.compareByName();
    }

    public static Comparator<Contact> compareByPhoneNumber() {
        ComparatorAge comparator = new ComparatorAge();
        return comparator.compareByPhoneNumber();
    }

    public static Comparator<Contact> compareByAge() {
        ComparatorAge comparator = new ComparatorAge();
        return comparator.compareByAge();
    }

    private static class ComparatorAge {

        Comparator<Contact> comparator;

        Comparator<Contact> compareByAge() {
            comparator = new Comparator<Contact>() {
                @Override
                public int compare(Contact o1, Contact o2) {
                    return Integer.compare(o1.iAge, o2.iAge);
                }
            };

            return comparator;
        }

        Comparator<Contact> compareByPhoneNumber() {
            comparator = new Comparator<Contact>() {
                @Override
                public int compare(Contact o1, Contact o2) {
                    return o1.iNumberPhone.compareTo(o2.iNumberPhone);
                }
            };

            return comparator;
        }

        Comparator<Contact> compareByName() {
            comparator = new Comparator<Contact>() {
                @Override
                public int compare(Contact o1, Contact o2) {
                    return o1.iFirstName.compareTo(o2.iFirstName);
                }
            };

            return comparator;
        }

    }

}
