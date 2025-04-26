package OPP.Override.staticc;


class Human {
    static int age;
    Human(int age) {
        this.age = age;
    }

}
public class Main {
    public static void main(String[] args) {
        Human h = new Human(19);
        Human h1 = new Human(20);
        System.out.println(Human.age);
        Human.age += 1;

    }
}
