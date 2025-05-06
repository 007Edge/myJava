package OPP.Generics.Interface;

class Pencil implements Box<Integer> {
    public Integer printHello() {
        System.out.println("Hello");
        return 0;
    }
    public Integer returnInt() {
        return 77;
    }
}

public class Main {
    public static void main(String[] args) {
        Pencil p = new Pencil();
        int num = p.printHello();
        int num2 = p.returnInt();
        System.out.println(num);
        System.out.println(num2);
    }
}

