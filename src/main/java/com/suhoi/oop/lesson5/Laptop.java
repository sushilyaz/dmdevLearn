package com.suhoi.oop.lesson5;

import com.suhoi.oop.lesson1.Ram;
import com.suhoi.oop.lesson1.Ssd;

public class Laptop implements Printable{
    private final Ssd ssd;
    private final Ram ram;

    public Laptop(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    @Override
    public void print() {
        System.out.println("Laptop print");
    }
}
