package com.suhoi.collections.lesson3;

import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
//
//        for (int i = 0; i < list.size(); i++) {
//            Integer integer = list.get(i);
//        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}
