package com.suhoi.oop.practice;

public class Enemy implements Mortal{
    private int health;
    private String name;

    public Enemy(int health, String name) {
        this.health = health;
        this.name = name;
    }


    public void takeDamage(int damage) {
        this.health -= Math.min(health, damage);
        System.out.println(String.format("%s damage has been taken damage %s. Health left: %s ", name, damage, health));
    }



    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
