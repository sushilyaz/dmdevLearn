package com.suhoi.generics.lesson1;

public class GenericRunner {
    public static void main(String[] args) {
        List<String> list = new List<>(10);
        list.add("String1");
        list.add("String3");

        Object o = list.get(1);
        System.out.println(o);
    }
}
