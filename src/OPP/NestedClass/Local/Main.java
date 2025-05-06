package OPP.NestedClass.Local;


class Outer {
    private final int num = 20;    // removing final will not give error
    void outerMethod() {
        int n = 10;

        class LocalInner {
            void display() {
                System.out.println(n);
                System.out.println(num);
            }
        }

        LocalInner obj = new LocalInner();
        obj.display();
        // n = 11;  cannot change the value because it is effectively final i.e. the value of n never changed.
        // note if n was the variable of Outer class then we were allowed to change the value of n.

    }
}

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerMethod();
    }
}

// rule: local, anonymous and lambdas classes can only access the final or effectively final local variables

