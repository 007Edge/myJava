package OPP.Harshita;


class A {

   static int x = 10;


    A(int n) {
        this(5,6);  // to call the costructor -> A(int a, int b)
        System.out.println("parameter wala const");
    }

    A(int a, int b) {
        System.out.println(a+b);
    }


}


public class Main {
    public static void main(String[] args) {
        A obj  = new A(5);

    }
}
