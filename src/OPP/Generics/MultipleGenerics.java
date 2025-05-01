package OPP.Generics;

class Box<T, U> {
    T value;
    U name;

    Box(T value, U name) {
        this.value = value;
        this.name = name;
    }

    void getInfo() {
        System.out.println(value);
        System.out.println(name);
    }

}


public class MultipleGenerics {
    public static void main(String[] args) {
        Box<Integer, String> obj = new Box<> (20, "Edge");
        obj.getInfo();

    }
}
