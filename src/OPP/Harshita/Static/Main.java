package OPP.Harshita.Static;

class Outer {
    int x = 10;
    static class Inner {

        void printNsm(Outer outerObj) {
            System.out.println(outerObj.x);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner n = new Outer.Inner();
        n.printNsm(obj);
    }
}
