package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String yesOrNo;
        do {
            System.out.println("Введите математическое выражение: ");
            String expression = scan.nextLine();
            String[] splitString = expression.split("(?<=[\\d.])(?=[^\\d.])|(?<=[^\\d.])(?=[\\d.])");
            int firstNumber = Integer.parseInt(splitString[0]);
            String sign = splitString[1];
            int secondNumber = Integer.parseInt(splitString[2]);
            System.out.println("Результат вычисления: " +
                    Calculator.calculate(firstNumber, secondNumber, sign));
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                yesOrNo = scan.nextLine();
            } while (!yesOrNo.equals("yes") && !yesOrNo.equals("no"));
        } while (!yesOrNo.equals("no"));
    }
}
