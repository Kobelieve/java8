package com.kobe.practice.optional;

import java.util.Optional;

public class FlatmapDemo {

    public static void main(String[] args) {
        Person person = new Person();
        String city = queryCity(person);
        System.out.println(city);
        Optional<String> optionalS = queryOptionalCity(person);
    }

    private static Optional<String> queryOptionalCity(Person person) {
        return Optional.ofNullable(person)
                .map(p -> p.getAddress())
                .flatMap(a -> Optional.ofNullable(a.getCity()));
    }

    private static String queryCity(Person person) {
        return Optional.ofNullable(person)
                .map(p -> p.getAddress())
                .map(a -> a.getCity())
                .orElse("sos");
    }


}
