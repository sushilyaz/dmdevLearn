package com.suhoi.generics.lesson1;

public class List<T> {
    private T[] elements;
    private int size;

    public List(int initialSize) {
        this.elements = (T[]) new Object[initialSize];
    }

    public void add(T element) {
        elements[size++] = element;
    }

    public Object get(int index) {
        return elements[index];
    }

    public int getSize() {
        return size;
    }
}
