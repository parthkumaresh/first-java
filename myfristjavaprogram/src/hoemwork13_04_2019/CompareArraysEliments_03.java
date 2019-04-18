package hoemwork13_04_2019;

import java.util.Arrays;

public class CompareArraysEliments_03 {
    public static void main(String[] args) {
        char chararray [] = {'a','b','c',};
        char chararrays [] = {'a','b','c',};
        Object[] arr1 = {chararray};  // arr1 contains only one element
        Object[] arr2 =  {chararrays};  // arr2 also contains only one element
        Object[] outarr1 = {arr1}; // outarr1 contains only one element
        Object[] outarr2 = {arr2}; // outarr2 also contains only one element
        if (Arrays.deepEquals(arr1, arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");
    }
}
