package OPP.Generics.Bound;

class Box <T extends Number> {
    // Bounded Type parameters
    // Number class is upperBound, that means we can only use classes like Integer and Double that comes under Number while creating object
    // Or we can say, the class we are allowed to use are the classes that extend Number so Type String we produce error
    T num;
    Box(T num) {
        System.out.println(num);
    }

}

public class Upper {
    public static void main(String[] args) {
        Box<Integer> obj = new Box<>(34);
        // Box<String> obj = new Box<>(34);
        // will throw error because String does not come under Number class
        // String is not subclass of Number class
    }
}


