package com.suhoi.collections.lesson4;

import java.util.HashSet;
import java.util.Set;

/**
 * Пример, если переопределен только equals
 */
public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car(1, "BMW");
        Car car2 = new Car(1, "BMW");
        System.out.println(car1.equals(car2)); // будут равны

        // Но если используем коллекцию, работа которой основана на хеше, то получается,
        // что мы добавляем разные объекты
        Set<Car> carSet = new HashSet<>();
        carSet.add(car1);
        carSet.add(car2);
        System.out.println(carSet.size()); // выведет 2
    }
}
