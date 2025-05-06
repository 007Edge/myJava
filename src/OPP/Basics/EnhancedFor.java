package OPP.Basics;

import java.util.ArrayList;

public class EnhancedFor {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);

        for (Integer i: list) {
            System.out.println(i.intValue());
        }

        // we can also use doubleValue(), floatValue()  according to the wrapper class.

    }
}
