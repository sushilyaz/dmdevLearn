package com.suhoi.functionalinterface;


import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66", "77", "88", "99");

        strings.stream()
                .map(value -> value + value)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
//                .sorted()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

//        for (String string : strings) {
//            String value = string + string;
//            Integer intValue = Integer.parseInt(value);
//            if (intValue % 2 == 0) {
//                System.out.println(intValue);
//            }
//        }
    }
}
