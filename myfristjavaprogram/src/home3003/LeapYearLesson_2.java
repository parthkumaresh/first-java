package home3003;

import java.util.Scanner;

public class
LeapYearLesson_2 {
    public static void main(String args[]) {
        /**
         * This programme is not working as expected.
         * Enter -1
         * Expected result:- Invalid input or -1
         * Actual result :- -1 is not Leap Year
         */
        int yr;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Year : ");
        yr = scan.nextInt();

        if((yr%4 == 0) && (yr%100!=0))
        {
            System.out.print("This is a Leap Year");
        }
        else if((yr%100 == 0) && (yr%400 == 0))
        {
            System.out.print("This is a Leap Year");
        }
        else if(yr%400 == 0)
        {
            System.out.print("This is a Leap Year");
        }
        else
        {
            System.out.print("This is not a Leap Year");
        }
    }
}



