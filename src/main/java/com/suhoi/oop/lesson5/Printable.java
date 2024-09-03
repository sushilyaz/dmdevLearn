package com.suhoi.oop.lesson5;

import java.util.Random;

public interface Printable {
    String SOME_VALUE = "Some Value";
    Random RANDOM = new Random();

    default void printWithRandom() {
        System.out.println(RANDOM.nextInt());
        print();
        getRandomInt(4, 10);
    }

    static int getRandomInt(int min, int max) {
        return min + RANDOM.nextInt(max - min);
    }

    void print();
}
