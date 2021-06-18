package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

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

        do {
            if (player1.getIndex() < 10 || player2.getIndex() < 10) {
                System.out.println(player1.getName() + ", введите число : ");
                player1.setNumber(in.nextInt());
                player1.addIndex();
                if (!compareNumbers(player1)) {
                    System.out.println(player2.getName() + ", введите число : ");
                    player2.setNumber(in.nextInt());
                    player2.addIndex();
                } else {
                    break;
                }
            } else {
                System.out.println("У " + player1.getName() + " закончились попытки");
                break;
            }
        } while (!compareNumbers(player2));
        player1.writePlayersNumbers();
        player2.writePlayersNumbers();
        player1.clearNumbers();
        player2.clearNumbers();
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNumber +
                    " c " + player.getIndex() + " попытки ");
            return true;
        }
        String moreOrLess = (player.getNumber() < hiddenNumber) ? "меньше" : "больше";
        System.out.println("Данное число " + moreOrLess + " того, что загадал компьютер");
        return false;
    }
}
