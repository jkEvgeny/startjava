package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static int calculate(int firstNumber, int secondNumber, String sign) {
        int result = 0;
        switch (sign) {
            case "+" -> result = Math.addExact(firstNumber, secondNumber);
            case "-" -> result = Math.subtractExact(firstNumber, secondNumber);
            case "*" -> result = Math.multiplyExact(firstNumber, secondNumber);
            case "/" -> result = firstNumber / secondNumber;
            case "^" -> result = (int) Math.pow(firstNumber, secondNumber);
            case "%" -> result = firstNumber % secondNumber;
        }
        return result;
    }
}
