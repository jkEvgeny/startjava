package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        String firstName = in.nextLine();
        System.out.println("Введите имя второго игрока: ");
        String secondName = in.nextLine();
        System.out.println("У каждого игрока по 10 попыток ");
        Player player1 = new Player(firstName);
        Player player2 = new Player(secondName);
        String yesOrNo;
        do {
            GuessNumber guessNumber = new GuessNumber(player1, player2);
            guessNumber.start();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                yesOrNo = in.nextLine();
            } while (!yesOrNo.equals("yes") && !yesOrNo.equals("no"));
        } while (!yesOrNo.equals("no"));
    }
}
