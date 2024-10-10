package com.suhoi.oop.practice;

public class TrainingGround {
    public static void main(String[] args) {
//        Hero warrior = new Warrior("suhoi", 20);
//        Hero archer = new Archer("suhoi", 10);
//        Hero mage = new Mage("suhoi", 30);
        Enemy enemy = new Enemy(100,"Зомби");
//        attackEnemy(enemy, warrior, archer, mage);
    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        for (Hero hero : heroes) {
            hero.attackEnemy(enemy);
        }
    }
}
