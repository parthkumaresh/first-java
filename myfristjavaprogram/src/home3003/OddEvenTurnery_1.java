package home3003;

import java.util.Scanner;

public class OddEvenTurnery_1 {
    public static void main(String[] args) {
        /**
         * This programme is not working as expected
         * see inline comments
         */

        int a;
        System.out.println(" Enter the number to check if the number is odd or even ");
        Scanner digit = new Scanner ( System.in );
        a = digit.nextInt();

        if (a % 4 == 0) // Wrong logic as if you enter 78999966 then result "This is odd number" but it is even number change logic to (a % 2 == 0)
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
