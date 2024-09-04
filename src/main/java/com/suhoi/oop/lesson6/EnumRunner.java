package com.suhoi.oop.lesson6;

public class EnumRunner {
    public static void main(String[] args) {
        ProcessorType processorType32 = ProcessorType.BIT_32;
        ProcessorType processorType64 = ProcessorType.BIT_64;
        System.out.println(processorType32.getName());
        System.out.println(processorType32.getDescription());
        System.out.println(processorType64.getName());
        System.out.println(processorType64.getDescription());
    }
}
