package com.startjava.lesson_2_3_4.person;

public class Person {
    public String sex = "male";
    public String name = "James";
    public String surname = "Bo";
    public int height = 130;
    public int weight = 15;
    public int age = 32;

    void go() {
        System.out.println("James goes");
    }

    void sit() {
        System.out.println("James sits");
    }

    void run() {
        System.out.println("James runs");
    }

    void speak() {
        System.out.println("James speaks");
    }

    boolean isLearningJava() {
        return true;
    }
}