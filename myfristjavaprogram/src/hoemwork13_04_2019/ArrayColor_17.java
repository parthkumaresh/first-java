package hoemwork13_04_2019;

import java.util.ArrayList;
import java.util.List;

public class ArrayColor_17 {
    public static void main(String[] args) {
        List<String> color = new ArrayList<>();

        color.add("Red");
        color.add("Blue");
        color.add("Green");
        color.add("Violet");
        color.add("Purple");
        color.add( "Black");
        color.add("White");

        for (String col : color) {

            System.out.printf("%s ", col);
        }

        System.out.println();
    }
}
