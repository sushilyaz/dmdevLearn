package com.suhoi.oop.practice;

public class Warrior<T> extends Hero<T> {

    public Warrior(String name, T weapon) {
        super(name, weapon);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(String.format("%s удар мечом %s", getName(), enemy.getName()));
    }
}
