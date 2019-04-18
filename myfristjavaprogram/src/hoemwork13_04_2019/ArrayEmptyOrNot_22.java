package hoemwork13_04_2019;

import java.util.ArrayList;

public class ArrayEmptyOrNot_22 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list.isEmpty());     //true

        list.add("A");

        System.out.println(list.isEmpty());     //false

        list.clear();

        System.out.println(list.isEmpty());     //true
    }
}
