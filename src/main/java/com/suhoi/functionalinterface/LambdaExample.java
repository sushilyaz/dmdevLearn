package com.suhoi.functionalinterface;

import java.util.Comparator;

public class LambdaExample {
    public static void main(String[] args) {
        Comparator<Integer> comparator = Integer::compare;
        System.out.println(comparator.compare(1, 2));
    }
}
