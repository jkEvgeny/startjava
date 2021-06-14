package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    public int possition = 0;
    public boolean isEndGame = false;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAllNumbers() {
        String out = "";
        int [] miniNumbers = Arrays.copyOf(numbers, possition);
        for (int i = 0; i < miniNumbers.length; i++) {
            out += " " + miniNumbers[i];
        }
        return out;
    }

    public int getNumber() {
        return numbers[possition - 1];
    }

    public void setNumber(int number) {
        if (possition < 10) {
            this.numbers[possition] = number;
            possition++;
        } else {
            System.out.println("У " + this.getName() + " закончились попытки");
            isEndGame = true;
        }
    }

    public void clearArray() {
        Arrays.fill(numbers, 0);
        possition = 0;
    }
}
