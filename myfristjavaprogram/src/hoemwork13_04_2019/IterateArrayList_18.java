package hoemwork13_04_2019;

import java.util.ArrayList;

public class IterateArrayList_18 {
    public static void main(String[] args) {

        ArrayList<String> vegetables= new ArrayList<>();

        vegetables.add("Cucumber");
        vegetables.add("Carrot");
        vegetables.add("Bitroot");
        vegetables.add("Tomatoes");
        vegetables.add("Potatoes");
        vegetables.add("Lemon");

        for (String veg : vegetables){
            System.out.println(veg);
        }
    }
}
