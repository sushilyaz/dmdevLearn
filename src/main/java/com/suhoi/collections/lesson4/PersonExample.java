package com.suhoi.collections.lesson4;

public class PersonExample {
    public static void main(String[] args) {
        Person ivan1 = new Person(1, "Ivan", "Zolo");
        Person ivan2 = new Person(1, "Ivan", "Zolo");
        Person petr = new Person(1, "Petr", "Petrov");

        System.out.println(ivan1.equals(ivan2));
        System.out.println(ivan1.hashCode());
        System.out.println(ivan2.hashCode());
        System.out.println(petr.hashCode());
        System.out.println(ivan1.equals(petr));
    }
}
