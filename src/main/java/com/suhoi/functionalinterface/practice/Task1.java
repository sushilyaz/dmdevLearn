package com.suhoi.functionalinterface.practice;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * Дан список целых чисел. Найти среднее всех
 * нечетных чисел, делящихся на 5
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(10, 23, 40, 31, 50, 44, 56, 77, 110, 35, 45);

        integers.stream()
                .mapToInt(Integer::intValue)
                .filter(number -> number % 5 == 0 && number % 2 != 0)
                .average()
                .ifPresent(System.out::println);
    }
}
