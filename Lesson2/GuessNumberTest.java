import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        String firstName = in.nextLine();
        System.out.println("Введите имя второго игрока: ");
        String secondName = in.nextLine();

        Player player1 = new Player(firstName);
        Player player2 = new Player(secondName);
        String yesOrNo;
        do {
            int hiddenNumber = (int) (Math.random() * 100);
            boolean endGame;
            do {
                System.out.println(firstName + ", введите число : ");
                player1.setNumber(in.nextInt());
                endGame = GuessNumber.doGame(hiddenNumber, player1.getNumber());
                if (!endGame) {
                    System.out.println(secondName + ", введите число : ");
                    player2.setNumber(in.nextInt());
                    endGame = GuessNumber.doGame(hiddenNumber, player2.getNumber());
                }
            } while (!endGame);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                yesOrNo = in.nextLine();
            } while (!yesOrNo.equals("yes") && !yesOrNo.equals("no"));
        } while (!yesOrNo.equals("no"));
    }
}
