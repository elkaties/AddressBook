package edu.pronina.addressbook;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AddressBookTest {

    private AddressBook contacts = new AddressBook();
    @Before
    public void setUpAddressBook() {
        contacts.addContact("Prokhorov", new Address("Lanskoye", "14", "1005"));
        contacts.addContact("Khorokhorin", new Address("Pargolavskaya", "11", "1"));
        contacts.addContact("Korneev", new Address("Lesnaya", "14", "7"));
        contacts.addContact("Klabukov", new Address("Pargolavskaya", "18", "5"));
    }


    @Test
    public void addContact() throws Exception {
        contacts.addContact("Pronina", new Address("Golykova", "86", "105"));
        assertEquals(new Address("Golykova", "86", "105"), contacts.getAddress("Pronina"));
    }

    @Test
    public void deleteContact() throws Exception {
        contacts.deleteContact("Prokhorov", new Address("Lanskoye", "14", "1005"));
        assertEquals(null, contacts.getAddress("Prokhorov"));
    }


    @Test
    public void changeContact() throws Exception {
        contacts.changeContact("Khorokhorin", new Address("Gubkin", "5", "28"));
        assertEquals(new Address("Gubkin", "5", "28"), contacts.getAddress("Khorokhorin"));
    }

    @Test
    public void getAddress() throws Exception {
        contacts.getAddress("Prokhorov");
        assertEquals(new Address("Lanskoye", "14", "1005"), contacts.getAddress("Prokhorov"));
    }

    @Test
    public void peopleSameStreet() throws Exception {
        List<String> listOfPeople = new ArrayList();
        listOfPeople.add("Khorokhorin");
        listOfPeople.add("Klabukov");
        assertEquals(listOfPeople, contacts.peopleSameStreet("Pargolavskaya"));

    }

    @Test
    public void peopleSameHouse() throws Exception {
        List<String> listOfPeople = new ArrayList();
        listOfPeople.add("Korneev");
        listOfPeople.add("Prokhorov");
        assertEquals(listOfPeople, contacts.peopleSameHouse("14"));

    }

}