package com.kobe.practice.optional;

import org.junit.Test;

import java.util.Optional;

public class PersonTest {

    @Test
    public void test1() throws Exception {
        Person p = new Person();
        p.setName("kobe");
        String city = getCity(p);
        System.out.println(city);
    }

    private String getCity(Person p) throws Exception {

        return Optional.ofNullable(p)
                .map(u -> u.getAddress())
                .map(a -> a.getCity())
                .orElseThrow(() -> new Exception("城市为空"));
    }

    /*private String getCity(Person p) throws Exception {
        if (p != null) {
            if (p.getAddress() != null) {
                Address address = p.getAddress();
                if (address.getCity() != null) {
                    return address.getCity();
                }
            }
        }
        throw new Exception("城市为空");
    }*/


}
