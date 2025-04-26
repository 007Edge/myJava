package OPP.inheritance;

public class Animal {
    String name;
    String color;
    int age;

    Animal() {
        System.out.println("Animal constructor without parameter");
       this.name = "Janvar";
       this.color = "Rang";
       this.age = 35;
    }

    Animal(String name, String color, int age) {
        System.out.println("Animal constructor with 3 parameter");
        this.name = name;
        this.color = color;
        this.age = age;
    }

    Animal(String name) {
        System.out.println("Animal constructor with 1 parameter");
        this.name = name;
    }

}
