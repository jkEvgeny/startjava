import java.util.Scanner;

public class GuessNumber {
    public void start(Player player1, Player player2) {
        int hiddenNumber = (int) (Math.random() * 100);
        Scanner in = new Scanner(System.in);
        int enterNumber;
        do {
            System.out.println(player1.getName() + ", введите число : ");
            player1.setNumber(in.nextInt());
            enterNumber = player1.getNumber();

            if (!compareNumbers(hiddenNumber, enterNumber)) {
                System.out.println(player2.getName() + ", введите число : ");
                player2.setNumber(in.nextInt());
                enterNumber = player2.getNumber();
            }
        } while (!compareNumbers(hiddenNumber, enterNumber));
    }

    private boolean compareNumbers(int hiddenNumber, int enterNumber) {
        if (enterNumber == hiddenNumber) {
            System.out.println("Поздравляю, число угадано!");
            return true;
        } else {
            if (enterNumber < hiddenNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (enterNumber > hiddenNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            }
            return false;
        }
    }
}
