package OPP.Generics.Bound.Wildcards;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);

        Number num = sum(list);
        mul(list);
        System.out.println(num);
    }


    public static int sum(ArrayList<? extends Number> list) {  // upper bound aka roof
        int sum = 0;

        for (Number i: list) {    // Note we can use only same the wrapper class for 'i' as defined in Array list
            sum+=i.intValue();
        }
        return sum;
    }

    public static void mul(ArrayList<? super Integer> list) {  // lower bound
        for (Object i: list) {
            System.out.println(i);
        }

    }

    // wild card can be used only for reading data but you can add null

    // but in case you are using lower bound with wild cards ? super Integer i.e. setting up floor
    // you can now add elements in array list

    // ArrayList<? super Integer> numbers = new ArrayList<> (); now adding elements are allowed. numbers.add(3);

}

