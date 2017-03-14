package edu.pronina.addressbook;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressBookTest {

    private AddressBook contacts = new AddressBook();
    @Before
    public void setUp() throws Exception {


    }


    @Test
    public void addContact() throws Exception {
        contacts.addContact("Pronina", new Address("Golykova", "86", "105"));
    }

    @Test
    public void deleteContact() throws Exception {
    }

    @Test
    public void changeContact() throws Exception {

    }

    @Test
    public void getName() throws Exception {

    }

    @Test
    public void peopleSameStreet() throws Exception {

    }

    @Test
    public void peopleSameHouse() throws Exception {

    }

}