package OPP.Harshita.Lambda;

interface MyInterface {
    int printSum(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        MyInterface obj = (a, b) -> {
            System.out.println("working");
            return a+b;
        };
        int n = obj.printSum(6,6);
        System.out.println(n);
    }
}
