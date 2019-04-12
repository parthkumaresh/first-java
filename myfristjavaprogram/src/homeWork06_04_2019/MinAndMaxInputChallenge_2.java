package homeWork06_04_2019;

import java.util.Scanner;

public class MinAndMaxInputChallenge_2 {
    public static void main(String[] args) {
        Scanner digits = new Scanner (System.in);
        int number = digits.nextInt();
        int max  = number;
        int min = number;
        while (number != -1) {
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
            System.out.print("Type a number: ");
            number = digits.nextInt();
        }

        if (max != -1 && min != -1) {
            System.out.println("Maximum was " + max);
            System.out.println("Minimum was " + min);
        }


    }
}
