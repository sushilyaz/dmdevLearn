package com.suhoi.oop.lesson5;

public class Mobile implements Printable{
    private final int display;

    public Mobile(int display) {
        this.display = display;
    }

    @Override
    public void print() {
        System.out.println("Mobile print");
    }
}
