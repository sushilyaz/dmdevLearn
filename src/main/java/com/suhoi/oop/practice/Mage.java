package com.suhoi.oop.practice;

public class Mage extends Hero {
    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(String.format("%s ебанул заклинание %s", getName(), enemy.getName()));
        enemy.takeDamage(getDamage());
    }
}
