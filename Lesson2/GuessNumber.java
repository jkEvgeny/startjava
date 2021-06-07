import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int hiddenNumber = (int) (Math.random() * 101);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println(player1.getName() + ", введите число : ");
            player1.setNumber(in.nextInt());

            if (!compareNumbers(player1)) {
                System.out.println(player2.getName() + ", введите число : ");
                player2.setNumber(in.nextInt());
            }
        } while (!compareNumbers(player2));
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() == hiddenNumber) {
            System.out.println("Поздравляю," + player.getName() + " число угадано!");
            return true;
        }
        if (player.getNumber() < hiddenNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if (player.getNumber() > hiddenNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        }
        return false;
    }
}
