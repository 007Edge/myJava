package OPP.Harshita.Abstract;

abstract class Human {
    Human () {
        System.out.println("Human");
    }
    void getInfo() {
        System.out.println("hi");
    }
    abstract void getMoney();
}

class Person extends Human {

    Person() {
        System.out.println("person");
    }

    void getMoney() {
        System.out.println("Money");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();

    }
}
