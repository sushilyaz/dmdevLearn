package com.suhoi.oop.lesson2;

public class Laptop extends Computer {

    private int display;

    {
        System.out.println("Laptop init");
    }

    static {
        System.out.println("Laptop static init");
    }

    public Laptop(int display, int ram) {
        super(ram);
        System.out.println("Laptop constructor");
        this.display = display;
    }
}
