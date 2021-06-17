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
            if (player1.index < 10 || player2.index < 10) {
                player1.enterNewNumber();
                player1.setNumber(in.nextInt());
                player1.index++;
                if (!compareNumbers(player1)) {
                    player2.enterNewNumber();
                    player2.setNumber(in.nextInt());
                    player2.index++;
                } else {
                    break;
                }
            } else {
                System.out.println("У " + player1.getName() + " закончились попытки");
                break;
            }
        } while (!compareNumbers(player2));
        System.out.println("Числа игрока " + player1.getName() + " :" +
                Arrays.stream(player1.getAllNumbers())
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" "))
        );

        System.out.println("Числа игрока " + player2.getName() + " :" +
                Arrays.stream(player2.getAllNumbers())
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" "))
        );
        player1.clearNumbers();
        player2.clearNumbers();
    }

    private boolean compareNumbers(Player player) {
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
