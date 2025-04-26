package OPP.Harshita.Local;

class Outer {
    void printNum() {

        class Local {
            void printHello() {
                System.out.println("Hello");
            }

        }

        Local obj = new Local();
        obj.printHello();
    }
}


public class Main {
    public static void main(String[] args) {
        Outer n = new Outer();
        n.printNum();
    }
}
