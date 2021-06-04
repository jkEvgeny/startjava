import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner signIn = new Scanner(System.in);
        String yesOrNo;
        do {
            System.out.println("Введите первое число: ");
            int firstValue = in.nextInt();

            System.out.println("Введите знак математической операции: ");
            String sign = signIn.nextLine();

            System.out.println("Введите второе число: ");
            int secondValue = in.nextInt();

            Calculator.doCalculation(firstValue, secondValue, sign);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                yesOrNo = signIn.nextLine();
            } while (!yesOrNo.equals("yes") && !yesOrNo.equals("no"));
        } while (!yesOrNo.equals("no"));
    }
}
