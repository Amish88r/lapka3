public class Klal {
    private int age = 40;
    private int height = 12;

    private String name;

    public void setName(String name) {
        if (name == "Малыш") {
            this.name = "ОШИБКА";
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 666;
        } else {
            this.age = age;
        }
    }

    public void fly(){
        System.out.println("Он заедал горечь от того, что подарил Пистолет карлсону, ведь в свои " +age+" лет он так и не научился самоконтролю");
    }

    @Override
    public String toString() {
        return "Карлсон, зовут = " + this.name + ", возраст = " + this.age + ", рост = " + this.height;
    }
}
