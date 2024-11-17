package com.suhoi.collections.lesson7;

import com.suhoi.collections.lesson4.Person;

import java.util.*;

public class TreeMapRunner {
    public static void main(String[] args) {
        Person ilya = new Person(26, "ilya", "Zolo");
        Person andrey = new Person(3, "andrey", "sdfsd");
        Person petr = new Person(1, "Petr", "Petrov");
        Person ivan = new Person(5, "ivan", "123da");
        Person vitya = new Person(34, "vitya", "asd");

        Map<Integer, Person> map = new TreeMap<>();
        // Сортировка осуществляется засчет переопределения метода compareTo(для этого надо имплементировать интерфейс Comparable) или передать значение
        // сложность log(n), благодаря алгоритму КЧД. Балансировка осуцществляется засчет метода fixAfterInsertion
        map.put(ilya.getId(), ilya);
        map.put(andrey.getId(), andrey);
        map.put(petr.getId(), petr);
        map.put(ivan.getId(), ivan);
        map.put(vitya.getId(), vitya);
        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        TreeMap<Integer, Person> treeMap = new TreeMap<>(map);
    }
}
