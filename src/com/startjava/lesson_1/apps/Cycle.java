package com.startjava.lesson_1.apps;
public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }

        int i = 6;
        int result = -6;
        while (i >= result) {
            System.out.println(i);
            i -= 2;
        }

        int j = 10;
        result = 20;
        int sum = 0;
        do {
            if (j % 2 != 0) {
                sum += j;
            }
            j++;
        } while (j <= result);
        System.out.println(sum);
    }
}