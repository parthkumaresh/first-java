package hoemwork13_04_2019;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayElements_20 {
    public static void main(String[] args) {

        //Constructing Arraylist

        ArrayList<String> list = new ArrayList<String>();

        list.add("Gold");
        list.add("Iron");
        list.add("Silver");
        list.add("Copper");
        list.add("Nickel");
        list.add("Cobalt");
        list.add("Zinc");

        //Printing list before reverse

        System.out.println("Array list before reverse : ");
        System.out.println(list);

        //Reversing list using Collections.reverse() method
        Collections.reverse(list);

        //Printing list after reverse
        System.out.println("Array list after reverse :");

        System.out.println(list);

    }
}
