package com.suhoi.functionalinterface.practice;

import java.util.Comparator;
import java.util.List;

/**
 * Дан класс Person с полями firstName, lastName, age.
 * Вывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов
 */
public class Task5 {
    public static void main(String[] args) {
        Person person1 = new Person("raz", "raz", 5);
        Person person2 = new Person("dvaasdasdadsdasdasdasdadsasdasdasd", "raz", 10);
        Person person3 = new Person("dvaasdasdadsdasasdq33434234dasdasdadsasdasdasd", "raz", 11);
        Person person4 = new Person("dva", "dva", 10);
        List<Person> persons = List.of(person1, person2, person3, person4);

        persons.stream()
                .filter(person -> person.getFirstName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

    }


}
