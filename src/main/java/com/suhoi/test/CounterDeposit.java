package com.suhoi.test;

public class CounterDeposit {
    public static void main(String[] args) {
        int startDeposit = 100;
        int endDeposit = 10000;
        int percent = 10;

        int bufDeposit = startDeposit;
        int currentDeposit = bufDeposit;
        int count = 0;

        while (endDeposit >= currentDeposit) {
            count++;
            bufDeposit = currentDeposit;
            currentDeposit = currentDeposit + (bufDeposit * percent/100);
            System.out.println(currentDeposit);
        }
        System.out.printf("Общее число итераций: %s \nПроцент повышения: %s\nСтартовый депозит: %s\nКонечная цель: %s", count, percent, startDeposit, endDeposit);
        System.out.println();
    }
}
