package hoemwork13_04_2019;

public class CompareStrings_05 {
    public static void main(String[] args) {
        String a = "MINAL";
        String b = "minal";

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
