import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int a;
        int b;
        int result = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first value: ");
        a = Integer.parseInt(in.nextLine());

        System.out.println("Enter the math operation (+, -, *, /, ^, %) :  ");
        String input = in.nextLine();

        System.out.println("Enter the first value: ");
        b = Integer.parseInt(in.nextLine());

        if (input.equals("+")) {
            result = a + b;
        }else if (input.equals("-")) {
            result = a - b;
        }else if (input.equals("*")) {
            result = a * b;
        }else if (input.equals("/")) {
            result = a / b;
        }else if (input.equals("^")) {
            result = (int) Math.pow(a,b);
        }else if (input.equals("%")) {
            result = a % b;
        }

        System.out.println(" Result = "+ result);
    }
}
