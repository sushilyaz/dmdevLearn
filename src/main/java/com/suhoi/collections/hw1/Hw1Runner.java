package com.suhoi.collections.hw1;

import java.util.*;

/**
 * 1. Написать метод markLength4, принимающий в качестве
 * параметра список (List) строк и размещающий строку "****"
 * перед каждым четырёхсимвольным элементом.
 * Оригинальные элементы должны остаться на месте.
 * Например:
 * {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}
 * ->
 * {"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****",
 * "Java", "programmer"}
 */
public class Hw1Runner {
    public static void main(String[] args) {
        List<String> list= new LinkedList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));

        List<String> result = markLength4(list);
        System.out.println(result);
    }

    private static List<String> markLength4(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String bufValue = iterator.next();
            if (bufValue.length() == 4) {
                iterator.set("****");
                iterator.add(bufValue);
            }
        }
        return list;
    }
}
