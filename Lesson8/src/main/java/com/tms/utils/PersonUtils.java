package com.tms.utils;

import MilitaryOffice.Address;
import MilitaryOffice.Person;

import static com.tms.utils.Constants.FEMALE;
import static com.tms.utils.Constants.MALE;

public class PersonUtils {
    public static Person[] createPersons() {
        Person[] people = new Person[5];
        {
            Person person = new Person("Konstantin", 23, MALE, new Address("Minsk"));
            people[0] = person;
        }
        {
            Person person = new Person("Alexander", 25, MALE, new Address("Mogilev"));
            people[1] = person;
        }
        {
            Person person = new Person("Vika", 22, FEMALE, new Address("Litva", "Kaunas"));
            people[2] = person;
        }
        {
            Person person = new Person("Vadim", 18, MALE, new Address("Vitebsk"));
            people[3] = person;
        }
        {
            Person person = new Person("Dmitry", 19, MALE, new Address("Grodno"));
            people[4] = person;

        }

        return people;
    }
}
