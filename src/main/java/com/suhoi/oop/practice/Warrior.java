package com.suhoi.oop.practice;

public class Warrior extends Hero {

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(String.format("%s удар мечом %s", getName(), enemy.getName()));
        enemy.takeDamage(getDamage());
    }
}
