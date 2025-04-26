package OPP.inheritance;

public class Main {
    public static void main(String[] args) {

        Monkey m1 = new Monkey("Languor");

        System.out.println("name: " + m1.name + "\nage: " + m1.age + "\ncolor: " + m1.color);

        // note first parent constructor will we called in case of monkey m1
        // to initialize name,color and age of monkey


        // also you cant do ....    Monkey e = new Animal();
        // the reason behind this is basically simple, The Animal class will not be able to inherit Monkey class

    }


}
