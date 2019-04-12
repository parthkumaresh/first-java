package homeWork06_04_2019;

import java.util.Scanner;

public class DigitdNumbers_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int num,sum=0;

        System.out.println("Enter your number " + counter + " : ");
        while (counter < 11) {
            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Enter your number "+counter+" : ");
            }
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                sum+= num;
                counter++;
                if (counter < 11) {
                    System.out.println("Enter your number " + counter + " : ");
                }
            }
        }
        System.out.println("Sum of 10 numbers is "+sum);

    }

}
