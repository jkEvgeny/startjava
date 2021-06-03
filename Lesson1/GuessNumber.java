import java.time.LocalDateTime;
import java.util.Scanner;

public class GuessNumber {
    public static int getNextRandom() {
        int nanoSeconds = LocalDateTime.now().getNano();
        int seed = nanoSeconds % 99 + 1;
        return seed;
    }

    public static void main(String[] args) {
        int number = getNextRandom();
        Scanner in = new Scanner(System.in);
        int enterNumber = 0;
        do {
            System.out.println("Введите число : ");
            enterNumber = in.nextInt();
            if (enterNumber < number) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (enterNumber > number) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else System.out.println("Поздравляю, число угадано!");
        } while (enterNumber != number);
    }
}
