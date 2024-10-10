package com.suhoi.oop.practice;

public class Archer<T> extends Hero<T> {

    public Archer(String name, T weapon) {
        super(name, weapon);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(String.format("%s стрельнул из лука %s", getName(), enemy.getName()));
    }
}
