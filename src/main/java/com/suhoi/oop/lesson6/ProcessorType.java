package com.suhoi.oop.lesson6;

public enum ProcessorType {
    BIT_64("bit-64") {
        @Override
        public String getDescription() {
            return "this is a 64 bit bit-64 processor";
        }
    },
    BIT_32("bit-32") {
        @Override
        public String getDescription() {
            return "this is a 32 bit bit-32 processor";
        }
    },;

    private String name;

    ProcessorType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getDescription();
}
