package OPP.Generics.Method;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3};
        String[] names = {"Edge", "Vertex", "Fury"};
        display(arr);
        display(names);
    }
    public static <T> void display(T[] array) {

        for (T t : array) {
            System.out.println(t);
        }
    }
}

