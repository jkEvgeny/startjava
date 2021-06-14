package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String yesOrNo;
        do {
            System.out.println("Введите математическое выражение: ");
            String expression = scan.nextLine();
            System.out.println("Результат вычисления: " +
                    Calculator.calculate(expression));
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                yesOrNo = scan.nextLine();
            } while (!yesOrNo.equals("yes") && !yesOrNo.equals("no"));
        } while (!yesOrNo.equals("no"));
    }
}
