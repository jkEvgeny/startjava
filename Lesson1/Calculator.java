import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first value: ");
        int a = in.nextInt();

        System.out.println("Enter the math operation (+, -, *, /, ^, %) :  ");
        String sign = in.nextLine();

        System.out.println("Enter the first value: ");
        int b =  in.nextInt();

        int result = 0;
        if (sign.equals("+")) {
            result = a + b;
        } else if (sign.equals("-")) {
            result = a - b;
        } else if (sign.equals("*")) {
            result = a * b;
        } else if (sign.equals("/")) {
            result = a / b;
        } else if (sign.equals("^")) {
            result = a;
            for (int i = 1; i < b; i++) {
                result *= a;
            }
        } else if (sign.equals("%")) {
            result = a % b;
        }

        System.out.println(" Result = " + result);
    }
}
