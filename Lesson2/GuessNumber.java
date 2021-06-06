import java.util.Scanner;

public class GuessNumber {
    public static void doGame(Player player1, Player player2) {
        int hiddenNumber = (int) (Math.random() * 100);
        Scanner in = new Scanner(System.in);
        boolean endGame;
        do {
            System.out.println(player1.getName() + ", введите число : ");
            player1.setNumber(in.nextInt());
            int enterNumber = player1.getNumber();
            endGame = isEndGame(hiddenNumber, enterNumber);

            if (!endGame) {
                System.out.println(player2.getName() + ", введите число : ");
                player2.setNumber(in.nextInt());
                enterNumber = player2.getNumber();
                endGame = isEndGame(hiddenNumber, enterNumber);
            }
        } while (!endGame);
    }

    private static boolean isEndGame(int hiddenNumber, int enterNumber) {
        boolean endGame;
        if (enterNumber < hiddenNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            endGame = false;
        } else if (enterNumber > hiddenNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            endGame =  false;
        } else {
            System.out.println("Поздравляю, число угадано!");
            endGame = true;
        }
        return endGame;
    }
}
