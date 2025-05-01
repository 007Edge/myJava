package OPP.Generics;


class Animal<T> {
    T value;

    Animal(T value) {
        this.value = value;
    }

    T getVal() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal<Integer> obj = new Animal<>(7);
        int a = obj.getVal();
        System.out.println(a);

    }
}

// Animal <T> means we can create set T as of any data type while creating object
// example Animal <T> = new Animal<> ();   in place of T we have to put Integer, String, Float any data type we want.

// limitation: we can't use <> with anonymouse classes and cannot create array

