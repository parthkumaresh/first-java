package homeWork06_04_2019;

import java.util.Arrays;

public class NumericStringArray_14 {
    public static void main(String[] args) {
        int[] my_array1 =
                {5000, 500, 2400, 4, 64, 789, 900000, 76767, 6566, 8787878, 9292992, 72727};

        String[] my_array2 = {
                "Radhi", "Param", "Gauri", "Manan", "Akshat", "Vihaan"};

        System.out.println("\nOriginal numeric array :\n"+ Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("\nSorted numeric array :\n"+Arrays.toString(my_array1));

        System.out.println("\nOriginal string array :\n"+Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("\nSorted string array :\n"+Arrays.toString(my_array2));
    }
}
