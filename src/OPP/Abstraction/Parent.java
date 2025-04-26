package OPP.Abstraction;

public abstract class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
    int age;
    String name;

    abstract void career();
    abstract void partner();


}
