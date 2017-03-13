package edu.pronina.addressbook;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AddressBook {
    private final Map<String, Address> contacts = new HashMap<String, Address>();


    public void addContact(String n, Address a) {
        this.contacts.put(n, a);
    }

    public void deleteContact(String n, Address a) {
        this.contacts.remove(n, a);
    }

    public void changeContact(String n, Address a) {
        this.contacts.put(n, a);
    }

    public Address getName(String n) {
        return (Address) this.contacts.get(n);
    }

    public List<String> peopleSameStreet (String nameOfStreet) {
        List<String> listOfPeople = new ArrayList<>();
        for (Map.Entry<String, Address> entry : contacts.entrySet()){
            Address address = entry.getValue();
            if (address.street.equals(nameOfStreet)) {
                listOfPeople.add(entry.getKey());
            }
        }
        return listOfPeople;
    }

    public List<String> peopleSameHouse (String numberOfHouse) {
        List<String> listOfPeople = new ArrayList<>();
        for (Map.Entry<String, Address> entry : contacts.entrySet()){
            Address address = entry.getValue();
            if (address.house.equals(numberOfHouse)) {
                listOfPeople.add(entry.getKey());
            }
        }
        return listOfPeople;
    }


    @Override
    public String toString() {
        return "AddressBook{" +
                "contacts=" + contacts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressBook that = (AddressBook) o;

        return contacts.equals(that.contacts);

    }

    @Override
    public int hashCode() {
        return contacts.hashCode();
    }
}
