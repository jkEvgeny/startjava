package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    public int index = 0;
    public boolean isEndGame = false;

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
        if (index < 10) {
            numbers[index] = number;
            index++;
        } else {
            System.out.println("У " + getName() + " закончились попытки");
            isEndGame = true;
        }
    }

    public void clearArray() {
        Arrays.fill(numbers, 0, index, 0);
        index = 0;
    }

    public void writeAllNumbers() {
        System.out.println("Числа игрока " + getName() + " :" +
                Arrays.stream(getAllNumbers())
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" "))
        );
    }
}
