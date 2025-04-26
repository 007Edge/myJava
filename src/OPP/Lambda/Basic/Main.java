package OPP.Lambda.Basic;

@FunctionalInterface
interface Greeting {

    void printHello();


}

public class Main {
    public static void main(String[] args) {
        Greeting obj = () -> System.out.println("Hello");
        obj.printHello();
    }
}