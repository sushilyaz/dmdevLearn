package com.suhoi.oop.lesson1;

public class Laptop extends Computer {

    private int weight;

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    public void open() {
        System.out.println("Laptop open");
    }
}
