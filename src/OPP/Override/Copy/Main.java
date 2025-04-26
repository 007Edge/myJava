package OPP.Override.Copy;

import java.net.SocketOption;

class Human{
    int age;
    String name;
    Human() {

    }
    Human(Human obj){
        this.name = obj.name;
        this.age = obj.age;
    }
}

class Main{
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.age=12;
        h1.name="harshita";

        Human h = new Human(h1);

        System.out.println(h.name);

    }
}