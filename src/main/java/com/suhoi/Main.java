package com.suhoi;

public class Main {
    public static void main(String[] args) {
        int value = 10;
        int[] array = {value, 120, 30};

        printArray(array);
    }

    private static void printArray(int[] array) {
        System.out.println(array);

        for (int element : array) {
            System.out.println(element);
        }
    }
}