package com.suhoi.oop.practice;

public abstract class Hero<T> {

    private final String name;

    private T weapon;

    public Hero(String name, T weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public T getWeapon() {
        return weapon;
    }

    public abstract void attackEnemy(Enemy enemy);
}
