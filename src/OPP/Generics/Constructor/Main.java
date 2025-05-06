package OPP.Generics.Constructor;

class Box {

    <T>Box(T value) {
        System.out.println(value);
    }
}

public class Main {
    public static void main(String[] args) {
        new Box(56);
        new Box(34.32);
        new Box("Edge");

    }
}
