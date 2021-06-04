public class Wolf {
    public String sex;
    public String name;
    public String color;
    public int weight;
    public int age;

    void go() {
        System.out.println("Goes");
    }

    void sit() {
        System.out.println("Sits");
    }

    void run() {
        System.out.println("Runs");
    }

    void howl() {
        System.out.println("Woooo!");
    }

    void hunt() {
        System.out.println("Hunts");
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}