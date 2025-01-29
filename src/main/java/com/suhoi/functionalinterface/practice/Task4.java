package com.suhoi.functionalinterface.practice;

import java.util.List;
import java.util.stream.IntStream;

/**
 * Дан список целых чисел, вывести строку,
 * представляющую собой конкатенацию строковых представлений этих чисел.
 * Пример: список [5, 2, 4, 2, 1]
 * Результат: "52421"
 */
public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 4, 2, 1);

        String result = numbers.stream()
                .map(String::valueOf)
                .reduce("", (a, b) -> a + b);

        System.out.println(result);
    }
}
