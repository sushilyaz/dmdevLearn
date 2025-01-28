package com.suhoi.functionalinterface.practice;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * Дана Map<String, Integer>
 * Найти сумму всех значений, длина ключей которых меньше 7 символов
 */
public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = Map.of(
                "string123", 5,
                "string", 6,
                "stringadsad", 10,
                "strin", 2,
                "stromgsfdf", 10
        );

        Integer reduce = stringIntegerMap.keySet().stream()
                .filter(key -> key.length() < 7)
                .reduce(0, (sum, key) -> sum + stringIntegerMap.get(key), Integer::sum);
        System.out.println(reduce);
    }
}
