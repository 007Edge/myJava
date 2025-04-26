package OPP.Harshita.Interface;

interface Human {

    static void printHello() {     // this is a static method and call it only by its interface name
        System.out.println("static method");
    }
    default void ben() {         // the only difference between the static method and default method is that we can override default method
        System.out.println("ben");
    }

    int a = 110;
    void getInfo();
}

class Person implements Human {

    public void ben () {
        System.out.println("override ben");
    }

    public void getInfo() {
        System.out.println("hi");

    }

}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();

        System.out.println(p);
        System.out.println(Human.a);
        Human.printHello();
        p.ben();



    }
}
