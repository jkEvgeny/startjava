package com.startjava.lesson_2_3.calculator;
public class Calculator {
    public static void calculate(int firstNumber, int secondNumber, String sign) {
        int result = 0;
        switch (sign) {
            case "+" -> result = firstNumber + secondNumber;
            case "-" -> result = firstNumber - secondNumber;
            case "*" -> result = firstNumber * secondNumber;
            case "/" -> result = firstNumber / secondNumber;
            case "^" -> result = (int) Math.pow(firstNumber, secondNumber);
            case "%" -> result = firstNumber % secondNumber;
        }
        System.out.println(" Result = " + result);
    }
}
