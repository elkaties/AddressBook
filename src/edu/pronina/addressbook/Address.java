package edu.pronina.addressbook;


public class Address {
    String street;
    String house;
    private String flat;

    Address(String street, String house, String flat) {
        this.house = house;
        this.street = street;
        this.flat = flat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (!street.equals(address.street)) return false;
        if (!house.equals(address.house)) return false;
        return flat.equals(address.flat);

    }

    @Override
    public int hashCode() {
        int result = street.hashCode();
        result = 31 * result + house.hashCode();
        result = 31 * result + flat.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}

