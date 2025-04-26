package OPP.Generics;

public class main {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.setItem("SHIV");
        System.out.println(b.getItem());

        Box<Integer> b1 = new Box<>();
        b1.setItem(20);


        Products<String, Integer> p = new Products<>("iPhone", 1000);
        System.out.println(p.getItem());
        System.out.println(p.getPrice());
    }
}
