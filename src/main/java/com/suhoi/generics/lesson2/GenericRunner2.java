package com.suhoi.generics.lesson2;

import com.suhoi.oop.practice.Archer;
import com.suhoi.oop.practice.Enemy;
import com.suhoi.oop.practice.Mage;
import com.suhoi.oop.practice.weapon.Bow;
import com.suhoi.oop.practice.weapon.MagicWand;
import com.suhoi.oop.practice.weapon.impl.BowImpl;
import com.suhoi.oop.practice.weapon.impl.MagicWandImpl;

public class GenericRunner2 {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("хуй", new BowImpl());
        Bow weapon = archer.getWeapon();
        System.out.println(weapon.getDamage());

        Mage<MagicWand> antimage = new Mage<>("antimage", new MagicWandImpl());
        System.out.println(antimage.getWeapon().getDamage());

        Enemy enemy = new Enemy(100, "lesogor");
        antimage.attackEnemy(enemy);
    }
}
