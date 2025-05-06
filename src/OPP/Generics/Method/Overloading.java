package OPP.Generics.Method;


public class Overloading {
    public static void main(String[] args) {
          display(23);
          display("Edge");
          display(34.34);
    }
    public static <T> void display(T value) {
        System.out.println(value);
    }

    public static void display(int value) {
        System.out.println(value);
    }
}

// generic display will be called two times
// and other display will be called 1 time
