package com.suhoi.oop.lesson1;

public class OopRunner {
    public static void main(String[] args) {

        Ram ram = new Ram(16);

        Ssd ssd = new Ssd(512);

        Computer computer = new Computer(ssd, ram);

        computer.load();

        Laptop laptop = new Laptop(new Ssd(128), new Ram(8), 4);

        laptop.load();
        laptop.open();
    }
}
