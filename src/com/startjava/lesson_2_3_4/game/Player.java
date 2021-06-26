package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int index;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
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
        index++;
    }

    public void clearNumbers() {
        Arrays.fill(numbers, 0, index, 0);
        index = 0;
    }
}
