package hoemwork13_04_2019;

public class CompareStrings_05 {
    public static void main(String[] args) {

        /*Working as expected*/

        String a = "MINAL";
        String b = "MINAL";

        if (a.equals(b)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }

        if (a.equalsIgnoreCase(b)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
    }
}
