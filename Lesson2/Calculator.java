public class Calculator {
    public static void doCalculation(int firstValue, int secondValue, String sign) {
        int result = 0;
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
