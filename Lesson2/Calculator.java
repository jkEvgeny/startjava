import java.util.Scanner;

public class Calculator {
    public static void Calculation() {

        int firstValue;
        int secondValue;
        int result = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        firstValue = Integer.parseInt(in.nextLine());

        System.out.println("Введите знак математической операции:  ");
        String sign = in.nextLine();

        System.out.println("Введите второе число: ");
        secondValue = Integer.parseInt(in.nextLine());

        switch (sign) {
            case "+" -> result = firstValue + secondValue;
            case "-" -> result = firstValue - secondValue;
            case "*" -> result = firstValue * secondValue;
            case "/" -> result = firstValue / secondValue;
            case "^" -> result = (int) Math.pow(firstValue, secondValue);
            case "%" -> result = firstValue % secondValue;
        }

        System.out.println(" Result = " + result);
    }
}
