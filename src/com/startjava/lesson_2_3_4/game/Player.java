package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    public int index;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getAllNumbers() {
        return Arrays.copyOf(numbers, index);
    }

    public int getNumber() {
        return numbers[index - 1];
    }

    public void setNumber(int number) {
        numbers[index] = number;
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, index, 0);
        index = 0;
    }

    public void enterNewNumber(){
        System.out.println(getName() + ", введите число : ");
    }
}
