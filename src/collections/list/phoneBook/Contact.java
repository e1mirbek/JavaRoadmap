package collections.list.phoneBook;

public class Contact {
    String name;
    String phoneNumber;

    Contact (String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return  name + " " + phoneNumber;
    }
}
