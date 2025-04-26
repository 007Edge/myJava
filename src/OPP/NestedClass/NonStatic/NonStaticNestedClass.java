package OPP.NestedClass.NonStatic;

class Outer {

    int n = 10;      // non static variable

    class Inner {               // non-static class i.e. dependent on Outer class and need to create Outer class object.
        void getValue() {

            System.out.println(n);     // accessing non static variable
        }
    }

}


public class NonStaticNestedClass {
    public static void main(String[] args) {

        Outer obj = new Outer();
        Outer.Inner object = obj.new Inner();
        object.getValue();

    }
}
