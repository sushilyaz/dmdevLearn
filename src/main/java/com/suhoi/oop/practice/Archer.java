package com.suhoi.oop.practice;

public class Archer extends Hero {

    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(String.format("%s стрельнул из лука %s", getName(), enemy.getName()));
        enemy.takeDamage(getDamage());
    }
}
