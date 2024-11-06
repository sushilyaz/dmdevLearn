package com.suhoi.collections.lesson6;

import com.suhoi.collections.lesson4.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("14", "123", "678", "345");

        Collections.sort(stringList);
        System.out.println(stringList); // выведет 123, 14, 345, 678

        List<Person> personList = Arrays.asList(
                new Person(1, "john", "bishop"),
                new Person(4, "jack", "london"),
                new Person(3, "oscar", "wild")
        );
//        Collections.sort(personList); // сортировка по id
        personList.sort(Comparator.comparing(Person::getFirstName)); // сортировка по firstName
        System.out.println(personList);
    }
}
