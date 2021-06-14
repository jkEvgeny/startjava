package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("male");

        wolf.setName("Petya");
        wolf.setColor("gray");
        wolf.setWeight(30);
        wolf.setAge(5);
        System.out.println(wolf);

        wolf.go();
        wolf.run();
        wolf.howl();
        wolf.hunt();
        wolf.sit();
    }
}