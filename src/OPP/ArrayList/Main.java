package OPP.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);

        // list.remove(0);   // remove the 0th index element
        list.set(1, 23);   // inserted 23 at the 1nd index  or to update the element
        // System.out.println(list.get(1));  // get a specific element at the specific index
        // System.out.println(list.size());  // get the size of the array list
        Collections.sort(list);   // sorting
        //System.out.println(list);  printing

        for (int i : list) {       // enhanced for loop
            System.out.println(i);
        }
    }
}
