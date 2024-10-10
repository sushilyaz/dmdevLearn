package com.suhoi.oop.practice;

import com.suhoi.oop.practice.weapon.MagicWand;

public class Mage<T extends MagicWand> extends Hero<T> {
    public Mage(String name, T weapon) {
        super(name, weapon);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(String.format("%s ебанул заклинание %s", getName(), enemy.getName()));
        enemy.takeDamage(getWeapon().getDamage());
    }
}
