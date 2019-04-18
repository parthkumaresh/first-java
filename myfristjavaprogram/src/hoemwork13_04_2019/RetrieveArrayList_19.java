package hoemwork13_04_2019;

import java.util.ArrayList;
import java.util.List;

public class RetrieveArrayList_19 {
    public static void main(String[] args) {

        // create a list and add some colors to te list
        List<String> strings = new ArrayList<String>();
        strings.add("Red");
        strings.add("Black");
        strings.add("White");
        strings.add("Orange");
        strings.add("Green");

        //print the list
        System.out.println(strings);
        //Retrieve the first and third element
        String element = strings.get(0);
        System.out.println("First element ; "+element);
        element=strings.get(2);
        System.out.println("Third element: "+element);
    }
}
