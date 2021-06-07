package com.startjava.lesson_2_3.robot;
public class JaegerTest {
    public static void main(String[] args) {
        Jaeger mark6 = new Jaeger();
        Jaeger mark7 = new Jaeger();

        mark6.setModelName("Guardian Bravo");
        mark6.setMark("mark-6");
        mark6.setHeight(240f);
        mark6.setWeight(1975);

        mark7.setModelName("Saber Athena");
        mark7.setMark("mark-7");
        mark7.setHeight(252f);
        mark7.setWeight(1628);

        System.out.println(mark6.getModelName());
        System.out.println(mark7.getModelName());
        mark6.useVortexCannon();
        mark7.move();
    }
}
