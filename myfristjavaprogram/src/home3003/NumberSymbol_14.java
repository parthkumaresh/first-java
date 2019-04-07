package home3003;

import java.util.Scanner;

public class NumberSymbol_14 {


    public static void main(String[] args) {
        /**
         * This programme is working as expected
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("\"WRITE ANY ALPHABET, NUMBER OR SYMBOL\"");
        char char1 = scanner.next().charAt(0);

        if (char1 >= 48 && char1 <= 57) {
            System.out.print("\"IT IS DIGIT\"");

        } else if ((char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z')) {
            System.out.print("\"IT IS ALPHABET\"");

        } else {
            System.out.print("\"IT IS SYMBOL\"");
        }
    }
}
