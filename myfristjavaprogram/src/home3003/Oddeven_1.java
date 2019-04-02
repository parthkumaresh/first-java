package home3003;

import java.util.Scanner;

public class Oddeven_1 {
    public static void main(String[] args) {
        int a;
        System.out.println(" Enter the number to check if the number is odd or even ");
        Scanner digit = new Scanner ( System.in );
        a = digit.nextInt();

        if (a % 4 == 0)
        System.out.println("This is even number ");
        else
        System.out.println("This is odd number ");
        //int a;
        //int b;
       // System.out.println("Enter the number to check if it is odd or even ");
        //Scanner digit = new Scanner(System.in);
       // a = digit.nextInt();
       // b = digit.nextInt();

       // if (a % 2 == 0);
        //System.out.println(" This number is even ");
       // if ( b %  3 == 0);
            //System.out.println(" This number is odd ");
    }
}
