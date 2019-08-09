package com.kobe.practice.optional;

import java.util.Optional;

public class OptionalTest3 {

    public static void main(String[] args) {

        Person p = new Person();
        Address address = new Address();
        address.setCity("New York");
        p.setAddress(address);
        System.out.println(getAddressByPersonNew(p));
        System.out.println(getAddressByPersonOld(p));

    }

    private static String getAddressByPersonNew(Person p) {
        return Optional.ofNullable(p)
                .map(person -> person.getAddress())
                .map(address -> address.getCity())
                .orElse("unknow");
    }

    private static String getAddressByPersonOld(Person p) {

        if (p != null) {
            Address address = p.getAddress();
            if (address != null) {
                String city = address.getCity();
                if (city != null) {
                    return city;
                } else {
                    return "unknow";
                }
            }
        }

        return "a";
    }


}
