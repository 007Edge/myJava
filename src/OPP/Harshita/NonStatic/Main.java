package OPP.Harshita.NonStatic;

class Outer {
    int x = 10;
    class Inner {
        void printNum() {
            System.out.println(x);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner o = obj.new Inner();
        o.printNum();
    }
}
