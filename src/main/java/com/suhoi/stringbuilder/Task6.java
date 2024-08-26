package com.suhoi.stringbuilder;

public class Task6 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder value = new StringBuilder();
//        StringBuffer - конкурентная реализация билдера
        for (int i = 0; i < 100_000; i++) {
            value.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime));
    }
}
