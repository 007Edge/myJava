package OPP.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/*

A dynamic array that can grow or shrink as needed.
Stores objects only (use wrapper classes for primitives like Integer, Double, etc.).
Maintains insertion order.
Allows duplicates.

 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        list.set(0, 23);
        Collections.sort(list);   // sorting
//        System.out.println(list);   can print array list in this way also
        for (int i : list) {       // enhanced for loop
            System.out.println(i);
        }
    }
}
// #note E means DataType that can be int, float, double, etc. And e represents the value like "Edge" for String datatype
// list.add(E e)    adds the element to the end of the list
// list.add(int index, E e)     adds the element to specific index
// list.get(int index)        retrieves the element at index
// set(int index, E e)        replace element at index
// remove (int index)         remove element at index
// remove (Object obj)        remove first occurrence of the object
// size()                     returns the size of the list
// isEmpty()                  returns true if list is empty
// clear()                    remove all the elements

