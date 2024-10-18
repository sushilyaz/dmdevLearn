package com.suhoi.generics.testgenerics;

import com.suhoi.generics.testgenerics.classes.Animal;
import com.suhoi.generics.testgenerics.classes.Cat;
import com.suhoi.generics.testgenerics.classes.Dog;

import java.util.ArrayList;
import java.util.List;

public class GenericRunner3 {
    // Producer Extends: извлечение объектов
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

    public static void addAnimal (List<? super Dog> animals) {
        animals.add(new Dog("Zalupa"));
        System.out.println(animals.get(0));
    }
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("sex"));
        addAnimal(dogs);
        printAnimals(dogs);
    }
}
