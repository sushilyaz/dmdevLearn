package com.suhoi.collections.lesson1;


import java.util.ArrayList;
import java.util.List;

public class ArrayListRunner {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        /*
        Смотреть в дебаге, поставить breakpoint на реализации .add в ArrayList,
        чтобы посмотреть как увеличивается размер коллекции
         */
        list.add(1);
        list.add(6);
        System.out.println();
    }
}
