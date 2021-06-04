public class GuessNumber {
    public static boolean doGame(int hiddenNumber, int enterNumber) {
        if (enterNumber < hiddenNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            return false;
        } else if (enterNumber > hiddenNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            return false;
        } else {
            System.out.println("Поздравляю, число угадано!");
            return true;
        }
    }
}
