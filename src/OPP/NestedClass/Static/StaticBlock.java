package OPP.NestedClass.Static;

public class StaticBlock {
    static int a = 17;
    static int b;

    static {   // will only run once, when first obj is created i.e. when the class is loaded
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b+=3;

        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}


