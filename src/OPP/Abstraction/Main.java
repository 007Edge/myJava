package OPP.Abstraction;

public class Main {
    public static void main(String[] args) {
        Son s = new Son();
        s.career();
        s.partner();

        // If function inside a class is abstract the class should also be declared as abstract
        // you cannot create object of an abstract class
        // But you can create a constructor of parent class
        // That is because when you create object of child to parent class constructor will be called

    }
}
