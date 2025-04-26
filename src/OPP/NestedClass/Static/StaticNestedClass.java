package OPP.NestedClass.Static;


class Outer {

    int x = 10;          // non static variable
    static int y = 20;   // static variable

    static class Inner {
        void printVal(Outer object) {
            System.out.println(object.x);       // accessing the not static variable with outer class object
            System.out.println(y);              // no need of outer class object for accessing a static variable
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        Outer object = new Outer();
        Outer.Inner obj = new Outer.Inner();
        obj.printVal(object);
    }

}
