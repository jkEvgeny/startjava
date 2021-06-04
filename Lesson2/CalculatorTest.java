import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);
        String yesOrNo;
        do {
            calculator.Calculation();
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            yesOrNo = in.nextLine();
        } while (!yesOrNo.equals("no"));
    }
}