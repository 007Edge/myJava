package OPP.Interfaces.NestedInterface;

public class A {
    public interface NestedInferface {
        void printHello();
    }
}

class B implements A.NestedInferface {
    public void printHello() {
        System.out.println("Hello");
    }
}


