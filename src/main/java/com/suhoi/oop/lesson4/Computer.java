package com.suhoi.oop.lesson4;

import com.suhoi.oop.lesson1.Ram;
import com.suhoi.oop.lesson1.Ssd;

public abstract class Computer {

    private Ssd ssd;
    private Ram ram;

    public Computer() {
        this.ssd = new Ssd(512);
        this.ram = new Ram(16);
    }

    public void hui(){
        System.out.println(ssd.getValue());
    }
    public abstract void load();
}
