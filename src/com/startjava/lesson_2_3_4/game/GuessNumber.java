package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int hiddenNumber = (int) (Math.random() * 101);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner in = new Scanner(System.in);
        boolean isOk;
        do {
            System.out.println(player1.getName() + ", введите число : ");
            player1.setNumber(in.nextInt());
            if (isOk = !compareNumbers(player1)) {
                System.out.println(player2.getName() + ", введите число : ");
                player2.setNumber(in.nextInt());
            }
        } while (!compareNumbers(player2) && isOk);
        System.out.println("Числа игрока "+ player1.getName()+ " :" + player1.getAllNumbers());
        System.out.println("Числа игрока "+ player2.getName()+ " :" + player2.getAllNumbers());
        player1.clearArray();
        player2.clearArray();
    }

    private boolean compareNumbers(Player player) {
        if (player.isEndGame) {
            return true;
        }
        if (player.getNumber() == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNumber +
                    " c " + player.possition + " попытки ");
            return true;
        }
        if (player.getNumber() < hiddenNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if (player.getNumber() > hiddenNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        }
        return false;
    }
}
