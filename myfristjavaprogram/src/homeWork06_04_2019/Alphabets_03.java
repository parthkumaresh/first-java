package homeWork06_04_2019;

import java.util.Scanner;

public class Alphabets_03
{
    public static void main(String[ ] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Character:\n");
        String mj = sc.next();

        if (mj.length() > 1) {
            System.out.println("\nYour input is Invalid\n");

        } else if (mj.equals("a") || mj.equals("e") || mj.equals("i") || mj.equals("o") || mj.equals("u")
                ||mj.equals("A") || mj.equals("E") || mj.equals("I") || mj.equals("O") || mj.equals("U")) {
            System.out.println("\nIt is Vowel Character\n");

        } else {
            System.out.println("\nIt is Consonant Character\n");
        }
    }
}