public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = "male";
        wolf.name = "Petya";
        wolf.color = "gray";
        wolf.weight = 30;
        wolf.age = 10;
        System.out.println(wolf.toString());

        wolf.go();
        wolf.run();
        wolf.howl();
        wolf.hunt();
        wolf.sit();
    }
}