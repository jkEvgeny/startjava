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
        player1.writeAllNumbers();
        player2.writeAllNumbers();
        player1.clearArray();
        player2.clearArray();
    }

    private boolean compareNumbers(Player player) {
        if (player.isEndGame) {
            return true;
        }
        if (player.getNumber() == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNumber +
                    " c " + player.index + " попытки ");
            return true;
        }
        String moreOrLess = (player.getNumber() < hiddenNumber) ? "меньше" : "больше";
        System.out.println("Данное число " + moreOrLess + " того, что загадал компьютер");
        return false;
    }
}
