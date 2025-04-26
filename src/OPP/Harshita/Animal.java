package OPP.Harshita;

import java.beans.DefaultPersistenceDelegate;

public class Animal {
    String name;
    int height;

    Animal () {
        System.out.println("Animal");
    }
    Animal (String name, int height) {
        this.name = name;
        this.height = height;
        System.out.println("Animal class const.");
    }

}

class Dog extends Animal {
    int tail;


    Dog (String name, int tail, int height) {

        this.name = name;
        this.tail = tail;
        this. height = height;
        System.out.println("Dog");
    }
}

class Pilla extends Dog {
    Pilla () {
        super("edge",10,20);
        System.out.println("Pilla");
    }
}

class Exc {
    public static void main(String[] args) {
        Animal a1 = new Animal("horse", 150);
        Dog d = new Dog("kukur", 10, 10);
        Pilla p = new Pilla();
    }
}
