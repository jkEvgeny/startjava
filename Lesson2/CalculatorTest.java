import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        String yesOrNo;
        do {
            System.out.println("Введите первое число: ");
            int firstNumber = in.nextInt();

            System.out.println("Введите знак математической операции: ");
            String sign = scan.nextLine();

            System.out.println("Введите второе число: ");
            int secondNumber = in.nextInt();

            Calculator.calculate(firstNumber, secondNumber, sign);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                yesOrNo = scan.nextLine();
            } while (!yesOrNo.equals("yes") && !yesOrNo.equals("no"));
        } while (!yesOrNo.equals("no"));
    }
}
