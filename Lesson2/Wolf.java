public class Wolf {
    private String sex;
    private String name;
    private String color;
    private int weight;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    private int age;

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