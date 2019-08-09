package com.kobe.practice.optional;

import java.util.Optional;

public class OptionalTest4 {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("kobe");
        person = null;
        System.out.println(getScoreByPersonOld(person));
        System.out.println(getScoreByPersonNew(person));

    }

    private static Integer getScoreByPersonNew(Person person) {
        return Optional.ofNullable(person)
                .map(p -> {
                    if ("kobe".equals(p.getName())) {
                        return 100;
                    }
                    return 99;
                })
                .orElse(11);

    }

    private static Integer getScoreByPersonOld(Person person) {

        if (person != null) {
            String name = person.getName();
            if ("kobe".equals(name)) {
                return 100;
            } else {
                return 99;
            }
        }

        return 11;
    }

}
