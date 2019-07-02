package main.java.lesson8;

public class Contact {
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


    /**
     *
     * @param numberPhone
     * @param firstName
     * @param lastName
     */
    public Contact(String numberPhone, String firstName, String lastName) {
        iNumberPhone = numberPhone;
        iFirstName = firstName;
        iLastName = lastName;
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + (iNumberPhone == null ? 0 : iNumberPhone.hashCode());
        result = 31 * result + (iFirstName == null ? 0 : iFirstName.hashCode());
        result = 31 * result + (iLastName == null ? 0 : iLastName.hashCode());

        return result;
    }

    /**
     *
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
        return cont.iFirstName.equals(this.iFirstName) && cont.iLastName.equals(this.iLastName) && cont.iNumberPhone.equals(this.iNumberPhone);
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
}
