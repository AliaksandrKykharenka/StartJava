package com.startjava.lesson_2_3_4.person;

public class Person {
    String sex = "male";
    String name = "Alex";
    int height = 175;
    int weight = 74;
    int age = 35;

    void run() {
        System.out.println(sex + " is running");
    }

    void sit() {
        System.out.println(sex + " is sitting");
    }

    void walk() {
        System.out.println(sex + " is walking");
    }

    void speak() {
        System.out.println(sex + " is speaking");
    }

    void learJava() {
        System.out.println(sex + " is learning Java");
    }
}
