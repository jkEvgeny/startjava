public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("male");

        wolf.setName("Petya");
        wolf.setColor("gray");
        wolf.setWeight(30);
        wolf.setAge(5);
        System.out.println(wolf.toString());

        wolf.go();
        wolf.run();
        wolf.howl();
        wolf.hunt();
        wolf.sit();
    }
}