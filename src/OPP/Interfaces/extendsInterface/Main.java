package OPP.Interfaces.extendsInterface;

public class Main implements B {
    public void apple() {
        System.out.println("apple");
    }



    public static void main(String[] args) {
        Main m = new Main();
        m.apple();
        m.banana();
    }
}
