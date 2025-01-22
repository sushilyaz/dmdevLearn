package com.suhoi.exceptions.lesson1.practice;

public class Task1 {
    public static void main(String[] args) {
        Integer value = null;

        try {
            double v = value.doubleValue();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
