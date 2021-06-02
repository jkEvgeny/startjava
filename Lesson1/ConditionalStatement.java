public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 20;
        boolean sex = true;
        double height = 1.80;
        char firstLitOfName = 'I';

        if (age > 20) System.out.println("возраст > 20");

        if (sex == true) System.out.println("пол мужской");

        if (sex != true) System.out.println("пол женский");

        if (height < 1.80) {
            System.out.println("рост < 1.80");
        } else {
            System.out.println("рост >= 1.80");
        }

        if (firstLitOfName == 'M') {
            System.out.println("первая Буква Имени M");
        } else if (firstLitOfName == 'I') {
            System.out.println("первая Буква Имени I ");
        } else {
            System.out.println("первая Буква Имени не I и не M");
        }
    }
}