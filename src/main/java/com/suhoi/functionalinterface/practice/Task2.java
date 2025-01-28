package com.suhoi.functionalinterface.practice;

import java.util.List;

/**
 * Дан список строк.
 * Найти количество уникальных строк длиной более 8 символов
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of("sdf", "girgj", "sdiwerdfk", "iwejflsidjflskdjf", "sdifjoiwehjrosijflsdjf", "iwejflsidjflskdjf");

        long count = strings.stream()
                .filter(element -> element.length() > 8)
                .distinct()
                .count();
        System.out.println(count);
    }
}
