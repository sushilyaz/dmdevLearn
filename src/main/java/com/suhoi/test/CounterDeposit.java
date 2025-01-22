package com.suhoi.test;

public class CounterDeposit {
    public static void main(String[] args) {
        // Стартовый депозит
        int startDeposit = 100;
        // Цель
        int endDeposit = 10000;
        // Процент для повышения объема
        int percent = 10;

        int bufDeposit = startDeposit;
        int currentDeposit = bufDeposit;
        int count = 0;

        while (endDeposit >= currentDeposit) {
            count++;
            bufDeposit = currentDeposit;
            int increaseSum = bufDeposit * percent/100;
            currentDeposit = currentDeposit + increaseSum;
            System.out.printf("Депозит: %s$. Надо заработать для повышения: %s$", currentDeposit, currentDeposit*percent/100);
            System.out.println();
        }
        System.out.printf("Общее число итераций: %s \nПроцент повышения: %s%% \nСтартовый депозит: %s$\nКонечная цель: %s$", count, percent, startDeposit, endDeposit);
        System.out.println();
    }
}
