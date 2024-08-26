package com.suhoi.stringlesson;

public class StringRunner {
    public static void main(String[] args) {
        StringObject s1 = new StringObject("a1", "b1", "c1");
        StringObject s2 = new StringObject("a1", "b1", "c1");
        StringObject s3 = new StringObject("a3", "b3", "c3");
        StringObject s4 = s1;
        String s5 = s1.toString();

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}
