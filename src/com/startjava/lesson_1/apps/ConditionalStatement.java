package com.startjava.lesson_1.apps;
public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 20;
        if (age > 20) System.out.println("возраст > 20");

        boolean sex = true;
        if (sex) System.out.println("пол мужской");
        if (!sex) System.out.println("пол женский");

        double height = 1.80;
        if (height < 1.80) {
            System.out.println("рост < 1.80");
        } else {
            System.out.println("рост >= 1.80");
        }

        char firstLitOfName = 'I';
        if (firstLitOfName == 'M') {
            System.out.println("первая Буква Имени M");
        } else if (firstLitOfName == 'I') {
            System.out.println("первая Буква Имени I ");
        } else {
            System.out.println("первая Буква Имени не I и не M");
        }
    }
}