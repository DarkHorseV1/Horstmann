package inc.brocorp;

import java.util.LinkedList;

public class SavingUserObjects {
    public static void main(String[] args) {
        LinkedList<AddressBook> addressBook = new LinkedList<>();
        addressBook.add(new AddressBook("Phillip", "Fray", "NewYork", "Brooklin", 17));
        addressBook.add(new AddressBook("Billie", "Eillish", "NewJercy", "Mikhael Bay street", 12));
        addressBook.add(new AddressBook("Dimash", "Khydaibergenov", "Nyrsultan", "Nyrsultan street", 1));
        addressBook.add(new AddressBook("Vladimir", "Putin", "Moscow", "Lenin street", 1));
        System.out.println(addressBook);
    }
}

class AddressBook {
    private String name;
    private String surname;
    private String city;
    private String street;
    private int houseNumber;

    public AddressBook(String name, String surname, String city, String street, int houseNumber) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String toString() {
        return "\n\n" + name + " " + surname +
                "\nCity: " + city +
                "\nAddress: " + street + " \"" + houseNumber + "\"";
    }
}