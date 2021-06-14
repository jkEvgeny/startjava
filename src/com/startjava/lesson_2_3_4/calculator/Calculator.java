package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static int calculate(String expression) {
        String[] splitString = expression.split("(?<=[\\d.])(?=[^\\d.])|(?<=[^\\d.])(?=[\\d.])");
        int firstNumber = Integer.parseInt(splitString[0]);
        String sign = splitString[1];
        int secondNumber = Integer.parseInt(splitString[2]);
        int result = switch (sign) {
            case "+" -> Math.addExact(firstNumber, secondNumber);
            case "-" -> Math.subtractExact(firstNumber, secondNumber);
            case "*" -> Math.multiplyExact(firstNumber, secondNumber);
            case "/" -> firstNumber / secondNumber;
            case "^" -> (int) Math.pow(firstNumber, secondNumber);
            case "%" -> firstNumber % secondNumber;
            default -> throw new IllegalStateException("Unexpected value: " + sign);
        };
        return result;
    }
}
