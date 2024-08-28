package com.suhoi.oop.lesson3;

public class Computer {
     int ssd = 500;
     int ram = 1024;

     public void loadClass() {
          System.out.println("Я загрузился");
          testStatic();
     }

     public boolean loadClass(String value) {
          System.out.println("Я загрузился");
          if (value.isEmpty()) {
               return false;
          } else {
               return true;
          }
     }

     public static void testStatic() {
          System.out.println("static");
     }
}
