package OPP.Static;

public class InnerClasses {

    static class Test {  // inner classes can only be static
        String name;
        public Test (String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test t1 = new Test("shviam");
        Test t2 = new Test("Jamvant");

        System.out.println(t1.name);
        System.out.println(t2.name);
    }


}


// static class means it is not dependent on its parent class object
// static variable are independent of class object
// that is why most outer class cannot be static
