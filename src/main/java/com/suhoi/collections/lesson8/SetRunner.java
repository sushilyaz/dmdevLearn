package com.suhoi.collections.lesson8;

import java.util.HashSet;
import java.util.Set;

public class SetRunner {
    public static void main(String[] args) {
        // HashSet под капотом использует HashMap, просто значение добавляется в качестве ключа, а в качестве значения добавляется new Object, который final static
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("B");
        // вернет 3, т.к. "B" повторяется
        System.out.println(set.size());
    }
}
