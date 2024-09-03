package com.suhoi.oop.lesson5;

import com.suhoi.oop.lesson1.Ram;
import com.suhoi.oop.lesson1.Ssd;

public class OopLessonRunner {
    public static void main(String[] args) {
        Printable laptop = new Laptop(new Ssd(4), new Ram(4));
        Printable mobile = new Mobile(100);

        print(laptop, mobile);
        System.out.println();
        System.out.println();
        randomPrint(laptop, mobile);
        System.out.println();
        System.out.println();
    }

    public static void print(Printable... objects) {
        for (Printable object : objects) {
            object.print();
        }
    }

    public static void randomPrint(Printable... objects) {
        for (Printable object : objects) {
            object.printWithRandom();
        }
    }
}

