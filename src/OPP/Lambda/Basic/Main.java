package OPP.Lambda.Basic;

@FunctionalInterface
interface Greeting {
    void printHello();
}

// functional interface is the interface that have only one abstract method
// it can have multiple methods that are not abstract e.g. static & default methods

public class Main {
    public static void main(String[] args) {
        Greeting obj = () -> System.out.println("Hello");
        obj.printHello();
    }
}