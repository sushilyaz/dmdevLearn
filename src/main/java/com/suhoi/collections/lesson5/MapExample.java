package com.suhoi.collections.lesson5;

import com.suhoi.collections.lesson4.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person ivan1 = new Person(1, "Ivan", "Zolo");
        Person ivan2 = new Person(1, "Ivan", "Zolo");
        Person petr = new Person(2, "Petr", "Petrov");

        Map<Integer, Person> map = new HashMap<>();

        map.put(ivan1.getId(), ivan1);
        map.put(petr.getId(), petr);
        System.out.println(map);
    }
}
